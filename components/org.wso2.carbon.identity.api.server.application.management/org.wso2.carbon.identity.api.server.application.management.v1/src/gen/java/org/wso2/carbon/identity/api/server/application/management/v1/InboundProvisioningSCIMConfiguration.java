package org.wso2.carbon.identity.api.server.application.management.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;


public class InboundProvisioningSCIMConfiguration   {
  
  private String provisioningUserstoreDomain;

  private Boolean proxyMode;


  /**
   * This property becomes only applicable if the proxy-mode config is set to false
   **/
  public InboundProvisioningSCIMConfiguration provisioningUserstoreDomain(String provisioningUserstoreDomain) {
    this.provisioningUserstoreDomain = provisioningUserstoreDomain;
    return this;
  }

  
  @ApiModelProperty(example = "PRIMARY", value = "This property becomes only applicable if the proxy-mode config is set to false")
  @JsonProperty("provisioningUserstoreDomain")
@Valid
  public String getProvisioningUserstoreDomain() {
    return provisioningUserstoreDomain;
  }
  public void setProvisioningUserstoreDomain(String provisioningUserstoreDomain) {
    this.provisioningUserstoreDomain = provisioningUserstoreDomain;
  }


  /**
   **/
  public InboundProvisioningSCIMConfiguration proxyMode(Boolean proxyMode) {
    this.proxyMode = proxyMode;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty("proxy-mode")
@Valid
  public Boolean getProxyMode() {
    return proxyMode;
  }
  public void setProxyMode(Boolean proxyMode) {
    this.proxyMode = proxyMode;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundProvisioningSCIMConfiguration inboundProvisioningSCIMConfiguration = (InboundProvisioningSCIMConfiguration) o;
    return Objects.equals(this.provisioningUserstoreDomain, inboundProvisioningSCIMConfiguration.provisioningUserstoreDomain) &&
        Objects.equals(this.proxyMode, inboundProvisioningSCIMConfiguration.proxyMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provisioningUserstoreDomain, proxyMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundProvisioningSCIMConfiguration {\n");
    
    sb.append("    provisioningUserstoreDomain: ").append(toIndentedString(provisioningUserstoreDomain)).append("\n");
    sb.append("    proxyMode: ").append(toIndentedString(proxyMode)).append("\n");
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

