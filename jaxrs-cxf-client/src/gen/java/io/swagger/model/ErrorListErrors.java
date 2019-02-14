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

public class ErrorListErrors  {
  
  @Schema(description = "The code of the error")
 /**
   * The code of the error  
  **/
  private String code = null;
  
  @Schema(description = "A displayable title of the error type")
 /**
   * A displayable title of the error type  
  **/
  private String title = null;
  
  @Schema(description = "Detail of the error")
 /**
   * Detail of the error  
  **/
  private String detail = null;
  
  @Schema(description = "Optional additional data for specific error types")
 /**
   * Optional additional data for specific error types  
  **/
  private Object meta = null;
 /**
   * The code of the error
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorListErrors code(String code) {
    this.code = code;
    return this;
  }

 /**
   * A displayable title of the error type
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ErrorListErrors title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Detail of the error
   * @return detail
  **/
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ErrorListErrors detail(String detail) {
    this.detail = detail;
    return this;
  }

 /**
   * Optional additional data for specific error types
   * @return meta
  **/
  @JsonProperty("meta")
  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }

  public ErrorListErrors meta(Object meta) {
    this.meta = meta;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorListErrors {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
