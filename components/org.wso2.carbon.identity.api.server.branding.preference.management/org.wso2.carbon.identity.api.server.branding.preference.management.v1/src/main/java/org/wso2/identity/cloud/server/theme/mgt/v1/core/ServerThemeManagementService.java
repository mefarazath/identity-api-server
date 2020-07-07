/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.identity.cloud.server.theme.mgt.v1.core;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.identity.api.server.common.ContextLoader;
import org.wso2.carbon.identity.api.server.common.error.APIError;
import org.wso2.carbon.identity.api.server.common.error.ErrorResponse;
import org.wso2.carbon.identity.branding.preference.mgt.exception.ThemeManagementException;
import org.wso2.carbon.identity.branding.preference.mgt.model.Theme;
import org.wso2.identity.cloud.server.theme.mgt.v1.core.functions.ApiModelToTheme;
import org.wso2.identity.cloud.server.theme.mgt.v1.core.functions.ThemeToApiModel;
import org.wso2.identity.cloud.server.theme.mgt.v1.model.TenantPreferenceModel;

import javax.ws.rs.core.Response;

import static org.wso2.identity.cloud.server.theme.mgt.common.ThemeManagementServiceHolder.getThemeManagementService;

/**
 * Calls internal osgi services to perform server theme management related operations.
 */
public class ServerThemeManagementService {

    private static final Log log = LogFactory.getLog(ServerThemeManagementService.class);

    public TenantPreferenceModel getTheme() {

        String tenantDomain = ContextLoader.getTenantDomainFromContext();
        try {
            Theme theme = getThemeManagementService().getTheme(tenantDomain);
            return new ThemeToApiModel().apply(theme);
        } catch (ThemeManagementException e) {
            // TODO: handle client and server errors.
            throw buildServerError("Error while retrieving theme preferences.", e);
        }
    }

    public void putTheme(TenantPreferenceModel themeApiModel) {

        String tenantDomain = ContextLoader.getTenantDomainFromContext();
        try {
            Theme themeToUpdate = new ApiModelToTheme().apply(themeApiModel);
            getThemeManagementService().putTheme(tenantDomain, themeToUpdate);
        } catch (ThemeManagementException e) {
            // TODO: handle client and server errors.
            throw buildServerError("Error while updating theme preferences.", e);
        }
    }

    public static APIError buildServerError(String errorDescription, Exception e) {

        String errorCode = "TMT-50001";
        String errorMessage = "Server error while performing the attempted operation.";

        return buildServerError(errorCode, errorMessage, errorDescription, e);
    }

    public static APIError buildServerError(String errorCode, String message, String description, Exception e) {

        ErrorResponse errorResponse = new ErrorResponse.Builder()
                .withCode(errorCode)
                .withMessage(message)
                .withDescription(description)
                .build(log, e, description);

        Response.Status status = Response.Status.INTERNAL_SERVER_ERROR;
        return new APIError(status, errorResponse);
    }
}
