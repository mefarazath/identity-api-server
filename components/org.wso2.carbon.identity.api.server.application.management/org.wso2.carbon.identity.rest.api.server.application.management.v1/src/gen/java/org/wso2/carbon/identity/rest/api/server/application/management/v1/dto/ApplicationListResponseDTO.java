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
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.ApplicationBasicInfoDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@ApiModel(description = "")
public class ApplicationListResponseDTO  {
  
  
  @Valid 
  private Integer totalResults = null;
  
  @Valid 
  private Integer startIndex = null;
  
  @Valid 
  private Integer limitPerPage = null;
  
  @Valid 
  private List<ApplicationBasicInfoDTO> applications = new ArrayList<ApplicationBasicInfoDTO>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("totalResults")
  public Integer getTotalResults() {
    return totalResults;
  }
  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("startIndex")
  public Integer getStartIndex() {
    return startIndex;
  }
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("limitPerPage")
  public Integer getLimitPerPage() {
    return limitPerPage;
  }
  public void setLimitPerPage(Integer limitPerPage) {
    this.limitPerPage = limitPerPage;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("applications")
  public List<ApplicationBasicInfoDTO> getApplications() {
    return applications;
  }
  public void setApplications(List<ApplicationBasicInfoDTO> applications) {
    this.applications = applications;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationListResponseDTO {\n");
    
    sb.append("  totalResults: ").append(totalResults).append("\n");
    sb.append("  startIndex: ").append(startIndex).append("\n");
    sb.append("  limitPerPage: ").append(limitPerPage).append("\n");
    sb.append("  applications: ").append(applications).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
