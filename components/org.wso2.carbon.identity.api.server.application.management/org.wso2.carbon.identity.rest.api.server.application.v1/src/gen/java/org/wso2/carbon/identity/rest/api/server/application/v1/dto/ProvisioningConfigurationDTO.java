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
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.InboundProvisioningConfigurationDTO;
import org.wso2.carbon.identity.rest.api.server.application.v1.dto.OutboundProvisioningConfigurationDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@ApiModel(description = "")
public class ProvisioningConfigurationDTO  {
  
  
  @Valid 
  private InboundProvisioningConfigurationDTO inboundProvisioning = null;
  
  @Valid 
  private List<OutboundProvisioningConfigurationDTO> outboundProvisioning = new ArrayList<OutboundProvisioningConfigurationDTO>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("inboundProvisioning")
  public InboundProvisioningConfigurationDTO getInboundProvisioning() {
    return inboundProvisioning;
  }
  public void setInboundProvisioning(InboundProvisioningConfigurationDTO inboundProvisioning) {
    this.inboundProvisioning = inboundProvisioning;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("outboundProvisioning")
  public List<OutboundProvisioningConfigurationDTO> getOutboundProvisioning() {
    return outboundProvisioning;
  }
  public void setOutboundProvisioning(List<OutboundProvisioningConfigurationDTO> outboundProvisioning) {
    this.outboundProvisioning = outboundProvisioning;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisioningConfigurationDTO {\n");
    
    sb.append("  inboundProvisioning: ").append(inboundProvisioning).append("\n");
    sb.append("  outboundProvisioning: ").append(outboundProvisioning).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
