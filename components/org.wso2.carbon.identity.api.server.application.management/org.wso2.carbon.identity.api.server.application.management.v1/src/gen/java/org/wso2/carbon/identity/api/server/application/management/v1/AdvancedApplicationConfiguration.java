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
import org.wso2.carbon.identity.api.server.application.management.v1.Certificate;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class AdvancedApplicationConfiguration  {
  
    private Boolean saas;
    private Certificate certificate;
    private Boolean skipConsent;
    private Boolean returnAuthenticatedListOfIdentityProviders;
    private Boolean enableAuthorization;

    /**
    * Whether this application is allowed to be accessed across tenants
    **/
    public AdvancedApplicationConfiguration saas(Boolean saas) {

        this.saas = saas;
        return this;
    }
    
    @ApiModelProperty(example = "false", value = "Whether this application is allowed to be accessed across tenants")
    @JsonProperty("saas")
    @Valid
    public Boolean getSaas() {
        return saas;
    }
    public void setSaas(Boolean saas) {
        this.saas = saas;
    }

    /**
    **/
    public AdvancedApplicationConfiguration certificate(Certificate certificate) {

        this.certificate = certificate;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("certificate")
    @Valid
    public Certificate getCertificate() {
        return certificate;
    }
    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    /**
    **/
    public AdvancedApplicationConfiguration skipConsent(Boolean skipConsent) {

        this.skipConsent = skipConsent;
        return this;
    }
    
    @ApiModelProperty(example = "false", value = "")
    @JsonProperty("skipConsent")
    @Valid
    public Boolean getSkipConsent() {
        return skipConsent;
    }
    public void setSkipConsent(Boolean skipConsent) {
        this.skipConsent = skipConsent;
    }

    /**
    **/
    public AdvancedApplicationConfiguration returnAuthenticatedListOfIdentityProviders(Boolean returnAuthenticatedListOfIdentityProviders) {

        this.returnAuthenticatedListOfIdentityProviders = returnAuthenticatedListOfIdentityProviders;
        return this;
    }
    
    @ApiModelProperty(example = "false", value = "")
    @JsonProperty("returnAuthenticatedListOfIdentityProviders")
    @Valid
    public Boolean getReturnAuthenticatedListOfIdentityProviders() {
        return returnAuthenticatedListOfIdentityProviders;
    }
    public void setReturnAuthenticatedListOfIdentityProviders(Boolean returnAuthenticatedListOfIdentityProviders) {
        this.returnAuthenticatedListOfIdentityProviders = returnAuthenticatedListOfIdentityProviders;
    }

    /**
    **/
    public AdvancedApplicationConfiguration enableAuthorization(Boolean enableAuthorization) {

        this.enableAuthorization = enableAuthorization;
        return this;
    }
    
    @ApiModelProperty(example = "true", value = "")
    @JsonProperty("enableAuthorization")
    @Valid
    public Boolean getEnableAuthorization() {
        return enableAuthorization;
    }
    public void setEnableAuthorization(Boolean enableAuthorization) {
        this.enableAuthorization = enableAuthorization;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdvancedApplicationConfiguration advancedApplicationConfiguration = (AdvancedApplicationConfiguration) o;
        return Objects.equals(this.saas, advancedApplicationConfiguration.saas) &&
            Objects.equals(this.certificate, advancedApplicationConfiguration.certificate) &&
            Objects.equals(this.skipConsent, advancedApplicationConfiguration.skipConsent) &&
            Objects.equals(this.returnAuthenticatedListOfIdentityProviders, advancedApplicationConfiguration.returnAuthenticatedListOfIdentityProviders) &&
            Objects.equals(this.enableAuthorization, advancedApplicationConfiguration.enableAuthorization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saas, certificate, skipConsent, returnAuthenticatedListOfIdentityProviders, enableAuthorization);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class AdvancedApplicationConfiguration {\n");
        
        sb.append("    saas: ").append(toIndentedString(saas)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    skipConsent: ").append(toIndentedString(skipConsent)).append("\n");
        sb.append("    returnAuthenticatedListOfIdentityProviders: ").append(toIndentedString(returnAuthenticatedListOfIdentityProviders)).append("\n");
        sb.append("    enableAuthorization: ").append(toIndentedString(enableAuthorization)).append("\n");
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

