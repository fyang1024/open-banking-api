package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CurrencyAmount;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class LendingBalance   {
  private CurrencyAmount accountBalance = null;  private CurrencyAmount availableBalance = null;  private CurrencyAmount creditLimit = null;  private CurrencyAmount amortisedLimit = null;

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("accountBalance")
  @NotNull
  public CurrencyAmount getAccountBalance() {
    return accountBalance;
  }
  public void setAccountBalance(CurrencyAmount accountBalance) {
    this.accountBalance = accountBalance;
  }

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("availableBalance")
  @NotNull
  public CurrencyAmount getAvailableBalance() {
    return availableBalance;
  }
  public void setAvailableBalance(CurrencyAmount availableBalance) {
    this.availableBalance = availableBalance;
  }

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("creditLimit")
  @NotNull
  public CurrencyAmount getCreditLimit() {
    return creditLimit;
  }
  public void setCreditLimit(CurrencyAmount creditLimit) {
    this.creditLimit = creditLimit;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("amortisedLimit")
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
    return Objects.equals(accountBalance, lendingBalance.accountBalance) &&
        Objects.equals(availableBalance, lendingBalance.availableBalance) &&
        Objects.equals(creditLimit, lendingBalance.creditLimit) &&
        Objects.equals(amortisedLimit, lendingBalance.amortisedLimit);
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
