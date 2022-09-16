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
 * GETMovieMovieIdTranslations200ResponseTranslationsInnerData
 */
@JsonPropertyOrder({
  GETMovieMovieIdTranslations200ResponseTranslationsInnerData.JSON_PROPERTY_TITLE,
  GETMovieMovieIdTranslations200ResponseTranslationsInnerData.JSON_PROPERTY_OVERVIEW,
  GETMovieMovieIdTranslations200ResponseTranslationsInnerData.JSON_PROPERTY_HOMEPAGE
})
@JsonTypeName("GET_movie_movie_id_translations_200_response_translations_inner_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class GETMovieMovieIdTranslations200ResponseTranslationsInnerData {
  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_OVERVIEW = "overview";
  private String overview;

  public static final String JSON_PROPERTY_HOMEPAGE = "homepage";
  private String homepage;

  public GETMovieMovieIdTranslations200ResponseTranslationsInnerData() {
  }

  public GETMovieMovieIdTranslations200ResponseTranslationsInnerData title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public GETMovieMovieIdTranslations200ResponseTranslationsInnerData overview(String overview) {
    
    this.overview = overview;
    return this;
  }

   /**
   * Get overview
   * @return overview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OVERVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOverview() {
    return overview;
  }


  @JsonProperty(JSON_PROPERTY_OVERVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverview(String overview) {
    this.overview = overview;
  }


  public GETMovieMovieIdTranslations200ResponseTranslationsInnerData homepage(String homepage) {
    
    this.homepage = homepage;
    return this;
  }

   /**
   * Get homepage
   * @return homepage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOMEPAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHomepage() {
    return homepage;
  }


  @JsonProperty(JSON_PROPERTY_HOMEPAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHomepage(String homepage) {
    this.homepage = homepage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETMovieMovieIdTranslations200ResponseTranslationsInnerData geTMovieMovieIdTranslations200ResponseTranslationsInnerData = (GETMovieMovieIdTranslations200ResponseTranslationsInnerData) o;
    return Objects.equals(this.title, geTMovieMovieIdTranslations200ResponseTranslationsInnerData.title) &&
        Objects.equals(this.overview, geTMovieMovieIdTranslations200ResponseTranslationsInnerData.overview) &&
        Objects.equals(this.homepage, geTMovieMovieIdTranslations200ResponseTranslationsInnerData.homepage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, overview, homepage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETMovieMovieIdTranslations200ResponseTranslationsInnerData {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
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
