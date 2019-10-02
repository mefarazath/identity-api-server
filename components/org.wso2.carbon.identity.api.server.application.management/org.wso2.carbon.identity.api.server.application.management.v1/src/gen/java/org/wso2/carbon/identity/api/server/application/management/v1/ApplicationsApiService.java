package org.wso2.carbon.identity.api.server.application.management.v1;

import org.wso2.carbon.identity.api.server.application.management.v1.*;
import org.wso2.carbon.identity.api.server.application.management.v1.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.wso2.carbon.identity.api.server.application.management.v1.AdvancedApplicationConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.ApplicationListResponse;
import org.wso2.carbon.identity.api.server.application.management.v1.ApplicationRequest;
import org.wso2.carbon.identity.api.server.application.management.v1.ApplicationResponse;
import org.wso2.carbon.identity.api.server.application.management.v1.AuthenticationSequence;
import org.wso2.carbon.identity.api.server.application.management.v1.ClaimConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.CustomInboundProtcolParameters;
import org.wso2.carbon.identity.api.server.application.management.v1.Error;
import org.wso2.carbon.identity.api.server.application.management.v1.InboundProtocols;
import org.wso2.carbon.identity.api.server.application.management.v1.OIDCParameters;
import org.wso2.carbon.identity.api.server.application.management.v1.PassiveSTSParameters;
import org.wso2.carbon.identity.api.server.application.management.v1.ProvisioningConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.ResidentApplication;
import org.wso2.carbon.identity.api.server.application.management.v1.SAML2Parameters;
import org.wso2.carbon.identity.api.server.application.management.v1.WSTrustParameters;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public interface ApplicationsApiService {
      public Response createApplication(ApplicationRequest applicationRequest,  String template );
      public Response deleteAdvancedConfigurations(String applicationId );
      public Response deleteApplication(String applicationId );
      public Response deleteAuthenticationSequence(String applicationId );
      public Response deleteClaimConfiguration(String applicationId );
      public Response deleteCustomInboundConfiguration(String applicationId,  String inboundProtocolId );
      public Response deleteInboundAuthenticationConfigurations(String applicationId );
      public Response deleteInboundOAuthConfiguration(String applicationId );
      public Response deleteInboundSAMLConfiguration(String applicationId );
      public Response deletePassiveStsConfiguration(String applicationId );
      public Response deleteProvisioningConfiguration(String applicationId );
      public Response deleteWSTrustConfiguration(String applicationId );
      public Response getAdvancedConfigurations(String applicationId );
      public Response getAllApplications(Integer limit,  Integer offset,  String filter,  String sort,  String sortBy,  String requiredAttributes );
      public Response getApplication(String applicationId );
      public Response getAuthenticationSequence(String applicationId );
      public Response getClaimConfiguration(String applicationId );
      public Response getCustomInboundConfiguration(String applicationId,  String inboundProtocolId );
      public Response getInboundAuthenticationConfigurations(String applicationId );
      public Response getInboundOAuthConfiguration(String applicationId );
      public Response getInboundSAMLConfiguration(String applicationId );
      public Response getPassiveStsConfiguration(String applicationId );
      public Response getProvisioningConfiguration(String applicationId );
      public Response getResidentApplication();
      public Response getWSTrustConfiguration(String applicationId );
      public Response regenerateOAuthApplicationSecret(String applicationId );
      public Response revokeOAuthApplication(String applicationId );
      public Response updateAdvancedConfigurations(String applicationId,  AdvancedApplicationConfiguration advancedApplicationConfiguration );
      public Response updateApplication(String applicationId,  ApplicationResponse applicationResponse );
      public Response updateAuthenticationSequence(String applicationId,  AuthenticationSequence authenticationSequence );
      public Response updateClaimConfiguration(String applicationId,  ClaimConfiguration claimConfiguration );
      public Response updateCustomInboundConfiguration(String applicationId,  String inboundProtocolId,  CustomInboundProtcolParameters customInboundProtcolParameters );
      public Response updateInboundAuthenticationConfigurations(String applicationId,  InboundProtocols inboundProtocols );
      public Response updateInboundOAuthConfiguration(String applicationId,  OIDCParameters oiDCParameters );
      public Response updateInboundSAMLConfiguration(String applicationId,  SAML2Parameters saML2Parameters );
      public Response updatePassiveStsConfiguration(String applicationId,  PassiveSTSParameters passiveSTSParameters );
      public Response updateProvisioningConfiguration(String applicationId,  ProvisioningConfiguration provisioningConfiguration );
      public Response updateResidentApplication(ProvisioningConfiguration provisioningConfiguration );
      public Response updateWSTrustConfiguration(String applicationId,  WSTrustParameters wsTrustParameters );
}
