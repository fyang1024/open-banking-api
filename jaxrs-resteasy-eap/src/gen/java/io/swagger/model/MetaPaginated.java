package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2019-02-14T03:34:59.075Z[GMT]")public class MetaPaginated   {
  private Integer totalRecords = null;
  private Integer totalPages = null;

  /**
   * The total number of records in the full set
   **/
  
  @Schema(description = "The total number of records in the full set")
  @JsonProperty("totalRecords")
  public Integer getTotalRecords() {
    return totalRecords;
  }
  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }

  /**
   * The total number of pages in the full set
   **/
  
  @Schema(description = "The total number of pages in the full set")
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaPaginated metaPaginated = (MetaPaginated) o;
    return Objects.equals(totalRecords, metaPaginated.totalRecords) &&
        Objects.equals(totalPages, metaPaginated.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRecords, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaPaginated {\n");
    
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
