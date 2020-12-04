/*
* Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbon.identity.api.server.identity.governance.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Governance connector details.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;
@ApiModel(description = "Governance connector details.")
public class PreferenceSearchAttribute  {
  
    private String connectorName;
    private List<String> properties = null;


    /**
    **/
    public PreferenceSearchAttribute connectorName(String connectorName) {

        this.connectorName = connectorName;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("connector-name")
    @Valid
    @NotNull(message = "Property connectorName cannot be null.")

    public String getConnectorName() {
        return connectorName;
    }
    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName;
    }

    /**
    **/
    public PreferenceSearchAttribute properties(List<String> properties) {

        this.properties = properties;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("properties")
    @Valid
    public List<String> getProperties() {
        return properties;
    }
    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public PreferenceSearchAttribute addPropertiesItem(String propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
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
        PreferenceSearchAttribute preferenceSearchAttribute = (PreferenceSearchAttribute) o;
        return Objects.equals(this.connectorName, preferenceSearchAttribute.connectorName) &&
            Objects.equals(this.properties, preferenceSearchAttribute.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectorName, properties);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class PreferenceSearchAttribute {\n");
        
        sb.append("    connectorName: ").append(toIndentedString(connectorName)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

