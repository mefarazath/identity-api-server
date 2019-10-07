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
package org.wso2.carbon.identity.api.server.application.management.v1.core;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.identity.api.server.application.management.common.ApplicationManagementServiceHolder;
import org.wso2.carbon.identity.api.server.application.management.v1.ApplicationBasicInformation;
import org.wso2.carbon.identity.api.server.application.management.v1.ApplicationListResponse;
import org.wso2.carbon.identity.api.server.application.management.v1.ApplicationResponse;
import org.wso2.carbon.identity.api.server.application.management.v1.InboundProtocols;
import org.wso2.carbon.identity.api.server.application.management.v1.OpenIDConnectConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.SAML2Configuration;
import org.wso2.carbon.identity.api.server.common.ContextLoader;
import org.wso2.carbon.identity.api.server.common.error.APIError;
import org.wso2.carbon.identity.api.server.common.error.ErrorResponse;
import org.wso2.carbon.identity.application.common.IdentityApplicationManagementException;
import org.wso2.carbon.identity.application.common.model.ApplicationBasicInfo;
import org.wso2.carbon.identity.application.common.model.InboundAuthenticationConfig;
import org.wso2.carbon.identity.application.common.model.InboundAuthenticationRequestConfig;
import org.wso2.carbon.identity.application.common.model.ServiceProvider;
import org.wso2.carbon.identity.oauth.IdentityOAuthAdminException;
import org.wso2.carbon.identity.oauth.dto.OAuthConsumerAppDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.ws.rs.core.Response;

/**
 * Calls internal osgi services to perform server application management related operations.
 */
public class ServerApplicationManagementService {

    private static final Log LOG = LogFactory.getLog(ServerApplicationManagementService.class);

    private static final List<String> SEARCH_SUPPORTED_FIELDS = new ArrayList<>();

    private static final String APP_NAME = "name";

    // Filter related constants.
    private static final String FILTER_STARTS_WITH = "sw";
    private static final String FILTER_ENDS_WITH = "ew";
    private static final String FILTER_EQUALS = "eq";
    private static final String FILTER_CONTAINS = "co";

    static {
        SEARCH_SUPPORTED_FIELDS.add(APP_NAME);
    }

    public ApplicationListResponse getAllApplications(Integer limit,
                                                      Integer offset,
                                                      String filter,
                                                      String sort,
                                                      String sortBy,
                                                      String requiredAttributes) {

        limit = limit != null ? limit : 10;
        offset = offset != null ? offset : 0;
        filter = buildFilter(filter);

        // TODO handle unsupported attributes.
        ApplicationListResponse applicationListResponse = new ApplicationListResponse();
        try {
            String username = ContextLoader.getUsernameFromContext();
            String tenantDomainFromContext = ContextLoader.getTenantDomainFromContext();

            int totalApps = ApplicationManagementServiceHolder
                    .getApplicationManagementService().getCountOfAllApplications(tenantDomainFromContext, username);

            ApplicationBasicInfo[] allApplicationBasicInfo =
                    ApplicationManagementServiceHolder.getApplicationManagementService()
                            .getApplicationBasicInfo(tenantDomainFromContext, username, filter, offset, limit);

            applicationListResponse.totalResults(totalApps)
                    .startIndex(offset)
                    .limitPerPage(limit)
                    .applications(getApplicationListItems(allApplicationBasicInfo));
        } catch (IdentityApplicationManagementException e) {
            throw handleServerError(e, "Error while retrieving all applications.");
        }

        return applicationListResponse;
    }

    public ApplicationResponse getApplication(String applicationId) {

        int id = Integer.parseInt(applicationId);
        try {
            ServiceProvider serviceProvider =
                    ApplicationManagementServiceHolder.getApplicationManagementService().getServiceProvider(id);

            if (serviceProvider == null) {
                throw handleApplicationNotFoundException();
            }

            return buildApplicationResponse(serviceProvider);
        } catch (IdentityApplicationManagementException e) {
            throw handleServerError(e, "Error while retrieving application with id: " + applicationId);
        }
    }

