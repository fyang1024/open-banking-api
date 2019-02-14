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
 * ErrorListErrors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-14T17:34:34.379921+11:00[Australia/Sydney]")

public class ErrorListErrors   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("title")
  private String title;

  @JsonProperty("detail")
  private String detail;

  @JsonProperty("meta")
  private Object meta = null;

  public ErrorListErrors code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The code of the error
   * @return code
  */
  @ApiModelProperty(required = true, value = "The code of the error")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorListErrors title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A displayable title of the error type
   * @return title
  */
  @ApiModelProperty(required = true, value = "A displayable title of the error type")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ErrorListErrors detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Detail of the error
   * @return detail
  */
  @ApiModelProperty(required = true, value = "Detail of the error")
  @NotNull


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ErrorListErrors meta(Object meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Optional additional data for specific error types
   * @return meta
  */
  @ApiModelProperty(value = "Optional additional data for specific error types")

  @Valid

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
    return Objects.equals(this.code, errorListErrors.code) &&
        Objects.equals(this.title, errorListErrors.title) &&
        Objects.equals(this.detail, errorListErrors.detail) &&
        Objects.equals(this.meta, errorListErrors.meta);
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

