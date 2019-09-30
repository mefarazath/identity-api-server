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

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@ApiModel(description = "")
public class SAML2ParametersDTO  {
  
  
  @Valid 
  private String issuer = null;
  
  @Valid 
  private List<String> assertionConsumerUrls = new ArrayList<String>();
  
  @Valid 
  private String defaultAssertionConsumerUrl = null;
  
  @Valid 
  private Boolean enableRequestSigning = true;
  
  @Valid 
  private Boolean enableAssertionEncryption = false;
  
  @Valid 
  private Boolean enableResponseSigning = true;
  
  @Valid 
  private String serviceProviderQualifier = null;
  
  @Valid 
  private String nameIdFormat = "urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress";
  
  @Valid 
  private String requestValidationCertificateAlias = null;
  
  @Valid 
  private String responseSigningAlgorithm = null;
  
  @Valid 
  private String responseDigestAlgorithm = null;
  
  @Valid 
  private String assertionEncryptionAlgroithm = null;
  
  @Valid 
  private String keyEncryptionAlgorithm = null;
  
  @Valid 
  private Boolean enableSingleLogout = true;
  
  @Valid 
  private String singleLogoutResponseUrl = null;
  
  @Valid 
  private String singleLogoutRequestUrl = null;
  
  public enum SingleLogoutMethodEnum {
     backchannel,  frontchannel_http_redirect,  frontchannel_http_post, 
  };
  @Valid 
  private SingleLogoutMethodEnum singleLogoutMethod = null;
  
  @Valid 
  private Boolean enableIdpInitiatedSingleSignOn = false;
  