    private ApplicationResponse buildApplicationResponse(ServiceProvider serviceProvider) {

        return new ApplicationResponse()
                .id(String.valueOf(serviceProvider.getApplicationID()))
                .name(serviceProvider.getApplicationName())
                .description(serviceProvider.getDescription())
                .inboundProtocolConfiguration(buildInboundProtocols(serviceProvider.getInboundAuthenticationConfig()));
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
                    default:
                        break;

                }
            }
        }

        return inboundProtocols;
    }

    private OpenIDConnectConfiguration buildOpenIdConnectConfiguration(InboundAuthenticationRequestConfig inboundAuth) {

        String clientID = inboundAuth.getInboundAuthKey();

        try {
            OAuthConsumerAppDTO oauthApp =
                    ApplicationManagementServiceHolder.getOAuthAdminService().getOAuthApplicationData(clientID);

            return new OpenIDConnectConfiguration()
                    .clientId(oauthApp.getOauthConsumerKey())
                    .clientSecret(oauthApp.getOauthConsumerSecret())
                    .grantTypes(buildGrantTypeList(oauthApp))
                    .state(OpenIDConnectConfiguration.StateEnum.valueOf(oauthApp.getState()))
                    .callbackURLs(getCallbackUrls(oauthApp))
                    .allowedOrigins(getAllowedOrigins(oauthApp))
                    .publicClient(oauthApp.isBypassClientCredentials())
                    ;

        } catch (IdentityOAuthAdminException e) {
            throw handleServerError(e, "Error while retrieving oauth application data for clientId: " + clientID);
        }
    }

    private List<String> getAllowedOrigins(OAuthConsumerAppDTO oauthApp) {

        return Collections.emptyList();
    }

    private List<String> getCallbackUrls(OAuthConsumerAppDTO oauthApp) {

        List<String> callbackUris = new ArrayList<>();
        if (StringUtils.isNotBlank(oauthApp.getCallbackUrl())) {
            callbackUris.add(oauthApp.getCallbackUrl());
        }
        return callbackUris;
    }

    private List<String> buildGrantTypeList(OAuthConsumerAppDTO oauthApp) {

        return oauthApp.getGrantTypes() != null ?
                Arrays.asList(oauthApp.getGrantTypes().split("\\s+")) : new ArrayList<>();
    }

    private SAML2Configuration buildSaml2Configuration(InboundAuthenticationRequestConfig inboundAuth) {

        return new SAML2Configuration();
    }

    private APIError handleServerError(Exception e, String message) {

        ErrorResponse.Builder builder = new ErrorResponse.Builder();
        ErrorResponse errorResponse = builder.build(LOG, e, message);

        Response.Status status = Response.Status.INTERNAL_SERVER_ERROR;
        return new APIError(status, errorResponse);
    }

    private APIError handleApplicationNotFoundException() {

        ErrorResponse.Builder builder = new ErrorResponse.Builder();
        ErrorResponse errorResponse = builder.build(LOG, null, "Resource not found.");

        Response.Status status = Response.Status.NOT_FOUND;
        return new APIError(status, errorResponse);
    }

    private APIError buildBadRequestException(String message) {

        ErrorResponse.Builder builder = new ErrorResponse.Builder();
        ErrorResponse errorResponse = builder.build(LOG, null, message);

        Response.Status status = Response.Status.BAD_REQUEST;
        return new APIError(status, errorResponse);
    }

    private List<ApplicationBasicInformation> getApplicationListItems(ApplicationBasicInfo[] allApplicationBasicInfo) {

        List<ApplicationBasicInformation> apps = new ArrayList<>();

        for (ApplicationBasicInfo appBasicInfo : allApplicationBasicInfo) {
            ApplicationBasicInformation appBasicInfoBean = new ApplicationBasicInformation()
                    .id(String.valueOf(appBasicInfo.getApplicationId()))
                    .description(appBasicInfo.getDescription())
                    .name(appBasicInfo.getApplicationName());

            apps.add(appBasicInfoBean);
        }

        return apps;
    }

    private String buildFilter(String filter) {

        if (StringUtils.isNotBlank(filter)) {
            String[] filterArgs = filter.split(" ");
            if (filterArgs.length == 3) {

                String searchField = filterArgs[0];
                if (SEARCH_SUPPORTED_FIELDS.contains(searchField)) {
                    String searchOperation = filterArgs[1];
                    String searchValue = filterArgs[2];
                    return generateFilterStringForBackend(searchField, searchOperation, searchValue);
                } else {
                    // throw error;
                    throw buildBadRequestException("Unsupported search field: " + searchField);
                }

            } else {
                throw buildBadRequestException("Invalid filter string");
            }
        } else {
            return null;
        }
    }

    private String generateFilterStringForBackend(String searchField, String searchOperation, String searchValue) {

        // We do not have support for searching any fields other than the name. Therefore we simply format the search
        // value based on the search operation.
        String formattedFilter;
        switch (searchOperation) {
            case FILTER_STARTS_WITH:
                formattedFilter = searchValue + "*";
                break;
            case FILTER_ENDS_WITH:
                formattedFilter = "*" + searchValue;
                break;
            case FILTER_EQUALS:
                formattedFilter = searchValue;
                break;
            case FILTER_CONTAINS:
                formattedFilter = "*" + searchValue + "*";
                break;
            default:
                throw buildBadRequestException("Unsupported filter operation: " + searchOperation);
        }

        return formattedFilter;
    }

}
