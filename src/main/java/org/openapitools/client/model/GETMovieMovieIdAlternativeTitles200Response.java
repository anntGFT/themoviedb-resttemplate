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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.GETMovieMovieIdAlternativeTitles200ResponseTitlesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETMovieMovieIdAlternativeTitles200Response
 */
@JsonPropertyOrder({
  GETMovieMovieIdAlternativeTitles200Response.JSON_PROPERTY_ID,
  GETMovieMovieIdAlternativeTitles200Response.JSON_PROPERTY_TITLES
})
@JsonTypeName("GET_movie_movie_id_alternative_titles_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class GETMovieMovieIdAlternativeTitles200Response {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_TITLES = "titles";
  private List<GETMovieMovieIdAlternativeTitles200ResponseTitlesInner> titles = null;

  public GETMovieMovieIdAlternativeTitles200Response() {
  }

  public GETMovieMovieIdAlternativeTitles200Response id(Integer id) {
    
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


  public GETMovieMovieIdAlternativeTitles200Response titles(List<GETMovieMovieIdAlternativeTitles200ResponseTitlesInner> titles) {
    
    this.titles = titles;
    return this;
  }

  public GETMovieMovieIdAlternativeTitles200Response addTitlesItem(GETMovieMovieIdAlternativeTitles200ResponseTitlesInner titlesItem) {
    if (this.titles == null) {
      this.titles = new ArrayList<>();
    }
    this.titles.add(titlesItem);
    return this;
  }

   /**
   * Get titles
   * @return titles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETMovieMovieIdAlternativeTitles200ResponseTitlesInner> getTitles() {
    return titles;
  }


  @JsonProperty(JSON_PROPERTY_TITLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitles(List<GETMovieMovieIdAlternativeTitles200ResponseTitlesInner> titles) {
    this.titles = titles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETMovieMovieIdAlternativeTitles200Response geTMovieMovieIdAlternativeTitles200Response = (GETMovieMovieIdAlternativeTitles200Response) o;
    return Objects.equals(this.id, geTMovieMovieIdAlternativeTitles200Response.id) &&
        Objects.equals(this.titles, geTMovieMovieIdAlternativeTitles200Response.titles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, titles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETMovieMovieIdAlternativeTitles200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
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

