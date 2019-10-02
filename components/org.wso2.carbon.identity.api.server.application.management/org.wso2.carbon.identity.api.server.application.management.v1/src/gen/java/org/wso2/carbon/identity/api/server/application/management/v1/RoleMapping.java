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


public class RoleMapping   {
  
  private String localRole;

  private String applicationRole;


  /**
   **/
  public RoleMapping localRole(String localRole) {
    this.localRole = localRole;
    return this;
  }

  
  @ApiModelProperty(example = "admin", value = "")
  @JsonProperty("localRole")
@Valid
  public String getLocalRole() {
    return localRole;
  }
  public void setLocalRole(String localRole) {
    this.localRole = localRole;
  }


  /**
   **/
  public RoleMapping applicationRole(String applicationRole) {
    this.applicationRole = applicationRole;
    return this;
  }

  
  @ApiModelProperty(example = "Administrator", value = "")
  @JsonProperty("applicationRole")
@Valid
  public String getApplicationRole() {
    return applicationRole;
  }
  public void setApplicationRole(String applicationRole) {
    this.applicationRole = applicationRole;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleMapping roleMapping = (RoleMapping) o;
    return Objects.equals(this.localRole, roleMapping.localRole) &&
        Objects.equals(this.applicationRole, roleMapping.applicationRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localRole, applicationRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleMapping {\n");
    
    sb.append("    localRole: ").append(toIndentedString(localRole)).append("\n");
    sb.append("    applicationRole: ").append(toIndentedString(applicationRole)).append("\n");
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

