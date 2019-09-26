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
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.AuthenticatorDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@ApiModel(description = "")
public class AuthenticationStepDTO  {
  
  
  @Valid 
  private String id = null;
  
  @Valid 
  private List<AuthenticatorDTO> options = new ArrayList<AuthenticatorDTO>();

  
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
  @ApiModelProperty(value = "")
  @JsonProperty("options")
  public List<AuthenticatorDTO> getOptions() {
    return options;
  }
  public void setOptions(List<AuthenticatorDTO> options) {
    this.options = options;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationStepDTO {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  options: ").append(options).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
