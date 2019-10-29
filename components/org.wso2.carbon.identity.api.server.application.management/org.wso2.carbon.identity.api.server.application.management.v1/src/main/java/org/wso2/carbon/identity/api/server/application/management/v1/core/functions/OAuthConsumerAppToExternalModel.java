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
import org.wso2.carbon.identity.api.server.application.management.v1.AccessTokenConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.IdTokenConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.IdTokenEncryptionConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.OAuth2PKCEConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.OIDCLogoutConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.OpenIDConnectConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.RefreshTokenConfiguration;
import org.wso2.carbon.identity.oauth.dto.OAuthConsumerAppDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Mapper function.
 */
public class OAuthConsumerAppToExternalModel implements Converter<OAuthConsumerAppDTO, OpenIDConnectConfiguration> {

    @Override
    public OpenIDConnectConfiguration convert(OAuthConsumerAppDTO oauthAppDTO) {

        return new OpenIDConnectConfiguration()
                .clientId(oauthAppDTO.getOauthConsumerKey())
                .clientSecret(oauthAppDTO.getOauthConsumerSecret())
                .state(OpenIDConnectConfiguration.StateEnum.valueOf(oauthAppDTO.getState()))
                .grantTypes(buildGrantTypeList(oauthAppDTO))
                .publicClient(oauthAppDTO.isBypassClientCredentials())
                .callbackURLs(getCallbackUrls(oauthAppDTO))
                .allowedOrigins(getAllowedOrigins(oauthAppDTO))
                .pkce(buildPKCEConfiguration(oauthAppDTO))
                .accessToken(buildTokenConfiguration(oauthAppDTO))
                .refreshToken(buildRefreshTokenConfiguration(oauthAppDTO))
                .idToken(buildIdTokenConfiguration(oauthAppDTO))
                .logout(buildLogoutConfiguration(oauthAppDTO))
                .scopeValidators(getScopeValidators(oauthAppDTO))
                .validateRequestObjectSignature(oauthAppDTO.isRequestObjectSignatureValidationEnabled());
    }

    private List<String> getScopeValidators(OAuthConsumerAppDTO oauthAppDTO) {

        return oauthAppDTO.getScopeValidators() != null ?
                Arrays.asList(oauthAppDTO.getScopeValidators()) : Collections.emptyList();
    }

    private static OIDCLogoutConfiguration buildLogoutConfiguration(OAuthConsumerAppDTO oAuthConsumerAppDTO) {

        return new OIDCLogoutConfiguration()
                .backChannelLogoutUrl(oAuthConsumerAppDTO.getBackChannelLogoutUrl())
                .frontChannelLogoutUrl(oAuthConsumerAppDTO.getFrontchannelLogoutUrl());
    }

    private static OAuth2PKCEConfiguration buildPKCEConfiguration(OAuthConsumerAppDTO oAuthConsumerAppDTO) {

        return new OAuth2PKCEConfiguration()
                .mandatory(oAuthConsumerAppDTO.getPkceMandatory())
                .supportPlainTransformAlgorithm(oAuthConsumerAppDTO.getPkceSupportPlain());
    }

    private static AccessTokenConfiguration buildTokenConfiguration(OAuthConsumerAppDTO oAuthConsumerAppDTO) {

        return new AccessTokenConfiguration()
                .type(oAuthConsumerAppDTO.getTokenType())
                .userAccessTokenExpiryInSeconds(oAuthConsumerAppDTO.getUserAccessTokenExpiryTime())
                .applicationAccessTokenExpiryInSeconds(oAuthConsumerAppDTO.getApplicationAccessTokenExpiryTime());
    }

    private static RefreshTokenConfiguration buildRefreshTokenConfiguration(OAuthConsumerAppDTO oAuthConsumerAppDTO) {

        return new RefreshTokenConfiguration()
                .expiryInSeconds(oAuthConsumerAppDTO.getRefreshTokenExpiryTime())
                .renewRefreshToken(Boolean.parseBoolean(oAuthConsumerAppDTO.getRenewRefreshTokenEnabled()));
    }

    private static IdTokenConfiguration buildIdTokenConfiguration(OAuthConsumerAppDTO oAuthConsumerAppDTO) {

        return new IdTokenConfiguration()
                .expiryInSeconds(oAuthConsumerAppDTO.getIdTokenExpiryTime())
                .audience(Arrays.asList(oAuthConsumerAppDTO.getAudiences()))
                .encryption(buildIdTokenEncryptionConfiguration(oAuthConsumerAppDTO));
    }

    private static IdTokenEncryptionConfiguration buildIdTokenEncryptionConfiguration(OAuthConsumerAppDTO appDTO) {

        return new IdTokenEncryptionConfiguration()
                .enabled(appDTO.isIdTokenEncryptionEnabled())
                .algorithm(appDTO.getIdTokenEncryptionAlgorithm())
                .method(appDTO.getIdTokenEncryptionMethod());
    }

    private static List<String> buildGrantTypeList(OAuthConsumerAppDTO oauthApp) {

        return oauthApp.getGrantTypes() != null ?
                Arrays.asList(oauthApp.getGrantTypes().split("\\s+")) : new ArrayList<>();
    }

    private static List<String> getAllowedOrigins(OAuthConsumerAppDTO oauthApp) {

        return Collections.emptyList();
    }

    private static List<String> getCallbackUrls(OAuthConsumerAppDTO oauthApp) {

        List<String> callbackUris = new ArrayList<>();
        if (StringUtils.isNotBlank(oauthApp.getCallbackUrl())) {
            callbackUris.add(oauthApp.getCallbackUrl());
        }
        return callbackUris;
    }
}
