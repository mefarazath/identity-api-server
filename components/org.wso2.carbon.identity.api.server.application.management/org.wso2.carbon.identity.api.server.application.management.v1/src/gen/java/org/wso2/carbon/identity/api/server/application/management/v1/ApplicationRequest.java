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
import org.wso2.carbon.identity.api.server.application.management.v1.AdvancedApplicationConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.AuthenticationSequence;
import org.wso2.carbon.identity.api.server.application.management.v1.ClaimConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.InboundProtocols;
import org.wso2.carbon.identity.api.server.application.management.v1.Property;
import org.wso2.carbon.identity.api.server.application.management.v1.ProvisioningConfiguration;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class ApplicationRequest  {
  
    private String name;
    private String description;
    private String homePage;
    private String image;
    private List<Property> properties = null;

    private ClaimConfiguration claimConfiguration;
    private InboundProtocols inboundProtocolConfiguration;
    private AuthenticationSequence authenticationSequence;
    private AdvancedApplicationConfiguration advancedConfigurations;
    private ProvisioningConfiguration provisioningConfigurations;

    /**
    **/
    public ApplicationRequest name(String name) {

        this.name = name;
        return this;
    }
    
    @ApiModelProperty(example = "pickup", required = true, value = "")
    @JsonProperty("name")
    @Valid
    @NotNull(message = "Property name cannot be null.")

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
    **/
    public ApplicationRequest description(String description) {

        this.description = description;
        return this;
    }
    
    @ApiModelProperty(example = "This is the configuration for Pickup application.", value = "")
    @JsonProperty("description")
    @Valid
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    **/
    public ApplicationRequest homePage(String homePage) {

        this.homePage = homePage;
        return this;
    }
    
    @ApiModelProperty(example = "https://example.com", value = "")
    @JsonProperty("homePage")
    @Valid
    public String getHomePage() {
        return homePage;
    }
    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    /**
    **/
    public ApplicationRequest image(String image) {

        this.image = image;
        return this;
    }
    
    @ApiModelProperty(example = "https://example.com/logo/my-logo.png", value = "")
    @JsonProperty("image")
    @Valid
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    /**
    **/
    public ApplicationRequest properties(List<Property> properties) {

        this.properties = properties;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("properties")
    @Valid
    public List<Property> getProperties() {
        return properties;
    }
    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public ApplicationRequest addPropertiesItem(Property propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

        /**
    **/
    public ApplicationRequest claimConfiguration(ClaimConfiguration claimConfiguration) {

        this.claimConfiguration = claimConfiguration;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("claimConfiguration")
    @Valid
    public ClaimConfiguration getClaimConfiguration() {
        return claimConfiguration;
    }
    public void setClaimConfiguration(ClaimConfiguration claimConfiguration) {
        this.claimConfiguration = claimConfiguration;
    }

    /**
    **/
    public ApplicationRequest inboundProtocolConfiguration(InboundProtocols inboundProtocolConfiguration) {

        this.inboundProtocolConfiguration = inboundProtocolConfiguration;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("inboundProtocolConfiguration")
    @Valid
    public InboundProtocols getInboundProtocolConfiguration() {
        return inboundProtocolConfiguration;
    }
    public void setInboundProtocolConfiguration(InboundProtocols inboundProtocolConfiguration) {
        this.inboundProtocolConfiguration = inboundProtocolConfiguration;
    }

    /**
    **/
    public ApplicationRequest authenticationSequence(AuthenticationSequence authenticationSequence) {

        this.authenticationSequence = authenticationSequence;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("authenticationSequence")
    @Valid
    public AuthenticationSequence getAuthenticationSequence() {
        return authenticationSequence;
    }
    public void setAuthenticationSequence(AuthenticationSequence authenticationSequence) {
        this.authenticationSequence = authenticationSequence;
    }

    /**
    **/
    public ApplicationRequest advancedConfigurations(AdvancedApplicationConfiguration advancedConfigurations) {

        this.advancedConfigurations = advancedConfigurations;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("advancedConfigurations")
    @Valid
    public AdvancedApplicationConfiguration getAdvancedConfigurations() {
        return advancedConfigurations;
    }
    public void setAdvancedConfigurations(AdvancedApplicationConfiguration advancedConfigurations) {
        this.advancedConfigurations = advancedConfigurations;
    }

    /**
    **/
    public ApplicationRequest provisioningConfigurations(ProvisioningConfiguration provisioningConfigurations) {

        this.provisioningConfigurations = provisioningConfigurations;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("provisioningConfigurations")
    @Valid
    public ProvisioningConfiguration getProvisioningConfigurations() {
        return provisioningConfigurations;
    }
    public void setProvisioningConfigurations(ProvisioningConfiguration provisioningConfigurations) {
        this.provisioningConfigurations = provisioningConfigurations;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationRequest applicationRequest = (ApplicationRequest) o;
        return Objects.equals(this.name, applicationRequest.name) &&
            Objects.equals(this.description, applicationRequest.description) &&
            Objects.equals(this.homePage, applicationRequest.homePage) &&
            Objects.equals(this.image, applicationRequest.image) &&
            Objects.equals(this.properties, applicationRequest.properties) &&
            Objects.equals(this.claimConfiguration, applicationRequest.claimConfiguration) &&
            Objects.equals(this.inboundProtocolConfiguration, applicationRequest.inboundProtocolConfiguration) &&
            Objects.equals(this.authenticationSequence, applicationRequest.authenticationSequence) &&
            Objects.equals(this.advancedConfigurations, applicationRequest.advancedConfigurations) &&
            Objects.equals(this.provisioningConfigurations, applicationRequest.provisioningConfigurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, homePage, image, properties, claimConfiguration, inboundProtocolConfiguration, authenticationSequence, advancedConfigurations, provisioningConfigurations);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationRequest {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    homePage: ").append(toIndentedString(homePage)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    claimConfiguration: ").append(toIndentedString(claimConfiguration)).append("\n");
        sb.append("    inboundProtocolConfiguration: ").append(toIndentedString(inboundProtocolConfiguration)).append("\n");
        sb.append("    authenticationSequence: ").append(toIndentedString(authenticationSequence)).append("\n");
        sb.append("    advancedConfigurations: ").append(toIndentedString(advancedConfigurations)).append("\n");
        sb.append("    provisioningConfigurations: ").append(toIndentedString(provisioningConfigurations)).append("\n");
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

