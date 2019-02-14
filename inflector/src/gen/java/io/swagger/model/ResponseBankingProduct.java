package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Links;
import io.swagger.model.Meta;
import io.swagger.model.ProductDetail;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class ResponseBankingProduct   {
  @JsonProperty("data")
  private ProductDetail data = null;
  @JsonProperty("links")
  private Links links = null;
  @JsonProperty("meta")
  private Meta meta = null;
  /**
   **/
  public ResponseBankingProduct data(ProductDetail data) {
    this.data = data;
    return this;
  }

  
  @Schema(required = true, description = "")
  @JsonProperty("data")
  public ProductDetail getData() {
    return data;
  }
  public void setData(ProductDetail data) {
    this.data = data;
  }

  /**
   **/
  public ResponseBankingProduct links(Links links) {
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
  public ResponseBankingProduct meta(Meta meta) {
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
    ResponseBankingProduct responseBankingProduct = (ResponseBankingProduct) o;
    return Objects.equals(data, responseBankingProduct.data) &&
        Objects.equals(links, responseBankingProduct.links) &&
        Objects.equals(meta, responseBankingProduct.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingProduct {\n");
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
