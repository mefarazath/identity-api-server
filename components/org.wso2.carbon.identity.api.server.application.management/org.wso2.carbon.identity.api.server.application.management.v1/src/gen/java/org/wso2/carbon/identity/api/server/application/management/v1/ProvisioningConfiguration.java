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

package org.wso2.carbon.identity.api.server.application.management.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.api.server.application.management.v1.InboundProvisioningConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.OutboundProvisioningConfiguration;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class ProvisioningConfiguration  {
  
    private InboundProvisioningConfiguration inboundProvisioning;
    private List<OutboundProvisioningConfiguration> outboundProvisioning = null;


    /**
    **/
    public ProvisioningConfiguration inboundProvisioning(InboundProvisioningConfiguration inboundProvisioning) {

        this.inboundProvisioning = inboundProvisioning;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("inboundProvisioning")
    @Valid
    public InboundProvisioningConfiguration getInboundProvisioning() {
        return inboundProvisioning;
    }
    public void setInboundProvisioning(InboundProvisioningConfiguration inboundProvisioning) {
        this.inboundProvisioning = inboundProvisioning;
    }

    /**
    **/
    public ProvisioningConfiguration outboundProvisioning(List<OutboundProvisioningConfiguration> outboundProvisioning) {

        this.outboundProvisioning = outboundProvisioning;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("outboundProvisioning")
    @Valid
    public List<OutboundProvisioningConfiguration> getOutboundProvisioning() {
        return outboundProvisioning;
    }
    public void setOutboundProvisioning(List<OutboundProvisioningConfiguration> outboundProvisioning) {
        this.outboundProvisioning = outboundProvisioning;
    }

    public ProvisioningConfiguration addOutboundProvisioningItem(OutboundProvisioningConfiguration outboundProvisioningItem) {
        if (this.outboundProvisioning == null) {
            this.outboundProvisioning = new ArrayList<>();
        }
        this.outboundProvisioning.add(outboundProvisioningItem);
        return this;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProvisioningConfiguration provisioningConfiguration = (ProvisioningConfiguration) o;
        return Objects.equals(this.inboundProvisioning, provisioningConfiguration.inboundProvisioning) &&
            Objects.equals(this.outboundProvisioning, provisioningConfiguration.outboundProvisioning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inboundProvisioning, outboundProvisioning);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class ProvisioningConfiguration {\n");
        
        sb.append("    inboundProvisioning: ").append(toIndentedString(inboundProvisioning)).append("\n");
        sb.append("    outboundProvisioning: ").append(toIndentedString(outboundProvisioning)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

