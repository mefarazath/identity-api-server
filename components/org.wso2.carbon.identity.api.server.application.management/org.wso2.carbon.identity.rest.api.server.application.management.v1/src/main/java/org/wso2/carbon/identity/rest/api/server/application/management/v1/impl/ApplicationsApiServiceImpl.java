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

package org.wso2.carbon.identity.rest.api.server.application.management.v1.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.ApplicationsApiService;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.core.ServerApplicationManagementService;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.AdvancedAuthenticationConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.ApplicationRequestDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.ApplicationResponseDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.AuthenticationSequenceDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.ClaimConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.CustomInboundProtcolParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.InboundProtocolsDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.KerberosKDCParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.OIDCParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.PassiveSTSParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.ProvisioningConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.SAML2ParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.WSTrustParametersDTO;

import javax.ws.rs.core.Response;

/**
 * Implementation of ApplicationsApiService.
 */
public class ApplicationsApiServiceImpl extends ApplicationsApiService {

    @Autowired
    private ServerApplicationManagementService applicationManagementService;

    @Override
    public Response getApplications(Integer limit,
                                    Integer offset,
                                    String filter,
                                    String sort,
                                    String sortBy,
                                    String requiredAttributes) {

        return Response.ok().entity("Response From getApplications!!!!!").build();
    }

    @Override
    public Response getApplication(String applicationId) {

        return null;
    }

    @Override
    public Response createApplication(ApplicationRequestDTO application) {

        return null;
    }

    @Override
    public Response updateApplication(String applicationId, ApplicationResponseDTO application) {

        return null;
    }

    @Override
    public Response deleteApplication(String applicationId) {

        return null;
    }

    @Override
    public Response getInboundAuthenticationConfigurations(String applicationId) {

        return null;
    }

    @Override
    public Response getInboundOAuthConfiguration(String applicationId) {

        return null;
    }

    @Override
    public Response getInboundSAMLConfiguration(String applicationId) {

        return null;
    }

    @Override
    public Response getPassiveStsConfiguration(String applicationId) {

        return null;
    }

    @Override
    public Response getResidentApplication() {

        return null;
    }

    @Override
    public Response getWSTrustConfiguration(String applicationId) {

        return null;
    }

    @Override
    public Response regenerateOAuthApplicationSecret(String applicationId) {

        return null;
    }

    @Override
    public Response revokeOAuthApplication(String applicationId) {

        return null;
    }

    @Override
    public Response updateAdvancedConfigurations(String applicationId,
                                                 AdvancedAuthenticationConfigurationDTO advancedConfigurations) {

        return null;
    }

    @Override
    public Response deleteInboundAuthenticationConfigurations(String applicationId) {

        return null;
    }

    @Override
    public Response deleteInboundOAuthConfiguration(String applicationId) {

        return null;
    }

    @Override
    public Response deleteInboundSAMLConfiguration(String applicationId) {

        return null;
    }

    @Override
    public Response deletePassiveStsConfiguration(String applicationId) {

        return null;
    }

    @Override
    public Response deleteWSTrustConfiguration(String applicationId) {

        return null;
    }

    @Override
    public Response getAdvancedConfigurations(String applicationId) {

        return null;
    }

    @Override
    public Response updateInboundAuthenticationConfigurations(String applicationId,
                                                              InboundProtocolsDTO inboundProtocols) {

        return null;
    }

    @Override
    public Response updateInboundOAuthConfiguration(String applicationId, OIDCParametersDTO parameters) {

        return null;
    }

    @Override
    public Response updateInboundSAMLConfiguration(String applicationId, SAML2ParametersDTO saml2Configuration) {

        return null;
    }

    @Override
    public Response updatePassiveStsConfiguration(String applicationId, PassiveSTSParametersDTO parameters) {

        return null;
    }

    @Override
    public Response updateResidentApplication(ProvisioningConfigurationDTO provisioningConfiguration) {

        return null;
    }

    @Override
    public Response updateWSTrustConfiguration(String applicationId, WSTrustParametersDTO parameters) {

        return null;
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsInboundProtocolIdDelete(String applicationId,
                                                                                  String inboundProtocolId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsInboundProtocolIdGet(String applicationId,
                                                                               String inboundProtocolId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsInboundProtocolIdPut(
            String applicationId, String inboundProtocolId, CustomInboundProtcolParametersDTO parameters) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsKerberosKdcDelete(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsKerberosKdcGet(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsKerberosKdcPut(String applicationId,
                                                                         KerberosKDCParametersDTO parameters) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthenticationSequencesDelete(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthenticationSequencesGet(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthenticationSequencesPut(
            String applicationId, AuthenticationSequenceDTO provisioningConfigurations) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdClaimsDelete(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdClaimsGet(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdClaimsPut(String applicationId, ClaimConfigurationDTO application) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdProvisioningConfigsDelete(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdProvisioningConfigsGet(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdProvisioningConfigsPut(
            String applicationId, ProvisioningConfigurationDTO provisioningConfiguration) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response deleteAdvancedConfigurations(String applicationId) {

        return null;
    }
}
