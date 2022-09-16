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
 * GETPersonLatest200Response
 */
@JsonPropertyOrder({
  GETPersonLatest200Response.JSON_PROPERTY_ADULT,
  GETPersonLatest200Response.JSON_PROPERTY_ALSO_KNOWN_AS,
  GETPersonLatest200Response.JSON_PROPERTY_GENDER,
  GETPersonLatest200Response.JSON_PROPERTY_ID,
  GETPersonLatest200Response.JSON_PROPERTY_NAME,
  GETPersonLatest200Response.JSON_PROPERTY_POPULARITY,
  GETPersonLatest200Response.JSON_PROPERTY_PROFILE_PATH
})
@JsonTypeName("GET_person_latest_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class GETPersonLatest200Response {
  public static final String JSON_PROPERTY_ADULT = "adult";
  private Boolean adult;

  public static final String JSON_PROPERTY_ALSO_KNOWN_AS = "also_known_as";
  private List<Object> alsoKnownAs = null;

  public static final String JSON_PROPERTY_GENDER = "gender";
  private Integer gender;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_POPULARITY = "popularity";
  private BigDecimal popularity;

  public static final String JSON_PROPERTY_PROFILE_PATH = "profile_path";
  private Object profilePath;

  public GETPersonLatest200Response() {
  }

  public GETPersonLatest200Response adult(Boolean adult) {
    
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


  public GETPersonLatest200Response alsoKnownAs(List<Object> alsoKnownAs) {
    
    this.alsoKnownAs = alsoKnownAs;
    return this;
  }

  public GETPersonLatest200Response addAlsoKnownAsItem(Object alsoKnownAsItem) {
    if (this.alsoKnownAs == null) {
      this.alsoKnownAs = new ArrayList<>();
    }
    this.alsoKnownAs.add(alsoKnownAsItem);
    return this;
  }

   /**
   * Get alsoKnownAs
   * @return alsoKnownAs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALSO_KNOWN_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getAlsoKnownAs() {
    return alsoKnownAs;
  }


  @JsonProperty(JSON_PROPERTY_ALSO_KNOWN_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlsoKnownAs(List<Object> alsoKnownAs) {
    this.alsoKnownAs = alsoKnownAs;
  }


  public GETPersonLatest200Response gender(Integer gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGender() {
    return gender;
  }


  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGender(Integer gender) {
    this.gender = gender;
  }


  public GETPersonLatest200Response id(Integer id) {
    
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


  public GETPersonLatest200Response name(String name) {
    
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


  public GETPersonLatest200Response popularity(BigDecimal popularity) {
    
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


  public GETPersonLatest200Response profilePath(Object profilePath) {
    
    this.profilePath = profilePath;
    return this;
  }

   /**
   * Get profilePath
   * @return profilePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getProfilePath() {
    return profilePath;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfilePath(Object profilePath) {
    this.profilePath = profilePath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETPersonLatest200Response geTPersonLatest200Response = (GETPersonLatest200Response) o;
    return Objects.equals(this.adult, geTPersonLatest200Response.adult) &&
        Objects.equals(this.alsoKnownAs, geTPersonLatest200Response.alsoKnownAs) &&
        Objects.equals(this.gender, geTPersonLatest200Response.gender) &&
        Objects.equals(this.id, geTPersonLatest200Response.id) &&
        Objects.equals(this.name, geTPersonLatest200Response.name) &&
        Objects.equals(this.popularity, geTPersonLatest200Response.popularity) &&
        Objects.equals(this.profilePath, geTPersonLatest200Response.profilePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adult, alsoKnownAs, gender, id, name, popularity, profilePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETPersonLatest200Response {\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    alsoKnownAs: ").append(toIndentedString(alsoKnownAs)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    profilePath: ").append(toIndentedString(profilePath)).append("\n");
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

