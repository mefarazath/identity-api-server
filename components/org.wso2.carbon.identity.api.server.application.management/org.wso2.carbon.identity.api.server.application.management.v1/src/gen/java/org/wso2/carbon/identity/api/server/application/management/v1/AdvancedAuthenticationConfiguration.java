package org.wso2.carbon.identity.api.server.application.management.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

import javax.validation.Valid;

public class AdvancedAuthenticationConfiguration   {
  
  private Boolean saas;

  private Certificate certificate;

  private Boolean skipConsent;

  private Boolean returnAuthenticatedListOfIdentityProviders;

  private Boolean enableAuthorization;


  /**
   * Whether this application is allowed to be accessed across tenants
   **/
  public AdvancedAuthenticationConfiguration saas(Boolean saas) {
    this.saas = saas;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Whether this application is allowed to be accessed across tenants")
  @JsonProperty("saas")
@Valid
  public Boolean getSaas() {
    return saas;
  }
  public void setSaas(Boolean saas) {
    this.saas = saas;
  }


  /**
   **/
  public AdvancedAuthenticationConfiguration certificate(Certificate certificate) {
    this.certificate = certificate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("certificate")
@Valid
  public Certificate getCertificate() {
    return certificate;
  }
  public void setCertificate(Certificate certificate) {
    this.certificate = certificate;
  }


  /**
   **/
  public AdvancedAuthenticationConfiguration skipConsent(Boolean skipConsent) {
    this.skipConsent = skipConsent;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty("skipConsent")
@Valid
  public Boolean getSkipConsent() {
    return skipConsent;
  }
  public void setSkipConsent(Boolean skipConsent) {
    this.skipConsent = skipConsent;
  }


  /**
   **/
  public AdvancedAuthenticationConfiguration returnAuthenticatedListOfIdentityProviders(Boolean returnAuthenticatedListOfIdentityProviders) {
    this.returnAuthenticatedListOfIdentityProviders = returnAuthenticatedListOfIdentityProviders;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty("returnAuthenticatedListOfIdentityProviders")
@Valid
  public Boolean getReturnAuthenticatedListOfIdentityProviders() {
    return returnAuthenticatedListOfIdentityProviders;
  }
  public void setReturnAuthenticatedListOfIdentityProviders(Boolean returnAuthenticatedListOfIdentityProviders) {
    this.returnAuthenticatedListOfIdentityProviders = returnAuthenticatedListOfIdentityProviders;
  }


  /**
   **/
  public AdvancedAuthenticationConfiguration enableAuthorization(Boolean enableAuthorization) {
    this.enableAuthorization = enableAuthorization;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty("enableAuthorization")
@Valid
  public Boolean getEnableAuthorization() {
    return enableAuthorization;
  }
  public void setEnableAuthorization(Boolean enableAuthorization) {
    this.enableAuthorization = enableAuthorization;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvancedAuthenticationConfiguration advancedAuthenticationConfiguration = (AdvancedAuthenticationConfiguration) o;
    return Objects.equals(this.saas, advancedAuthenticationConfiguration.saas) &&
        Objects.equals(this.certificate, advancedAuthenticationConfiguration.certificate) &&
        Objects.equals(this.skipConsent, advancedAuthenticationConfiguration.skipConsent) &&
        Objects.equals(this.returnAuthenticatedListOfIdentityProviders, advancedAuthenticationConfiguration.returnAuthenticatedListOfIdentityProviders) &&
        Objects.equals(this.enableAuthorization, advancedAuthenticationConfiguration.enableAuthorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saas, certificate, skipConsent, returnAuthenticatedListOfIdentityProviders, enableAuthorization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuthenticationConfiguration {\n");
    
    sb.append("    saas: ").append(toIndentedString(saas)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    skipConsent: ").append(toIndentedString(skipConsent)).append("\n");
    sb.append("    returnAuthenticatedListOfIdentityProviders: ").append(toIndentedString(returnAuthenticatedListOfIdentityProviders)).append("\n");
    sb.append("    enableAuthorization: ").append(toIndentedString(enableAuthorization)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

