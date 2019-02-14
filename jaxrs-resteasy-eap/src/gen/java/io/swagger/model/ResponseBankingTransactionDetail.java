package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Links;
import io.swagger.model.Meta;
import io.swagger.model.ResponseBankingTransactionDetailData;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2019-02-14T03:34:59.075Z[GMT]")public class ResponseBankingTransactionDetail   {
  private ResponseBankingTransactionDetailData data = null;
  private Links links = null;
  private Meta meta = null;

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("data")
  @NotNull
  public ResponseBankingTransactionDetailData getData() {
    return data;
  }
  public void setData(ResponseBankingTransactionDetailData data) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBankingTransactionDetail responseBankingTransactionDetail = (ResponseBankingTransactionDetail) o;
    return Objects.equals(data, responseBankingTransactionDetail.data) &&
        Objects.equals(links, responseBankingTransactionDetail.links) &&
        Objects.equals(meta, responseBankingTransactionDetail.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingTransactionDetail {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
