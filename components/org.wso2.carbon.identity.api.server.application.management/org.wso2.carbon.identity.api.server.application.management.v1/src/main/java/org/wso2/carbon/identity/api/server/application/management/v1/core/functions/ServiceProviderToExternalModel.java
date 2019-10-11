/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.identity.api.server.application.management.v1.core.functions;

import org.apache.commons.lang.StringUtils;
import org.wso2.carbon.identity.api.server.application.management.common.ApplicationManagementServiceHolder;
import org.wso2.carbon.identity.api.server.application.management.v1.AdvancedApplicationConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.Application;
import org.wso2.carbon.identity.api.server.application.management.v1.Certificate;
import org.wso2.carbon.identity.api.server.application.management.v1.InboundProtocols;
import org.wso2.carbon.identity.api.server.application.management.v1.OpenIDConnectConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.PassiveStsConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.SAML2Configuration;
import org.wso2.carbon.identity.api.server.application.management.v1.WSTrustConfiguration;
import org.wso2.carbon.identity.api.server.common.error.APIError;
import org.wso2.carbon.identity.api.server.common.error.ErrorResponse;
import org.wso2.carbon.identity.application.common.model.InboundAuthenticationConfig;
import org.wso2.carbon.identity.application.common.model.InboundAuthenticationRequestConfig;
import org.wso2.carbon.identity.application.common.model.LocalAndOutboundAuthenticationConfig;
import org.wso2.carbon.identity.application.common.model.Property;
import org.wso2.carbon.identity.application.common.model.ServiceProvider;
import org.wso2.carbon.identity.base.IdentityConstants;
import org.wso2.carbon.identity.oauth.IdentityOAuthAdminException;
import org.wso2.carbon.identity.oauth.dto.OAuthConsumerAppDTO;
import org.wso2.carbon.security.SecurityConfigException;
import org.wso2.carbon.security.sts.service.util.TrustedServiceData;

import java.util.Arrays;
import javax.ws.rs.core.Response;

/**
 * Mapper Function.
 */
public class ServiceProviderToExternalModel implements Converter<ServiceProvider, Application> {

    // TODO: introduce constants for these at the backend..
    private static final String PASSIVE_STS_REALM = "passiveSTSRealm";
    private static final String PASSIVE_STS_REPLY_URL = "passiveSTSWReply";
    private static final String PASSIVE_STS_INBOUND_TYPE = "passivests";

    // TODO define a proper constant
    public static final String JWKS_URI = "jwksURI";

    @Override
    public Application convert(ServiceProvider serviceProvider) {

        return new Application()
                .id(String.valueOf(serviceProvider.getApplicationID()))
                .name(serviceProvider.getApplicationName())
                .description(serviceProvider.getDescription())
                .inboundProtocolConfiguration(buildInboundProtocols(serviceProvider.getInboundAuthenticationConfig()))
                .advancedConfigurations(buildAdvancedAppConfiguration(serviceProvider));
    }

    private AdvancedApplicationConfiguration buildAdvancedAppConfiguration(ServiceProvider serviceProvider) {

        LocalAndOutboundAuthenticationConfig authConfig = serviceProvider.getLocalAndOutBoundAuthenticationConfig();
        if (authConfig == null) {
            authConfig = new LocalAndOutboundAuthenticationConfig();
        }

        return new AdvancedApplicationConfiguration()
                .saas(serviceProvider.isSaasApp())
                .enableAuthorization(authConfig.isEnableAuthorization())
                .returnAuthenticatedIdpList(authConfig.isAlwaysSendBackAuthenticatedListOfIdPs())
                .skipConsent(getSkipConsent(serviceProvider))
                .certificate(getCertificate(serviceProvider));
    }

    private Certificate getCertificate(ServiceProvider serviceProvider) {

        if (StringUtils.isNotBlank(serviceProvider.getCertificateContent())) {

            return new Certificate().type(Certificate.TypeEnum.PEM).value(serviceProvider.getCertificateContent());
        } else {
            // Check whether JWKS URI is configured
            return Arrays.stream(serviceProvider.getSpProperties())
                    .filter(x -> StringUtils.equals(x.getName(), JWKS_URI))
                    .findAny().map(x -> new Certificate().type(Certificate.TypeEnum.JWKS).value(x.getValue()))
                    .orElse(null);
        }
    }

