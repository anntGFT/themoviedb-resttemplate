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
 * MovieListResultsObjectWithMediaType
 */
@JsonPropertyOrder({
  MovieListResultsObjectWithMediaType.JSON_PROPERTY_POSTER_PATH,
  MovieListResultsObjectWithMediaType.JSON_PROPERTY_ADULT,
  MovieListResultsObjectWithMediaType.JSON_PROPERTY_OVERVIEW,
  MovieListResultsObjectWithMediaType.JSON_PROPERTY_RELEASE_DATE,
  MovieListResultsObjectWithMediaType.JSON_PROPERTY_ORIGINAL_TITLE,
  MovieListResultsObjectWithMediaType.JSON_PROPERTY_GENRE_IDS,
  MovieListResultsObjectWithMediaType.JSON_PROPERTY_ID,
  MovieListResultsObjectWithMediaType.JSON_PROPERTY_MEDIA_TYPE,
  MovieListResultsObjectWithMediaType.JSON_PROPERTY_ORIGINAL_LANGUAGE,
  MovieListResultsObjectWithMediaType.JSON_PROPERTY_TITLE,
  MovieListResultsObjectWithMediaType.JSON_PROPERTY_BACKDROP_PATH,
  MovieListResultsObjectWithMediaType.JSON_PROPERTY_POPULARITY,
  MovieListResultsObjectWithMediaType.JSON_PROPERTY_VOTE_COUNT,
  MovieListResultsObjectWithMediaType.JSON_PROPERTY_VIDEO,
  MovieListResultsObjectWithMediaType.JSON_PROPERTY_VOTE_AVERAGE
})
@JsonTypeName("movie-list-results-object-with-media_type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class MovieListResultsObjectWithMediaType {
  public static final String JSON_PROPERTY_POSTER_PATH = "poster_path";
  private Object posterPath;

  public static final String JSON_PROPERTY_ADULT = "adult";
  private Boolean adult;

  public static final String JSON_PROPERTY_OVERVIEW = "overview";
  private String overview;

  public static final String JSON_PROPERTY_RELEASE_DATE = "release_date";
  private String releaseDate;

  public static final String JSON_PROPERTY_ORIGINAL_TITLE = "original_title";
  private String originalTitle;

  public static final String JSON_PROPERTY_GENRE_IDS = "genre_ids";
  private List<Integer> genreIds = null;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    MOVIE("movie");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MediaTypeEnum fromValue(String value) {
      for (MediaTypeEnum b : MediaTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MEDIA_TYPE = "media_type";
  private MediaTypeEnum mediaType;

  public static final String JSON_PROPERTY_ORIGINAL_LANGUAGE = "original_language";
  private String originalLanguage;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_BACKDROP_PATH = "backdrop_path";
  private Object backdropPath;

  public static final String JSON_PROPERTY_POPULARITY = "popularity";
  private BigDecimal popularity;

  public static final String JSON_PROPERTY_VOTE_COUNT = "vote_count";
  private Integer voteCount;

  public static final String JSON_PROPERTY_VIDEO = "video";
  private Boolean video;

  public static final String JSON_PROPERTY_VOTE_AVERAGE = "vote_average";
  private BigDecimal voteAverage;

  public MovieListResultsObjectWithMediaType() {
  }

  public MovieListResultsObjectWithMediaType posterPath(Object posterPath) {
    
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


  public MovieListResultsObjectWithMediaType adult(Boolean adult) {
    
    this.adult = adult;
    return this;
  }

   /**
   * Get adult
   * @return adult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAdult() {
    return adult;
  }


  @JsonProperty(JSON_PROPERTY_ADULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdult(Boolean adult) {
    this.adult = adult;
  }


  public MovieListResultsObjectWithMediaType overview(String overview) {
    
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


  public MovieListResultsObjectWithMediaType releaseDate(String releaseDate) {
    
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Get releaseDate
   * @return releaseDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReleaseDate() {
    return releaseDate;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }


  public MovieListResultsObjectWithMediaType originalTitle(String originalTitle) {
    
    this.originalTitle = originalTitle;
    return this;
  }

   /**
   * Get originalTitle
   * @return originalTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalTitle() {
    return originalTitle;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
  }


  public MovieListResultsObjectWithMediaType genreIds(List<Integer> genreIds) {
    
    this.genreIds = genreIds;
    return this;
  }

  public MovieListResultsObjectWithMediaType addGenreIdsItem(Integer genreIdsItem) {
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


  public MovieListResultsObjectWithMediaType id(Integer id) {
    
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


  public MovieListResultsObjectWithMediaType mediaType(MediaTypeEnum mediaType) {
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MediaTypeEnum getMediaType() {
    return mediaType;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  public MovieListResultsObjectWithMediaType originalLanguage(String originalLanguage) {
    
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


  public MovieListResultsObjectWithMediaType title(String title) {
    
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


  public MovieListResultsObjectWithMediaType backdropPath(Object backdropPath) {
    
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


  public MovieListResultsObjectWithMediaType popularity(BigDecimal popularity) {
    
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


  public MovieListResultsObjectWithMediaType voteCount(Integer voteCount) {
    
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


  public MovieListResultsObjectWithMediaType video(Boolean video) {
    
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVideo() {
    return video;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideo(Boolean video) {
    this.video = video;
  }


  public MovieListResultsObjectWithMediaType voteAverage(BigDecimal voteAverage) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieListResultsObjectWithMediaType movieListResultsObjectWithMediaType = (MovieListResultsObjectWithMediaType) o;
    return Objects.equals(this.posterPath, movieListResultsObjectWithMediaType.posterPath) &&
        Objects.equals(this.adult, movieListResultsObjectWithMediaType.adult) &&
        Objects.equals(this.overview, movieListResultsObjectWithMediaType.overview) &&
        Objects.equals(this.releaseDate, movieListResultsObjectWithMediaType.releaseDate) &&
        Objects.equals(this.originalTitle, movieListResultsObjectWithMediaType.originalTitle) &&
        Objects.equals(this.genreIds, movieListResultsObjectWithMediaType.genreIds) &&
        Objects.equals(this.id, movieListResultsObjectWithMediaType.id) &&
        Objects.equals(this.mediaType, movieListResultsObjectWithMediaType.mediaType) &&
        Objects.equals(this.originalLanguage, movieListResultsObjectWithMediaType.originalLanguage) &&
        Objects.equals(this.title, movieListResultsObjectWithMediaType.title) &&
        Objects.equals(this.backdropPath, movieListResultsObjectWithMediaType.backdropPath) &&
        Objects.equals(this.popularity, movieListResultsObjectWithMediaType.popularity) &&
        Objects.equals(this.voteCount, movieListResultsObjectWithMediaType.voteCount) &&
        Objects.equals(this.video, movieListResultsObjectWithMediaType.video) &&
        Objects.equals(this.voteAverage, movieListResultsObjectWithMediaType.voteAverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(posterPath, adult, overview, releaseDate, originalTitle, genreIds, id, mediaType, originalLanguage, title, backdropPath, popularity, voteCount, video, voteAverage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieListResultsObjectWithMediaType {\n");
    sb.append("    posterPath: ").append(toIndentedString(posterPath)).append("\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    originalTitle: ").append(toIndentedString(originalTitle)).append("\n");
    sb.append("    genreIds: ").append(toIndentedString(genreIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    originalLanguage: ").append(toIndentedString(originalLanguage)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    backdropPath: ").append(toIndentedString(backdropPath)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    voteAverage: ").append(toIndentedString(voteAverage)).append("\n");
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

