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

package org.wso2.carbon.identity.rest.api.server.application.management.v1.dto;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@ApiModel(description = "")
public class RequestedClaimConfigurationDTO  {
  
  
  @Valid 
  private String claimUri = null;
  
  @Valid 
  private Boolean mandatory = null;

  
  /**
   * User claims that need to be sent back to the application. If the claim mappings are local, use local claim uris. If the custom claim mappings are configured, use the mapped applicationClaimUri
   **/
  @ApiModelProperty(value = "User claims that need to be sent back to the application. If the claim mappings are local, use local claim uris. If the custom claim mappings are configured, use the mapped applicationClaimUri")
  @JsonProperty("claimUri")
  public String getClaimUri() {
    return claimUri;
  }
  public void setClaimUri(String claimUri) {
    this.claimUri = claimUri;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("mandatory")
  public Boolean getMandatory() {
    return mandatory;
  }
  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestedClaimConfigurationDTO {\n");
    
    sb.append("  claimUri: ").append(claimUri).append("\n");
    sb.append("  mandatory: ").append(mandatory).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
