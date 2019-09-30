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

import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.AuthenticationStepDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@ApiModel(description = "")
public class AuthenticationSequenceDTO  {
  
  
  @Valid 
  private List<AuthenticationStepDTO> steps = new ArrayList<AuthenticationStepDTO>();
  
  @Valid 
  private String script = null;
  
  @Valid 
  private String subjectStepId = null;
  
  @Valid 
  private String attributeStepId = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("steps")
  public List<AuthenticationStepDTO> getSteps() {
    return steps;
  }
  public void setSteps(List<AuthenticationStepDTO> steps) {
    this.steps = steps;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("script")
  public String getScript() {
    return script;
  }
  public void setScript(String script) {
    this.script = script;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("subjectStepId")
  public String getSubjectStepId() {
    return subjectStepId;
  }
  public void setSubjectStepId(String subjectStepId) {
    this.subjectStepId = subjectStepId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("attributeStepId")
  public String getAttributeStepId() {
    return attributeStepId;
  }
  public void setAttributeStepId(String attributeStepId) {
    this.attributeStepId = attributeStepId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationSequenceDTO {\n");
    
    sb.append("  steps: ").append(steps).append("\n");
    sb.append("  script: ").append(script).append("\n");
    sb.append("  subjectStepId: ").append(subjectStepId).append("\n");
    sb.append("  attributeStepId: ").append(attributeStepId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
