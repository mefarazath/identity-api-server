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

package org.wso2.carbon.identity.rest.api.server.application.management.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.*;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.ApplicationsApiService;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.factories.ApplicationsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.ErrorDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.CustomInboundProtcolParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.KerberosKDCParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.AuthenticationSequenceDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.ClaimConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.ProvisioningConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.ApplicationRequestDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.ApplicationResponseDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.AdvancedAuthenticationConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.ApplicationListResponseDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.InboundProtocolsDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.OIDCParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.SAML2ParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.PassiveSTSParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.ResidentApplicationDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.WSTrustParametersDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/applications")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/applications", description = "the applications API")
public class ApplicationsApi  {

   @Autowired
   private ApplicationsApiService delegate;

    @Valid
    @DELETE
    @Path("/{applicationId}/auth-protocols/{inboundProtocolId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Custom Inbound authentication protocol parameters of an application.\n", notes = "This API provides the capability to delete Custom Inbound authentication protocol of an application.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Delete Success"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response applicationsApplicationIdAuthProtocolsInboundProtocolIdDelete(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId,
    @ApiParam(value = "Inbound Authentication Protocol ID",required=true ) @PathParam("inboundProtocolId")  String inboundProtocolId)
    {
    return delegate.applicationsApplicationIdAuthProtocolsInboundProtocolIdDelete(applicationId,inboundProtocolId);
    }
    @Valid
    @GET
    @Path("/{applicationId}/auth-protocols/{inboundProtocolId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve Custom Inbound authentication protocol parameters of an application.\n", notes = "This API provides the capability to retrieve Custom Inbound authentication protocol parameters of an application.\n", response = CustomInboundProtcolParametersDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response applicationsApplicationIdAuthProtocolsInboundProtocolIdGet(@ApiParam(value = "Id of the application",required=true ) @PathParam("applicationId")  String applicationId,
    @ApiParam(value = "Inbound Authentication Protocol ID",required=true ) @PathParam("inboundProtocolId")  String inboundProtocolId)
    {
    return delegate.applicationsApplicationIdAuthProtocolsInboundProtocolIdGet(applicationId,inboundProtocolId);
    }
    @Valid
    @PUT
    @Path("/{applicationId}/auth-protocols/{inboundProtocolId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update WS Trust authentication protocol parameters of an application.\n", notes = "This API provides the capability to store WS Trust authentication protocol parameters of an application.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful response."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response applicationsApplicationIdAuthProtocolsInboundProtocolIdPut(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId,
    @ApiParam(value = "Inbound Authentication Protocol ID",required=true ) @PathParam("inboundProtocolId")  String inboundProtocolId,
    @ApiParam(value = "This represents the Custom Inbound authentication protocol parameters of an application." ,required=true ) @Valid CustomInboundProtcolParametersDTO parameters)
    {
    return delegate.applicationsApplicationIdAuthProtocolsInboundProtocolIdPut(applicationId,inboundProtocolId,parameters);
    }
    @Valid
    @DELETE
    @Path("/{applicationId}/auth-protocols/kerberos-kdc")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Kerberos KDC parameters of an application.\n", notes = "This API provides the capability to delete Kerberos KDC parameters of an application.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Delete Success"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response applicationsApplicationIdAuthProtocolsKerberosKdcDelete(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.applicationsApplicationIdAuthProtocolsKerberosKdcDelete(applicationId);
    }
    @Valid
    @GET
    @Path("/{applicationId}/auth-protocols/kerberos-kdc")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve Kerberos KDC parameters of an application.\n", notes = "This API provides the capability to retrieve Kerberos KDC parameters of the application.\n", response = KerberosKDCParametersDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response applicationsApplicationIdAuthProtocolsKerberosKdcGet(@ApiParam(value = "Id of the application",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.applicationsApplicationIdAuthProtocolsKerberosKdcGet(applicationId);
    }
    @Valid
    @PUT
    @Path("/{applicationId}/auth-protocols/kerberos-kdc")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Kerberos KDC parameters of an application.\n", notes = "This API provides the capability to update the Kerberos KDC protocol parameters of an application.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful response."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response applicationsApplicationIdAuthProtocolsKerberosKdcPut(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId,
    @ApiParam(value = "This represents the Kerberos KDC configuration of an application." ,required=true ) @Valid KerberosKDCParametersDTO parameters)
    {
    return delegate.applicationsApplicationIdAuthProtocolsKerberosKdcPut(applicationId,parameters);
    }
    @Valid
    @DELETE
    @Path("/{applicationId}/authentication-sequences")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete authentication sequence of an application by id\n", notes = "This API provides the capability to delete the authentication sequence an application by id.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Successfully Deleted"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response applicationsApplicationIdAuthenticationSequencesDelete(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.applicationsApplicationIdAuthenticationSequencesDelete(applicationId);
    }
    @Valid
    @GET
    @Path("/{applicationId}/authentication-sequences")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrive authentication sequence of application by id\n", notes = "This API provides the capability to retrive authentication sequence of an application by id.\n", response = AuthenticationSequenceDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response applicationsApplicationIdAuthenticationSequencesGet(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.applicationsApplicationIdAuthenticationSequencesGet(applicationId);
    }
    @Valid
    @PUT
    @Path("/{applicationId}/authentication-sequences")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update the the authentication sequence of an application by id\n", notes = "This API provides the capability to update the authentication sequence of an application by id.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful response."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response applicationsApplicationIdAuthenticationSequencesPut(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId,
    @ApiParam(value = "This represents provisioning configurations of the application to be updated." ,required=true ) @Valid AuthenticationSequenceDTO provisioningConfigurations)
    {
    return delegate.applicationsApplicationIdAuthenticationSequencesPut(applicationId,provisioningConfigurations);
    }
    @Valid
    @DELETE
    @Path("/{applicationId}/claims")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete claim configuration of an application by id\n", notes = "This API provides the capability to delete an application by id.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Successfully Deleted"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response applicationsApplicationIdClaimsDelete(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.applicationsApplicationIdClaimsDelete(applicationId);
    }
    @Valid
    @GET
    @Path("/{applicationId}/claims")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrive claim configuration application by id\n", notes = "This API provides the capability to retrive the application claim configuration by id.\n", response = ClaimConfigurationDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response applicationsApplicationIdClaimsGet(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.applicationsApplicationIdClaimsGet(applicationId);
    }
    @Valid
    @PUT
    @Path("/{applicationId}/claims")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update the claim configuration of an application by id\n", notes = "This API provides the capability to update claim configuration of an application.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful response."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response applicationsApplicationIdClaimsPut(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId,
    @ApiParam(value = "This represents the application to be updated." ,required=true ) @Valid ClaimConfigurationDTO application)
    {
    return delegate.applicationsApplicationIdClaimsPut(applicationId,application);
    }
    @Valid
    @DELETE
    @Path("/{applicationId}/provisioning-configs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete provisioning configurations of an application by id\n", notes = "This API provides the capability to delete provisioning configurations an application by id.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Successfully Deleted"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response applicationsApplicationIdProvisioningConfigsDelete(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.applicationsApplicationIdProvisioningConfigsDelete(applicationId);
    }
    @Valid
    @GET
    @Path("/{applicationId}/provisioning-configs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrive provisioning configurations of application by id\n", notes = "This API provides the capability to retrive the provisioning configurations of an application by id.\n", response = ProvisioningConfigurationDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response applicationsApplicationIdProvisioningConfigsGet(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.applicationsApplicationIdProvisioningConfigsGet(applicationId);
    }
    @Valid
    @PUT
    @Path("/{applicationId}/provisioning-configs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update the the provisioning configurations of an application by id\n", notes = "This API provides the capability to update the provisioning configurations of an application by id.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful response."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response applicationsApplicationIdProvisioningConfigsPut(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId,
    @ApiParam(value = "This represents provisioning configurations of the application to be updated." ,required=true ) @Valid ProvisioningConfigurationDTO provisioningConfiguration)
    {
    return delegate.applicationsApplicationIdProvisioningConfigsPut(applicationId,provisioningConfiguration);
    }
    @Valid
    @POST
    
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add application\n", notes = "This API provides the capability to store the application information provided by users.\n", response = ApplicationResponseDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful response."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response createApplication(@ApiParam(value = "This represents the application to be created." ,required=true ) @Valid ApplicationRequestDTO application)
    {
    return delegate.createApplication(application);
    }
    @Valid
    @DELETE
    @Path("/{applicationId}/advanced-configs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete advanced configurations of an application by id\n", notes = "This API provides the capability to delete advanced configurations an application by id.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Successfully Deleted"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response deleteAdvancedConfigurations(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.deleteAdvancedConfigurations(applicationId);
    }
    @Valid
    @DELETE
    @Path("/{applicationId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete an application by id\n", notes = "This API provides the capability to delete an application by id.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Successfully Deleted"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response deleteApplication(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.deleteApplication(applicationId);
    }
    @Valid
    @DELETE
    @Path("/{applicationId}/auth-protocols/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete inbound protocol configurations of an application.\n", notes = "This API provides the capability to delete inbound protocol configurations of an application.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Delete successful"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response deleteInboundAuthenticationConfigurations(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.deleteInboundAuthenticationConfigurations(applicationId);
    }
    @Valid
    @DELETE
    @Path("/{applicationId}/auth-protocols/oidc")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete OIDC authentication protocol parameters of an application.\n", notes = "This API provides the capability to delete OIDC authentication protocol parameters of an application.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Delete Success"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response deleteInboundOAuthConfiguration(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.deleteInboundOAuthConfiguration(applicationId);
    }
    @Valid
    @DELETE
    @Path("/{applicationId}/auth-protocols/saml")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete SAML2 authentication protocol parameters of an application.\n", notes = "This API provides the capability to delete SAML2 authentication protocol parameters of an application.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Delete successful"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response deleteInboundSAMLConfiguration(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.deleteInboundSAMLConfiguration(applicationId);
    }
    @Valid
    @DELETE
    @Path("/{applicationId}/auth-protocols/passive-sts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Passive STS authentication protocol parameters of an application.\n", notes = "This API provides the capability to delete Passive STS authentication protocol parameters of an application.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Delete Success"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response deletePassiveStsConfiguration(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.deletePassiveStsConfiguration(applicationId);
    }
    @Valid
    @DELETE
    @Path("/{applicationId}/auth-protocols/ws-trust")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete WS Trust authentication protocol parameters of an application.\n", notes = "This API provides the capability to delete WS Trust authentication protocol parameters of an application.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Delete Success"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response deleteWSTrustConfiguration(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.deleteWSTrustConfiguration(applicationId);
    }
    @Valid
    @GET
    @Path("/{applicationId}/advanced-configs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrive advanced configurations of an application by id\n", notes = "This API provides the capability to retrive the advanced configurations of an application by id.\n", response = AdvancedAuthenticationConfigurationDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response getAdvancedConfigurations(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.getAdvancedConfigurations(applicationId);
    }
    @Valid
    @GET
    @Path("/{applicationId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrive application by id\n", notes = "This API provides the capability to retrive the application information by id.\n", response = ApplicationResponseDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response getApplication(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.getApplication(applicationId);
    }
    @Valid
    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "List applications\n", notes = "This API provides the capability to retrive the list of applications.\n", response = ApplicationListResponseDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response getApplications(@ApiParam(value = "Maximum number of records to return.\n") @QueryParam("limit")  Integer limit,
    @ApiParam(value = "Number of records to skip for pagination.\n") @QueryParam("offset")  Integer offset,
    @ApiParam(value = "Condition to filter the retrival of records.\n") @QueryParam("filter")  String filter,
    @ApiParam(value = "Define the order in which the retrieved records should be sorted.\n_This parameter is not supported yet._\n", allowableValues="{values=[asc, desc]}") @QueryParam("sort")  String sort,
    @ApiParam(value = "Attribute by which the retrieved records should be sorted.\n_This parameter is not supported yet._\n") @QueryParam("sortBy")  String sortBy,
    @ApiParam(value = "Specifies the required parameters in the response\n_This parameter is not supported yet_\n") @QueryParam("requiredAttributes")  String requiredAttributes)
    {
    return delegate.getApplications(limit,offset,filter,sort,sortBy,requiredAttributes);
    }
    @Valid
    @GET
    @Path("/{applicationId}/auth-protocols/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve inbound protocol configurations of an application.\n", notes = "This API provides the capability to retrive authentication protocol configurations of an application.\n", response = InboundProtocolsDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response getInboundAuthenticationConfigurations(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.getInboundAuthenticationConfigurations(applicationId);
    }
    @Valid
    @GET
    @Path("/{applicationId}/auth-protocols/oidc")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve OIDC authentication protocol parameters of an application.\n", notes = "This API provides the capability to retrieve OIDC authentication protocol parameters of an application.\n", response = OIDCParametersDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response getInboundOAuthConfiguration(@ApiParam(value = "Id of the application",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.getInboundOAuthConfiguration(applicationId);
    }
    @Valid
    @GET
    @Path("/{applicationId}/auth-protocols/saml")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve SAML2 authentication protocol parameters of an application.\n", notes = "This API provides the capability to retrive SAML2 authentication protocol parameters of an application.\n", response = SAML2ParametersDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response getInboundSAMLConfiguration(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.getInboundSAMLConfiguration(applicationId);
    }
    @Valid
    @GET
    @Path("/{applicationId}/auth-protocols/passive-sts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve Passive STS authentication protocol parameters of an application.\n", notes = "This API provides the capability to retrieve Passive STS authentication protocol parameters of an application.\n", response = PassiveSTSParametersDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response getPassiveStsConfiguration(@ApiParam(value = "Id of the application",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.getPassiveStsConfiguration(applicationId);
    }
    @Valid
    @GET
    @Path("/resident")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Resident Service Provider Information.\n", notes = "This API provides the capability to retrive the resident SP information.\n", response = ResidentApplicationDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response getResidentApplication()
    {
    return delegate.getResidentApplication();
    }
    @Valid
    @GET
    @Path("/{applicationId}/auth-protocols/ws-trust")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve WS Trust authentication protocol parameters of an application.\n", notes = "This API provides the capability to retrieve Passive STS authentication protocol parameters of an application.\n", response = WSTrustParametersDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response getWSTrustConfiguration(@ApiParam(value = "Id of the application",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.getWSTrustConfiguration(applicationId);
    }
    @Valid
    @POST
    @Path("/{applicationId}/auth-protocols/oidc/regenerate-secret")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Regenerate the OAuth2/OIDC client secret.\n", notes = "This API provides regenerate the OAuth2/OIDC client secret.\n", response = OIDCParametersDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response regenerateOAuthApplicationSecret(@ApiParam(value = "Id of the application",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.regenerateOAuthApplicationSecret(applicationId);
    }
    @Valid
    @POST
    @Path("/{applicationId}/auth-protocols/oidc/revoke")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Revoke the OAuth2/OIDC client configuration of an application.\n", notes = "This API provides revoke the OAuth2/OIDC client configuration of an application.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response revokeOAuthApplication(@ApiParam(value = "Id of the application",required=true ) @PathParam("applicationId")  String applicationId)
    {
    return delegate.revokeOAuthApplication(applicationId);
    }
    @Valid
    @PUT
    @Path("/{applicationId}/advanced-configs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update the the advanced configurations of an application by id\n", notes = "This API provides the capability to update the advanced configurations of an application by id.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful response."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response updateAdvancedConfigurations(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId,
    @ApiParam(value = "This represents advanced configurations of the application to be updated." ,required=true ) @Valid AdvancedAuthenticationConfigurationDTO advancedConfigurations)
    {
    return delegate.updateAdvancedConfigurations(applicationId,advancedConfigurations);
    }
    @Valid
    @PUT
    @Path("/{applicationId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update an application by id\n", notes = "This API provides the capability to update an application.\n", response = ApplicationResponseDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response updateApplication(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId,
    @ApiParam(value = "This represents the application to be updated." ,required=true ) @Valid ApplicationResponseDTO application)
    {
    return delegate.updateApplication(applicationId,application);
    }
    @Valid
    @PUT
    @Path("/{applicationId}/auth-protocols/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update inbound protocol configurations of an application.\n", notes = "This API provides the capability to update inbound protocol configurations of an application.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful response."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response updateInboundAuthenticationConfigurations(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId,
    @ApiParam(value = "This represents the inbound protocol configurations of the application." ,required=true ) @Valid InboundProtocolsDTO inboundProtocols)
    {
    return delegate.updateInboundAuthenticationConfigurations(applicationId,inboundProtocols);
    }
    @Valid
    @PUT
    @Path("/{applicationId}/auth-protocols/oidc")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update OIDC authentication protocol parameters of an application.\n", notes = "This API provides the capability to store OIDC authentication protocol parameters of an application.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful response."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response updateInboundOAuthConfiguration(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId,
    @ApiParam(value = "This represents the OIDC authentication protocol parameters of an application." ,required=true ) @Valid OIDCParametersDTO parameters)
    {
    return delegate.updateInboundOAuthConfiguration(applicationId,parameters);
    }
    @Valid
    @PUT
    @Path("/{applicationId}/auth-protocols/saml")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update SAML2 authentication protocol parameters of an application.\n", notes = "This API provides the capability to store SAML2 authentication protocol parameters of an application.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful response."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response updateInboundSAMLConfiguration(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId,
    @ApiParam(value = "This represents the SAML2 protocol attributes of the application." ,required=true ) @Valid SAML2ParametersDTO saml2Configuration)
    {
    return delegate.updateInboundSAMLConfiguration(applicationId,saml2Configuration);
    }
    @Valid
    @PUT
    @Path("/{applicationId}/auth-protocols/passive-sts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Passive STS authentication protocol parameters of an application.\n", notes = "This API provides the capability to store passive STS authentication protocol parameters of an application.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful response."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response updatePassiveStsConfiguration(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId,
    @ApiParam(value = "This represents the Passive STS authentication protocol parameters of an application." ,required=true ) @Valid PassiveSTSParametersDTO parameters)
    {
    return delegate.updatePassiveStsConfiguration(applicationId,parameters);
    }
    @Valid
    @PUT
    @Path("/resident")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Resident Application's provisioning configuration.\n", notes = "This API provides the capability to update Resident Service Provider Configuration.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful response."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response updateResidentApplication(@ApiParam(value = "This represents the provisioning configuration of the resident application." ,required=true ) @Valid ProvisioningConfigurationDTO provisioningConfiguration)
    {
    return delegate.updateResidentApplication(provisioningConfiguration);
    }
    @Valid
    @PUT
    @Path("/{applicationId}/auth-protocols/ws-trust")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update WS Trust authentication protocol parameters of an application.\n", notes = "This API provides the capability to store WS Trust authentication protocol parameters of an application.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful response."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response updateWSTrustConfiguration(@ApiParam(value = "Id of the application.",required=true ) @PathParam("applicationId")  String applicationId,
    @ApiParam(value = "This represents the Passive STS authentication protocol parameters of an application." ,required=true ) @Valid WSTrustParametersDTO parameters)
    {
    return delegate.updateWSTrustConfiguration(applicationId,parameters);
    }
}