  @Valid 
  private Boolean enableIdpInitiatedSingleLogOut = false;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("issuer")
  public String getIssuer() {
    return issuer;
  }
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("assertionConsumerUrls")
  public List<String> getAssertionConsumerUrls() {
    return assertionConsumerUrls;
  }
  public void setAssertionConsumerUrls(List<String> assertionConsumerUrls) {
    this.assertionConsumerUrls = assertionConsumerUrls;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("defaultAssertionConsumerUrl")
  public String getDefaultAssertionConsumerUrl() {
    return defaultAssertionConsumerUrl;
  }
  public void setDefaultAssertionConsumerUrl(String defaultAssertionConsumerUrl) {
    this.defaultAssertionConsumerUrl = defaultAssertionConsumerUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("enableRequestSigning")
  public Boolean getEnableRequestSigning() {
    return enableRequestSigning;
  }
  public void setEnableRequestSigning(Boolean enableRequestSigning) {
    this.enableRequestSigning = enableRequestSigning;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("enableAssertionEncryption")
  public Boolean getEnableAssertionEncryption() {
    return enableAssertionEncryption;
  }
  public void setEnableAssertionEncryption(Boolean enableAssertionEncryption) {
    this.enableAssertionEncryption = enableAssertionEncryption;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("enableResponseSigning")
  public Boolean getEnableResponseSigning() {
    return enableResponseSigning;
  }
  public void setEnableResponseSigning(Boolean enableResponseSigning) {
    this.enableResponseSigning = enableResponseSigning;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("serviceProviderQualifier")
  public String getServiceProviderQualifier() {
    return serviceProviderQualifier;
  }
  public void setServiceProviderQualifier(String serviceProviderQualifier) {
    this.serviceProviderQualifier = serviceProviderQualifier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("nameIdFormat")
  public String getNameIdFormat() {
    return nameIdFormat;
  }
  public void setNameIdFormat(String nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("requestValidationCertificateAlias")
  public String getRequestValidationCertificateAlias() {
    return requestValidationCertificateAlias;
  }
  public void setRequestValidationCertificateAlias(String requestValidationCertificateAlias) {
    this.requestValidationCertificateAlias = requestValidationCertificateAlias;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("responseSigningAlgorithm")
  public String getResponseSigningAlgorithm() {
    return responseSigningAlgorithm;
  }
  public void setResponseSigningAlgorithm(String responseSigningAlgorithm) {
    this.responseSigningAlgorithm = responseSigningAlgorithm;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("responseDigestAlgorithm")
  public String getResponseDigestAlgorithm() {
    return responseDigestAlgorithm;
  }
  public void setResponseDigestAlgorithm(String responseDigestAlgorithm) {
    this.responseDigestAlgorithm = responseDigestAlgorithm;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("assertionEncryptionAlgroithm")
  public String getAssertionEncryptionAlgroithm() {
    return assertionEncryptionAlgroithm;
  }
  public void setAssertionEncryptionAlgroithm(String assertionEncryptionAlgroithm) {
    this.assertionEncryptionAlgroithm = assertionEncryptionAlgroithm;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("keyEncryptionAlgorithm")
  public String getKeyEncryptionAlgorithm() {
    return keyEncryptionAlgorithm;
  }
  public void setKeyEncryptionAlgorithm(String keyEncryptionAlgorithm) {
    this.keyEncryptionAlgorithm = keyEncryptionAlgorithm;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("enableSingleLogout")
  public Boolean getEnableSingleLogout() {
    return enableSingleLogout;
  }
  public void setEnableSingleLogout(Boolean enableSingleLogout) {
    this.enableSingleLogout = enableSingleLogout;
  }

  
  /**
   * Single logout response accepting endpoint
   **/
  @ApiModelProperty(value = "Single logout response accepting endpoint")
  @JsonProperty("singleLogoutResponseUrl")
  public String getSingleLogoutResponseUrl() {
    return singleLogoutResponseUrl;
  }
  public void setSingleLogoutResponseUrl(String singleLogoutResponseUrl) {
    this.singleLogoutResponseUrl = singleLogoutResponseUrl;
  }

  
  /**
   * Single logout request accepting endpoint
   **/
  @ApiModelProperty(value = "Single logout request accepting endpoint")
  @JsonProperty("singleLogoutRequestUrl")
  public String getSingleLogoutRequestUrl() {
    return singleLogoutRequestUrl;
  }
  public void setSingleLogoutRequestUrl(String singleLogoutRequestUrl) {
    this.singleLogoutRequestUrl = singleLogoutRequestUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("singleLogoutMethod")
  public SingleLogoutMethodEnum getSingleLogoutMethod() {
    return singleLogoutMethod;
  }
  public void setSingleLogoutMethod(SingleLogoutMethodEnum singleLogoutMethod) {
    this.singleLogoutMethod = singleLogoutMethod;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("enableIdpInitiatedSingleSignOn")
  public Boolean getEnableIdpInitiatedSingleSignOn() {
    return enableIdpInitiatedSingleSignOn;
  }
  public void setEnableIdpInitiatedSingleSignOn(Boolean enableIdpInitiatedSingleSignOn) {
    this.enableIdpInitiatedSingleSignOn = enableIdpInitiatedSingleSignOn;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("enableIdpInitiatedSingleLogOut")
  public Boolean getEnableIdpInitiatedSingleLogOut() {
    return enableIdpInitiatedSingleLogOut;
  }
  public void setEnableIdpInitiatedSingleLogOut(Boolean enableIdpInitiatedSingleLogOut) {
    this.enableIdpInitiatedSingleLogOut = enableIdpInitiatedSingleLogOut;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAML2ParametersDTO {\n");
    
    sb.append("  issuer: ").append(issuer).append("\n");
    sb.append("  assertionConsumerUrls: ").append(assertionConsumerUrls).append("\n");
    sb.append("  defaultAssertionConsumerUrl: ").append(defaultAssertionConsumerUrl).append("\n");
    sb.append("  enableRequestSigning: ").append(enableRequestSigning).append("\n");
    sb.append("  enableAssertionEncryption: ").append(enableAssertionEncryption).append("\n");
    sb.append("  enableResponseSigning: ").append(enableResponseSigning).append("\n");
    sb.append("  serviceProviderQualifier: ").append(serviceProviderQualifier).append("\n");
    sb.append("  nameIdFormat: ").append(nameIdFormat).append("\n");
    sb.append("  requestValidationCertificateAlias: ").append(requestValidationCertificateAlias).append("\n");
    sb.append("  responseSigningAlgorithm: ").append(responseSigningAlgorithm).append("\n");
    sb.append("  responseDigestAlgorithm: ").append(responseDigestAlgorithm).append("\n");
    sb.append("  assertionEncryptionAlgroithm: ").append(assertionEncryptionAlgroithm).append("\n");
    sb.append("  keyEncryptionAlgorithm: ").append(keyEncryptionAlgorithm).append("\n");
    sb.append("  enableSingleLogout: ").append(enableSingleLogout).append("\n");
    sb.append("  singleLogoutResponseUrl: ").append(singleLogoutResponseUrl).append("\n");
    sb.append("  singleLogoutRequestUrl: ").append(singleLogoutRequestUrl).append("\n");
    sb.append("  singleLogoutMethod: ").append(singleLogoutMethod).append("\n");
    sb.append("  enableIdpInitiatedSingleSignOn: ").append(enableIdpInitiatedSingleSignOn).append("\n");
    sb.append("  enableIdpInitiatedSingleLogOut: ").append(enableIdpInitiatedSingleLogOut).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
