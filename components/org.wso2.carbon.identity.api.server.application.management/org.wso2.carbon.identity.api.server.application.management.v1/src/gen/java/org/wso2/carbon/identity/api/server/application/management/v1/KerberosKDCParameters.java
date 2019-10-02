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


public class KerberosKDCParameters   {
  
  private String serviceName;

  private String description;

  private String password;


  /**
   **/
  public KerberosKDCParameters serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("serviceName")
@Valid
  @NotNull(message = "Property serviceName cannot be null.")
  public String getServiceName() {
    return serviceName;
  }
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  /**
   **/
  public KerberosKDCParameters description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
@Valid
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public KerberosKDCParameters password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("password")
@Valid
  @NotNull(message = "Property password cannot be null.")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KerberosKDCParameters kerberosKDCParameters = (KerberosKDCParameters) o;
    return Objects.equals(this.serviceName, kerberosKDCParameters.serviceName) &&
        Objects.equals(this.description, kerberosKDCParameters.description) &&
        Objects.equals(this.password, kerberosKDCParameters.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, description, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KerberosKDCParameters {\n");
    
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

