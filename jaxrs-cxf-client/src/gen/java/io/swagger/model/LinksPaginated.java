package io.swagger.model;


import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class LinksPaginated  {
  
  @Schema(description = "Fully qualified link to this API call")
 /**
   * Fully qualified link to this API call  
  **/
  private String self = null;
  
  @Schema(description = "URI to the first page of this set. Mandatory if this response is not the first page")
 /**
   * URI to the first page of this set. Mandatory if this response is not the first page  
  **/
  private String first = null;
  
  @Schema(description = "URI to the first previous page of this set. Mandatory if this response is not the first page")
 /**
   * URI to the first previous page of this set. Mandatory if this response is not the first page  
  **/
  private String prev = null;
  
  @Schema(description = "URI to the first next page of this set. Mandatory if this response is not the last page")
 /**
   * URI to the first next page of this set. Mandatory if this response is not the last page  
  **/
  private String next = null;
  
  @Schema(description = "URI to the first last page of this set. Mandatory if this response is not the last page")
 /**
   * URI to the first last page of this set. Mandatory if this response is not the last page  
  **/
  private String last = null;
 /**
   * Fully qualified link to this API call
   * @return self
  **/
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public LinksPaginated self(String self) {
    this.self = self;
    return this;
  }

 /**
   * URI to the first page of this set. Mandatory if this response is not the first page
   * @return first
  **/
  @JsonProperty("first")
  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public LinksPaginated first(String first) {
    this.first = first;
    return this;
  }

 /**
   * URI to the first previous page of this set. Mandatory if this response is not the first page
   * @return prev
  **/
  @JsonProperty("prev")
  public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public LinksPaginated prev(String prev) {
    this.prev = prev;
    return this;
  }

 /**
   * URI to the first next page of this set. Mandatory if this response is not the last page
   * @return next
  **/
  @JsonProperty("next")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public LinksPaginated next(String next) {
    this.next = next;
    return this;
  }

 /**
   * URI to the first last page of this set. Mandatory if this response is not the last page
   * @return last
  **/
  @JsonProperty("last")
  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }

  public LinksPaginated last(String last) {
    this.last = last;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
