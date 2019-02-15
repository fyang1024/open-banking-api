package org.openbank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/**
 * CurrencyAmount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class CurrencyAmount   {
  @JsonProperty("amount")
  private String amount;

  @JsonProperty("currency")
  private String currency;

  public CurrencyAmount amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The current balance of the account at this time. Should align to the current balance available via other channels such as ATM balance enquiry or Internet Banking
   * @return amount
  */
  @ApiModelProperty(required = true, value = "The current balance of the account at this time. Should align to the current balance available via other channels such as ATM balance enquiry or Internet Banking")
  @NotNull


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public CurrencyAmount currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * If not present assumes AUD
   * @return currency
  */
  @ApiModelProperty(value = "If not present assumes AUD")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyAmount currencyAmount = (CurrencyAmount) o;
    return Objects.equals(this.amount, currencyAmount.amount) &&
        Objects.equals(this.currency, currencyAmount.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyAmount {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

