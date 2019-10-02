package org.wso2.carbon.identity.api.server.application.management.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.api.server.application.management.v1.AccessTokenConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.IdTokenConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.OAuth2PKCEConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.OIDCLogoutConfiguration;
import org.wso2.carbon.identity.api.server.application.management.v1.RefreshTokenConfiguration;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;


public class OIDCParameters   {
  
  private String clientId;

  private String clientSecret;


@XmlType(name="StateEnum")
@XmlEnum(String.class)
public enum StateEnum {

    @XmlEnumValue("ACTIVE") ACTIVE(String.valueOf("ACTIVE")), @XmlEnumValue("REVOKED") REVOKED(String.valueOf("REVOKED"));


    private String value;

    StateEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
        for (StateEnum b : StateEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private StateEnum state = StateEnum.ACTIVE;

  private String version = "2.0";

  private List<String> grantTypes = new ArrayList<>();

  private List<String> callbackURLs = null;

  private List<String> allowedOrigins = null;

  private Boolean publicClient = false;

  private OAuth2PKCEConfiguration pkce;

  private AccessTokenConfiguration accessToken;

  private RefreshTokenConfiguration refreshToken;

  private IdTokenConfiguration idToken;

  private OIDCLogoutConfiguration logout;

  private Boolean validateRequestObjectSignature = false;

  private List<String> scopeValidators = null;


  /**
   **/
  public OIDCParameters clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("clientId")
@Valid
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  /**
   **/
  public OIDCParameters clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("clientSecret")
@Valid
  public String getClientSecret() {
    return clientSecret;
  }
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  /**
   **/
  public OIDCParameters state(StateEnum state) {
    this.state = state;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("state")
@Valid
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * Possible values are &#39;2.0&#39; and &#39;1.0a&#39;
   **/
  public OIDCParameters version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Possible values are '2.0' and '1.0a'")
  @JsonProperty("version")
@Valid
  @NotNull(message = "Property version cannot be null.")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   **/
  public OIDCParameters grantTypes(List<String> grantTypes) {
    this.grantTypes = grantTypes;
    return this;
  }

  
  @ApiModelProperty(example = "[\"authorization_code\",\"password\"]", required = true, value = "")
  @JsonProperty("grantTypes")
@Valid
  @NotNull(message = "Property grantTypes cannot be null.")
  public List<String> getGrantTypes() {
    return grantTypes;
  }
  public void setGrantTypes(List<String> grantTypes) {
    this.grantTypes = grantTypes;
  }

  public OIDCParameters addGrantTypesItem(String grantTypesItem) {
    this.grantTypes.add(grantTypesItem);
    return this;
  }


  /**
   * Authorized redirect URIs
   **/
  public OIDCParameters callbackURLs(List<String> callbackURLs) {
    this.callbackURLs = callbackURLs;
    return this;
  }

  
  @ApiModelProperty(example = "[\"https://app.example.com/callback1\",\"https://app.example.com/callback2\"]", value = "Authorized redirect URIs")
  @JsonProperty("callbackURLs")
@Valid
  public List<String> getCallbackURLs() {
    return callbackURLs;
  }
  public void setCallbackURLs(List<String> callbackURLs) {
    this.callbackURLs = callbackURLs;
  }

  public OIDCParameters addCallbackURLsItem(String callbackURLsItem) {
    if (this.callbackURLs == null) {
      this.callbackURLs = new ArrayList<>();
    }
    this.callbackURLs.add(callbackURLsItem);
    return this;
  }


  /**
   * Authorized JavaScript origins
   **/
  public OIDCParameters allowedOrigins(List<String> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
    return this;
  }

  
  @ApiModelProperty(example = "[\"https://app.example.com/js\"]", value = "Authorized JavaScript origins")
  @JsonProperty("allowedOrigins")
@Valid
  public List<String> getAllowedOrigins() {
    return allowedOrigins;
  }
  public void setAllowedOrigins(List<String> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
  }

  public OIDCParameters addAllowedOriginsItem(String allowedOriginsItem) {
    if (this.allowedOrigins == null) {
      this.allowedOrigins = new ArrayList<>();
    }
    this.allowedOrigins.add(allowedOriginsItem);
    return this;
  }


  /**
   * Enabling this option will allow the client to authenticate without a client secret
   **/
  public OIDCParameters publicClient(Boolean publicClient) {
    this.publicClient = publicClient;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Enabling this option will allow the client to authenticate without a client secret")
  @JsonProperty("publicClient")
@Valid
  public Boolean getPublicClient() {
    return publicClient;
  }
  public void setPublicClient(Boolean publicClient) {
    this.publicClient = publicClient;
  }


  /**
   **/
  public OIDCParameters pkce(OAuth2PKCEConfiguration pkce) {
    this.pkce = pkce;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pkce")
@Valid
  public OAuth2PKCEConfiguration getPkce() {
    return pkce;
  }
  public void setPkce(OAuth2PKCEConfiguration pkce) {
    this.pkce = pkce;
  }


  /**
   **/
  public OIDCParameters accessToken(AccessTokenConfiguration accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("accessToken")
@Valid
  public AccessTokenConfiguration getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(AccessTokenConfiguration accessToken) {
    this.accessToken = accessToken;
  }


  /**
   **/
  public OIDCParameters refreshToken(RefreshTokenConfiguration refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("refreshToken")
@Valid
  public RefreshTokenConfiguration getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(RefreshTokenConfiguration refreshToken) {
    this.refreshToken = refreshToken;
  }


  /**
   **/
  public OIDCParameters idToken(IdTokenConfiguration idToken) {
    this.idToken = idToken;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("idToken")
@Valid
  public IdTokenConfiguration getIdToken() {
    return idToken;
  }
  public void setIdToken(IdTokenConfiguration idToken) {
    this.idToken = idToken;
  }


  /**
   **/
  public OIDCParameters logout(OIDCLogoutConfiguration logout) {
    this.logout = logout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("logout")
@Valid
  public OIDCLogoutConfiguration getLogout() {
    return logout;
  }
  public void setLogout(OIDCLogoutConfiguration logout) {
    this.logout = logout;
  }


  /**
   **/
  public OIDCParameters validateRequestObjectSignature(Boolean validateRequestObjectSignature) {
    this.validateRequestObjectSignature = validateRequestObjectSignature;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty("validateRequestObjectSignature")
@Valid
  public Boolean getValidateRequestObjectSignature() {
    return validateRequestObjectSignature;
  }
  public void setValidateRequestObjectSignature(Boolean validateRequestObjectSignature) {
    this.validateRequestObjectSignature = validateRequestObjectSignature;
  }


  /**
   **/
  public OIDCParameters scopeValidators(List<String> scopeValidators) {
    this.scopeValidators = scopeValidators;
    return this;
  }

  
  @ApiModelProperty(example = "[\"XACMLScopeValidator\",\"RoleBasedScopeValidator\"]", value = "")
  @JsonProperty("scopeValidators")
@Valid
  public List<String> getScopeValidators() {
    return scopeValidators;
  }
  public void setScopeValidators(List<String> scopeValidators) {
    this.scopeValidators = scopeValidators;
  }

  public OIDCParameters addScopeValidatorsItem(String scopeValidatorsItem) {
    if (this.scopeValidators == null) {
      this.scopeValidators = new ArrayList<>();
    }
    this.scopeValidators.add(scopeValidatorsItem);
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
    OIDCParameters oiDCParameters = (OIDCParameters) o;
    return Objects.equals(this.clientId, oiDCParameters.clientId) &&
        Objects.equals(this.clientSecret, oiDCParameters.clientSecret) &&
        Objects.equals(this.state, oiDCParameters.state) &&
        Objects.equals(this.version, oiDCParameters.version) &&
        Objects.equals(this.grantTypes, oiDCParameters.grantTypes) &&
        Objects.equals(this.callbackURLs, oiDCParameters.callbackURLs) &&
        Objects.equals(this.allowedOrigins, oiDCParameters.allowedOrigins) &&
        Objects.equals(this.publicClient, oiDCParameters.publicClient) &&
        Objects.equals(this.pkce, oiDCParameters.pkce) &&
        Objects.equals(this.accessToken, oiDCParameters.accessToken) &&
        Objects.equals(this.refreshToken, oiDCParameters.refreshToken) &&
        Objects.equals(this.idToken, oiDCParameters.idToken) &&
        Objects.equals(this.logout, oiDCParameters.logout) &&
        Objects.equals(this.validateRequestObjectSignature, oiDCParameters.validateRequestObjectSignature) &&
        Objects.equals(this.scopeValidators, oiDCParameters.scopeValidators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, state, version, grantTypes, callbackURLs, allowedOrigins, publicClient, pkce, accessToken, refreshToken, idToken, logout, validateRequestObjectSignature, scopeValidators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCParameters {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    grantTypes: ").append(toIndentedString(grantTypes)).append("\n");
    sb.append("    callbackURLs: ").append(toIndentedString(callbackURLs)).append("\n");
    sb.append("    allowedOrigins: ").append(toIndentedString(allowedOrigins)).append("\n");
    sb.append("    publicClient: ").append(toIndentedString(publicClient)).append("\n");
    sb.append("    pkce: ").append(toIndentedString(pkce)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
    sb.append("    logout: ").append(toIndentedString(logout)).append("\n");
    sb.append("    validateRequestObjectSignature: ").append(toIndentedString(validateRequestObjectSignature)).append("\n");
    sb.append("    scopeValidators: ").append(toIndentedString(scopeValidators)).append("\n");
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
    return o.toString().replace("\n", "\n    ");
  }
}

