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
public class OutboundProvisioningConfigurationDTO  {
  
  
  @Valid 
  private String idp = null;
  
  @Valid 
  private String connector = null;
  
  @Valid 
  private Boolean blocking = null;
  
  @Valid 
  private Boolean rules = null;
  
  @Valid 
  private Boolean jit = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("idp")
  public String getIdp() {
    return idp;
  }
  public void setIdp(String idp) {
    this.idp = idp;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("connector")
  public String getConnector() {
    return connector;
  }
  public void setConnector(String connector) {
    this.connector = connector;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("blocking")
  public Boolean getBlocking() {
    return blocking;
  }
  public void setBlocking(Boolean blocking) {
    this.blocking = blocking;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("rules")
  public Boolean getRules() {
    return rules;
  }
  public void setRules(Boolean rules) {
    this.rules = rules;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("jit")
  public Boolean getJit() {
    return jit;
  }
  public void setJit(Boolean jit) {
    this.jit = jit;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundProvisioningConfigurationDTO {\n");
    
    sb.append("  idp: ").append(idp).append("\n");
    sb.append("  connector: ").append(connector).append("\n");
    sb.append("  blocking: ").append(blocking).append("\n");
    sb.append("  rules: ").append(rules).append("\n");
    sb.append("  jit: ").append(jit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
