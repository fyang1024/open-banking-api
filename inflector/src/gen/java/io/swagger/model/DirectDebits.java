package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AuthorisedEntity;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class DirectDebits   {
  @JsonProperty("accountId")
  private String accountId = null;
  @JsonProperty("authorisedEntity")
  private AuthorisedEntity authorisedEntity = null;
  @JsonProperty("lastDebitDateTime")
  private String lastDebitDateTime = null;
  @JsonProperty("lastDebitAmount")
  private String lastDebitAmount = null;
  /**
   * A unique ID of the account adhering to the standards for ID permanence.
   **/
  public DirectDebits accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  
  @Schema(required = true, description = "A unique ID of the account adhering to the standards for ID permanence.")
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   **/
  public DirectDebits authorisedEntity(AuthorisedEntity authorisedEntity) {
    this.authorisedEntity = authorisedEntity;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("authorisedEntity")
  public AuthorisedEntity getAuthorisedEntity() {
    return authorisedEntity;
  }
  public void setAuthorisedEntity(AuthorisedEntity authorisedEntity) {
    this.authorisedEntity = authorisedEntity;
  }

  /**
   * The date and time of the last debit executed under this authorisation
   **/
  public DirectDebits lastDebitDateTime(String lastDebitDateTime) {
    this.lastDebitDateTime = lastDebitDateTime;
    return this;
  }

  
  @Schema(description = "The date and time of the last debit executed under this authorisation")
  @JsonProperty("lastDebitDateTime")
  public String getLastDebitDateTime() {
    return lastDebitDateTime;
  }
  public void setLastDebitDateTime(String lastDebitDateTime) {
    this.lastDebitDateTime = lastDebitDateTime;
  }

  /**
   * The amount of the last debit executed under this authorisation
   **/
  public DirectDebits lastDebitAmount(String lastDebitAmount) {
    this.lastDebitAmount = lastDebitAmount;
    return this;
  }

  
  @Schema(description = "The amount of the last debit executed under this authorisation")
  @JsonProperty("lastDebitAmount")
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
    return Objects.equals(accountId, directDebits.accountId) &&
        Objects.equals(authorisedEntity, directDebits.authorisedEntity) &&
        Objects.equals(lastDebitDateTime, directDebits.lastDebitDateTime) &&
        Objects.equals(lastDebitAmount, directDebits.lastDebitAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, authorisedEntity, lastDebitDateTime, lastDebitAmount);
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
