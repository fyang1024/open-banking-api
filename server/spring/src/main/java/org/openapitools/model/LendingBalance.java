package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CurrencyAmount;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LendingBalance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-14T17:34:34.379921+11:00[Australia/Sydney]")

public class LendingBalance   {
  @JsonProperty("accountBalance")
  private CurrencyAmount accountBalance = null;

  @JsonProperty("availableBalance")
  private CurrencyAmount availableBalance = null;

  @JsonProperty("creditLimit")
  private CurrencyAmount creditLimit = null;

  @JsonProperty("amortisedLimit")
  private CurrencyAmount amortisedLimit = null;

  public LendingBalance accountBalance(CurrencyAmount accountBalance) {
    this.accountBalance = accountBalance;
    return this;
  }

  /**
   * Get accountBalance
   * @return accountBalance
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CurrencyAmount getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(CurrencyAmount accountBalance) {
    this.accountBalance = accountBalance;
  }

  public LendingBalance availableBalance(CurrencyAmount availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

  /**
   * Get availableBalance
   * @return availableBalance
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CurrencyAmount getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(CurrencyAmount availableBalance) {
    this.availableBalance = availableBalance;
  }

  public LendingBalance creditLimit(CurrencyAmount creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

  /**
   * Get creditLimit
   * @return creditLimit
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CurrencyAmount getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(CurrencyAmount creditLimit) {
    this.creditLimit = creditLimit;
  }

  public LendingBalance amortisedLimit(CurrencyAmount amortisedLimit) {
    this.amortisedLimit = amortisedLimit;
    return this;
  }

  /**
   * Get amortisedLimit
   * @return amortisedLimit
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrencyAmount getAmortisedLimit() {
    return amortisedLimit;
  }

  public void setAmortisedLimit(CurrencyAmount amortisedLimit) {
    this.amortisedLimit = amortisedLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LendingBalance lendingBalance = (LendingBalance) o;
    return Objects.equals(this.accountBalance, lendingBalance.accountBalance) &&
        Objects.equals(this.availableBalance, lendingBalance.availableBalance) &&
        Objects.equals(this.creditLimit, lendingBalance.creditLimit) &&
        Objects.equals(this.amortisedLimit, lendingBalance.amortisedLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountBalance, availableBalance, creditLimit, amortisedLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LendingBalance {\n");
    
    sb.append("    accountBalance: ").append(toIndentedString(accountBalance)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    amortisedLimit: ").append(toIndentedString(amortisedLimit)).append("\n");
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

