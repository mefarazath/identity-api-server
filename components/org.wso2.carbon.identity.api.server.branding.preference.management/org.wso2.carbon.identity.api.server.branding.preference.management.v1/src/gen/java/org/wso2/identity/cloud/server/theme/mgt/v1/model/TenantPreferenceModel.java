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

package org.wso2.identity.cloud.server.theme.mgt.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class TenantPreferenceModel  {
  
    private String logo;
    private String favicon;
    private String primaryColor;
    private String backgroundColor;
    private String themeFile;
    private String headerText;
    private String footerText;
    private String titleText;

    /**
    * Tenant domain of the tenant.
    **/
    public TenantPreferenceModel logo(String logo) {

        this.logo = logo;
        return this;
    }
    
    @ApiModelProperty(example = "abc.com", value = "Tenant domain of the tenant.")
    @JsonProperty("logo")
    @Valid
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
    * Tenant domain of the tenant.
    **/
    public TenantPreferenceModel favicon(String favicon) {

        this.favicon = favicon;
        return this;
    }
    
    @ApiModelProperty(example = "abc.com", value = "Tenant domain of the tenant.")
    @JsonProperty("favicon")
    @Valid
    public String getFavicon() {
        return favicon;
    }
    public void setFavicon(String favicon) {
        this.favicon = favicon;
    }

    /**
    * Tenant domain of the tenant.
    **/
    public TenantPreferenceModel primaryColor(String primaryColor) {

        this.primaryColor = primaryColor;
        return this;
    }
    
    @ApiModelProperty(example = "abc.com", value = "Tenant domain of the tenant.")
    @JsonProperty("primaryColor")
    @Valid
    public String getPrimaryColor() {
        return primaryColor;
    }
    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    /**
    * Tenant domain of the tenant.
    **/
    public TenantPreferenceModel backgroundColor(String backgroundColor) {

        this.backgroundColor = backgroundColor;
        return this;
    }
    
    @ApiModelProperty(example = "abc.com", value = "Tenant domain of the tenant.")
    @JsonProperty("backgroundColor")
    @Valid
    public String getBackgroundColor() {
        return backgroundColor;
    }
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
    * Tenant domain of the tenant.
    **/
    public TenantPreferenceModel themeFile(String themeFile) {

        this.themeFile = themeFile;
        return this;
    }
    
    @ApiModelProperty(example = "abc.com", value = "Tenant domain of the tenant.")
    @JsonProperty("themeFile")
    @Valid
    public String getThemeFile() {
        return themeFile;
    }
    public void setThemeFile(String themeFile) {
        this.themeFile = themeFile;
    }

    /**
    * Tenant domain of the tenant.
    **/
    public TenantPreferenceModel headerText(String headerText) {

        this.headerText = headerText;
        return this;
    }
    
    @ApiModelProperty(example = "abc.com", value = "Tenant domain of the tenant.")
    @JsonProperty("headerText")
    @Valid
    public String getHeaderText() {
        return headerText;
    }
    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    /**
    * Tenant domain of the tenant.
    **/
    public TenantPreferenceModel footerText(String footerText) {

        this.footerText = footerText;
        return this;
    }
    
    @ApiModelProperty(example = "abc.com", value = "Tenant domain of the tenant.")
    @JsonProperty("footerText")
    @Valid
    public String getFooterText() {
        return footerText;
    }
    public void setFooterText(String footerText) {
        this.footerText = footerText;
    }

    /**
    * Tenant domain of the tenant.
    **/
    public TenantPreferenceModel titleText(String titleText) {

        this.titleText = titleText;
        return this;
    }
    
    @ApiModelProperty(example = "abc.com", value = "Tenant domain of the tenant.")
    @JsonProperty("titleText")
    @Valid
    public String getTitleText() {
        return titleText;
    }
    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TenantPreferenceModel tenantPreferenceModel = (TenantPreferenceModel) o;
        return Objects.equals(this.logo, tenantPreferenceModel.logo) &&
            Objects.equals(this.favicon, tenantPreferenceModel.favicon) &&
            Objects.equals(this.primaryColor, tenantPreferenceModel.primaryColor) &&
            Objects.equals(this.backgroundColor, tenantPreferenceModel.backgroundColor) &&
            Objects.equals(this.themeFile, tenantPreferenceModel.themeFile) &&
            Objects.equals(this.headerText, tenantPreferenceModel.headerText) &&
            Objects.equals(this.footerText, tenantPreferenceModel.footerText) &&
            Objects.equals(this.titleText, tenantPreferenceModel.titleText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logo, favicon, primaryColor, backgroundColor, themeFile, headerText, footerText, titleText);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class TenantPreferenceModel {\n");
        
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb.append("    favicon: ").append(toIndentedString(favicon)).append("\n");
        sb.append("    primaryColor: ").append(toIndentedString(primaryColor)).append("\n");
        sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
        sb.append("    themeFile: ").append(toIndentedString(themeFile)).append("\n");
        sb.append("    headerText: ").append(toIndentedString(headerText)).append("\n");
        sb.append("    footerText: ").append(toIndentedString(footerText)).append("\n");
        sb.append("    titleText: ").append(toIndentedString(titleText)).append("\n");
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

