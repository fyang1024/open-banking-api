package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class LinksPaginated   {
  private String self = null;  private String first = null;  private String prev = null;  private String next = null;  private String last = null;

  /**
   * Fully qualified link to this API call
   **/
  
  @Schema(description = "Fully qualified link to this API call")
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }
  public void setSelf(String self) {
    this.self = self;
  }

  /**
   * URI to the first page of this set. Mandatory if this response is not the first page
   **/
  
  @Schema(description = "URI to the first page of this set. Mandatory if this response is not the first page")
  @JsonProperty("first")
  public String getFirst() {
    return first;
  }
  public void setFirst(String first) {
    this.first = first;
  }

  /**
   * URI to the first previous page of this set. Mandatory if this response is not the first page
   **/
  
  @Schema(description = "URI to the first previous page of this set. Mandatory if this response is not the first page")
  @JsonProperty("prev")
  public String getPrev() {
    return prev;
  }
  public void setPrev(String prev) {
    this.prev = prev;
  }

  /**
   * URI to the first next page of this set. Mandatory if this response is not the last page
   **/
  
  @Schema(description = "URI to the first next page of this set. Mandatory if this response is not the last page")
  @JsonProperty("next")
  public String getNext() {
    return next;
  }
  public void setNext(String next) {
    this.next = next;
  }

  /**
   * URI to the first last page of this set. Mandatory if this response is not the last page
   **/
  
  @Schema(description = "URI to the first last page of this set. Mandatory if this response is not the last page")
  @JsonProperty("last")
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
    return Objects.equals(self, linksPaginated.self) &&
        Objects.equals(first, linksPaginated.first) &&
        Objects.equals(prev, linksPaginated.prev) &&
        Objects.equals(next, linksPaginated.next) &&
        Objects.equals(last, linksPaginated.last);
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
