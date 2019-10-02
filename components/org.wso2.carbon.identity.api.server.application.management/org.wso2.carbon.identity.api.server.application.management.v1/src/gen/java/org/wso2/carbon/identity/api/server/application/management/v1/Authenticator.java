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


public class Authenticator   {
  
  private String idp;

  private String authenticator;


  /**
   **/
  public Authenticator idp(String idp) {
    this.idp = idp;
    return this;
  }

  
  @ApiModelProperty(example = "LOCAL", value = "")
  @JsonProperty("idp")
@Valid
  public String getIdp() {
    return idp;
  }
  public void setIdp(String idp) {
    this.idp = idp;
  }


  /**
   **/
  public Authenticator authenticator(String authenticator) {
    this.authenticator = authenticator;
    return this;
  }

  
  @ApiModelProperty(example = "basic", value = "")
  @JsonProperty("authenticator")
@Valid
  public String getAuthenticator() {
    return authenticator;
  }
  public void setAuthenticator(String authenticator) {
    this.authenticator = authenticator;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authenticator authenticator = (Authenticator) o;
    return Objects.equals(this.idp, authenticator.idp) &&
        Objects.equals(this.authenticator, authenticator.authenticator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idp, authenticator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authenticator {\n");
    
    sb.append("    idp: ").append(toIndentedString(idp)).append("\n");
    sb.append("    authenticator: ").append(toIndentedString(authenticator)).append("\n");
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

