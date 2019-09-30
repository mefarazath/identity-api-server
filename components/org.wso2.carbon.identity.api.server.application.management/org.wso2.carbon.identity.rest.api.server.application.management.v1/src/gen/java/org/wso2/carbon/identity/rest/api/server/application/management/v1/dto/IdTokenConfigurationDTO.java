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
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.IdTokenEncryptionConfigurationDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@ApiModel(description = "")
public class IdTokenConfigurationDTO  {
  
  
  @Valid 
  private Integer expiryInSeconds = null;
  
  @Valid 
  private List<String> audience = new ArrayList<String>();
  
  @Valid 
  private IdTokenEncryptionConfigurationDTO encryption = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("expiryInSeconds")
  public Integer getExpiryInSeconds() {
    return expiryInSeconds;
  }
  public void setExpiryInSeconds(Integer expiryInSeconds) {
    this.expiryInSeconds = expiryInSeconds;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("audience")
  public List<String> getAudience() {
    return audience;
  }
  public void setAudience(List<String> audience) {
    this.audience = audience;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("encryption")
  public IdTokenEncryptionConfigurationDTO getEncryption() {
    return encryption;
  }
  public void setEncryption(IdTokenEncryptionConfigurationDTO encryption) {
    this.encryption = encryption;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdTokenConfigurationDTO {\n");
    
    sb.append("  expiryInSeconds: ").append(expiryInSeconds).append("\n");
    sb.append("  audience: ").append(audience).append("\n");
    sb.append("  encryption: ").append(encryption).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
