package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LinksPaginated
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class LinksPaginated   {
  @JsonProperty("self")
  private String self;

  @JsonProperty("first")
  private String first;

  @JsonProperty("prev")
  private String prev;

  @JsonProperty("next")
  private String next;

  @JsonProperty("last")
  private String last;

  public LinksPaginated self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Fully qualified link to this API call
   * @return self
  */
  @ApiModelProperty(value = "Fully qualified link to this API call")


  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public LinksPaginated first(String first) {
    this.first = first;
    return this;
  }

  /**
   * URI to the first page of this set. Mandatory if this response is not the first page
   * @return first
  */
  @ApiModelProperty(value = "URI to the first page of this set. Mandatory if this response is not the first page")


  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public LinksPaginated prev(String prev) {
    this.prev = prev;
    return this;
  }

  /**
   * URI to the first previous page of this set. Mandatory if this response is not the first page
   * @return prev
  */
  @ApiModelProperty(value = "URI to the first previous page of this set. Mandatory if this response is not the first page")


  public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public LinksPaginated next(String next) {
    this.next = next;
    return this;
  }

  /**
   * URI to the first next page of this set. Mandatory if this response is not the last page
   * @return next
  */
  @ApiModelProperty(value = "URI to the first next page of this set. Mandatory if this response is not the last page")


  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public LinksPaginated last(String last) {
    this.last = last;
    return this;
  }

  /**
   * URI to the first last page of this set. Mandatory if this response is not the last page
   * @return last
  */
  @ApiModelProperty(value = "URI to the first last page of this set. Mandatory if this response is not the last page")


  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksPaginated linksPaginated = (LinksPaginated) o;
    return Objects.equals(this.self, linksPaginated.self) &&
        Objects.equals(this.first, linksPaginated.first) &&
        Objects.equals(this.prev, linksPaginated.prev) &&
        Objects.equals(this.next, linksPaginated.next) &&
        Objects.equals(this.last, linksPaginated.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, prev, next, last);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksPaginated {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

