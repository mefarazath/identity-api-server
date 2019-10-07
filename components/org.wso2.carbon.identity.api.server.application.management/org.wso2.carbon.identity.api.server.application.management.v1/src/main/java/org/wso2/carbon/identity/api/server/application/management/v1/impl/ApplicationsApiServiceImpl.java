package org.wso2.carbon.identity.api.server.application.management.v1.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.wso2.carbon.identity.api.server.application.management.v1.AdvancedApplicationConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.ApplicationRequest;
import org.wso2.carbon.identity.api.server.application.management.v1.ApplicationResponse;
import org.wso2.carbon.identity.api.server.application.management.v1.ApplicationsApiService;
import org.wso2.carbon.identity.api.server.application.management.v1.AuthenticationSequence;
import org.wso2.carbon.identity.api.server.application.management.v1.ClaimConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.CustomInboundProtocolConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.InboundProtocols;
import org.wso2.carbon.identity.api.server.application.management.v1.OpenIDConnectConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.PassiveStsConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.ProvisioningConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.SAML2Configuration;
import org.wso2.carbon.identity.api.server.application.management.v1.WSTrustConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.core.ServerApplicationManagementService;

import javax.ws.rs.core.Response;

/**
 * Implementation of ApplicationsApiService.
 */
public class ApplicationsApiServiceImpl implements ApplicationsApiService {

    @Autowired
    private ServerApplicationManagementService applicationManagementService;

    @Override
    public Response getAllApplications(Integer limit, Integer offset, String filter, String sort, String sortBy,
                                       String requiredAttributes) {

        return Response.ok()
                .entity(applicationManagementService.getAllApplications(
                        limit, offset, filter, sort, sortBy, requiredAttributes))
                .build();
    }

    @Override
    public Response getApplication(String applicationId) {
        // do some magic!
        return Response.ok().entity(applicationManagementService.getApplication(applicationId)).build();
    }

    @Override
    public Response createApplication(ApplicationRequest applicationRequest, String template) {

        return null;
    }

    @Override
    public Response deleteAdvancedConfigurations(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response deleteApplication(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response deleteAuthenticationSequence(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response deleteClaimConfiguration(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response deleteCustomInboundConfiguration(String applicationId, String inboundProtocolId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response deleteInboundAuthenticationConfigurations(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response deleteInboundOAuthConfiguration(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response deleteInboundSAMLConfiguration(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response deletePassiveStsConfiguration(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response deleteProvisioningConfiguration(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response deleteWSTrustConfiguration(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response getAdvancedConfigurations(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response getAuthenticationSequence(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response getClaimConfiguration(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response getCustomInboundConfiguration(String applicationId, String inboundProtocolId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response getInboundAuthenticationConfigurations(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response getInboundOAuthConfiguration(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response getInboundSAMLConfiguration(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response getPassiveStsConfiguration(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response getProvisioningConfiguration(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response getResidentApplication() {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response getWSTrustConfiguration(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response regenerateOAuthApplicationSecret(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response revokeOAuthApplication(String applicationId) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response updateAdvancedConfigurations(String applicationId,
                                                 AdvancedApplicationConfiguration advancedApplicationConfiguration) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response updateApplication(String applicationId, ApplicationResponse applicationResponse) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response updateAuthenticationSequence(String applicationId, AuthenticationSequence authenticationSequence) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response updateClaimConfiguration(String applicationId, ClaimConfiguration claimConfiguration) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response updateCustomInboundConfiguration(String applicationId,
                                                     String inboundProtocolId,
                                                     CustomInboundProtocolConfiguration customInboundProtocolConfig) {

        return null;
    }

    @Override
    public Response updateInboundAuthenticationConfigurations(String applicationId, InboundProtocols inboundProtocols) {

        return null;
    }

    @Override
    public Response updateInboundOAuthConfiguration(String applicationId,
                                                    OpenIDConnectConfiguration openIDConnectConfiguration) {

        return null;
    }

    @Override
    public Response updateInboundSAMLConfiguration(String applicationId, SAML2Configuration saML2Configuration) {

        return null;
    }

    @Override
    public Response updatePassiveStsConfiguration(String applicationId,
                                                  PassiveStsConfiguration passiveStsConfiguration) {

        return null;
    }

    @Override
    public Response updateProvisioningConfiguration(String applicationId,
                                                    ProvisioningConfiguration provisioningConfiguration) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response updateResidentApplication(ProvisioningConfiguration provisioningConfiguration) {
        // do some magic!
        return Response.ok().entity("magic!").build();
    }

    @Override
    public Response updateWSTrustConfiguration(String applicationId, WSTrustConfiguration wsTrustConfiguration) {

        return null;
    }
}
