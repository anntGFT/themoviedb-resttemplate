/*
 * API
 * ## Welcome  This is a place to put general notes and extra information, for internal use.  To get started designing/documenting this API, select a version on the left. # Title No Description
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * POSTAuthenticationTokenValidateWithLogin200Response
 */
@JsonPropertyOrder({
  POSTAuthenticationTokenValidateWithLogin200Response.JSON_PROPERTY_SUCCESS,
  POSTAuthenticationTokenValidateWithLogin200Response.JSON_PROPERTY_EXPIRES_AT,
  POSTAuthenticationTokenValidateWithLogin200Response.JSON_PROPERTY_REQUEST_TOKEN
})
@JsonTypeName("POST_authentication_token_validate_with_login_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class POSTAuthenticationTokenValidateWithLogin200Response {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private String expiresAt;

  public static final String JSON_PROPERTY_REQUEST_TOKEN = "request_token";
  private String requestToken;

  public POSTAuthenticationTokenValidateWithLogin200Response() {
  }

  public POSTAuthenticationTokenValidateWithLogin200Response success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public POSTAuthenticationTokenValidateWithLogin200Response expiresAt(String expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiresAt() {
    return expiresAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }


  public POSTAuthenticationTokenValidateWithLogin200Response requestToken(String requestToken) {
    
    this.requestToken = requestToken;
    return this;
  }

   /**
   * Get requestToken
   * @return requestToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUEST_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestToken() {
    return requestToken;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestToken(String requestToken) {
    this.requestToken = requestToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    POSTAuthenticationTokenValidateWithLogin200Response poSTAuthenticationTokenValidateWithLogin200Response = (POSTAuthenticationTokenValidateWithLogin200Response) o;
    return Objects.equals(this.success, poSTAuthenticationTokenValidateWithLogin200Response.success) &&
        Objects.equals(this.expiresAt, poSTAuthenticationTokenValidateWithLogin200Response.expiresAt) &&
        Objects.equals(this.requestToken, poSTAuthenticationTokenValidateWithLogin200Response.requestToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, expiresAt, requestToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class POSTAuthenticationTokenValidateWithLogin200Response {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    requestToken: ").append(toIndentedString(requestToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

