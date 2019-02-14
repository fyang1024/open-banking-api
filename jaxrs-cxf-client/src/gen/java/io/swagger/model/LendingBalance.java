package io.swagger.model;

import io.swagger.model.CurrencyAmount;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class LendingBalance  {
  
  @Schema(required = true, description = "")
  private CurrencyAmount accountBalance = null;
  
  @Schema(required = true, description = "")
  private CurrencyAmount availableBalance = null;
  
  @Schema(required = true, description = "")
  private CurrencyAmount creditLimit = null;
  
  @Schema(description = "")
  private CurrencyAmount amortisedLimit = null;
 /**
   * Get accountBalance
   * @return accountBalance
  **/
  @JsonProperty("accountBalance")
  public CurrencyAmount getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(CurrencyAmount accountBalance) {
    this.accountBalance = accountBalance;
  }

  public LendingBalance accountBalance(CurrencyAmount accountBalance) {
    this.accountBalance = accountBalance;
    return this;
  }

 /**
   * Get availableBalance
   * @return availableBalance
  **/
  @JsonProperty("availableBalance")
  public CurrencyAmount getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(CurrencyAmount availableBalance) {
    this.availableBalance = availableBalance;
  }

  public LendingBalance availableBalance(CurrencyAmount availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

 /**
   * Get creditLimit
   * @return creditLimit
  **/
  @JsonProperty("creditLimit")
  public CurrencyAmount getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(CurrencyAmount creditLimit) {
    this.creditLimit = creditLimit;
  }

  public LendingBalance creditLimit(CurrencyAmount creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

 /**
   * Get amortisedLimit
   * @return amortisedLimit
  **/
  @JsonProperty("amortisedLimit")
  public CurrencyAmount getAmortisedLimit() {
    return amortisedLimit;
  }

  public void setAmortisedLimit(CurrencyAmount amortisedLimit) {
    this.amortisedLimit = amortisedLimit;
  }

  public LendingBalance amortisedLimit(CurrencyAmount amortisedLimit) {
    this.amortisedLimit = amortisedLimit;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
