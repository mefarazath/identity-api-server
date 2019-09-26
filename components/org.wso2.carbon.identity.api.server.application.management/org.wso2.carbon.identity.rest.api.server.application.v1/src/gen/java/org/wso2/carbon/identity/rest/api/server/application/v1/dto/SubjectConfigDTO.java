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


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@ApiModel(description = "")
public class SubjectConfigDTO  {
  
  
  @Valid 
  private String claimId = null;
  
  @Valid 
  private Boolean includeUserDomain = null;
  
  @Valid 
  private Boolean includeTenantDomain = null;
  
  @Valid 
  private Boolean useMappedLocalSubject = null;

  
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
  @JsonProperty("includeTenantDomain")
  public Boolean getIncludeTenantDomain() {
    return includeTenantDomain;
  }
  public void setIncludeTenantDomain(Boolean includeTenantDomain) {
    this.includeTenantDomain = includeTenantDomain;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("useMappedLocalSubject")
  public Boolean getUseMappedLocalSubject() {
    return useMappedLocalSubject;
  }
  public void setUseMappedLocalSubject(Boolean useMappedLocalSubject) {
    this.useMappedLocalSubject = useMappedLocalSubject;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectConfigDTO {\n");
    
    sb.append("  claimId: ").append(claimId).append("\n");
    sb.append("  includeUserDomain: ").append(includeUserDomain).append("\n");
    sb.append("  includeTenantDomain: ").append(includeTenantDomain).append("\n");
    sb.append("  useMappedLocalSubject: ").append(useMappedLocalSubject).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
