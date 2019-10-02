package org.wso2.carbon.identity.api.server.application.management.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.wso2.carbon.identity.api.server.application.management.v1.OIDCBackChannelLogoutConfig;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;


public class OIDCLogoutConfiguration   {
  
  private OIDCBackChannelLogoutConfig backChannelLogout;


  /**
   **/
  public OIDCLogoutConfiguration backChannelLogout(OIDCBackChannelLogoutConfig backChannelLogout) {
    this.backChannelLogout = backChannelLogout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("backChannelLogout")
@Valid
  public OIDCBackChannelLogoutConfig getBackChannelLogout() {
    return backChannelLogout;
  }
  public void setBackChannelLogout(OIDCBackChannelLogoutConfig backChannelLogout) {
    this.backChannelLogout = backChannelLogout;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIDCLogoutConfiguration oiDCLogoutConfiguration = (OIDCLogoutConfiguration) o;
    return Objects.equals(this.backChannelLogout, oiDCLogoutConfiguration.backChannelLogout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backChannelLogout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCLogoutConfiguration {\n");
    
    sb.append("    backChannelLogout: ").append(toIndentedString(backChannelLogout)).append("\n");
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

