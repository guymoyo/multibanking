/*
 * finAPI RESTful Services
 * finAPI RESTful Services
 *
 * OpenAPI spec version: v1.20.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * User access token info
 */
@ApiModel(description = "User access token info")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T14:26:47.047Z")
public class AccessToken {
  @SerializedName("scope")
  private String scope = null;

  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("refresh_token")
  private String refreshToken = null;

  @SerializedName("token_type")
  private String tokenType = null;

  @SerializedName("expires_in")
  private Integer expiresIn = null;

  public AccessToken scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Requested scopes (it's always 'all')
   * @return scope
  **/
  @ApiModelProperty(example = "null", required = true, value = "Requested scopes (it's always 'all')")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public AccessToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Access token
   * @return accessToken
  **/
  @ApiModelProperty(example = "null", required = true, value = "Access token")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public AccessToken refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Refresh token. Only set in case of grant_type='password'.
   * @return refreshToken
  **/
  @ApiModelProperty(example = "null", value = "Refresh token. Only set in case of grant_type='password'.")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public AccessToken tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Token type (it's always 'bearer')
   * @return tokenType
  **/
  @ApiModelProperty(example = "null", required = true, value = "Token type (it's always 'bearer')")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public AccessToken expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Expiration time in seconds. A value of 0 means that the token never expires (unless it is explicitly invalidated, e.g. by revocation, or when a user gets locked).
   * @return expiresIn
  **/
  @ApiModelProperty(example = "null", required = true, value = "Expiration time in seconds. A value of 0 means that the token never expires (unless it is explicitly invalidated, e.g. by revocation, or when a user gets locked).")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessToken accessToken = (AccessToken) o;
    return Objects.equals(this.scope, accessToken.scope) &&
        Objects.equals(this.accessToken, accessToken.accessToken) &&
        Objects.equals(this.refreshToken, accessToken.refreshToken) &&
        Objects.equals(this.tokenType, accessToken.tokenType) &&
        Objects.equals(this.expiresIn, accessToken.expiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, accessToken, refreshToken, tokenType, expiresIn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessToken {\n");
    
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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

