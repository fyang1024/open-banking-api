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
import io.swagger.client.model.AuthorisedEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * DirectDebits
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-14T03:38:22.905Z[GMT]")public class DirectDebits {

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("authorisedEntity")
  private AuthorisedEntity authorisedEntity = null;

  @SerializedName("lastDebitDateTime")
  private String lastDebitDateTime = null;

  @SerializedName("lastDebitAmount")
  private String lastDebitAmount = null;
  public DirectDebits accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  

  /**
  * A unique ID of the account adhering to the standards for ID permanence.
  * @return accountId
  **/
  @Schema(required = true, description = "A unique ID of the account adhering to the standards for ID permanence.")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
  public DirectDebits authorisedEntity(AuthorisedEntity authorisedEntity) {
    this.authorisedEntity = authorisedEntity;
    return this;
  }

  

  /**
  * Get authorisedEntity
  * @return authorisedEntity
  **/
  @Schema(description = "")
  public AuthorisedEntity getAuthorisedEntity() {
    return authorisedEntity;
  }
  public void setAuthorisedEntity(AuthorisedEntity authorisedEntity) {
    this.authorisedEntity = authorisedEntity;
  }
  public DirectDebits lastDebitDateTime(String lastDebitDateTime) {
    this.lastDebitDateTime = lastDebitDateTime;
    return this;
  }

  

  /**
  * The date and time of the last debit executed under this authorisation
  * @return lastDebitDateTime
  **/
  @Schema(description = "The date and time of the last debit executed under this authorisation")
  public String getLastDebitDateTime() {
    return lastDebitDateTime;
  }
  public void setLastDebitDateTime(String lastDebitDateTime) {
    this.lastDebitDateTime = lastDebitDateTime;
  }
  public DirectDebits lastDebitAmount(String lastDebitAmount) {
    this.lastDebitAmount = lastDebitAmount;
    return this;
  }

  

  /**
  * The amount of the last debit executed under this authorisation
  * @return lastDebitAmount
  **/
  @Schema(description = "The amount of the last debit executed under this authorisation")
  public String getLastDebitAmount() {
    return lastDebitAmount;
  }
  public void setLastDebitAmount(String lastDebitAmount) {
    this.lastDebitAmount = lastDebitAmount;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDebits directDebits = (DirectDebits) o;
    return Objects.equals(this.accountId, directDebits.accountId) &&
        Objects.equals(this.authorisedEntity, directDebits.authorisedEntity) &&
        Objects.equals(this.lastDebitDateTime, directDebits.lastDebitDateTime) &&
        Objects.equals(this.lastDebitAmount, directDebits.lastDebitAmount);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(accountId, authorisedEntity, lastDebitDateTime, lastDebitAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebits {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    authorisedEntity: ").append(toIndentedString(authorisedEntity)).append("\n");
    sb.append("    lastDebitDateTime: ").append(toIndentedString(lastDebitDateTime)).append("\n");
    sb.append("    lastDebitAmount: ").append(toIndentedString(lastDebitAmount)).append("\n");
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
