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

package org.wso2.carbon.identity.rest.api.server.application.v1.impl;

import org.wso2.carbon.identity.rest.api.server.application.v1.ApplicationsApiService;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.AdvancedAuthenticationConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ApplicationPermissionsDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ApplicationRequestDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ApplicationResponseDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.AuthenticationSequenceDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ClaimConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.CustomInboundProtcolParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.InboundProtocolsDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.KerberosKDCParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.OIDCParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.PassiveSTSParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ProvisioningConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.SAML2ParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.WSTrustParametersDTO;

import javax.ws.rs.core.Response;

/**
 * Implementation of ApplicationsApiService.
 */
public class ApplicationsApiServiceImpl extends ApplicationsApiService {

    @Override
    public Response applicationsApplicationIdAdvancedConfigsDelete(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAdvancedConfigsGet(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAdvancedConfigsPut(
            String applicationId, AdvancedAuthenticationConfigurationDTO advancedConfigurations) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsDelete(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsGet(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
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
    public Response applicationsApplicationIdAuthProtocolsOidcDelete(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsOidcGet(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsOidcPut(String applicationId, OIDCParametersDTO parameters) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsOidcRegenerateSecretPost(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsOidcRevokePost(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsPassiveStsDelete(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsPassiveStsGet(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsPassiveStsPut(String applicationId,
                                                                        PassiveSTSParametersDTO parameters) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsPut(String applicationId,
                                                              InboundProtocolsDTO inboundProtocols) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsSamlDelete(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsSamlGet(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsSamlPut(String applicationId,
                                                                  SAML2ParametersDTO saml2Configuration) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsWsTrustDelete(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsWsTrustGet(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdAuthProtocolsWsTrustPut(String applicationId,
                                                                     WSTrustParametersDTO parameters) {
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
    public Response applicationsApplicationIdDelete(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdGet(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdPermissionsDelete(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdPermissionsGet(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsApplicationIdPermissionsPut(String applicationId,
                                                            ApplicationPermissionsDTO permissions) {
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
    public Response applicationsApplicationIdPut(String applicationId, ApplicationResponseDTO application) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsGet(Integer limit, Integer offset, String filter, String sort, String sortBy,
                                    String requiredAttributes) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsPost(ApplicationRequestDTO application) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsResidentGet() {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response applicationsResidentPut(ProvisioningConfigurationDTO provisioningConfiguration) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }
}
