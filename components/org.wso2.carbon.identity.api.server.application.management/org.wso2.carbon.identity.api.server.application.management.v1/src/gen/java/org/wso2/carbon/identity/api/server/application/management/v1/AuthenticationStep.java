package org.wso2.carbon.identity.api.server.application.management.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.api.server.application.management.v1.Authenticator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;


public class AuthenticationStep   {
  
  private String id;

  private List<Authenticator> options = null;


  /**
   **/
  public AuthenticationStep id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "step1", value = "")
  @JsonProperty("id")
@Valid
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public AuthenticationStep options(List<Authenticator> options) {
    this.options = options;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("options")
@Valid
  public List<Authenticator> getOptions() {
    return options;
  }
  public void setOptions(List<Authenticator> options) {
    this.options = options;
  }

  public AuthenticationStep addOptionsItem(Authenticator optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationStep authenticationStep = (AuthenticationStep) o;
    return Objects.equals(this.id, authenticationStep.id) &&
        Objects.equals(this.options, authenticationStep.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationStep {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

