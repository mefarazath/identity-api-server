package org.wso2.carbon.identity.api.server.application.management.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.api.server.application.management.v1.IdTokenEncryptionConfiguration;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;


public class IdTokenConfiguration   {
  
  private Integer expiryInSeconds;

  private List<String> audience = null;

  private IdTokenEncryptionConfiguration encryption;


  /**
   **/
  public IdTokenConfiguration expiryInSeconds(Integer expiryInSeconds) {
    this.expiryInSeconds = expiryInSeconds;
    return this;
  }

  
  @ApiModelProperty(example = "3600", value = "")
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
  public IdTokenConfiguration audience(List<String> audience) {
    this.audience = audience;
    return this;
  }

  
  @ApiModelProperty(example = "[\"http://idp.xyz.com\",\"http://idp.abc.com\"]", value = "")
  @JsonProperty("audience")
@Valid
  public List<String> getAudience() {
    return audience;
  }
  public void setAudience(List<String> audience) {
    this.audience = audience;
  }

  public IdTokenConfiguration addAudienceItem(String audienceItem) {
    if (this.audience == null) {
      this.audience = new ArrayList<>();
    }
    this.audience.add(audienceItem);
    return this;
  }


  /**
   **/
  public IdTokenConfiguration encryption(IdTokenEncryptionConfiguration encryption) {
    this.encryption = encryption;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("encryption")
@Valid
  public IdTokenEncryptionConfiguration getEncryption() {
    return encryption;
  }
  public void setEncryption(IdTokenEncryptionConfiguration encryption) {
    this.encryption = encryption;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdTokenConfiguration idTokenConfiguration = (IdTokenConfiguration) o;
    return Objects.equals(this.expiryInSeconds, idTokenConfiguration.expiryInSeconds) &&
        Objects.equals(this.audience, idTokenConfiguration.audience) &&
        Objects.equals(this.encryption, idTokenConfiguration.encryption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiryInSeconds, audience, encryption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdTokenConfiguration {\n");
    
    sb.append("    expiryInSeconds: ").append(toIndentedString(expiryInSeconds)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
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

