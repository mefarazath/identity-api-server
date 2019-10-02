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


public class PassiveSTSParameters   {
  
  private String realm;

  private String replyTo;


  /**
   **/
  public PassiveSTSParameters realm(String realm) {
    this.realm = realm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("realm")
@Valid
  public String getRealm() {
    return realm;
  }
  public void setRealm(String realm) {
    this.realm = realm;
  }


  /**
   **/
  public PassiveSTSParameters replyTo(String replyTo) {
    this.replyTo = replyTo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("replyTo")
@Valid
  public String getReplyTo() {
    return replyTo;
  }
  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassiveSTSParameters passiveSTSParameters = (PassiveSTSParameters) o;
    return Objects.equals(this.realm, passiveSTSParameters.realm) &&
        Objects.equals(this.replyTo, passiveSTSParameters.replyTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realm, replyTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassiveSTSParameters {\n");
    
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
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

