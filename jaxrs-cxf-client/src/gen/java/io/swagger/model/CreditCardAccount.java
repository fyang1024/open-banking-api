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

public class CreditCardAccount  {
  
  @Schema(required = true, description = "The minimum payment amount due for the next card payment")
 /**
   * The minimum payment amount due for the next card payment  
  **/
  private String minPaymentAmount = null;
  
  @Schema(required = true, description = "The amount due for the next card payment")
 /**
   * The amount due for the next card payment  
  **/
  private String paymentDueAmount = null;
  
  @Schema(description = "If absent assumes AUD")
 /**
   * If absent assumes AUD  
  **/
  private String paymentCurrency = null;
  
  @Schema(required = true, description = "Date that the next payment for the card is due")
 /**
   * Date that the next payment for the card is due  
  **/
  private String paymentDueDate = null;
 /**
   * The minimum payment amount due for the next card payment
   * @return minPaymentAmount
  **/
  @JsonProperty("minPaymentAmount")
  public String getMinPaymentAmount() {
    return minPaymentAmount;
  }

  public void setMinPaymentAmount(String minPaymentAmount) {
    this.minPaymentAmount = minPaymentAmount;
  }

  public CreditCardAccount minPaymentAmount(String minPaymentAmount) {
    this.minPaymentAmount = minPaymentAmount;
    return this;
  }

 /**
   * The amount due for the next card payment
   * @return paymentDueAmount
  **/
  @JsonProperty("paymentDueAmount")
  public String getPaymentDueAmount() {
    return paymentDueAmount;
  }

  public void setPaymentDueAmount(String paymentDueAmount) {
    this.paymentDueAmount = paymentDueAmount;
  }

  public CreditCardAccount paymentDueAmount(String paymentDueAmount) {
    this.paymentDueAmount = paymentDueAmount;
    return this;
  }

 /**
   * If absent assumes AUD
   * @return paymentCurrency
  **/
  @JsonProperty("paymentCurrency")
  public String getPaymentCurrency() {
    return paymentCurrency;
  }

  public void setPaymentCurrency(String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
  }

  public CreditCardAccount paymentCurrency(String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
    return this;
  }

 /**
   * Date that the next payment for the card is due
   * @return paymentDueDate
  **/
  @JsonProperty("paymentDueDate")
  public String getPaymentDueDate() {
    return paymentDueDate;
  }

  public void setPaymentDueDate(String paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
  }

  public CreditCardAccount paymentDueDate(String paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardAccount {\n");
    
    sb.append("    minPaymentAmount: ").append(toIndentedString(minPaymentAmount)).append("\n");
    sb.append("    paymentDueAmount: ").append(toIndentedString(paymentDueAmount)).append("\n");
    sb.append("    paymentCurrency: ").append(toIndentedString(paymentCurrency)).append("\n");
    sb.append("    paymentDueDate: ").append(toIndentedString(paymentDueDate)).append("\n");
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
