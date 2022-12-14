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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.GETMovieMovieId200ResponseProductionCompaniesInner;
import org.openapitools.client.model.GETMovieMovieId200ResponseProductionCountriesInner;
import org.openapitools.client.model.GETMovieMovieId200ResponseSpokenLanguagesInner;
import org.openapitools.client.model.GETSearchKeyword200ResponseResultsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETMovieMovieId200Response
 */
@JsonPropertyOrder({
  GETMovieMovieId200Response.JSON_PROPERTY_ADULT,
  GETMovieMovieId200Response.JSON_PROPERTY_BACKDROP_PATH,
  GETMovieMovieId200Response.JSON_PROPERTY_BUDGET,
  GETMovieMovieId200Response.JSON_PROPERTY_GENRES,
  GETMovieMovieId200Response.JSON_PROPERTY_ID,
  GETMovieMovieId200Response.JSON_PROPERTY_ORIGINAL_LANGUAGE,
  GETMovieMovieId200Response.JSON_PROPERTY_ORIGINAL_TITLE,
  GETMovieMovieId200Response.JSON_PROPERTY_POPULARITY,
  GETMovieMovieId200Response.JSON_PROPERTY_POSTER_PATH,
  GETMovieMovieId200Response.JSON_PROPERTY_PRODUCTION_COMPANIES,
  GETMovieMovieId200Response.JSON_PROPERTY_PRODUCTION_COUNTRIES,
  GETMovieMovieId200Response.JSON_PROPERTY_RELEASE_DATE,
  GETMovieMovieId200Response.JSON_PROPERTY_REVENUE,
  GETMovieMovieId200Response.JSON_PROPERTY_SPOKEN_LANGUAGES,
  GETMovieMovieId200Response.JSON_PROPERTY_STATUS,
  GETMovieMovieId200Response.JSON_PROPERTY_TITLE,
  GETMovieMovieId200Response.JSON_PROPERTY_VIDEO,
  GETMovieMovieId200Response.JSON_PROPERTY_VOTE_AVERAGE,
  GETMovieMovieId200Response.JSON_PROPERTY_VOTE_COUNT
})
@JsonTypeName("GET_movie_movie_id_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class GETMovieMovieId200Response {
  public static final String JSON_PROPERTY_ADULT = "adult";
  private Boolean adult;

  public static final String JSON_PROPERTY_BACKDROP_PATH = "backdrop_path";
  private Object backdropPath;

  public static final String JSON_PROPERTY_BUDGET = "budget";
  private Integer budget;

  public static final String JSON_PROPERTY_GENRES = "genres";
  private List<GETSearchKeyword200ResponseResultsInner> genres = null;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_ORIGINAL_LANGUAGE = "original_language";
  private String originalLanguage;

  public static final String JSON_PROPERTY_ORIGINAL_TITLE = "original_title";
  private String originalTitle;

  public static final String JSON_PROPERTY_POPULARITY = "popularity";
  private BigDecimal popularity;

  public static final String JSON_PROPERTY_POSTER_PATH = "poster_path";
  private Object posterPath;

  public static final String JSON_PROPERTY_PRODUCTION_COMPANIES = "production_companies";
  private List<GETMovieMovieId200ResponseProductionCompaniesInner> productionCompanies = null;

  public static final String JSON_PROPERTY_PRODUCTION_COUNTRIES = "production_countries";
  private List<GETMovieMovieId200ResponseProductionCountriesInner> productionCountries = null;

  public static final String JSON_PROPERTY_RELEASE_DATE = "release_date";
  private LocalDate releaseDate;

  public static final String JSON_PROPERTY_REVENUE = "revenue";
  private Integer revenue;

  public static final String JSON_PROPERTY_SPOKEN_LANGUAGES = "spoken_languages";
  private List<GETMovieMovieId200ResponseSpokenLanguagesInner> spokenLanguages = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    RUMORED("Rumored"),
    
    PLANNED("Planned"),
    
    IN_PRODUCTION("In Production"),
    
    POST_PRODUCTION("Post Production"),
    
    RELEASED("Released"),
    
    CANCELED("Canceled");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_VIDEO = "video";
  private Boolean video;

  public static final String JSON_PROPERTY_VOTE_AVERAGE = "vote_average";
  private BigDecimal voteAverage;

  public static final String JSON_PROPERTY_VOTE_COUNT = "vote_count";
  private Integer voteCount;

  public GETMovieMovieId200Response() {
  }

  public GETMovieMovieId200Response adult(Boolean adult) {
    
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


  public GETMovieMovieId200Response backdropPath(Object backdropPath) {
    
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


  public GETMovieMovieId200Response budget(Integer budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBudget() {
    return budget;
  }


  @JsonProperty(JSON_PROPERTY_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBudget(Integer budget) {
    this.budget = budget;
  }


  public GETMovieMovieId200Response genres(List<GETSearchKeyword200ResponseResultsInner> genres) {
    
    this.genres = genres;
    return this;
  }

  public GETMovieMovieId200Response addGenresItem(GETSearchKeyword200ResponseResultsInner genresItem) {
    if (this.genres == null) {
      this.genres = new ArrayList<>();
    }
    this.genres.add(genresItem);
    return this;
  }

   /**
   * Get genres
   * @return genres
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GENRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETSearchKeyword200ResponseResultsInner> getGenres() {
    return genres;
  }


  @JsonProperty(JSON_PROPERTY_GENRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGenres(List<GETSearchKeyword200ResponseResultsInner> genres) {
    this.genres = genres;
  }


  public GETMovieMovieId200Response id(Integer id) {
    
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


  public GETMovieMovieId200Response originalLanguage(String originalLanguage) {
    
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


  public GETMovieMovieId200Response originalTitle(String originalTitle) {
    
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


  public GETMovieMovieId200Response popularity(BigDecimal popularity) {
    
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


  public GETMovieMovieId200Response posterPath(Object posterPath) {
    
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


  public GETMovieMovieId200Response productionCompanies(List<GETMovieMovieId200ResponseProductionCompaniesInner> productionCompanies) {
    
    this.productionCompanies = productionCompanies;
    return this;
  }

  public GETMovieMovieId200Response addProductionCompaniesItem(GETMovieMovieId200ResponseProductionCompaniesInner productionCompaniesItem) {
    if (this.productionCompanies == null) {
      this.productionCompanies = new ArrayList<>();
    }
    this.productionCompanies.add(productionCompaniesItem);
    return this;
  }

   /**
   * Get productionCompanies
   * @return productionCompanies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCTION_COMPANIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETMovieMovieId200ResponseProductionCompaniesInner> getProductionCompanies() {
    return productionCompanies;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCTION_COMPANIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductionCompanies(List<GETMovieMovieId200ResponseProductionCompaniesInner> productionCompanies) {
    this.productionCompanies = productionCompanies;
  }


  public GETMovieMovieId200Response productionCountries(List<GETMovieMovieId200ResponseProductionCountriesInner> productionCountries) {
    
    this.productionCountries = productionCountries;
    return this;
  }

  public GETMovieMovieId200Response addProductionCountriesItem(GETMovieMovieId200ResponseProductionCountriesInner productionCountriesItem) {
    if (this.productionCountries == null) {
      this.productionCountries = new ArrayList<>();
    }
    this.productionCountries.add(productionCountriesItem);
    return this;
  }

   /**
   * Get productionCountries
   * @return productionCountries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCTION_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETMovieMovieId200ResponseProductionCountriesInner> getProductionCountries() {
    return productionCountries;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCTION_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductionCountries(List<GETMovieMovieId200ResponseProductionCountriesInner> productionCountries) {
    this.productionCountries = productionCountries;
  }


  public GETMovieMovieId200Response releaseDate(LocalDate releaseDate) {
    
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

  public LocalDate getReleaseDate() {
    return releaseDate;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }


  public GETMovieMovieId200Response revenue(Integer revenue) {
    
    this.revenue = revenue;
    return this;
  }

   /**
   * Get revenue
   * @return revenue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REVENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRevenue() {
    return revenue;
  }


  @JsonProperty(JSON_PROPERTY_REVENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevenue(Integer revenue) {
    this.revenue = revenue;
  }


  public GETMovieMovieId200Response spokenLanguages(List<GETMovieMovieId200ResponseSpokenLanguagesInner> spokenLanguages) {
    
    this.spokenLanguages = spokenLanguages;
    return this;
  }

  public GETMovieMovieId200Response addSpokenLanguagesItem(GETMovieMovieId200ResponseSpokenLanguagesInner spokenLanguagesItem) {
    if (this.spokenLanguages == null) {
      this.spokenLanguages = new ArrayList<>();
    }
    this.spokenLanguages.add(spokenLanguagesItem);
    return this;
  }

   /**
   * Get spokenLanguages
   * @return spokenLanguages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPOKEN_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETMovieMovieId200ResponseSpokenLanguagesInner> getSpokenLanguages() {
    return spokenLanguages;
  }


  @JsonProperty(JSON_PROPERTY_SPOKEN_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpokenLanguages(List<GETMovieMovieId200ResponseSpokenLanguagesInner> spokenLanguages) {
    this.spokenLanguages = spokenLanguages;
  }


  public GETMovieMovieId200Response status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public GETMovieMovieId200Response title(String title) {
    
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


  public GETMovieMovieId200Response video(Boolean video) {
    
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


  public GETMovieMovieId200Response voteAverage(BigDecimal voteAverage) {
    
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


  public GETMovieMovieId200Response voteCount(Integer voteCount) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETMovieMovieId200Response geTMovieMovieId200Response = (GETMovieMovieId200Response) o;
    return Objects.equals(this.adult, geTMovieMovieId200Response.adult) &&
        Objects.equals(this.backdropPath, geTMovieMovieId200Response.backdropPath) &&
        Objects.equals(this.budget, geTMovieMovieId200Response.budget) &&
        Objects.equals(this.genres, geTMovieMovieId200Response.genres) &&
        Objects.equals(this.id, geTMovieMovieId200Response.id) &&
        Objects.equals(this.originalLanguage, geTMovieMovieId200Response.originalLanguage) &&
        Objects.equals(this.originalTitle, geTMovieMovieId200Response.originalTitle) &&
        Objects.equals(this.popularity, geTMovieMovieId200Response.popularity) &&
        Objects.equals(this.posterPath, geTMovieMovieId200Response.posterPath) &&
        Objects.equals(this.productionCompanies, geTMovieMovieId200Response.productionCompanies) &&
        Objects.equals(this.productionCountries, geTMovieMovieId200Response.productionCountries) &&
        Objects.equals(this.releaseDate, geTMovieMovieId200Response.releaseDate) &&
        Objects.equals(this.revenue, geTMovieMovieId200Response.revenue) &&
        Objects.equals(this.spokenLanguages, geTMovieMovieId200Response.spokenLanguages) &&
        Objects.equals(this.status, geTMovieMovieId200Response.status) &&
        Objects.equals(this.title, geTMovieMovieId200Response.title) &&
        Objects.equals(this.video, geTMovieMovieId200Response.video) &&
        Objects.equals(this.voteAverage, geTMovieMovieId200Response.voteAverage) &&
        Objects.equals(this.voteCount, geTMovieMovieId200Response.voteCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adult, backdropPath, budget, genres, id, originalLanguage, originalTitle, popularity, posterPath, productionCompanies, productionCountries, releaseDate, revenue, spokenLanguages, status, title, video, voteAverage, voteCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETMovieMovieId200Response {\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    backdropPath: ").append(toIndentedString(backdropPath)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    originalLanguage: ").append(toIndentedString(originalLanguage)).append("\n");
    sb.append("    originalTitle: ").append(toIndentedString(originalTitle)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    posterPath: ").append(toIndentedString(posterPath)).append("\n");
    sb.append("    productionCompanies: ").append(toIndentedString(productionCompanies)).append("\n");
    sb.append("    productionCountries: ").append(toIndentedString(productionCountries)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    spokenLanguages: ").append(toIndentedString(spokenLanguages)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    voteAverage: ").append(toIndentedString(voteAverage)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
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