    private boolean getSkipConsent(ServiceProvider serviceProvider) {

        return Arrays.stream(serviceProvider.getSpProperties())
                .filter(x -> StringUtils.equals(x.getName(), IdentityConstants.SKIP_CONSENT))
                .findAny()
                .map(x -> Boolean.parseBoolean(x.getValue()))
                .orElse(false);
    }

    private InboundProtocols buildInboundProtocols(InboundAuthenticationConfig inboundAuthenticationConfig) {

        InboundProtocols inboundProtocols = new InboundProtocols();

        InboundAuthenticationRequestConfig[] inboundAuthConfigs =
                inboundAuthenticationConfig.getInboundAuthenticationRequestConfigs();

        if (inboundAuthConfigs != null) {
            for (InboundAuthenticationRequestConfig inboundAuth : inboundAuthConfigs) {

                switch (inboundAuth.getInboundAuthType()) {
                    case "SAML":
                        inboundProtocols.setSaml(buildSaml2Configuration(inboundAuth));
                        break;
                    case "oauth2":
                        inboundProtocols.setOidc(buildOpenIdConnectConfiguration(inboundAuth));
                        break;
                    case PASSIVE_STS_INBOUND_TYPE:
                        inboundProtocols.setPassiveSts(buildPassiveSTSConfiguration(inboundAuth));
                        break;
                    case "wstrust":
                        inboundProtocols.setWsTrust(buildWsTrustConfiguration(inboundAuth));
                        break;
                    default:
                        break;

                }
            }
        }

        return inboundProtocols;
    }

    private WSTrustConfiguration buildWsTrustConfiguration(InboundAuthenticationRequestConfig inboundAuth) {

        String audience = inboundAuth.getInboundAuthKey();
        try {
            TrustedServiceData[] trustedServices =
                    ApplicationManagementServiceHolder.getStsAdminService().getTrustedServices();

            // TODO : check whether we need to throw an exception if we can't find a wstrust service
            return Arrays.stream(trustedServices)
                    .filter(x -> StringUtils.equals(x.getServiceAddress(), audience))
                    .findAny()
                    .map(x -> new WSTrustConfiguration()
                            .audience(x.getServiceAddress())
                            .certificateAlias(x.getCertAlias()))
                    .orElse(new WSTrustConfiguration());

        } catch (SecurityConfigException e) {
            throw handleServerError(e, "Error while retrieving wsTrust configuration for audience: " + audience);
        }
    }

    private PassiveStsConfiguration buildPassiveSTSConfiguration(InboundAuthenticationRequestConfig inboundAuth) {

        return new PassiveStsConfiguration()
                .realm(inboundAuth.getInboundAuthKey())
                .replyTo(getPassiveSTSWReply(inboundAuth.getProperties()));
    }

    private String getPassiveSTSWReply(Property[] properties) {

        // TODO : null check on property array
        return Arrays.stream(properties).filter(x -> StringUtils.equals(x.getName(), PASSIVE_STS_REPLY_URL))
                .findAny()
                .map(Property::getValue).orElse(null);
    }

    private OpenIDConnectConfiguration buildOpenIdConnectConfiguration(InboundAuthenticationRequestConfig inboundAuth) {

        String clientId = inboundAuth.getInboundAuthKey();
        try {
            OAuthConsumerAppDTO oauthApp =
                    ApplicationManagementServiceHolder.getOAuthAdminService().getOAuthApplicationData(clientId);
            return new OAuthConsumerAppToModel().apply(oauthApp);

        } catch (IdentityOAuthAdminException e) {
            throw handleServerError(e, "Error while retrieving oauth application data for clientId: " + clientId);
        }
    }

    private SAML2Configuration buildSaml2Configuration(InboundAuthenticationRequestConfig inboundAuth) {

        return new SAML2Configuration();
    }

    private APIError handleServerError(Exception e, String message) {

        // TODO handle errors properly.
        ErrorResponse.Builder builder = new ErrorResponse.Builder();
        ErrorResponse errorResponse = builder.build(null, e, message);

        Response.Status status = Response.Status.INTERNAL_SERVER_ERROR;
        return new APIError(status, errorResponse);
    }
}
