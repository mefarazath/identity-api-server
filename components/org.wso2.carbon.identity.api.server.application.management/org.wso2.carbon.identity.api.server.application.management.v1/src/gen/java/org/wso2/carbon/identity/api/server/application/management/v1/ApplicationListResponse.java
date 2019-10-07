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
import org.wso2.carbon.identity.api.server.application.management.v1.ApplicationBasicInformation;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class ApplicationListResponse  {
  
    private Integer totalResults;
    private Integer startIndex;
    private Integer limitPerPage;
    private List<ApplicationBasicInformation> applications = null;


    /**
    **/
    public ApplicationListResponse totalResults(Integer totalResults) {

        this.totalResults = totalResults;
        return this;
    }
    
    @ApiModelProperty(example = "1", value = "")
    @JsonProperty("totalResults")
    @Valid
    public Integer getTotalResults() {
        return totalResults;
    }
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    /**
    **/
    public ApplicationListResponse startIndex(Integer startIndex) {

        this.startIndex = startIndex;
        return this;
    }
    
    @ApiModelProperty(example = "1", value = "")
    @JsonProperty("startIndex")
    @Valid
    public Integer getStartIndex() {
        return startIndex;
    }
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    /**
    **/
    public ApplicationListResponse limitPerPage(Integer limitPerPage) {

        this.limitPerPage = limitPerPage;
        return this;
    }
    
    @ApiModelProperty(example = "10", value = "")
    @JsonProperty("limitPerPage")
    @Valid
    public Integer getLimitPerPage() {
        return limitPerPage;
    }
    public void setLimitPerPage(Integer limitPerPage) {
        this.limitPerPage = limitPerPage;
    }

    /**
    **/
    public ApplicationListResponse applications(List<ApplicationBasicInformation> applications) {

        this.applications = applications;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("applications")
    @Valid
    public List<ApplicationBasicInformation> getApplications() {
        return applications;
    }
    public void setApplications(List<ApplicationBasicInformation> applications) {
        this.applications = applications;
    }

    public ApplicationListResponse addApplicationsItem(ApplicationBasicInformation applicationsItem) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        this.applications.add(applicationsItem);
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
        ApplicationListResponse applicationListResponse = (ApplicationListResponse) o;
        return Objects.equals(this.totalResults, applicationListResponse.totalResults) &&
            Objects.equals(this.startIndex, applicationListResponse.startIndex) &&
            Objects.equals(this.limitPerPage, applicationListResponse.limitPerPage) &&
            Objects.equals(this.applications, applicationListResponse.applications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalResults, startIndex, limitPerPage, applications);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationListResponse {\n");
        
        sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
        sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
        sb.append("    limitPerPage: ").append(toIndentedString(limitPerPage)).append("\n");
        sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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

