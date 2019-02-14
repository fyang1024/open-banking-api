package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.LinksPaginated;
import io.swagger.model.MetaPaginated;
import io.swagger.model.ResponseBankingAccountsBalancesData;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class ResponseBankingAccountsBalances   {
  @JsonProperty("data")
  private ResponseBankingAccountsBalancesData data = null;
  @JsonProperty("links")
  private LinksPaginated links = null;
  @JsonProperty("meta")
  private MetaPaginated meta = null;
  /**
   **/
  public ResponseBankingAccountsBalances data(ResponseBankingAccountsBalancesData data) {
    this.data = data;
    return this;
  }

  
  @Schema(required = true, description = "")
  @JsonProperty("data")
  public ResponseBankingAccountsBalancesData getData() {
    return data;
  }
  public void setData(ResponseBankingAccountsBalancesData data) {
    this.data = data;
  }

  /**
   **/
  public ResponseBankingAccountsBalances links(LinksPaginated links) {
    this.links = links;
    return this;
  }

  
  @Schema(required = true, description = "")
  @JsonProperty("links")
  public LinksPaginated getLinks() {
    return links;
  }
  public void setLinks(LinksPaginated links) {
    this.links = links;
  }

  /**
   **/
  public ResponseBankingAccountsBalances meta(MetaPaginated meta) {
    this.meta = meta;
    return this;
  }

  
  @Schema(required = true, description = "")
  @JsonProperty("meta")
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
    ResponseBankingAccountsBalances responseBankingAccountsBalances = (ResponseBankingAccountsBalances) o;
    return Objects.equals(data, responseBankingAccountsBalances.data) &&
        Objects.equals(links, responseBankingAccountsBalances.links) &&
        Objects.equals(meta, responseBankingAccountsBalances.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingAccountsBalances {\n");
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