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
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.RoleMappingDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@ApiModel(description = "")
public class RoleConfigDTO  {
  
  
  @Valid 
  private List<RoleMappingDTO> mappings = new ArrayList<RoleMappingDTO>();
  
  @Valid 
  private Boolean includeUserDomain = null;
  
  @Valid 
  private String claimId = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("mappings")
  public List<RoleMappingDTO> getMappings() {
    return mappings;
  }
  public void setMappings(List<RoleMappingDTO> mappings) {
    this.mappings = mappings;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("includeUserDomain")
  public Boolean getIncludeUserDomain() {
    return includeUserDomain;
  }
  public void setIncludeUserDomain(Boolean includeUserDomain) {
    this.includeUserDomain = includeUserDomain;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("claimId")
  public String getClaimId() {
    return claimId;
  }
  public void setClaimId(String claimId) {
    this.claimId = claimId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleConfigDTO {\n");
    
    sb.append("  mappings: ").append(mappings).append("\n");
    sb.append("  includeUserDomain: ").append(includeUserDomain).append("\n");
    sb.append("  claimId: ").append(claimId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
