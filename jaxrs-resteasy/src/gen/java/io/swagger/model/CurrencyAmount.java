package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class CurrencyAmount   {
  private String amount = null;  private String currency = null;

  /**
   * The current balance of the account at this time. Should align to the current balance available via other channels such as ATM balance enquiry or Internet Banking
   **/
  
  @Schema(required = true, description = "The current balance of the account at this time. Should align to the current balance available via other channels such as ATM balance enquiry or Internet Banking")
  @JsonProperty("amount")
  @NotNull
  public String getAmount() {
    return amount;
  }
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * If not present assumes AUD
   **/
  
  @Schema(description = "If not present assumes AUD")
  @JsonProperty("currency")
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
    return Objects.equals(amount, currencyAmount.amount) &&
        Objects.equals(currency, currencyAmount.currency);
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
