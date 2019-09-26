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

package org.wso2.carbon.identity.rest.api.server.application.v1;

import org.wso2.carbon.identity.rest.api.server.application.v1.*;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.*;

import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ErrorDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.AdvancedAuthenticationConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.InboundProtocolsDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.CustomInboundProtcolParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.KerberosKDCParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.OIDCParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.PassiveSTSParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.SAML2ParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.WSTrustParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.AuthenticationSequenceDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ClaimConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ApplicationResponseDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ApplicationPermissionsDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ProvisioningConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ApplicationListResponseDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ApplicationRequestDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ResidentApplicationDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public abstract class ApplicationsApiService {
    public abstract Response applicationsApplicationIdAdvancedConfigsDelete(String applicationId);
    public abstract Response applicationsApplicationIdAdvancedConfigsGet(String applicationId);
    public abstract Response applicationsApplicationIdAdvancedConfigsPut(String applicationId,AdvancedAuthenticationConfigurationDTO advancedConfigurations);
    public abstract Response applicationsApplicationIdAuthProtocolsDelete(String applicationId);
    public abstract Response applicationsApplicationIdAuthProtocolsGet(String applicationId);
    public abstract Response applicationsApplicationIdAuthProtocolsInboundProtocolIdDelete(String applicationId,String inboundProtocolId);
    public abstract Response applicationsApplicationIdAuthProtocolsInboundProtocolIdGet(String applicationId,String inboundProtocolId);
    public abstract Response applicationsApplicationIdAuthProtocolsInboundProtocolIdPut(String applicationId,String inboundProtocolId,CustomInboundProtcolParametersDTO parameters);
    public abstract Response applicationsApplicationIdAuthProtocolsKerberosKdcDelete(String applicationId);
    public abstract Response applicationsApplicationIdAuthProtocolsKerberosKdcGet(String applicationId);
    public abstract Response applicationsApplicationIdAuthProtocolsKerberosKdcPut(String applicationId,KerberosKDCParametersDTO parameters);
    public abstract Response applicationsApplicationIdAuthProtocolsOidcDelete(String applicationId);
    public abstract Response applicationsApplicationIdAuthProtocolsOidcGet(String applicationId);
    public abstract Response applicationsApplicationIdAuthProtocolsOidcPut(String applicationId,OIDCParametersDTO parameters);
    public abstract Response applicationsApplicationIdAuthProtocolsOidcRegenerateSecretPost(String applicationId);
    public abstract Response applicationsApplicationIdAuthProtocolsOidcRevokePost(String applicationId);
    public abstract Response applicationsApplicationIdAuthProtocolsPassiveStsDelete(String applicationId);
    public abstract Response applicationsApplicationIdAuthProtocolsPassiveStsGet(String applicationId);
    public abstract Response applicationsApplicationIdAuthProtocolsPassiveStsPut(String applicationId,PassiveSTSParametersDTO parameters);
    public abstract Response applicationsApplicationIdAuthProtocolsPut(String applicationId,InboundProtocolsDTO inboundProtocols);
    public abstract Response applicationsApplicationIdAuthProtocolsSamlDelete(String applicationId);
    public abstract Response applicationsApplicationIdAuthProtocolsSamlGet(String applicationId);
    public abstract Response applicationsApplicationIdAuthProtocolsSamlPut(String applicationId,SAML2ParametersDTO saml2Configuration);
    public abstract Response applicationsApplicationIdAuthProtocolsWsTrustDelete(String applicationId);
    public abstract Response applicationsApplicationIdAuthProtocolsWsTrustGet(String applicationId);
    public abstract Response applicationsApplicationIdAuthProtocolsWsTrustPut(String applicationId,WSTrustParametersDTO parameters);
    public abstract Response applicationsApplicationIdAuthenticationSequencesDelete(String applicationId);
    public abstract Response applicationsApplicationIdAuthenticationSequencesGet(String applicationId);
    public abstract Response applicationsApplicationIdAuthenticationSequencesPut(String applicationId,AuthenticationSequenceDTO provisioningConfigurations);
    public abstract Response applicationsApplicationIdClaimsDelete(String applicationId);
    public abstract Response applicationsApplicationIdClaimsGet(String applicationId);
    public abstract Response applicationsApplicationIdClaimsPut(String applicationId,ClaimConfigurationDTO application);
    public abstract Response applicationsApplicationIdDelete(String applicationId);
    public abstract Response applicationsApplicationIdGet(String applicationId);
    public abstract Response applicationsApplicationIdPermissionsDelete(String applicationId);
    public abstract Response applicationsApplicationIdPermissionsGet(String applicationId);
    public abstract Response applicationsApplicationIdPermissionsPut(String applicationId,ApplicationPermissionsDTO permissions);
    public abstract Response applicationsApplicationIdProvisioningConfigsDelete(String applicationId);
    public abstract Response applicationsApplicationIdProvisioningConfigsGet(String applicationId);
    public abstract Response applicationsApplicationIdProvisioningConfigsPut(String applicationId,ProvisioningConfigurationDTO provisioningConfiguration);
    public abstract Response applicationsApplicationIdPut(String applicationId,ApplicationResponseDTO application);
    public abstract Response applicationsGet(Integer limit,Integer offset,String filter,String sort,String sortBy,String requiredAttributes);
    public abstract Response applicationsPost(ApplicationRequestDTO application);
    public abstract Response applicationsResidentGet();
    public abstract Response applicationsResidentPut(ProvisioningConfigurationDTO provisioningConfiguration);
}

