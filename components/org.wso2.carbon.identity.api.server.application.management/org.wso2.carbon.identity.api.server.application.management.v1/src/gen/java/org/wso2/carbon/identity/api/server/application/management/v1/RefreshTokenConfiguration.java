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


public class RefreshTokenConfiguration   {
  
  private Integer expiryInSeconds;

  private Boolean renewRefreshToken;


  /**
   **/
  public RefreshTokenConfiguration expiryInSeconds(Integer expiryInSeconds) {
    this.expiryInSeconds = expiryInSeconds;
    return this;
  }

  
  @ApiModelProperty(example = "86400", value = "")
  @JsonProperty("expiryInSeconds")
@Valid
  public Integer getExpiryInSeconds() {
    return expiryInSeconds;
  }
  public void setExpiryInSeconds(Integer expiryInSeconds) {
    this.expiryInSeconds = expiryInSeconds;
  }


  /**
   **/
  public RefreshTokenConfiguration renewRefreshToken(Boolean renewRefreshToken) {
    this.renewRefreshToken = renewRefreshToken;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty("renewRefreshToken")
@Valid
  public Boolean getRenewRefreshToken() {
    return renewRefreshToken;
  }
  public void setRenewRefreshToken(Boolean renewRefreshToken) {
    this.renewRefreshToken = renewRefreshToken;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefreshTokenConfiguration refreshTokenConfiguration = (RefreshTokenConfiguration) o;
    return Objects.equals(this.expiryInSeconds, refreshTokenConfiguration.expiryInSeconds) &&
        Objects.equals(this.renewRefreshToken, refreshTokenConfiguration.renewRefreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiryInSeconds, renewRefreshToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshTokenConfiguration {\n");
    
    sb.append("    expiryInSeconds: ").append(toIndentedString(expiryInSeconds)).append("\n");
    sb.append("    renewRefreshToken: ").append(toIndentedString(renewRefreshToken)).append("\n");
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

