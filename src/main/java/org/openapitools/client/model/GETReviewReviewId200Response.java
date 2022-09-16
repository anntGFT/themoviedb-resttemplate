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
import org.openapitools.client.model.GETReviewReviewId200ResponseAuthorDetails;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETReviewReviewId200Response
 */
@JsonPropertyOrder({
  GETReviewReviewId200Response.JSON_PROPERTY_ID,
  GETReviewReviewId200Response.JSON_PROPERTY_AUTHOR,
  GETReviewReviewId200Response.JSON_PROPERTY_AUTHOR_DETAILS,
  GETReviewReviewId200Response.JSON_PROPERTY_CONTENT,
  GETReviewReviewId200Response.JSON_PROPERTY_CREATED_AT,
  GETReviewReviewId200Response.JSON_PROPERTY_ISO6391,
  GETReviewReviewId200Response.JSON_PROPERTY_MEDIA_ID,
  GETReviewReviewId200Response.JSON_PROPERTY_MEDIA_TITLE,
  GETReviewReviewId200Response.JSON_PROPERTY_MEDIA_TYPE,
  GETReviewReviewId200Response.JSON_PROPERTY_UPDATED_AT,
  GETReviewReviewId200Response.JSON_PROPERTY_URL
})
@JsonTypeName("GET_review_review_id_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class GETReviewReviewId200Response {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_AUTHOR = "author";
  private String author;

  public static final String JSON_PROPERTY_AUTHOR_DETAILS = "author_details";
  private GETReviewReviewId200ResponseAuthorDetails authorDetails;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_ISO6391 = "iso_639_1";
  private String iso6391;

  public static final String JSON_PROPERTY_MEDIA_ID = "media_id";
  private Integer mediaId;

  public static final String JSON_PROPERTY_MEDIA_TITLE = "media_title";
  private String mediaTitle;

  public static final String JSON_PROPERTY_MEDIA_TYPE = "media_type";
  private String mediaType;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public GETReviewReviewId200Response() {
  }

  public GETReviewReviewId200Response id(String id) {
    
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


  public GETReviewReviewId200Response author(String author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthor() {
    return author;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthor(String author) {
    this.author = author;
  }


  public GETReviewReviewId200Response authorDetails(GETReviewReviewId200ResponseAuthorDetails authorDetails) {
    
    this.authorDetails = authorDetails;
    return this;
  }

   /**
   * Get authorDetails
   * @return authorDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GETReviewReviewId200ResponseAuthorDetails getAuthorDetails() {
    return authorDetails;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorDetails(GETReviewReviewId200ResponseAuthorDetails authorDetails) {
    this.authorDetails = authorDetails;
  }


  public GETReviewReviewId200Response content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(String content) {
    this.content = content;
  }


  public GETReviewReviewId200Response createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public GETReviewReviewId200Response iso6391(String iso6391) {
    
    this.iso6391 = iso6391;
    return this;
  }

   /**
   * Get iso6391
   * @return iso6391
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISO6391)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIso6391() {
    return iso6391;
  }


  @JsonProperty(JSON_PROPERTY_ISO6391)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIso6391(String iso6391) {
    this.iso6391 = iso6391;
  }


  public GETReviewReviewId200Response mediaId(Integer mediaId) {
    
    this.mediaId = mediaId;
    return this;
  }

   /**
   * Get mediaId
   * @return mediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMediaId() {
    return mediaId;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaId(Integer mediaId) {
    this.mediaId = mediaId;
  }


  public GETReviewReviewId200Response mediaTitle(String mediaTitle) {
    
    this.mediaTitle = mediaTitle;
    return this;
  }

   /**
   * Get mediaTitle
   * @return mediaTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaTitle() {
    return mediaTitle;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaTitle(String mediaTitle) {
    this.mediaTitle = mediaTitle;
  }


  public GETReviewReviewId200Response mediaType(String mediaType) {
    
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


  public GETReviewReviewId200Response updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public GETReviewReviewId200Response url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETReviewReviewId200Response geTReviewReviewId200Response = (GETReviewReviewId200Response) o;
    return Objects.equals(this.id, geTReviewReviewId200Response.id) &&
        Objects.equals(this.author, geTReviewReviewId200Response.author) &&
        Objects.equals(this.authorDetails, geTReviewReviewId200Response.authorDetails) &&
        Objects.equals(this.content, geTReviewReviewId200Response.content) &&
        Objects.equals(this.createdAt, geTReviewReviewId200Response.createdAt) &&
        Objects.equals(this.iso6391, geTReviewReviewId200Response.iso6391) &&
        Objects.equals(this.mediaId, geTReviewReviewId200Response.mediaId) &&
        Objects.equals(this.mediaTitle, geTReviewReviewId200Response.mediaTitle) &&
        Objects.equals(this.mediaType, geTReviewReviewId200Response.mediaType) &&
        Objects.equals(this.updatedAt, geTReviewReviewId200Response.updatedAt) &&
        Objects.equals(this.url, geTReviewReviewId200Response.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, author, authorDetails, content, createdAt, iso6391, mediaId, mediaTitle, mediaType, updatedAt, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETReviewReviewId200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorDetails: ").append(toIndentedString(authorDetails)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    iso6391: ").append(toIndentedString(iso6391)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    mediaTitle: ").append(toIndentedString(mediaTitle)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

