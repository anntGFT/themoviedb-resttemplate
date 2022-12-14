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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TvListResultWithRatingObject
 */
@JsonPropertyOrder({
  TvListResultWithRatingObject.JSON_PROPERTY_BACKDROP_PATH,
  TvListResultWithRatingObject.JSON_PROPERTY_FIRST_AIR_DATE,
  TvListResultWithRatingObject.JSON_PROPERTY_GENRE_IDS,
  TvListResultWithRatingObject.JSON_PROPERTY_ID,
  TvListResultWithRatingObject.JSON_PROPERTY_ORIGINAL_LANGUAGE,
  TvListResultWithRatingObject.JSON_PROPERTY_ORIGINAL_NAME,
  TvListResultWithRatingObject.JSON_PROPERTY_OVERVIEW,
  TvListResultWithRatingObject.JSON_PROPERTY_ORIGIN_COUNTRY,
  TvListResultWithRatingObject.JSON_PROPERTY_POSTER_PATH,
  TvListResultWithRatingObject.JSON_PROPERTY_POPULARITY,
  TvListResultWithRatingObject.JSON_PROPERTY_NAME,
  TvListResultWithRatingObject.JSON_PROPERTY_VOTE_AVERAGE,
  TvListResultWithRatingObject.JSON_PROPERTY_VOTE_COUNT,
  TvListResultWithRatingObject.JSON_PROPERTY_RATING
})
@JsonTypeName("tv-list-result-with-rating-object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class TvListResultWithRatingObject {
  public static final String JSON_PROPERTY_BACKDROP_PATH = "backdrop_path";
  private Object backdropPath;

  public static final String JSON_PROPERTY_FIRST_AIR_DATE = "first_air_date";
  private String firstAirDate;

  public static final String JSON_PROPERTY_GENRE_IDS = "genre_ids";
  private List<Integer> genreIds = null;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_ORIGINAL_LANGUAGE = "original_language";
  private String originalLanguage;

  public static final String JSON_PROPERTY_ORIGINAL_NAME = "original_name";
  private String originalName;

  public static final String JSON_PROPERTY_OVERVIEW = "overview";
  private String overview;

  public static final String JSON_PROPERTY_ORIGIN_COUNTRY = "origin_country";
  private List<String> originCountry = null;

  public static final String JSON_PROPERTY_POSTER_PATH = "poster_path";
  private Object posterPath;

  public static final String JSON_PROPERTY_POPULARITY = "popularity";
  private BigDecimal popularity;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VOTE_AVERAGE = "vote_average";
  private BigDecimal voteAverage;

  public static final String JSON_PROPERTY_VOTE_COUNT = "vote_count";
  private Integer voteCount;

  public static final String JSON_PROPERTY_RATING = "rating";
  private Integer rating;

  public TvListResultWithRatingObject() {
  }

  public TvListResultWithRatingObject backdropPath(Object backdropPath) {
    
    this.backdropPath = backdropPath;
    return this;
  }

   /**
   * Get backdropPath
   * @return backdropPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BACKDROP_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getBackdropPath() {
    return backdropPath;
  }


  @JsonProperty(JSON_PROPERTY_BACKDROP_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackdropPath(Object backdropPath) {
    this.backdropPath = backdropPath;
  }


  public TvListResultWithRatingObject firstAirDate(String firstAirDate) {
    
    this.firstAirDate = firstAirDate;
    return this;
  }

   /**
   * Get firstAirDate
   * @return firstAirDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_AIR_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstAirDate() {
    return firstAirDate;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_AIR_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstAirDate(String firstAirDate) {
    this.firstAirDate = firstAirDate;
  }


  public TvListResultWithRatingObject genreIds(List<Integer> genreIds) {
    
    this.genreIds = genreIds;
    return this;
  }

  public TvListResultWithRatingObject addGenreIdsItem(Integer genreIdsItem) {
    if (this.genreIds == null) {
      this.genreIds = new ArrayList<>();
    }
    this.genreIds.add(genreIdsItem);
    return this;
  }

   /**
   * Get genreIds
   * @return genreIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GENRE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getGenreIds() {
    return genreIds;
  }


  @JsonProperty(JSON_PROPERTY_GENRE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGenreIds(List<Integer> genreIds) {
    this.genreIds = genreIds;
  }


  public TvListResultWithRatingObject id(Integer id) {
    
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


  public TvListResultWithRatingObject originalLanguage(String originalLanguage) {
    
    this.originalLanguage = originalLanguage;
    return this;
  }

   /**
   * Get originalLanguage
   * @return originalLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalLanguage() {
    return originalLanguage;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalLanguage(String originalLanguage) {
    this.originalLanguage = originalLanguage;
  }


  public TvListResultWithRatingObject originalName(String originalName) {
    
    this.originalName = originalName;
    return this;
  }

   /**
   * Get originalName
   * @return originalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalName() {
    return originalName;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }


  public TvListResultWithRatingObject overview(String overview) {
    
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


  public TvListResultWithRatingObject originCountry(List<String> originCountry) {
    
    this.originCountry = originCountry;
    return this;
  }

  public TvListResultWithRatingObject addOriginCountryItem(String originCountryItem) {
    if (this.originCountry == null) {
      this.originCountry = new ArrayList<>();
    }
    this.originCountry.add(originCountryItem);
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

  public List<String> getOriginCountry() {
    return originCountry;
  }


  @JsonProperty(JSON_PROPERTY_ORIGIN_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginCountry(List<String> originCountry) {
    this.originCountry = originCountry;
  }


  public TvListResultWithRatingObject posterPath(Object posterPath) {
    
    this.posterPath = posterPath;
    return this;
  }

   /**
   * Get posterPath
   * @return posterPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSTER_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getPosterPath() {
    return posterPath;
  }


  @JsonProperty(JSON_PROPERTY_POSTER_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosterPath(Object posterPath) {
    this.posterPath = posterPath;
  }


  public TvListResultWithRatingObject popularity(BigDecimal popularity) {
    
    this.popularity = popularity;
    return this;
  }

   /**
   * Get popularity
   * @return popularity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POPULARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPopularity() {
    return popularity;
  }


  @JsonProperty(JSON_PROPERTY_POPULARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPopularity(BigDecimal popularity) {
    this.popularity = popularity;
  }


  public TvListResultWithRatingObject name(String name) {
    
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


  public TvListResultWithRatingObject voteAverage(BigDecimal voteAverage) {
    
    this.voteAverage = voteAverage;
    return this;
  }

   /**
   * Get voteAverage
   * @return voteAverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOTE_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getVoteAverage() {
    return voteAverage;
  }


  @JsonProperty(JSON_PROPERTY_VOTE_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoteAverage(BigDecimal voteAverage) {
    this.voteAverage = voteAverage;
  }


  public TvListResultWithRatingObject voteCount(Integer voteCount) {
    
    this.voteCount = voteCount;
    return this;
  }

   /**
   * Get voteCount
   * @return voteCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVoteCount() {
    return voteCount;
  }


  @JsonProperty(JSON_PROPERTY_VOTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoteCount(Integer voteCount) {
    this.voteCount = voteCount;
  }


  public TvListResultWithRatingObject rating(Integer rating) {
    
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRating() {
    return rating;
  }


  @JsonProperty(JSON_PROPERTY_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRating(Integer rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TvListResultWithRatingObject tvListResultWithRatingObject = (TvListResultWithRatingObject) o;
    return Objects.equals(this.backdropPath, tvListResultWithRatingObject.backdropPath) &&
        Objects.equals(this.firstAirDate, tvListResultWithRatingObject.firstAirDate) &&
        Objects.equals(this.genreIds, tvListResultWithRatingObject.genreIds) &&
        Objects.equals(this.id, tvListResultWithRatingObject.id) &&
        Objects.equals(this.originalLanguage, tvListResultWithRatingObject.originalLanguage) &&
        Objects.equals(this.originalName, tvListResultWithRatingObject.originalName) &&
        Objects.equals(this.overview, tvListResultWithRatingObject.overview) &&
        Objects.equals(this.originCountry, tvListResultWithRatingObject.originCountry) &&
        Objects.equals(this.posterPath, tvListResultWithRatingObject.posterPath) &&
        Objects.equals(this.popularity, tvListResultWithRatingObject.popularity) &&
        Objects.equals(this.name, tvListResultWithRatingObject.name) &&
        Objects.equals(this.voteAverage, tvListResultWithRatingObject.voteAverage) &&
        Objects.equals(this.voteCount, tvListResultWithRatingObject.voteCount) &&
        Objects.equals(this.rating, tvListResultWithRatingObject.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backdropPath, firstAirDate, genreIds, id, originalLanguage, originalName, overview, originCountry, posterPath, popularity, name, voteAverage, voteCount, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TvListResultWithRatingObject {\n");
    sb.append("    backdropPath: ").append(toIndentedString(backdropPath)).append("\n");
    sb.append("    firstAirDate: ").append(toIndentedString(firstAirDate)).append("\n");
    sb.append("    genreIds: ").append(toIndentedString(genreIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    originalLanguage: ").append(toIndentedString(originalLanguage)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    originCountry: ").append(toIndentedString(originCountry)).append("\n");
    sb.append("    posterPath: ").append(toIndentedString(posterPath)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    voteAverage: ").append(toIndentedString(voteAverage)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

