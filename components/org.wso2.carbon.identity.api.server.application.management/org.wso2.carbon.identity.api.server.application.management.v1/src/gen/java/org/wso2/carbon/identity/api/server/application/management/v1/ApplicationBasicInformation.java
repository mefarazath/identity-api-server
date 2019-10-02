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


public class ApplicationBasicInformation   {
  
  private String id;

  private String name;

  private String description;

  private String logo;

  private String location;


  /**
   **/
  public ApplicationBasicInformation id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "85e3f4b8-0d22-4181-b1e3-1651f71b88bd", value = "")
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
  public ApplicationBasicInformation name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "user-portal", value = "")
  @JsonProperty("name")
@Valid
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public ApplicationBasicInformation description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "Application representing user portal", value = "")
  @JsonProperty("description")
@Valid
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public ApplicationBasicInformation logo(String logo) {
    this.logo = logo;
    return this;
  }

  
  @ApiModelProperty(example = "https://example.com/logo/my-logo.png", value = "")
  @JsonProperty("logo")
@Valid
  public String getLogo() {
    return logo;
  }
  public void setLogo(String logo) {
    this.logo = logo;
  }


  /**
   **/
  public ApplicationBasicInformation location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(example = "\"https://iam.example.com/t/wso2.com/api/server/v1/applications/85e3f4b8-0d22-4181-b1e3-1651f71b88bd\"", value = "")
  @JsonProperty("location")
@Valid
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationBasicInformation applicationBasicInformation = (ApplicationBasicInformation) o;
    return Objects.equals(this.id, applicationBasicInformation.id) &&
        Objects.equals(this.name, applicationBasicInformation.name) &&
        Objects.equals(this.description, applicationBasicInformation.description) &&
        Objects.equals(this.logo, applicationBasicInformation.logo) &&
        Objects.equals(this.location, applicationBasicInformation.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, logo, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationBasicInformation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

