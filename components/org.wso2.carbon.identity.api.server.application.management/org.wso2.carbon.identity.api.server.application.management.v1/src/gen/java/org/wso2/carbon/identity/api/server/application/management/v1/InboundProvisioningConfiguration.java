package org.wso2.carbon.identity.api.server.application.management.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.wso2.carbon.identity.api.server.application.management.v1.InboundProvisioningSCIMConfiguration;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;


public class InboundProvisioningConfiguration   {
  
  private InboundProvisioningSCIMConfiguration scimConfiguration;


  /**
   **/
  public InboundProvisioningConfiguration scimConfiguration(InboundProvisioningSCIMConfiguration scimConfiguration) {
    this.scimConfiguration = scimConfiguration;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scimConfiguration")
@Valid
  public InboundProvisioningSCIMConfiguration getScimConfiguration() {
    return scimConfiguration;
  }
  public void setScimConfiguration(InboundProvisioningSCIMConfiguration scimConfiguration) {
    this.scimConfiguration = scimConfiguration;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundProvisioningConfiguration inboundProvisioningConfiguration = (InboundProvisioningConfiguration) o;
    return Objects.equals(this.scimConfiguration, inboundProvisioningConfiguration.scimConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scimConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundProvisioningConfiguration {\n");
    
    sb.append("    scimConfiguration: ").append(toIndentedString(scimConfiguration)).append("\n");
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

