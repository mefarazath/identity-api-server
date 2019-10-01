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
package org.wso2.carbon.identity.rest.api.server.application.management.v1.core;

import org.wso2.carbon.identity.api.server.application.management.common.ApplicationManagementServiceHolder;
import org.wso2.carbon.identity.api.server.common.ContextLoader;
import org.wso2.carbon.identity.application.common.IdentityApplicationManagementException;
import org.wso2.carbon.identity.application.common.model.ApplicationBasicInfo;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.ApplicationBasicInfoDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.ApplicationListResponseDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Calls internal osgi services to perform server application management related operations.
 */
public class ServerApplicationManagementService {

    public ApplicationListResponseDTO getAllApplications(Integer limit,
                                                         Integer offset,
                                                         String filter,
                                                         String sort,
                                                         String sortBy,
                                                         String requiredAttributes) {

        ApplicationListResponseDTO applicationListResponseDTO = new ApplicationListResponseDTO();

        try {
            ApplicationBasicInfo[] allApplicationBasicInfo =
                    ApplicationManagementServiceHolder.getApplicationManagementService().getAllApplicationBasicInfo(
                            ContextLoader.getUsernameFromContext(),
                            ContextLoader.getTenantDomainFromContext()
                    );

            applicationListResponseDTO.setApplications(getApplicationListItemDTOs(allApplicationBasicInfo));
            applicationListResponseDTO.setTotalResults(allApplicationBasicInfo.length);
        } catch (IdentityApplicationManagementException e) {
            //
        }

        return applicationListResponseDTO;
    }

    private List<ApplicationBasicInfoDTO> getApplicationListItemDTOs(ApplicationBasicInfo[] allApplicationBasicInfo) {

        List<ApplicationBasicInfoDTO> apps = new ArrayList<>();

        for (ApplicationBasicInfo appBasicInfo : allApplicationBasicInfo) {

            ApplicationBasicInfoDTO dto = new ApplicationBasicInfoDTO();
            dto.setId(String.valueOf(appBasicInfo.getApplicationId()));
            dto.setDescription(appBasicInfo.getDescription());
            dto.setName(appBasicInfo.getApplicationName());
            apps.add(dto);
        }

        return apps;
    }

}
