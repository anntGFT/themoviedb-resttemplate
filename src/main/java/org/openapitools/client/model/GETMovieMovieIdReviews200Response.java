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
import org.openapitools.client.model.GETMovieMovieIdReviews200ResponseResultsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETMovieMovieIdReviews200Response
 */
@JsonPropertyOrder({
  GETMovieMovieIdReviews200Response.JSON_PROPERTY_ID,
  GETMovieMovieIdReviews200Response.JSON_PROPERTY_PAGE,
  GETMovieMovieIdReviews200Response.JSON_PROPERTY_RESULTS,
  GETMovieMovieIdReviews200Response.JSON_PROPERTY_TOTAL_PAGES,
  GETMovieMovieIdReviews200Response.JSON_PROPERTY_TOTAL_RESULTS
})
@JsonTypeName("GET_movie_movie_id_reviews_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class GETMovieMovieIdReviews200Response {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<GETMovieMovieIdReviews200ResponseResultsInner> results = null;

  public static final String JSON_PROPERTY_TOTAL_PAGES = "total_pages";
  private Integer totalPages;

  public static final String JSON_PROPERTY_TOTAL_RESULTS = "total_results";
  private Integer totalResults;

  public GETMovieMovieIdReviews200Response() {
  }

  public GETMovieMovieIdReviews200Response id(Integer id) {
    
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


  public GETMovieMovieIdReviews200Response page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPage() {
    return page;
  }


  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPage(Integer page) {
    this.page = page;
  }


  public GETMovieMovieIdReviews200Response results(List<GETMovieMovieIdReviews200ResponseResultsInner> results) {
    
    this.results = results;
    return this;
  }

  public GETMovieMovieIdReviews200Response addResultsItem(GETMovieMovieIdReviews200ResponseResultsInner resultsItem) {
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

  public List<GETMovieMovieIdReviews200ResponseResultsInner> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<GETMovieMovieIdReviews200ResponseResultsInner> results) {
    this.results = results;
  }


  public GETMovieMovieIdReviews200Response totalPages(Integer totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalPages() {
    return totalPages;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  public GETMovieMovieIdReviews200Response totalResults(Integer totalResults) {
    
    this.totalResults = totalResults;
    return this;
  }

   /**
   * Get totalResults
   * @return totalResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalResults() {
    return totalResults;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETMovieMovieIdReviews200Response geTMovieMovieIdReviews200Response = (GETMovieMovieIdReviews200Response) o;
    return Objects.equals(this.id, geTMovieMovieIdReviews200Response.id) &&
        Objects.equals(this.page, geTMovieMovieIdReviews200Response.page) &&
        Objects.equals(this.results, geTMovieMovieIdReviews200Response.results) &&
        Objects.equals(this.totalPages, geTMovieMovieIdReviews200Response.totalPages) &&
        Objects.equals(this.totalResults, geTMovieMovieIdReviews200Response.totalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, page, results, totalPages, totalResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETMovieMovieIdReviews200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
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

