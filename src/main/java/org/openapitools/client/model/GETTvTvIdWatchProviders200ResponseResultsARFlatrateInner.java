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
 * GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner
 */
@JsonPropertyOrder({
  GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner.JSON_PROPERTY_DISPLAY_PRIORITY,
  GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner.JSON_PROPERTY_LOGO_PATH,
  GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner.JSON_PROPERTY_PROVIDER_ID,
  GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner.JSON_PROPERTY_PROVIDER_NAME
})
@JsonTypeName("GET_tv_tv_id_watch_providers_200_response_results_AR_flatrate_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner {
  public static final String JSON_PROPERTY_DISPLAY_PRIORITY = "display_priority";
  private Integer displayPriority;

  public static final String JSON_PROPERTY_LOGO_PATH = "logo_path";
  private String logoPath;

  public static final String JSON_PROPERTY_PROVIDER_ID = "provider_id";
  private Integer providerId;

  public static final String JSON_PROPERTY_PROVIDER_NAME = "provider_name";
  private String providerName;

  public GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner() {
  }

  public GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner displayPriority(Integer displayPriority) {
    
    this.displayPriority = displayPriority;
    return this;
  }

   /**
   * Get displayPriority
   * @return displayPriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDisplayPriority() {
    return displayPriority;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayPriority(Integer displayPriority) {
    this.displayPriority = displayPriority;
  }


  public GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner logoPath(String logoPath) {
    
    this.logoPath = logoPath;
    return this;
  }

   /**
   * Get logoPath
   * @return logoPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGO_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogoPath() {
    return logoPath;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoPath(String logoPath) {
    this.logoPath = logoPath;
  }


  public GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner providerId(Integer providerId) {
    
    this.providerId = providerId;
    return this;
  }

   /**
   * Get providerId
   * @return providerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProviderId() {
    return providerId;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderId(Integer providerId) {
    this.providerId = providerId;
  }


  public GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner providerName(String providerName) {
    
    this.providerName = providerName;
    return this;
  }

   /**
   * Get providerName
   * @return providerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProviderName() {
    return providerName;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner geTTvTvIdWatchProviders200ResponseResultsARFlatrateInner = (GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner) o;
    return Objects.equals(this.displayPriority, geTTvTvIdWatchProviders200ResponseResultsARFlatrateInner.displayPriority) &&
        Objects.equals(this.logoPath, geTTvTvIdWatchProviders200ResponseResultsARFlatrateInner.logoPath) &&
        Objects.equals(this.providerId, geTTvTvIdWatchProviders200ResponseResultsARFlatrateInner.providerId) &&
        Objects.equals(this.providerName, geTTvTvIdWatchProviders200ResponseResultsARFlatrateInner.providerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayPriority, logoPath, providerId, providerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner {\n");
    sb.append("    displayPriority: ").append(toIndentedString(displayPriority)).append("\n");
    sb.append("    logoPath: ").append(toIndentedString(logoPath)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
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

