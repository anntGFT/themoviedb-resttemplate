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
 * GETMovieMovieIdAccountStates200Response
 */
@JsonPropertyOrder({
  GETMovieMovieIdAccountStates200Response.JSON_PROPERTY_ID,
  GETMovieMovieIdAccountStates200Response.JSON_PROPERTY_FAVORITE,
  GETMovieMovieIdAccountStates200Response.JSON_PROPERTY_WATCHLIST
})
@JsonTypeName("GET_movie_movie_id_account_states_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class GETMovieMovieIdAccountStates200Response {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_FAVORITE = "favorite";
  private Boolean favorite;

  public static final String JSON_PROPERTY_WATCHLIST = "watchlist";
  private Boolean watchlist;

  public GETMovieMovieIdAccountStates200Response() {
  }

  public GETMovieMovieIdAccountStates200Response id(Integer id) {
    
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


  public GETMovieMovieIdAccountStates200Response favorite(Boolean favorite) {
    
    this.favorite = favorite;
    return this;
  }

   /**
   * Get favorite
   * @return favorite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAVORITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFavorite() {
    return favorite;
  }


  @JsonProperty(JSON_PROPERTY_FAVORITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }


  public GETMovieMovieIdAccountStates200Response watchlist(Boolean watchlist) {
    
    this.watchlist = watchlist;
    return this;
  }

   /**
   * Get watchlist
   * @return watchlist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WATCHLIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWatchlist() {
    return watchlist;
  }


  @JsonProperty(JSON_PROPERTY_WATCHLIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWatchlist(Boolean watchlist) {
    this.watchlist = watchlist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETMovieMovieIdAccountStates200Response geTMovieMovieIdAccountStates200Response = (GETMovieMovieIdAccountStates200Response) o;
    return Objects.equals(this.id, geTMovieMovieIdAccountStates200Response.id) &&
        Objects.equals(this.favorite, geTMovieMovieIdAccountStates200Response.favorite) &&
        Objects.equals(this.watchlist, geTMovieMovieIdAccountStates200Response.watchlist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, favorite, watchlist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETMovieMovieIdAccountStates200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    watchlist: ").append(toIndentedString(watchlist)).append("\n");
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

