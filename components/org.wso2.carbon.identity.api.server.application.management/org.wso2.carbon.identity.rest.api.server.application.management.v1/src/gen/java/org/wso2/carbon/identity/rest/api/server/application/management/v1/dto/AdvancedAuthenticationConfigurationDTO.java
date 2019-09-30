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

package org.wso2.carbon.identity.rest.api.server.application.management.v1.dto;

import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.CertificateDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@ApiModel(description = "")
public class AdvancedAuthenticationConfigurationDTO  {
  
  
  @Valid 
  private Boolean saas = null;
  
  @Valid 
  private CertificateDTO certificate = null;
  
  @Valid 
  private Boolean skipConsent = null;
  
  @Valid 
  private Boolean returnAuthenticatedListOfIdentityProviders = null;
  
  @Valid 
  private Boolean enableAuthorization = null;

  
  /**
   * Whether this application is allowed to be accessed across tenants
   **/
  @ApiModelProperty(value = "Whether this application is allowed to be accessed across tenants")
  @JsonProperty("saas")
  public Boolean getSaas() {
    return saas;
  }
  public void setSaas(Boolean saas) {
    this.saas = saas;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("certificate")
  public CertificateDTO getCertificate() {
    return certificate;
  }
  public void setCertificate(CertificateDTO certificate) {
    this.certificate = certificate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("skipConsent")
  public Boolean getSkipConsent() {
    return skipConsent;
  }
  public void setSkipConsent(Boolean skipConsent) {
    this.skipConsent = skipConsent;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("returnAuthenticatedListOfIdentityProviders")
  public Boolean getReturnAuthenticatedListOfIdentityProviders() {
    return returnAuthenticatedListOfIdentityProviders;
  }
  public void setReturnAuthenticatedListOfIdentityProviders(Boolean returnAuthenticatedListOfIdentityProviders) {
    this.returnAuthenticatedListOfIdentityProviders = returnAuthenticatedListOfIdentityProviders;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("enableAuthorization")
  public Boolean getEnableAuthorization() {
    return enableAuthorization;
  }
  public void setEnableAuthorization(Boolean enableAuthorization) {
    this.enableAuthorization = enableAuthorization;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuthenticationConfigurationDTO {\n");
    
    sb.append("  saas: ").append(saas).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("  skipConsent: ").append(skipConsent).append("\n");
    sb.append("  returnAuthenticatedListOfIdentityProviders: ").append(returnAuthenticatedListOfIdentityProviders).append("\n");
    sb.append("  enableAuthorization: ").append(enableAuthorization).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
