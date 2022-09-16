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
 * GETTvTvId200ResponseNetworksInner
 */
@JsonPropertyOrder({
  GETTvTvId200ResponseNetworksInner.JSON_PROPERTY_NAME,
  GETTvTvId200ResponseNetworksInner.JSON_PROPERTY_ID,
  GETTvTvId200ResponseNetworksInner.JSON_PROPERTY_LOGO_PATH,
  GETTvTvId200ResponseNetworksInner.JSON_PROPERTY_ORIGIN_COUNTRY
})
@JsonTypeName("GET_tv_tv_id_200_response_networks_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class GETTvTvId200ResponseNetworksInner {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_LOGO_PATH = "logo_path";
  private Object logoPath;

  public static final String JSON_PROPERTY_ORIGIN_COUNTRY = "origin_country";
  private String originCountry;

  public GETTvTvId200ResponseNetworksInner() {
  }

  public GETTvTvId200ResponseNetworksInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public GETTvTvId200ResponseNetworksInner id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public GETTvTvId200ResponseNetworksInner logoPath(Object logoPath) {
    
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

  public Object getLogoPath() {
    return logoPath;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoPath(Object logoPath) {
    this.logoPath = logoPath;
  }


  public GETTvTvId200ResponseNetworksInner originCountry(String originCountry) {
    
    this.originCountry = originCountry;
    return this;
  }

   /**
   * Get originCountry
   * @return originCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORIGIN_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginCountry() {
    return originCountry;
  }


  @JsonProperty(JSON_PROPERTY_ORIGIN_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginCountry(String originCountry) {
    this.originCountry = originCountry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETTvTvId200ResponseNetworksInner geTTvTvId200ResponseNetworksInner = (GETTvTvId200ResponseNetworksInner) o;
    return Objects.equals(this.name, geTTvTvId200ResponseNetworksInner.name) &&
        Objects.equals(this.id, geTTvTvId200ResponseNetworksInner.id) &&
        Objects.equals(this.logoPath, geTTvTvId200ResponseNetworksInner.logoPath) &&
        Objects.equals(this.originCountry, geTTvTvId200ResponseNetworksInner.originCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, logoPath, originCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvTvId200ResponseNetworksInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoPath: ").append(toIndentedString(logoPath)).append("\n");
    sb.append("    originCountry: ").append(toIndentedString(originCountry)).append("\n");
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

