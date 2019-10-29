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


public class AccessTokenConfiguration   {
  
  private String type;

  private Integer userAccessTokenExpiryInSeconds;

  private Integer applicationAccessTokenExpiryInSeconds;


  /**
   **/
  public AccessTokenConfiguration type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "JWT", value = "")
  @JsonProperty("type")
@Valid
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   **/
  public AccessTokenConfiguration userAccessTokenExpiryInSeconds(Integer userAccessTokenExpiryInSeconds) {
    this.userAccessTokenExpiryInSeconds = userAccessTokenExpiryInSeconds;
    return this;
  }

  
  @ApiModelProperty(example = "3600", value = "")
  @JsonProperty("userAccessTokenExpiryInSeconds")
@Valid
  public Integer getUserAccessTokenExpiryInSeconds() {
    return userAccessTokenExpiryInSeconds;
  }
  public void setUserAccessTokenExpiryInSeconds(Integer userAccessTokenExpiryInSeconds) {
    this.userAccessTokenExpiryInSeconds = userAccessTokenExpiryInSeconds;
  }


  /**
   **/
  public AccessTokenConfiguration applicationAccessTokenExpiryInSeconds(Integer applicationAccessTokenExpiryInSeconds) {
    this.applicationAccessTokenExpiryInSeconds = applicationAccessTokenExpiryInSeconds;
    return this;
  }

  
  @ApiModelProperty(example = "3600", value = "")
  @JsonProperty("applicationAccessTokenExpiryInSeconds")
@Valid
  public Integer getApplicationAccessTokenExpiryInSeconds() {
    return applicationAccessTokenExpiryInSeconds;
  }
  public void setApplicationAccessTokenExpiryInSeconds(Integer applicationAccessTokenExpiryInSeconds) {
    this.applicationAccessTokenExpiryInSeconds = applicationAccessTokenExpiryInSeconds;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokenConfiguration accessTokenConfiguration = (AccessTokenConfiguration) o;
    return Objects.equals(this.type, accessTokenConfiguration.type) &&
        Objects.equals(this.userAccessTokenExpiryInSeconds, accessTokenConfiguration.userAccessTokenExpiryInSeconds) &&
        Objects.equals(this.applicationAccessTokenExpiryInSeconds, accessTokenConfiguration.applicationAccessTokenExpiryInSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, userAccessTokenExpiryInSeconds, applicationAccessTokenExpiryInSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenConfiguration {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userAccessTokenExpiryInSeconds: ").append(toIndentedString(userAccessTokenExpiryInSeconds)).append("\n");
    sb.append("    applicationAccessTokenExpiryInSeconds: ").append(toIndentedString(applicationAccessTokenExpiryInSeconds)).append("\n");
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

