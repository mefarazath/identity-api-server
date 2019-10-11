package org.wso2.carbon.identity.api.server.application.management.v1.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.wso2.carbon.identity.api.server.application.management.v1.AdvancedApplicationConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.Application;
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
    public Response getAllApplications(Integer limit, Integer offset, String filter, String sortOrder, String sortBy,
                                       String requiredAttributes) {

        return Response.ok()
                .entity(applicationManagementService
                        .getAllApplications(limit, offset, filter, sortOrder, sortBy, requiredAttributes))
                .build();
    }

    @Override
    public Response getApplication(String applicationId) {

        return Response.ok().entity(applicationManagementService.getApplication(applicationId)).build();
    }

    @Override
    public Response createApplication(Application application, String template) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response deleteAdvancedConfigurations(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response deleteApplication(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response deleteAuthenticationSequence(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response deleteClaimConfiguration(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response deleteCustomInboundConfiguration(String applicationId, String inboundProtocolId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response deleteInboundAuthenticationConfigurations(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response deleteInboundOAuthConfiguration(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response deleteInboundSAMLConfiguration(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response deletePassiveStsConfiguration(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response deleteProvisioningConfiguration(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response deleteWSTrustConfiguration(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response getAdvancedConfigurations(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response getAuthenticationSequence(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response getClaimConfiguration(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response getCustomInboundConfiguration(String applicationId, String inboundProtocolId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response getInboundAuthenticationConfigurations(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response getInboundOAuthConfiguration(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response getInboundSAMLConfiguration(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response getPassiveStsConfiguration(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response getProvisioningConfiguration(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response getResidentApplication() {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response getWSTrustConfiguration(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response regenerateOAuthApplicationSecret(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response revokeOAuthApplication(String applicationId) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response updateAdvancedConfigurations(String applicationId,
                                                 AdvancedApplicationConfiguration advancedApplicationConfiguration) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response updateApplication(String applicationId, Application application) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response updateAuthenticationSequence(String applicationId, AuthenticationSequence authenticationSequence) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response updateClaimConfiguration(String applicationId, ClaimConfiguration claimConfiguration) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response updateCustomInboundConfiguration(String applicationId,
                                                     String inboundProtocolId,
                                                     CustomInboundProtocolConfiguration customInboundProtocolConfig) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response updateInboundAuthenticationConfigurations(String applicationId, InboundProtocols inboundProtocols) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response updateInboundOAuthConfiguration(String applicationId,
                                                    OpenIDConnectConfiguration openIDConnectConfiguration) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response updateInboundSAMLConfiguration(String applicationId, SAML2Configuration saML2Configuration) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response updatePassiveStsConfiguration(String applicationId,
                                                  PassiveStsConfiguration passiveStsConfiguration) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response updateProvisioningConfiguration(String applicationId,
                                                    ProvisioningConfiguration provisioningConfiguration) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response updateResidentApplication(ProvisioningConfiguration provisioningConfiguration) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }

    @Override
    public Response updateWSTrustConfiguration(String applicationId, WSTrustConfiguration wsTrustConfiguration) {

        return Response.status(Response.Status.NOT_IMPLEMENTED).build();
    }
}
