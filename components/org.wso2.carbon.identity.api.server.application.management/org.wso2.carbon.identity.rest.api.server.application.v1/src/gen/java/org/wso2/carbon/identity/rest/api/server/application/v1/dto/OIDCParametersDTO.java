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

package org.wso2.carbon.identity.rest.api.server.application.v1.dto;

import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.AccessTokenConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.IdTokenConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.OAuth2PKCEConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.OIDCLogoutConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.RefreshTokenConfigurationDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@ApiModel(description = "")
public class OIDCParametersDTO  {
  
  
  @Valid 
  private String clientId = null;
  
  @Valid 
  private String clientSecret = null;
  
  public enum StateEnum {
     ACTIVE,  REVOKED, 
  };
  @Valid 
  private StateEnum state = StateEnum.ACTIVE;
  
  @Valid @NotNull(message = "Property version cannot be null.") 
  private String version = "2.0";
  
  @Valid @NotNull(message = "Property grantTypes cannot be null.") 
  private List<String> grantTypes = new ArrayList<String>();
  
  @Valid 
  private List<String> callbackURLs = new ArrayList<String>();
  
  @Valid 
  private List<String> allowedOrigins = new ArrayList<String>();
  
  @Valid 
  private Boolean publicClient = false;
  
  @Valid 
  private OAuth2PKCEConfigurationDTO pkce = null;
  
  @Valid 
  private AccessTokenConfigurationDTO accessToken = null;
  
  @Valid 
  private RefreshTokenConfigurationDTO refreshToken = null;
  
  @Valid 
  private IdTokenConfigurationDTO idToken = null;
  
  @Valid 
  private OIDCLogoutConfigurationDTO logout = null;
  
  @Valid 
  private Boolean validateRequestObjectSignature = false;
  
  @Valid 
  private List<String> scopeValidators = new ArrayList<String>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("clientSecret")
  public String getClientSecret() {
    return clientSecret;
  }
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * Possible values are '2.0' and '1.0a'
   **/
  @ApiModelProperty(required = true, value = "Possible values are '2.0' and '1.0a'")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("grantTypes")
  public List<String> getGrantTypes() {
    return grantTypes;
  }
  public void setGrantTypes(List<String> grantTypes) {
    this.grantTypes = grantTypes;
  }

  
  /**
   * Authorized redirect URIs
   **/
  @ApiModelProperty(value = "Authorized redirect URIs")
  @JsonProperty("callbackURLs")
  public List<String> getCallbackURLs() {
    return callbackURLs;
  }
  public void setCallbackURLs(List<String> callbackURLs) {
    this.callbackURLs = callbackURLs;
  }

  
  /**
   * Authorized JavaScript origins
   **/
  @ApiModelProperty(value = "Authorized JavaScript origins")
  @JsonProperty("allowedOrigins")
  public List<String> getAllowedOrigins() {
    return allowedOrigins;
  }
  public void setAllowedOrigins(List<String> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
  }

  
  /**
   * Enabling this option will allow the client to authenticate without a client secret
   **/
  @ApiModelProperty(value = "Enabling this option will allow the client to authenticate without a client secret")
  @JsonProperty("publicClient")
  public Boolean getPublicClient() {
    return publicClient;
  }
  public void setPublicClient(Boolean publicClient) {
    this.publicClient = publicClient;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pkce")
  public OAuth2PKCEConfigurationDTO getPkce() {
    return pkce;
  }
  public void setPkce(OAuth2PKCEConfigurationDTO pkce) {
    this.pkce = pkce;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("accessToken")
  public AccessTokenConfigurationDTO getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(AccessTokenConfigurationDTO accessToken) {
    this.accessToken = accessToken;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("refreshToken")
  public RefreshTokenConfigurationDTO getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(RefreshTokenConfigurationDTO refreshToken) {
    this.refreshToken = refreshToken;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("idToken")
  public IdTokenConfigurationDTO getIdToken() {
    return idToken;
  }
  public void setIdToken(IdTokenConfigurationDTO idToken) {
    this.idToken = idToken;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("logout")
  public OIDCLogoutConfigurationDTO getLogout() {
    return logout;
  }
  public void setLogout(OIDCLogoutConfigurationDTO logout) {
    this.logout = logout;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("validateRequestObjectSignature")
  public Boolean getValidateRequestObjectSignature() {
    return validateRequestObjectSignature;
  }
  public void setValidateRequestObjectSignature(Boolean validateRequestObjectSignature) {
    this.validateRequestObjectSignature = validateRequestObjectSignature;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("scopeValidators")
  public List<String> getScopeValidators() {
    return scopeValidators;
  }
  public void setScopeValidators(List<String> scopeValidators) {
    this.scopeValidators = scopeValidators;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCParametersDTO {\n");
    
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  clientSecret: ").append(clientSecret).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  grantTypes: ").append(grantTypes).append("\n");
    sb.append("  callbackURLs: ").append(callbackURLs).append("\n");
    sb.append("  allowedOrigins: ").append(allowedOrigins).append("\n");
    sb.append("  publicClient: ").append(publicClient).append("\n");
    sb.append("  pkce: ").append(pkce).append("\n");
    sb.append("  accessToken: ").append(accessToken).append("\n");
    sb.append("  refreshToken: ").append(refreshToken).append("\n");
    sb.append("  idToken: ").append(idToken).append("\n");
    sb.append("  logout: ").append(logout).append("\n");
    sb.append("  validateRequestObjectSignature: ").append(validateRequestObjectSignature).append("\n");
    sb.append("  scopeValidators: ").append(scopeValidators).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
