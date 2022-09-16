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
 * GETTvTvId200ResponseCreatedByInner
 */
@JsonPropertyOrder({
  GETTvTvId200ResponseCreatedByInner.JSON_PROPERTY_ID,
  GETTvTvId200ResponseCreatedByInner.JSON_PROPERTY_CREDIT_ID,
  GETTvTvId200ResponseCreatedByInner.JSON_PROPERTY_NAME,
  GETTvTvId200ResponseCreatedByInner.JSON_PROPERTY_GENDER,
  GETTvTvId200ResponseCreatedByInner.JSON_PROPERTY_PROFILE_PATH
})
@JsonTypeName("GET_tv_tv_id_200_response_created_by_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class GETTvTvId200ResponseCreatedByInner {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_CREDIT_ID = "credit_id";
  private String creditId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_GENDER = "gender";
  private Integer gender;

  public static final String JSON_PROPERTY_PROFILE_PATH = "profile_path";
  private Object profilePath;

  public GETTvTvId200ResponseCreatedByInner() {
  }

  public GETTvTvId200ResponseCreatedByInner id(Integer id) {
    
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


  public GETTvTvId200ResponseCreatedByInner creditId(String creditId) {
    
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


  public GETTvTvId200ResponseCreatedByInner name(String name) {
    
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


  public GETTvTvId200ResponseCreatedByInner gender(Integer gender) {
    
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


  public GETTvTvId200ResponseCreatedByInner profilePath(Object profilePath) {
    
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
    GETTvTvId200ResponseCreatedByInner geTTvTvId200ResponseCreatedByInner = (GETTvTvId200ResponseCreatedByInner) o;
    return Objects.equals(this.id, geTTvTvId200ResponseCreatedByInner.id) &&
        Objects.equals(this.creditId, geTTvTvId200ResponseCreatedByInner.creditId) &&
        Objects.equals(this.name, geTTvTvId200ResponseCreatedByInner.name) &&
        Objects.equals(this.gender, geTTvTvId200ResponseCreatedByInner.gender) &&
        Objects.equals(this.profilePath, geTTvTvId200ResponseCreatedByInner.profilePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creditId, name, gender, profilePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvTvId200ResponseCreatedByInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creditId: ").append(toIndentedString(creditId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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
