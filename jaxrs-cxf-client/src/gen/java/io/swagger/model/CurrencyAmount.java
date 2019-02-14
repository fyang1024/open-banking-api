package io.swagger.model;


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

public class CurrencyAmount  {
  
  @Schema(required = true, description = "The current balance of the account at this time. Should align to the current balance available via other channels such as ATM balance enquiry or Internet Banking")
 /**
   * The current balance of the account at this time. Should align to the current balance available via other channels such as ATM balance enquiry or Internet Banking  
  **/
  private String amount = null;
  
  @Schema(description = "If not present assumes AUD")
 /**
   * If not present assumes AUD  
  **/
  private String currency = null;
 /**
   * The current balance of the account at this time. Should align to the current balance available via other channels such as ATM balance enquiry or Internet Banking
   * @return amount
  **/
  @JsonProperty("amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public CurrencyAmount amount(String amount) {
    this.amount = amount;
    return this;
  }

 /**
   * If not present assumes AUD
   * @return currency
  **/
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CurrencyAmount currency(String currency) {
    this.currency = currency;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
