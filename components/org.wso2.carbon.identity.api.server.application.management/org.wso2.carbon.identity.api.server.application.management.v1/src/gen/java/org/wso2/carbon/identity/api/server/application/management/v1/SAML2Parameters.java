package org.wso2.carbon.identity.api.server.application.management.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;


public class SAML2Parameters   {
  
  private String issuer;

  private List<String> assertionConsumerUrls = null;

  private String defaultAssertionConsumerUrl;

  private Boolean enableRequestSigning = true;

  private Boolean enableAssertionEncryption = false;

  private Boolean enableResponseSigning = true;

  private String serviceProviderQualifier;

  private String nameIdFormat = "urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress";

  private String requestValidationCertificateAlias;

  private String responseSigningAlgorithm;

  private String responseDigestAlgorithm;

  private String assertionEncryptionAlgroithm;

  private String keyEncryptionAlgorithm;

  private Boolean enableSingleLogout = true;

  private String singleLogoutResponseUrl;

  private String singleLogoutRequestUrl;


@XmlType(name="SingleLogoutMethodEnum")
@XmlEnum(String.class)
public enum SingleLogoutMethodEnum {

    @XmlEnumValue("backchannel") BACKCHANNEL(String.valueOf("backchannel")), @XmlEnumValue("frontchannel_http_redirect") FRONTCHANNEL_HTTP_REDIRECT(String.valueOf("frontchannel_http_redirect")), @XmlEnumValue("frontchannel_http_post") FRONTCHANNEL_HTTP_POST(String.valueOf("frontchannel_http_post"));


    private String value;

    SingleLogoutMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SingleLogoutMethodEnum fromValue(String value) {
        for (SingleLogoutMethodEnum b : SingleLogoutMethodEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private SingleLogoutMethodEnum singleLogoutMethod;

  private Boolean enableIdpInitiatedSingleSignOn = false;

  private Boolean enableIdpInitiatedSingleLogOut = false;


  /**
   **/
  public SAML2Parameters issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("issuer")
@Valid
  public String getIssuer() {
    return issuer;
  }
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  /**
   **/
  public SAML2Parameters assertionConsumerUrls(List<String> assertionConsumerUrls) {
    this.assertionConsumerUrls = assertionConsumerUrls;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("assertionConsumerUrls")
@Valid
  public List<String> getAssertionConsumerUrls() {
    return assertionConsumerUrls;
  }
  public void setAssertionConsumerUrls(List<String> assertionConsumerUrls) {
    this.assertionConsumerUrls = assertionConsumerUrls;
  }

  public SAML2Parameters addAssertionConsumerUrlsItem(String assertionConsumerUrlsItem) {
    if (this.assertionConsumerUrls == null) {
      this.assertionConsumerUrls = new ArrayList<>();
    }
    this.assertionConsumerUrls.add(assertionConsumerUrlsItem);
    return this;
  }


  /**
   **/
  public SAML2Parameters defaultAssertionConsumerUrl(String defaultAssertionConsumerUrl) {
    this.defaultAssertionConsumerUrl = defaultAssertionConsumerUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultAssertionConsumerUrl")
@Valid
  public String getDefaultAssertionConsumerUrl() {
    return defaultAssertionConsumerUrl;
  }
  public void setDefaultAssertionConsumerUrl(String defaultAssertionConsumerUrl) {
    this.defaultAssertionConsumerUrl = defaultAssertionConsumerUrl;
  }


  /**
   **/
  public SAML2Parameters enableRequestSigning(Boolean enableRequestSigning) {
    this.enableRequestSigning = enableRequestSigning;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enableRequestSigning")
@Valid
  public Boolean getEnableRequestSigning() {
    return enableRequestSigning;
  }
  public void setEnableRequestSigning(Boolean enableRequestSigning) {
    this.enableRequestSigning = enableRequestSigning;
  }


  /**
   **/
  public SAML2Parameters enableAssertionEncryption(Boolean enableAssertionEncryption) {
    this.enableAssertionEncryption = enableAssertionEncryption;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enableAssertionEncryption")
@Valid
  public Boolean getEnableAssertionEncryption() {
    return enableAssertionEncryption;
  }
  public void setEnableAssertionEncryption(Boolean enableAssertionEncryption) {
    this.enableAssertionEncryption = enableAssertionEncryption;
  }


  /**
   **/
  public SAML2Parameters enableResponseSigning(Boolean enableResponseSigning) {
    this.enableResponseSigning = enableResponseSigning;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enableResponseSigning")
@Valid
  public Boolean getEnableResponseSigning() {
    return enableResponseSigning;
  }
  public void setEnableResponseSigning(Boolean enableResponseSigning) {
    this.enableResponseSigning = enableResponseSigning;
  }


  /**
   **/
  public SAML2Parameters serviceProviderQualifier(String serviceProviderQualifier) {
    this.serviceProviderQualifier = serviceProviderQualifier;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceProviderQualifier")
@Valid
  public String getServiceProviderQualifier() {
    return serviceProviderQualifier;
  }
  public void setServiceProviderQualifier(String serviceProviderQualifier) {
    this.serviceProviderQualifier = serviceProviderQualifier;
  }


  /**
   **/
  public SAML2Parameters nameIdFormat(String nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
    return this;
  }

  
  @ApiModelProperty(example = "urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress", value = "")
  @JsonProperty("nameIdFormat")
@Valid
  public String getNameIdFormat() {
    return nameIdFormat;
  }
  public void setNameIdFormat(String nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
  }


  /**
   **/
  public SAML2Parameters requestValidationCertificateAlias(String requestValidationCertificateAlias) {
    this.requestValidationCertificateAlias = requestValidationCertificateAlias;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("requestValidationCertificateAlias")
@Valid
  public String getRequestValidationCertificateAlias() {
    return requestValidationCertificateAlias;
  }
  public void setRequestValidationCertificateAlias(String requestValidationCertificateAlias) {
    this.requestValidationCertificateAlias = requestValidationCertificateAlias;
  }


  /**
   **/
  public SAML2Parameters responseSigningAlgorithm(String responseSigningAlgorithm) {
    this.responseSigningAlgorithm = responseSigningAlgorithm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("responseSigningAlgorithm")
@Valid
  public String getResponseSigningAlgorithm() {
    return responseSigningAlgorithm;
  }
  public void setResponseSigningAlgorithm(String responseSigningAlgorithm) {
    this.responseSigningAlgorithm = responseSigningAlgorithm;
  }


  /**
   **/
  public SAML2Parameters responseDigestAlgorithm(String responseDigestAlgorithm) {
    this.responseDigestAlgorithm = responseDigestAlgorithm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("responseDigestAlgorithm")
@Valid
  public String getResponseDigestAlgorithm() {
    return responseDigestAlgorithm;
  }
  public void setResponseDigestAlgorithm(String responseDigestAlgorithm) {
    this.responseDigestAlgorithm = responseDigestAlgorithm;
  }


  /**
   **/
  public SAML2Parameters assertionEncryptionAlgroithm(String assertionEncryptionAlgroithm) {
    this.assertionEncryptionAlgroithm = assertionEncryptionAlgroithm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("assertionEncryptionAlgroithm")
@Valid
  public String getAssertionEncryptionAlgroithm() {
    return assertionEncryptionAlgroithm;
  }
  public void setAssertionEncryptionAlgroithm(String assertionEncryptionAlgroithm) {
    this.assertionEncryptionAlgroithm = assertionEncryptionAlgroithm;
  }


  /**
   **/
  public SAML2Parameters keyEncryptionAlgorithm(String keyEncryptionAlgorithm) {
    this.keyEncryptionAlgorithm = keyEncryptionAlgorithm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("keyEncryptionAlgorithm")
@Valid
  public String getKeyEncryptionAlgorithm() {
    return keyEncryptionAlgorithm;
  }
  public void setKeyEncryptionAlgorithm(String keyEncryptionAlgorithm) {
    this.keyEncryptionAlgorithm = keyEncryptionAlgorithm;
  }


  /**
   **/
  public SAML2Parameters enableSingleLogout(Boolean enableSingleLogout) {
    this.enableSingleLogout = enableSingleLogout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enableSingleLogout")
@Valid
  public Boolean getEnableSingleLogout() {
    return enableSingleLogout;
  }
  public void setEnableSingleLogout(Boolean enableSingleLogout) {
    this.enableSingleLogout = enableSingleLogout;
  }


  /**
   * Single logout response accepting endpoint
   **/
  public SAML2Parameters singleLogoutResponseUrl(String singleLogoutResponseUrl) {
    this.singleLogoutResponseUrl = singleLogoutResponseUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Single logout response accepting endpoint")
  @JsonProperty("singleLogoutResponseUrl")
@Valid
  public String getSingleLogoutResponseUrl() {
    return singleLogoutResponseUrl;
  }
  public void setSingleLogoutResponseUrl(String singleLogoutResponseUrl) {
    this.singleLogoutResponseUrl = singleLogoutResponseUrl;
  }


  /**
   * Single logout request accepting endpoint
   **/
  public SAML2Parameters singleLogoutRequestUrl(String singleLogoutRequestUrl) {
    this.singleLogoutRequestUrl = singleLogoutRequestUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Single logout request accepting endpoint")
  @JsonProperty("singleLogoutRequestUrl")
@Valid
  public String getSingleLogoutRequestUrl() {
    return singleLogoutRequestUrl;
  }
  public void setSingleLogoutRequestUrl(String singleLogoutRequestUrl) {
    this.singleLogoutRequestUrl = singleLogoutRequestUrl;
  }


  /**
   **/
  public SAML2Parameters singleLogoutMethod(SingleLogoutMethodEnum singleLogoutMethod) {
    this.singleLogoutMethod = singleLogoutMethod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("singleLogoutMethod")
@Valid
  public SingleLogoutMethodEnum getSingleLogoutMethod() {
    return singleLogoutMethod;
  }
  public void setSingleLogoutMethod(SingleLogoutMethodEnum singleLogoutMethod) {
    this.singleLogoutMethod = singleLogoutMethod;
  }


  /**
   **/
  public SAML2Parameters enableIdpInitiatedSingleSignOn(Boolean enableIdpInitiatedSingleSignOn) {
    this.enableIdpInitiatedSingleSignOn = enableIdpInitiatedSingleSignOn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enableIdpInitiatedSingleSignOn")
@Valid
  public Boolean getEnableIdpInitiatedSingleSignOn() {
    return enableIdpInitiatedSingleSignOn;
  }
  public void setEnableIdpInitiatedSingleSignOn(Boolean enableIdpInitiatedSingleSignOn) {
    this.enableIdpInitiatedSingleSignOn = enableIdpInitiatedSingleSignOn;
  }


  /**
   **/
  public SAML2Parameters enableIdpInitiatedSingleLogOut(Boolean enableIdpInitiatedSingleLogOut) {
    this.enableIdpInitiatedSingleLogOut = enableIdpInitiatedSingleLogOut;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enableIdpInitiatedSingleLogOut")
@Valid
  public Boolean getEnableIdpInitiatedSingleLogOut() {
    return enableIdpInitiatedSingleLogOut;
  }
  public void setEnableIdpInitiatedSingleLogOut(Boolean enableIdpInitiatedSingleLogOut) {
    this.enableIdpInitiatedSingleLogOut = enableIdpInitiatedSingleLogOut;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAML2Parameters saML2Parameters = (SAML2Parameters) o;
    return Objects.equals(this.issuer, saML2Parameters.issuer) &&
        Objects.equals(this.assertionConsumerUrls, saML2Parameters.assertionConsumerUrls) &&
        Objects.equals(this.defaultAssertionConsumerUrl, saML2Parameters.defaultAssertionConsumerUrl) &&
        Objects.equals(this.enableRequestSigning, saML2Parameters.enableRequestSigning) &&
        Objects.equals(this.enableAssertionEncryption, saML2Parameters.enableAssertionEncryption) &&
        Objects.equals(this.enableResponseSigning, saML2Parameters.enableResponseSigning) &&
        Objects.equals(this.serviceProviderQualifier, saML2Parameters.serviceProviderQualifier) &&
        Objects.equals(this.nameIdFormat, saML2Parameters.nameIdFormat) &&
        Objects.equals(this.requestValidationCertificateAlias, saML2Parameters.requestValidationCertificateAlias) &&
        Objects.equals(this.responseSigningAlgorithm, saML2Parameters.responseSigningAlgorithm) &&
        Objects.equals(this.responseDigestAlgorithm, saML2Parameters.responseDigestAlgorithm) &&
        Objects.equals(this.assertionEncryptionAlgroithm, saML2Parameters.assertionEncryptionAlgroithm) &&
        Objects.equals(this.keyEncryptionAlgorithm, saML2Parameters.keyEncryptionAlgorithm) &&
        Objects.equals(this.enableSingleLogout, saML2Parameters.enableSingleLogout) &&
        Objects.equals(this.singleLogoutResponseUrl, saML2Parameters.singleLogoutResponseUrl) &&
        Objects.equals(this.singleLogoutRequestUrl, saML2Parameters.singleLogoutRequestUrl) &&
        Objects.equals(this.singleLogoutMethod, saML2Parameters.singleLogoutMethod) &&
        Objects.equals(this.enableIdpInitiatedSingleSignOn, saML2Parameters.enableIdpInitiatedSingleSignOn) &&
        Objects.equals(this.enableIdpInitiatedSingleLogOut, saML2Parameters.enableIdpInitiatedSingleLogOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuer, assertionConsumerUrls, defaultAssertionConsumerUrl, enableRequestSigning, enableAssertionEncryption, enableResponseSigning, serviceProviderQualifier, nameIdFormat, requestValidationCertificateAlias, responseSigningAlgorithm, responseDigestAlgorithm, assertionEncryptionAlgroithm, keyEncryptionAlgorithm, enableSingleLogout, singleLogoutResponseUrl, singleLogoutRequestUrl, singleLogoutMethod, enableIdpInitiatedSingleSignOn, enableIdpInitiatedSingleLogOut);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAML2Parameters {\n");
    
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    assertionConsumerUrls: ").append(toIndentedString(assertionConsumerUrls)).append("\n");
    sb.append("    defaultAssertionConsumerUrl: ").append(toIndentedString(defaultAssertionConsumerUrl)).append("\n");
    sb.append("    enableRequestSigning: ").append(toIndentedString(enableRequestSigning)).append("\n");
    sb.append("    enableAssertionEncryption: ").append(toIndentedString(enableAssertionEncryption)).append("\n");
    sb.append("    enableResponseSigning: ").append(toIndentedString(enableResponseSigning)).append("\n");
    sb.append("    serviceProviderQualifier: ").append(toIndentedString(serviceProviderQualifier)).append("\n");
    sb.append("    nameIdFormat: ").append(toIndentedString(nameIdFormat)).append("\n");
    sb.append("    requestValidationCertificateAlias: ").append(toIndentedString(requestValidationCertificateAlias)).append("\n");
    sb.append("    responseSigningAlgorithm: ").append(toIndentedString(responseSigningAlgorithm)).append("\n");
    sb.append("    responseDigestAlgorithm: ").append(toIndentedString(responseDigestAlgorithm)).append("\n");
    sb.append("    assertionEncryptionAlgroithm: ").append(toIndentedString(assertionEncryptionAlgroithm)).append("\n");
    sb.append("    keyEncryptionAlgorithm: ").append(toIndentedString(keyEncryptionAlgorithm)).append("\n");
    sb.append("    enableSingleLogout: ").append(toIndentedString(enableSingleLogout)).append("\n");
    sb.append("    singleLogoutResponseUrl: ").append(toIndentedString(singleLogoutResponseUrl)).append("\n");
    sb.append("    singleLogoutRequestUrl: ").append(toIndentedString(singleLogoutRequestUrl)).append("\n");
    sb.append("    singleLogoutMethod: ").append(toIndentedString(singleLogoutMethod)).append("\n");
    sb.append("    enableIdpInitiatedSingleSignOn: ").append(toIndentedString(enableIdpInitiatedSingleSignOn)).append("\n");
    sb.append("    enableIdpInitiatedSingleLogOut: ").append(toIndentedString(enableIdpInitiatedSingleLogOut)).append("\n");
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

