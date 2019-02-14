package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class ErrorListErrors   {
  @JsonProperty("code")
  private String code = null;
  @JsonProperty("title")
  private String title = null;
  @JsonProperty("detail")
  private String detail = null;
  @JsonProperty("meta")
  private Object meta = null;
  /**
   * The code of the error
   **/
  public ErrorListErrors code(String code) {
    this.code = code;
    return this;
  }

  
  @Schema(description = "The code of the error")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * A displayable title of the error type
   **/
  public ErrorListErrors title(String title) {
    this.title = title;
    return this;
  }

  
  @Schema(description = "A displayable title of the error type")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Detail of the error
   **/
  public ErrorListErrors detail(String detail) {
    this.detail = detail;
    return this;
  }

  
  @Schema(description = "Detail of the error")
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }
  public void setDetail(String detail) {
    this.detail = detail;
  }

  /**
   * Optional additional data for specific error types
   **/
  public ErrorListErrors meta(Object meta) {
    this.meta = meta;
    return this;
  }

  
  @Schema(description = "Optional additional data for specific error types")
  @JsonProperty("meta")
  public Object getMeta() {
    return meta;
  }
  public void setMeta(Object meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorListErrors errorListErrors = (ErrorListErrors) o;
    return Objects.equals(code, errorListErrors.code) &&
        Objects.equals(title, errorListErrors.title) &&
        Objects.equals(detail, errorListErrors.detail) &&
        Objects.equals(meta, errorListErrors.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, title, detail, meta);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
