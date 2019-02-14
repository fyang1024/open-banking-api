/*
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.AccountDetail;
import io.swagger.client.model.Links;
import io.swagger.client.model.Meta;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * ResponseBankingAccount
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-14T03:38:22.905Z[GMT]")public class ResponseBankingAccount {

  @SerializedName("data")
  private AccountDetail data = null;

  @SerializedName("links")
  private Links links = null;

  @SerializedName("meta")
  private Meta meta = null;
  public ResponseBankingAccount data(AccountDetail data) {
    this.data = data;
    return this;
  }

  

  /**
  * Get data
  * @return data
  **/
  @Schema(required = true, description = "")
  public AccountDetail getData() {
    return data;
  }
  public void setData(AccountDetail data) {
    this.data = data;
  }
  public ResponseBankingAccount links(Links links) {
    this.links = links;
    return this;
  }

  

  /**
  * Get links
  * @return links
  **/
  @Schema(required = true, description = "")
  public Links getLinks() {
    return links;
  }
  public void setLinks(Links links) {
    this.links = links;
  }
  public ResponseBankingAccount meta(Meta meta) {
    this.meta = meta;
    return this;
  }

  

  /**
  * Get meta
  * @return meta
  **/
  @Schema(required = true, description = "")
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
    ResponseBankingAccount responseBankingAccount = (ResponseBankingAccount) o;
    return Objects.equals(this.data, responseBankingAccount.data) &&
        Objects.equals(this.links, responseBankingAccount.links) &&
        Objects.equals(this.meta, responseBankingAccount.meta);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingAccount {\n");
    
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
