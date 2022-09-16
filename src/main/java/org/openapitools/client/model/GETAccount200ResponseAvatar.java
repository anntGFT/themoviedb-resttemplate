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
import org.openapitools.client.model.GETAccount200ResponseAvatarGravatar;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETAccount200ResponseAvatar
 */
@JsonPropertyOrder({
  GETAccount200ResponseAvatar.JSON_PROPERTY_GRAVATAR
})
@JsonTypeName("GET_account_200_response_avatar")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T07:38:43.023Z[UTC]")
public class GETAccount200ResponseAvatar {
  public static final String JSON_PROPERTY_GRAVATAR = "gravatar";
  private GETAccount200ResponseAvatarGravatar gravatar;

  public GETAccount200ResponseAvatar() {
  }

  public GETAccount200ResponseAvatar gravatar(GETAccount200ResponseAvatarGravatar gravatar) {
    
    this.gravatar = gravatar;
    return this;
  }

   /**
   * Get gravatar
   * @return gravatar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GRAVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GETAccount200ResponseAvatarGravatar getGravatar() {
    return gravatar;
  }


  @JsonProperty(JSON_PROPERTY_GRAVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGravatar(GETAccount200ResponseAvatarGravatar gravatar) {
    this.gravatar = gravatar;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETAccount200ResponseAvatar geTAccount200ResponseAvatar = (GETAccount200ResponseAvatar) o;
    return Objects.equals(this.gravatar, geTAccount200ResponseAvatar.gravatar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gravatar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETAccount200ResponseAvatar {\n");
    sb.append("    gravatar: ").append(toIndentedString(gravatar)).append("\n");
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

