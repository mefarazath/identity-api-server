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
import org.wso2.carbon.identity.api.server.common.ContextLoader;
import org.wso2.carbon.identity.api.server.common.error.APIError;
import org.wso2.carbon.identity.api.server.common.error.ErrorResponse;
import org.wso2.carbon.identity.application.common.IdentityApplicationManagementException;
import org.wso2.carbon.identity.application.common.model.ApplicationBasicInfo;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Response;

/**
 * Calls internal osgi services to perform server application management related operations.
 */
public class ServerApplicationManagementService {

    private static final Log LOG = LogFactory.getLog(ServerApplicationManagementService.class);

    public ApplicationListResponse getAllApplications(Integer limit,
                                                      Integer offset,
                                                      String filter,
                                                      String sort,
                                                      String sortBy,
                                                      String requiredAttributes) {

        limit = limit != null ? limit : 10;
        offset = offset != null ? offset : 0;
        filter = StringUtils.isNotBlank(filter) ? filter : "*";

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
            throw handleApplicationManagementException(e);
        }

        return applicationListResponse;
    }

    private APIError handleApplicationManagementException(IdentityApplicationManagementException e) {

        ErrorResponse.Builder builder = new ErrorResponse.Builder();
        ErrorResponse errorResponse = builder.build(LOG, e, "Error while retrieving all applications.");

        Response.Status status = Response.Status.INTERNAL_SERVER_ERROR;
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

}
