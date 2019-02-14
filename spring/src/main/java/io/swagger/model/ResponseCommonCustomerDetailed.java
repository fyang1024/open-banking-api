package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Links;
import io.swagger.model.Meta;
import io.swagger.model.ResponseCommonCustomerDetailedData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseCommonCustomerDetailed
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-14T03:26:14.367Z[GMT]")
public class ResponseCommonCustomerDetailed   {
  @JsonProperty("data")
  private ResponseCommonCustomerDetailedData data = null;

  @JsonProperty("links")
  private Links links = null;

  @JsonProperty("meta")
  private Meta meta = null;

  public ResponseCommonCustomerDetailed data(ResponseCommonCustomerDetailedData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public ResponseCommonCustomerDetailedData getData() {
    return data;
  }

  public void setData(ResponseCommonCustomerDetailedData data) {
    this.data = data;
  }

  public ResponseCommonCustomerDetailed links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public ResponseCommonCustomerDetailed meta(Meta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
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
    return Objects.equals(this.data, responseCommonCustomerDetailed.data) &&
        Objects.equals(this.links, responseCommonCustomerDetailed.links) &&
        Objects.equals(this.meta, responseCommonCustomerDetailed.meta);
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
