package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Links;
import io.swagger.model.Meta;
import io.swagger.model.ResponseCommonCustomerDetailedData;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class ResponseCommonCustomerDetailed   {
  @JsonProperty("data")
  private ResponseCommonCustomerDetailedData data = null;
  @JsonProperty("links")
  private Links links = null;
  @JsonProperty("meta")
  private Meta meta = null;
  /**
   **/
  public ResponseCommonCustomerDetailed data(ResponseCommonCustomerDetailedData data) {
    this.data = data;
    return this;
  }

  
  @Schema(required = true, description = "")
  @JsonProperty("data")
  public ResponseCommonCustomerDetailedData getData() {
    return data;
  }
  public void setData(ResponseCommonCustomerDetailedData data) {
    this.data = data;
  }

  /**
   **/
  public ResponseCommonCustomerDetailed links(Links links) {
    this.links = links;
    return this;
  }

  
  @Schema(required = true, description = "")
  @JsonProperty("links")
  public Links getLinks() {
    return links;
  }
  public void setLinks(Links links) {
    this.links = links;
  }

  /**
   **/
  public ResponseCommonCustomerDetailed meta(Meta meta) {
    this.meta = meta;
    return this;
  }

  
  @Schema(required = true, description = "")
  @JsonProperty("meta")
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
    ResponseCommonCustomerDetailed responseCommonCustomerDetailed = (ResponseCommonCustomerDetailed) o;
    return Objects.equals(data, responseCommonCustomerDetailed.data) &&
        Objects.equals(links, responseCommonCustomerDetailed.links) &&
        Objects.equals(meta, responseCommonCustomerDetailed.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCommonCustomerDetailed {\n");
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
