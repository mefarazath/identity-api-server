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


public class OAuth2PKCEConfiguration   {
  
  private Boolean mandatory;

  private Boolean supportPlainTransformAlgorithm;


  /**
   **/
  public OAuth2PKCEConfiguration mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty("mandatory")
@Valid
  public Boolean getMandatory() {
    return mandatory;
  }
  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }


  /**
   **/
  public OAuth2PKCEConfiguration supportPlainTransformAlgorithm(Boolean supportPlainTransformAlgorithm) {
    this.supportPlainTransformAlgorithm = supportPlainTransformAlgorithm;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty("supportPlainTransformAlgorithm")
@Valid
  public Boolean getSupportPlainTransformAlgorithm() {
    return supportPlainTransformAlgorithm;
  }
  public void setSupportPlainTransformAlgorithm(Boolean supportPlainTransformAlgorithm) {
    this.supportPlainTransformAlgorithm = supportPlainTransformAlgorithm;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2PKCEConfiguration oauth2PKCEConfiguration = (OAuth2PKCEConfiguration) o;
    return Objects.equals(this.mandatory, oauth2PKCEConfiguration.mandatory) &&
        Objects.equals(this.supportPlainTransformAlgorithm, oauth2PKCEConfiguration.supportPlainTransformAlgorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandatory, supportPlainTransformAlgorithm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2PKCEConfiguration {\n");
    
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    supportPlainTransformAlgorithm: ").append(toIndentedString(supportPlainTransformAlgorithm)).append("\n");
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
