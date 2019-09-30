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
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.CustomInboundProtcolParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.KerberosKDCParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.OIDCParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.PassiveSTSParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.SAML2ParametersDTO;
import org.wso2.carbon.identity.rest.api.server.application.management.v1.dto.WSTrustParametersDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@ApiModel(description = "")
public class InboundProtocolsDTO  {
  
  
  @Valid 
  private SAML2ParametersDTO saml = null;
  
  @Valid 
  private OIDCParametersDTO oidc = null;
  
  @Valid 
  private PassiveSTSParametersDTO passiveSts = null;
  
  @Valid 
  private WSTrustParametersDTO wsTrust = null;
  
  @Valid 
  private KerberosKDCParametersDTO kerberosKDC = null;
  
  @Valid 
  private List<CustomInboundProtcolParametersDTO> custom = new ArrayList<CustomInboundProtcolParametersDTO>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("saml")
  public SAML2ParametersDTO getSaml() {
    return saml;
  }
  public void setSaml(SAML2ParametersDTO saml) {
    this.saml = saml;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("oidc")
  public OIDCParametersDTO getOidc() {
    return oidc;
  }
  public void setOidc(OIDCParametersDTO oidc) {
    this.oidc = oidc;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("passiveSts")
  public PassiveSTSParametersDTO getPassiveSts() {
    return passiveSts;
  }
  public void setPassiveSts(PassiveSTSParametersDTO passiveSts) {
    this.passiveSts = passiveSts;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("wsTrust")
  public WSTrustParametersDTO getWsTrust() {
    return wsTrust;
  }
  public void setWsTrust(WSTrustParametersDTO wsTrust) {
    this.wsTrust = wsTrust;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("kerberosKDC")
  public KerberosKDCParametersDTO getKerberosKDC() {
    return kerberosKDC;
  }
  public void setKerberosKDC(KerberosKDCParametersDTO kerberosKDC) {
    this.kerberosKDC = kerberosKDC;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("custom")
  public List<CustomInboundProtcolParametersDTO> getCustom() {
    return custom;
  }
  public void setCustom(List<CustomInboundProtcolParametersDTO> custom) {
    this.custom = custom;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundProtocolsDTO {\n");
    
    sb.append("  saml: ").append(saml).append("\n");
    sb.append("  oidc: ").append(oidc).append("\n");
    sb.append("  passiveSts: ").append(passiveSts).append("\n");
    sb.append("  wsTrust: ").append(wsTrust).append("\n");
    sb.append("  kerberosKDC: ").append(kerberosKDC).append("\n");
    sb.append("  custom: ").append(custom).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
