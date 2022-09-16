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
import org.openapitools.client.model.GETMovieMovieIdReleaseDates200ResponseResultsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETMovieMovieIdReleaseDates200Response
 */
@JsonPropertyOrder({
  GETMovieMovieIdReleaseDates200Response.JSON_PROPERTY_ID,
  GETMovieMovieIdReleaseDates200Response.JSON_PROPERTY_RESULTS
})
@JsonTypeName("GET_movie_movie_id_release_dates_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class GETMovieMovieIdReleaseDates200Response {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<GETMovieMovieIdReleaseDates200ResponseResultsInner> results = null;

  public GETMovieMovieIdReleaseDates200Response() {
  }

  public GETMovieMovieIdReleaseDates200Response id(Integer id) {
    
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


  public GETMovieMovieIdReleaseDates200Response results(List<GETMovieMovieIdReleaseDates200ResponseResultsInner> results) {
    
    this.results = results;
    return this;
  }

  public GETMovieMovieIdReleaseDates200Response addResultsItem(GETMovieMovieIdReleaseDates200ResponseResultsInner resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETMovieMovieIdReleaseDates200ResponseResultsInner> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<GETMovieMovieIdReleaseDates200ResponseResultsInner> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETMovieMovieIdReleaseDates200Response geTMovieMovieIdReleaseDates200Response = (GETMovieMovieIdReleaseDates200Response) o;
    return Objects.equals(this.id, geTMovieMovieIdReleaseDates200Response.id) &&
        Objects.equals(this.results, geTMovieMovieIdReleaseDates200Response.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETMovieMovieIdReleaseDates200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

