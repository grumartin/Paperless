package at.fhtw.swkom.paperless.services.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateTag200Response
 */

@JsonTypeName("CreateTag_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-18T10:41:21.972847Z[Etc/UTC]")
public class CreateTag200Response {

  private Integer id;

  private String slug;

  private String name;

  private String color;

  private String textColor;

  private String match;

  private Integer matchingAlgorithm;

  private Boolean isInsensitive;

  private Boolean isInboxTag;

  private Integer owner;

  private Boolean userCanChange;

  public CreateTag200Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateTag200Response(Integer id, String slug, String name, String color, String textColor, String match, Integer matchingAlgorithm, Boolean isInsensitive, Boolean isInboxTag, Integer owner, Boolean userCanChange) {
    this.id = id;
    this.slug = slug;
    this.name = name;
    this.color = color;
    this.textColor = textColor;
    this.match = match;
    this.matchingAlgorithm = matchingAlgorithm;
    this.isInsensitive = isInsensitive;
    this.isInboxTag = isInboxTag;
    this.owner = owner;
    this.userCanChange = userCanChange;
  }

  public CreateTag200Response id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CreateTag200Response slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * @return slug
  */
  @NotNull 
  @Schema(name = "slug", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public CreateTag200Response name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateTag200Response color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
  */
  @NotNull 
  @Schema(name = "color", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public CreateTag200Response textColor(String textColor) {
    this.textColor = textColor;
    return this;
  }

  /**
   * Get textColor
   * @return textColor
  */
  @NotNull 
  @Schema(name = "text_color", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text_color")
  public String getTextColor() {
    return textColor;
  }

  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }

  public CreateTag200Response match(String match) {
    this.match = match;
    return this;
  }

  /**
   * Get match
   * @return match
  */
  @NotNull 
  @Schema(name = "match", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("match")
  public String getMatch() {
    return match;
  }

  public void setMatch(String match) {
    this.match = match;
  }

  public CreateTag200Response matchingAlgorithm(Integer matchingAlgorithm) {
    this.matchingAlgorithm = matchingAlgorithm;
    return this;
  }

  /**
   * Get matchingAlgorithm
   * @return matchingAlgorithm
  */
  @NotNull 
  @Schema(name = "matching_algorithm", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("matching_algorithm")
  public Integer getMatchingAlgorithm() {
    return matchingAlgorithm;
  }

  public void setMatchingAlgorithm(Integer matchingAlgorithm) {
    this.matchingAlgorithm = matchingAlgorithm;
  }

  public CreateTag200Response isInsensitive(Boolean isInsensitive) {
    this.isInsensitive = isInsensitive;
    return this;
  }

  /**
   * Get isInsensitive
   * @return isInsensitive
  */
  @NotNull 
  @Schema(name = "is_insensitive", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_insensitive")
  public Boolean getIsInsensitive() {
    return isInsensitive;
  }

  public void setIsInsensitive(Boolean isInsensitive) {
    this.isInsensitive = isInsensitive;
  }

  public CreateTag200Response isInboxTag(Boolean isInboxTag) {
    this.isInboxTag = isInboxTag;
    return this;
  }

  /**
   * Get isInboxTag
   * @return isInboxTag
  */
  @NotNull 
  @Schema(name = "is_inbox_tag", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_inbox_tag")
  public Boolean getIsInboxTag() {
    return isInboxTag;
  }

  public void setIsInboxTag(Boolean isInboxTag) {
    this.isInboxTag = isInboxTag;
  }

  public CreateTag200Response owner(Integer owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @NotNull 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("owner")
  public Integer getOwner() {
    return owner;
  }

  public void setOwner(Integer owner) {
    this.owner = owner;
  }

  public CreateTag200Response userCanChange(Boolean userCanChange) {
    this.userCanChange = userCanChange;
    return this;
  }

  /**
   * Get userCanChange
   * @return userCanChange
  */
  @NotNull 
  @Schema(name = "user_can_change", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_can_change")
  public Boolean getUserCanChange() {
    return userCanChange;
  }

  public void setUserCanChange(Boolean userCanChange) {
    this.userCanChange = userCanChange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTag200Response createTag200Response = (CreateTag200Response) o;
    return Objects.equals(this.id, createTag200Response.id) &&
        Objects.equals(this.slug, createTag200Response.slug) &&
        Objects.equals(this.name, createTag200Response.name) &&
        Objects.equals(this.color, createTag200Response.color) &&
        Objects.equals(this.textColor, createTag200Response.textColor) &&
        Objects.equals(this.match, createTag200Response.match) &&
        Objects.equals(this.matchingAlgorithm, createTag200Response.matchingAlgorithm) &&
        Objects.equals(this.isInsensitive, createTag200Response.isInsensitive) &&
        Objects.equals(this.isInboxTag, createTag200Response.isInboxTag) &&
        Objects.equals(this.owner, createTag200Response.owner) &&
        Objects.equals(this.userCanChange, createTag200Response.userCanChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, name, color, textColor, match, matchingAlgorithm, isInsensitive, isInboxTag, owner, userCanChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTag200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    matchingAlgorithm: ").append(toIndentedString(matchingAlgorithm)).append("\n");
    sb.append("    isInsensitive: ").append(toIndentedString(isInsensitive)).append("\n");
    sb.append("    isInboxTag: ").append(toIndentedString(isInboxTag)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    userCanChange: ").append(toIndentedString(userCanChange)).append("\n");
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

