package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AuthorisedEntity;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DirectDebits
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-14T03:26:14.367Z[GMT]")
public class DirectDebits   {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("authorisedEntity")
  private AuthorisedEntity authorisedEntity = null;

  @JsonProperty("lastDebitDateTime")
  private String lastDebitDateTime = null;

  @JsonProperty("lastDebitAmount")
  private String lastDebitAmount = null;

  public DirectDebits accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique ID of the account adhering to the standards for ID permanence.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "A unique ID of the account adhering to the standards for ID permanence.")
  @NotNull

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
  @ApiModelProperty(value = "")

  @Valid
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
  @ApiModelProperty(value = "The date and time of the last debit executed under this authorisation")

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
  @ApiModelProperty(value = "The amount of the last debit executed under this authorisation")

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
