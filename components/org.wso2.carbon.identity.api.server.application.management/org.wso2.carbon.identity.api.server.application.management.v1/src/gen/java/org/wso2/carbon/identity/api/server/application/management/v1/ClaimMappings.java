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


public class ClaimMappings   {
  
  private String applicationClaimUri;

  private String localClaimUri;


  /**
   **/
  public ClaimMappings applicationClaimUri(String applicationClaimUri) {
    this.applicationClaimUri = applicationClaimUri;
    return this;
  }

  
  @ApiModelProperty(example = "firstname", value = "")
  @JsonProperty("applicationClaimUri")
@Valid
  public String getApplicationClaimUri() {
    return applicationClaimUri;
  }
  public void setApplicationClaimUri(String applicationClaimUri) {
    this.applicationClaimUri = applicationClaimUri;
  }


  /**
   **/
  public ClaimMappings localClaimUri(String localClaimUri) {
    this.localClaimUri = localClaimUri;
    return this;
  }

  
  @ApiModelProperty(example = "http://wso2.org/claims/givenname", value = "")
  @JsonProperty("localClaimUri")
@Valid
  public String getLocalClaimUri() {
    return localClaimUri;
  }
  public void setLocalClaimUri(String localClaimUri) {
    this.localClaimUri = localClaimUri;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaimMappings claimMappings = (ClaimMappings) o;
    return Objects.equals(this.applicationClaimUri, claimMappings.applicationClaimUri) &&
        Objects.equals(this.localClaimUri, claimMappings.localClaimUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationClaimUri, localClaimUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimMappings {\n");
    
    sb.append("    applicationClaimUri: ").append(toIndentedString(applicationClaimUri)).append("\n");
    sb.append("    localClaimUri: ").append(toIndentedString(localClaimUri)).append("\n");
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

