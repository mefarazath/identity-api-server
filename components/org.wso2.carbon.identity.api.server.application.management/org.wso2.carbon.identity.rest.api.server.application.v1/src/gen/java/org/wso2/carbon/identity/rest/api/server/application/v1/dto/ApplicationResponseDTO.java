/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.rest.api.server.application.v1.dto;

import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.AdvancedAuthenticationConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ApplicationPermissionsDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.AuthenticationSequenceDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ClaimConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.InboundProtocolsDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.PropertyDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ProvisioningConfigurationDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@ApiModel(description = "")
public class ApplicationResponseDTO  {
  
  
  @Valid 
  private String id = null;
  
  @Valid @NotNull(message = "Property name cannot be null.") 
  private String name = null;
  
  @Valid 
  private String description = null;
  
  @Valid 
  private String homePage = null;
  
  @Valid 
  private String logo = null;
  
  @Valid 
  private String owner = null;
  
  @Valid 
  private List<PropertyDTO> spProperties = new ArrayList<PropertyDTO>();
  
  @Valid 
  private ClaimConfigurationDTO claimConfiguration = null;
  
  @Valid 
  private ApplicationPermissionsDTO permissionConfiguration = null;
  
  @Valid 
  private InboundProtocolsDTO inboundProtocols = null;
  
  @Valid 
  private AuthenticationSequenceDTO authenticationSequence = null;
  
  @Valid 
  private AdvancedAuthenticationConfigurationDTO advancedConfigurations = null;
  
  @Valid 
  private ProvisioningConfigurationDTO provisioningConfigurations = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("homePage")
  public String getHomePage() {
    return homePage;
  }
  public void setHomePage(String homePage) {
    this.homePage = homePage;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("logo")
  public String getLogo() {
    return logo;
  }
  public void setLogo(String logo) {
    this.logo = logo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("spProperties")
  public List<PropertyDTO> getSpProperties() {
    return spProperties;
  }
  public void setSpProperties(List<PropertyDTO> spProperties) {
    this.spProperties = spProperties;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("claimConfiguration")
  public ClaimConfigurationDTO getClaimConfiguration() {
    return claimConfiguration;
  }
  public void setClaimConfiguration(ClaimConfigurationDTO claimConfiguration) {
    this.claimConfiguration = claimConfiguration;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("permissionConfiguration")
  public ApplicationPermissionsDTO getPermissionConfiguration() {
    return permissionConfiguration;
  }
  public void setPermissionConfiguration(ApplicationPermissionsDTO permissionConfiguration) {
    this.permissionConfiguration = permissionConfiguration;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("inboundProtocols")
  public InboundProtocolsDTO getInboundProtocols() {
    return inboundProtocols;
  }
  public void setInboundProtocols(InboundProtocolsDTO inboundProtocols) {
    this.inboundProtocols = inboundProtocols;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("authenticationSequence")
  public AuthenticationSequenceDTO getAuthenticationSequence() {
    return authenticationSequence;
  }
  public void setAuthenticationSequence(AuthenticationSequenceDTO authenticationSequence) {
    this.authenticationSequence = authenticationSequence;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("advancedConfigurations")
  public AdvancedAuthenticationConfigurationDTO getAdvancedConfigurations() {
    return advancedConfigurations;
  }
  public void setAdvancedConfigurations(AdvancedAuthenticationConfigurationDTO advancedConfigurations) {
    this.advancedConfigurations = advancedConfigurations;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("provisioningConfigurations")
  public ProvisioningConfigurationDTO getProvisioningConfigurations() {
    return provisioningConfigurations;
  }
  public void setProvisioningConfigurations(ProvisioningConfigurationDTO provisioningConfigurations) {
    this.provisioningConfigurations = provisioningConfigurations;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationResponseDTO {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  homePage: ").append(homePage).append("\n");
    sb.append("  logo: ").append(logo).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  spProperties: ").append(spProperties).append("\n");
    sb.append("  claimConfiguration: ").append(claimConfiguration).append("\n");
    sb.append("  permissionConfiguration: ").append(permissionConfiguration).append("\n");
    sb.append("  inboundProtocols: ").append(inboundProtocols).append("\n");
    sb.append("  authenticationSequence: ").append(authenticationSequence).append("\n");
    sb.append("  advancedConfigurations: ").append(advancedConfigurations).append("\n");
    sb.append("  provisioningConfigurations: ").append(provisioningConfigurations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
