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
 * GETPersonPersonIdCombinedCredits200ResponseCastInner
 */
@JsonPropertyOrder({
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_ID,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_ORIGINAL_LANGUAGE,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_EPISODE_COUNT,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_OVERVIEW,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_ORIGIN_COUNTRY,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_ORIGINAL_NAME,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_GENRE_IDS,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_NAME,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_MEDIA_TYPE,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_POSTER_PATH,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_FIRST_AIR_DATE,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_VOTE_COUNT,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_CHARACTER,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_BACKDROP_PATH,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_POPULARITY,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_CREDIT_ID,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_ORIGINAL_TITLE,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_VIDEO,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_RELEASE_DATE,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_TITLE,
  GETPersonPersonIdCombinedCredits200ResponseCastInner.JSON_PROPERTY_ADULT
})
@JsonTypeName("GET_person_person_id_combined_credits_200_response_cast_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class GETPersonPersonIdCombinedCredits200ResponseCastInner {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_ORIGINAL_LANGUAGE = "original_language";
  private String originalLanguage;

  public static final String JSON_PROPERTY_EPISODE_COUNT = "episode_count";
  private Integer episodeCount;

  public static final String JSON_PROPERTY_OVERVIEW = "overview";
  private String overview;

  public static final String JSON_PROPERTY_ORIGIN_COUNTRY = "origin_country";
  private List<String> originCountry = null;

  public static final String JSON_PROPERTY_ORIGINAL_NAME = "original_name";
  private String originalName;

  public static final String JSON_PROPERTY_GENRE_IDS = "genre_ids";
  private List<Integer> genreIds = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MEDIA_TYPE = "media_type";
  private String mediaType;

  public static final String JSON_PROPERTY_POSTER_PATH = "poster_path";
  private Object posterPath;

  public static final String JSON_PROPERTY_FIRST_AIR_DATE = "first_air_date";
  private String firstAirDate;

  public static final String JSON_PROPERTY_VOTE_COUNT = "vote_count";
  private Integer voteCount;

  public static final String JSON_PROPERTY_CHARACTER = "character";
  private String character;

  public static final String JSON_PROPERTY_BACKDROP_PATH = "backdrop_path";
  private Object backdropPath;

  public static final String JSON_PROPERTY_POPULARITY = "popularity";
  private BigDecimal popularity;

  public static final String JSON_PROPERTY_CREDIT_ID = "credit_id";
  private String creditId;

  public static final String JSON_PROPERTY_ORIGINAL_TITLE = "original_title";
  private String originalTitle;

  public static final String JSON_PROPERTY_VIDEO = "video";
  private Boolean video;

  public static final String JSON_PROPERTY_RELEASE_DATE = "release_date";
  private String releaseDate;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_ADULT = "adult";
  private Boolean adult;

  public GETPersonPersonIdCombinedCredits200ResponseCastInner() {
  }

  public GETPersonPersonIdCombinedCredits200ResponseCastInner id(Integer id) {
    
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


  public GETPersonPersonIdCombinedCredits200ResponseCastInner originalLanguage(String originalLanguage) {
    
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


  public GETPersonPersonIdCombinedCredits200ResponseCastInner episodeCount(Integer episodeCount) {
    
    this.episodeCount = episodeCount;
    return this;
  }

   /**
   * Get episodeCount
   * @return episodeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EPISODE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEpisodeCount() {
    return episodeCount;
  }


  @JsonProperty(JSON_PROPERTY_EPISODE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEpisodeCount(Integer episodeCount) {
    this.episodeCount = episodeCount;
  }


  public GETPersonPersonIdCombinedCredits200ResponseCastInner overview(String overview) {
    
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


  public GETPersonPersonIdCombinedCredits200ResponseCastInner originCountry(List<String> originCountry) {
    
    this.originCountry = originCountry;
    return this;
  }

  public GETPersonPersonIdCombinedCredits200ResponseCastInner addOriginCountryItem(String originCountryItem) {
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


  public GETPersonPersonIdCombinedCredits200ResponseCastInner originalName(String originalName) {
    
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


  public GETPersonPersonIdCombinedCredits200ResponseCastInner genreIds(List<Integer> genreIds) {
    
    this.genreIds = genreIds;
    return this;
  }

  public GETPersonPersonIdCombinedCredits200ResponseCastInner addGenreIdsItem(Integer genreIdsItem) {
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


  public GETPersonPersonIdCombinedCredits200ResponseCastInner name(String name) {
    
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


  public GETPersonPersonIdCombinedCredits200ResponseCastInner mediaType(String mediaType) {
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaType() {
    return mediaType;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  public GETPersonPersonIdCombinedCredits200ResponseCastInner posterPath(Object posterPath) {
    
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


  public GETPersonPersonIdCombinedCredits200ResponseCastInner firstAirDate(String firstAirDate) {
    
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


  public GETPersonPersonIdCombinedCredits200ResponseCastInner voteCount(Integer voteCount) {
    
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


  public GETPersonPersonIdCombinedCredits200ResponseCastInner character(String character) {
    
    this.character = character;
    return this;
  }

   /**
   * Get character
   * @return character
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHARACTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCharacter() {
    return character;
  }


  @JsonProperty(JSON_PROPERTY_CHARACTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharacter(String character) {
    this.character = character;
  }


  public GETPersonPersonIdCombinedCredits200ResponseCastInner backdropPath(Object backdropPath) {
    
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


  public GETPersonPersonIdCombinedCredits200ResponseCastInner popularity(BigDecimal popularity) {
    
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


  public GETPersonPersonIdCombinedCredits200ResponseCastInner creditId(String creditId) {
    
    this.creditId = creditId;
    return this;
  }

   /**
   * Get creditId
   * @return creditId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREDIT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreditId() {
    return creditId;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreditId(String creditId) {
    this.creditId = creditId;
  }


  public GETPersonPersonIdCombinedCredits200ResponseCastInner originalTitle(String originalTitle) {
    
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


  public GETPersonPersonIdCombinedCredits200ResponseCastInner video(Boolean video) {
    
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


  public GETPersonPersonIdCombinedCredits200ResponseCastInner releaseDate(String releaseDate) {
    
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


  public GETPersonPersonIdCombinedCredits200ResponseCastInner title(String title) {
    
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


  public GETPersonPersonIdCombinedCredits200ResponseCastInner adult(Boolean adult) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETPersonPersonIdCombinedCredits200ResponseCastInner geTPersonPersonIdCombinedCredits200ResponseCastInner = (GETPersonPersonIdCombinedCredits200ResponseCastInner) o;
    return Objects.equals(this.id, geTPersonPersonIdCombinedCredits200ResponseCastInner.id) &&
        Objects.equals(this.originalLanguage, geTPersonPersonIdCombinedCredits200ResponseCastInner.originalLanguage) &&
        Objects.equals(this.episodeCount, geTPersonPersonIdCombinedCredits200ResponseCastInner.episodeCount) &&
        Objects.equals(this.overview, geTPersonPersonIdCombinedCredits200ResponseCastInner.overview) &&
        Objects.equals(this.originCountry, geTPersonPersonIdCombinedCredits200ResponseCastInner.originCountry) &&
        Objects.equals(this.originalName, geTPersonPersonIdCombinedCredits200ResponseCastInner.originalName) &&
        Objects.equals(this.genreIds, geTPersonPersonIdCombinedCredits200ResponseCastInner.genreIds) &&
        Objects.equals(this.name, geTPersonPersonIdCombinedCredits200ResponseCastInner.name) &&
        Objects.equals(this.mediaType, geTPersonPersonIdCombinedCredits200ResponseCastInner.mediaType) &&
        Objects.equals(this.posterPath, geTPersonPersonIdCombinedCredits200ResponseCastInner.posterPath) &&
        Objects.equals(this.firstAirDate, geTPersonPersonIdCombinedCredits200ResponseCastInner.firstAirDate) &&
        Objects.equals(this.voteCount, geTPersonPersonIdCombinedCredits200ResponseCastInner.voteCount) &&
        Objects.equals(this.character, geTPersonPersonIdCombinedCredits200ResponseCastInner.character) &&
        Objects.equals(this.backdropPath, geTPersonPersonIdCombinedCredits200ResponseCastInner.backdropPath) &&
        Objects.equals(this.popularity, geTPersonPersonIdCombinedCredits200ResponseCastInner.popularity) &&
        Objects.equals(this.creditId, geTPersonPersonIdCombinedCredits200ResponseCastInner.creditId) &&
        Objects.equals(this.originalTitle, geTPersonPersonIdCombinedCredits200ResponseCastInner.originalTitle) &&
        Objects.equals(this.video, geTPersonPersonIdCombinedCredits200ResponseCastInner.video) &&
        Objects.equals(this.releaseDate, geTPersonPersonIdCombinedCredits200ResponseCastInner.releaseDate) &&
        Objects.equals(this.title, geTPersonPersonIdCombinedCredits200ResponseCastInner.title) &&
        Objects.equals(this.adult, geTPersonPersonIdCombinedCredits200ResponseCastInner.adult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, originalLanguage, episodeCount, overview, originCountry, originalName, genreIds, name, mediaType, posterPath, firstAirDate, voteCount, character, backdropPath, popularity, creditId, originalTitle, video, releaseDate, title, adult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETPersonPersonIdCombinedCredits200ResponseCastInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    originalLanguage: ").append(toIndentedString(originalLanguage)).append("\n");
    sb.append("    episodeCount: ").append(toIndentedString(episodeCount)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    originCountry: ").append(toIndentedString(originCountry)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    genreIds: ").append(toIndentedString(genreIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    posterPath: ").append(toIndentedString(posterPath)).append("\n");
    sb.append("    firstAirDate: ").append(toIndentedString(firstAirDate)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
    sb.append("    character: ").append(toIndentedString(character)).append("\n");
    sb.append("    backdropPath: ").append(toIndentedString(backdropPath)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    creditId: ").append(toIndentedString(creditId)).append("\n");
    sb.append("    originalTitle: ").append(toIndentedString(originalTitle)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
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

