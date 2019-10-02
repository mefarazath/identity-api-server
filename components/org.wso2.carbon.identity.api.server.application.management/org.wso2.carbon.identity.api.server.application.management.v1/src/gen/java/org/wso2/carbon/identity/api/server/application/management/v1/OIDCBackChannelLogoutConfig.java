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


public class OIDCBackChannelLogoutConfig   {
  
  private Boolean enabled = false;

  private String backChannelLogoutUrl;


  /**
   **/
  public OIDCBackChannelLogoutConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty("enabled")
@Valid
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   **/
  public OIDCBackChannelLogoutConfig backChannelLogoutUrl(String backChannelLogoutUrl) {
    this.backChannelLogoutUrl = backChannelLogoutUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://app.example.com/backchannellogout/callback", value = "")
  @JsonProperty("backChannelLogoutUrl")
@Valid
  public String getBackChannelLogoutUrl() {
    return backChannelLogoutUrl;
  }
  public void setBackChannelLogoutUrl(String backChannelLogoutUrl) {
    this.backChannelLogoutUrl = backChannelLogoutUrl;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIDCBackChannelLogoutConfig oiDCBackChannelLogoutConfig = (OIDCBackChannelLogoutConfig) o;
    return Objects.equals(this.enabled, oiDCBackChannelLogoutConfig.enabled) &&
        Objects.equals(this.backChannelLogoutUrl, oiDCBackChannelLogoutConfig.backChannelLogoutUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, backChannelLogoutUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCBackChannelLogoutConfig {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    backChannelLogoutUrl: ").append(toIndentedString(backChannelLogoutUrl)).append("\n");
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

