package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Links;
import io.swagger.model.Meta;
import io.swagger.model.ResponseCommonCustomerData;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class ResponseCommonCustomer   {
  private ResponseCommonCustomerData data = null;  private Links links = null;  private Meta meta = null;

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("data")
  @NotNull
  public ResponseCommonCustomerData getData() {
    return data;
  }
  public void setData(ResponseCommonCustomerData data) {
    this.data = data;
  }

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("links")
  @NotNull
  public Links getLinks() {
    return links;
  }
  public void setLinks(Links links) {
    this.links = links;
  }

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("meta")
  @NotNull
  public Meta getMeta() {
    return meta;
  }
  public void setMeta(Meta meta) {
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
    ResponseCommonCustomer responseCommonCustomer = (ResponseCommonCustomer) o;
    return Objects.equals(data, responseCommonCustomer.data) &&
        Objects.equals(links, responseCommonCustomer.links) &&
        Objects.equals(meta, responseCommonCustomer.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCommonCustomer {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
