package org.wso2.carbon.identity.api.server.application.management.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.api.server.application.management.v1.CustomInboundProtcolParameters;
import org.wso2.carbon.identity.api.server.application.management.v1.KerberosKDCParameters;
import org.wso2.carbon.identity.api.server.application.management.v1.OIDCParameters;
import org.wso2.carbon.identity.api.server.application.management.v1.PassiveSTSParameters;
import org.wso2.carbon.identity.api.server.application.management.v1.SAML2Parameters;
import org.wso2.carbon.identity.api.server.application.management.v1.WSTrustParameters;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;


public class InboundProtocols   {
  
  private SAML2Parameters saml;

  private OIDCParameters oidc;

  private PassiveSTSParameters passiveSts;

  private WSTrustParameters wsTrust;

  private KerberosKDCParameters kerberosKDC;

  private List<CustomInboundProtcolParameters> custom = null;


  /**
   **/
  public InboundProtocols saml(SAML2Parameters saml) {
    this.saml = saml;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("saml")
@Valid
  public SAML2Parameters getSaml() {
    return saml;
  }
  public void setSaml(SAML2Parameters saml) {
    this.saml = saml;
  }


  /**
   **/
  public InboundProtocols oidc(OIDCParameters oidc) {
    this.oidc = oidc;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oidc")
@Valid
  public OIDCParameters getOidc() {
    return oidc;
  }
  public void setOidc(OIDCParameters oidc) {
    this.oidc = oidc;
  }


  /**
   **/
  public InboundProtocols passiveSts(PassiveSTSParameters passiveSts) {
    this.passiveSts = passiveSts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("passiveSts")
@Valid
  public PassiveSTSParameters getPassiveSts() {
    return passiveSts;
  }
  public void setPassiveSts(PassiveSTSParameters passiveSts) {
    this.passiveSts = passiveSts;
  }


  /**
   **/
  public InboundProtocols wsTrust(WSTrustParameters wsTrust) {
    this.wsTrust = wsTrust;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("wsTrust")
@Valid
  public WSTrustParameters getWsTrust() {
    return wsTrust;
  }
  public void setWsTrust(WSTrustParameters wsTrust) {
    this.wsTrust = wsTrust;
  }


  /**
   **/
  public InboundProtocols kerberosKDC(KerberosKDCParameters kerberosKDC) {
    this.kerberosKDC = kerberosKDC;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("kerberosKDC")
@Valid
  public KerberosKDCParameters getKerberosKDC() {
    return kerberosKDC;
  }
  public void setKerberosKDC(KerberosKDCParameters kerberosKDC) {
    this.kerberosKDC = kerberosKDC;
  }


  /**
   **/
  public InboundProtocols custom(List<CustomInboundProtcolParameters> custom) {
    this.custom = custom;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom")
@Valid
  public List<CustomInboundProtcolParameters> getCustom() {
    return custom;
  }
  public void setCustom(List<CustomInboundProtcolParameters> custom) {
    this.custom = custom;
  }

  public InboundProtocols addCustomItem(CustomInboundProtcolParameters customItem) {
    if (this.custom == null) {
      this.custom = new ArrayList<>();
    }
    this.custom.add(customItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundProtocols inboundProtocols = (InboundProtocols) o;
    return Objects.equals(this.saml, inboundProtocols.saml) &&
        Objects.equals(this.oidc, inboundProtocols.oidc) &&
        Objects.equals(this.passiveSts, inboundProtocols.passiveSts) &&
        Objects.equals(this.wsTrust, inboundProtocols.wsTrust) &&
        Objects.equals(this.kerberosKDC, inboundProtocols.kerberosKDC) &&
        Objects.equals(this.custom, inboundProtocols.custom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saml, oidc, passiveSts, wsTrust, kerberosKDC, custom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundProtocols {\n");
    
    sb.append("    saml: ").append(toIndentedString(saml)).append("\n");
    sb.append("    oidc: ").append(toIndentedString(oidc)).append("\n");
    sb.append("    passiveSts: ").append(toIndentedString(passiveSts)).append("\n");
    sb.append("    wsTrust: ").append(toIndentedString(wsTrust)).append("\n");
    sb.append("    kerberosKDC: ").append(toIndentedString(kerberosKDC)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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

