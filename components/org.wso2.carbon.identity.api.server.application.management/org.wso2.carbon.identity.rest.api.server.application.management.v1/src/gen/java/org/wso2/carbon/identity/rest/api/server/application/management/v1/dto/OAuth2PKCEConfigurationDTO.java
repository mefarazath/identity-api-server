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
public class OAuth2PKCEConfigurationDTO  {
  
  
  @Valid 
  private Boolean mandatory = null;
  
  @Valid 
  private Boolean supportPlainTransformAlgorithm = null;

  
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("supportPlainTransformAlgorithm")
  public Boolean getSupportPlainTransformAlgorithm() {
    return supportPlainTransformAlgorithm;
  }
  public void setSupportPlainTransformAlgorithm(Boolean supportPlainTransformAlgorithm) {
    this.supportPlainTransformAlgorithm = supportPlainTransformAlgorithm;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2PKCEConfigurationDTO {\n");
    
    sb.append("  mandatory: ").append(mandatory).append("\n");
    sb.append("  supportPlainTransformAlgorithm: ").append(supportPlainTransformAlgorithm).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
