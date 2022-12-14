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
import org.openapitools.client.model.GETCreditCreditId200ResponseMedia;
import org.openapitools.client.model.GETCreditCreditId200ResponsePerson;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETCreditCreditId200Response
 */
@JsonPropertyOrder({
  GETCreditCreditId200Response.JSON_PROPERTY_CREDIT_TYPE,
  GETCreditCreditId200Response.JSON_PROPERTY_DEPARTMENT,
  GETCreditCreditId200Response.JSON_PROPERTY_JOB,
  GETCreditCreditId200Response.JSON_PROPERTY_MEDIA,
  GETCreditCreditId200Response.JSON_PROPERTY_MEDIA_TYPE,
  GETCreditCreditId200Response.JSON_PROPERTY_ID,
  GETCreditCreditId200Response.JSON_PROPERTY_PERSON
})
@JsonTypeName("GET_credit_credit_id_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class GETCreditCreditId200Response {
  public static final String JSON_PROPERTY_CREDIT_TYPE = "credit_type";
  private String creditType;

  public static final String JSON_PROPERTY_DEPARTMENT = "department";
  private String department;

  public static final String JSON_PROPERTY_JOB = "job";
  private String job;

  public static final String JSON_PROPERTY_MEDIA = "media";
  private GETCreditCreditId200ResponseMedia media;

  public static final String JSON_PROPERTY_MEDIA_TYPE = "media_type";
  private String mediaType;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PERSON = "person";
  private GETCreditCreditId200ResponsePerson person;

  public GETCreditCreditId200Response() {
  }

  public GETCreditCreditId200Response creditType(String creditType) {
    
    this.creditType = creditType;
    return this;
  }

   /**
   * Get creditType
   * @return creditType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREDIT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreditType() {
    return creditType;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreditType(String creditType) {
    this.creditType = creditType;
  }


  public GETCreditCreditId200Response department(String department) {
    
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDepartment() {
    return department;
  }


  @JsonProperty(JSON_PROPERTY_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepartment(String department) {
    this.department = department;
  }


  public GETCreditCreditId200Response job(String job) {
    
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJob() {
    return job;
  }


  @JsonProperty(JSON_PROPERTY_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJob(String job) {
    this.job = job;
  }


  public GETCreditCreditId200Response media(GETCreditCreditId200ResponseMedia media) {
    
    this.media = media;
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GETCreditCreditId200ResponseMedia getMedia() {
    return media;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedia(GETCreditCreditId200ResponseMedia media) {
    this.media = media;
  }


  public GETCreditCreditId200Response mediaType(String mediaType) {
    
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


  public GETCreditCreditId200Response id(String id) {
    
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

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public GETCreditCreditId200Response person(GETCreditCreditId200ResponsePerson person) {
    
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GETCreditCreditId200ResponsePerson getPerson() {
    return person;
  }


  @JsonProperty(JSON_PROPERTY_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerson(GETCreditCreditId200ResponsePerson person) {
    this.person = person;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETCreditCreditId200Response geTCreditCreditId200Response = (GETCreditCreditId200Response) o;
    return Objects.equals(this.creditType, geTCreditCreditId200Response.creditType) &&
        Objects.equals(this.department, geTCreditCreditId200Response.department) &&
        Objects.equals(this.job, geTCreditCreditId200Response.job) &&
        Objects.equals(this.media, geTCreditCreditId200Response.media) &&
        Objects.equals(this.mediaType, geTCreditCreditId200Response.mediaType) &&
        Objects.equals(this.id, geTCreditCreditId200Response.id) &&
        Objects.equals(this.person, geTCreditCreditId200Response.person);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditType, department, job, media, mediaType, id, person);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETCreditCreditId200Response {\n");
    sb.append("    creditType: ").append(toIndentedString(creditType)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
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

