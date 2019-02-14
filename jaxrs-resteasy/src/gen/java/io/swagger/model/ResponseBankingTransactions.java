package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.LinksPaginated;
import io.swagger.model.MetaPaginated;
import io.swagger.model.ResponseBankingTransactionsData;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class ResponseBankingTransactions   {
  private ResponseBankingTransactionsData data = null;  private LinksPaginated links = null;  private MetaPaginated meta = null;

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("data")
  @NotNull
  public ResponseBankingTransactionsData getData() {
    return data;
  }
  public void setData(ResponseBankingTransactionsData data) {
    this.data = data;
  }

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("links")
  @NotNull
  public LinksPaginated getLinks() {
    return links;
  }
  public void setLinks(LinksPaginated links) {
    this.links = links;
  }

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("meta")
  @NotNull
  public MetaPaginated getMeta() {
    return meta;
  }
  public void setMeta(MetaPaginated meta) {
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
    ResponseBankingTransactions responseBankingTransactions = (ResponseBankingTransactions) o;
    return Objects.equals(data, responseBankingTransactions.data) &&
        Objects.equals(links, responseBankingTransactions.links) &&
        Objects.equals(meta, responseBankingTransactions.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingTransactions {\n");
    
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
