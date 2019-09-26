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
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.ClaimMappingsDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.RequestedClaimConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.RoleConfigDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.SubjectConfigDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@ApiModel(description = "")
public class ClaimConfigurationDTO  {
  
  
  public enum ClaimMappingTypeEnum {
     custom,  external,  local, 
  };
  @Valid 
  private ClaimMappingTypeEnum claimMappingType = null;
  
  @Valid 
  private List<ClaimMappingsDTO> claimMapping = new ArrayList<ClaimMappingsDTO>();
  
  @Valid 
  private List<RequestedClaimConfigurationDTO> requestedClaims = new ArrayList<RequestedClaimConfigurationDTO>();
  
  @Valid 
  private SubjectConfigDTO subject = null;
  
  @Valid 
  private RoleConfigDTO role = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("claimMappingType")
  public ClaimMappingTypeEnum getClaimMappingType() {
    return claimMappingType;
  }
  public void setClaimMappingType(ClaimMappingTypeEnum claimMappingType) {
    this.claimMappingType = claimMappingType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("claimMapping")
  public List<ClaimMappingsDTO> getClaimMapping() {
    return claimMapping;
  }
  public void setClaimMapping(List<ClaimMappingsDTO> claimMapping) {
    this.claimMapping = claimMapping;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("requestedClaims")
  public List<RequestedClaimConfigurationDTO> getRequestedClaims() {
    return requestedClaims;
  }
  public void setRequestedClaims(List<RequestedClaimConfigurationDTO> requestedClaims) {
    this.requestedClaims = requestedClaims;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("subject")
  public SubjectConfigDTO getSubject() {
    return subject;
  }
  public void setSubject(SubjectConfigDTO subject) {
    this.subject = subject;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("role")
  public RoleConfigDTO getRole() {
    return role;
  }
  public void setRole(RoleConfigDTO role) {
    this.role = role;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimConfigurationDTO {\n");
    
    sb.append("  claimMappingType: ").append(claimMappingType).append("\n");
    sb.append("  claimMapping: ").append(claimMapping).append("\n");
    sb.append("  requestedClaims: ").append(requestedClaims).append("\n");
    sb.append("  subject: ").append(subject).append("\n");
    sb.append("  role: ").append(role).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
