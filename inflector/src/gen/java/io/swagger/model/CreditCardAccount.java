package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class CreditCardAccount   {
  @JsonProperty("minPaymentAmount")
  private String minPaymentAmount = null;
  @JsonProperty("paymentDueAmount")
  private String paymentDueAmount = null;
  @JsonProperty("paymentCurrency")
  private String paymentCurrency = null;
  @JsonProperty("paymentDueDate")
  private String paymentDueDate = null;
  /**
   * The minimum payment amount due for the next card payment
   **/
  public CreditCardAccount minPaymentAmount(String minPaymentAmount) {
    this.minPaymentAmount = minPaymentAmount;
    return this;
  }

  
  @Schema(required = true, description = "The minimum payment amount due for the next card payment")
  @JsonProperty("minPaymentAmount")
  public String getMinPaymentAmount() {
    return minPaymentAmount;
  }
  public void setMinPaymentAmount(String minPaymentAmount) {
    this.minPaymentAmount = minPaymentAmount;
  }

  /**
   * The amount due for the next card payment
   **/
  public CreditCardAccount paymentDueAmount(String paymentDueAmount) {
    this.paymentDueAmount = paymentDueAmount;
    return this;
  }

  
  @Schema(required = true, description = "The amount due for the next card payment")
  @JsonProperty("paymentDueAmount")
  public String getPaymentDueAmount() {
    return paymentDueAmount;
  }
  public void setPaymentDueAmount(String paymentDueAmount) {
    this.paymentDueAmount = paymentDueAmount;
  }

  /**
   * If absent assumes AUD
   **/
  public CreditCardAccount paymentCurrency(String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
    return this;
  }

  
  @Schema(description = "If absent assumes AUD")
  @JsonProperty("paymentCurrency")
  public String getPaymentCurrency() {
    return paymentCurrency;
  }
  public void setPaymentCurrency(String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
  }

  /**
   * Date that the next payment for the card is due
   **/
  public CreditCardAccount paymentDueDate(String paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
    return this;
  }

  
  @Schema(required = true, description = "Date that the next payment for the card is due")
  @JsonProperty("paymentDueDate")
  public String getPaymentDueDate() {
    return paymentDueDate;
  }
  public void setPaymentDueDate(String paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardAccount creditCardAccount = (CreditCardAccount) o;
    return Objects.equals(minPaymentAmount, creditCardAccount.minPaymentAmount) &&
        Objects.equals(paymentDueAmount, creditCardAccount.paymentDueAmount) &&
        Objects.equals(paymentCurrency, creditCardAccount.paymentCurrency) &&
        Objects.equals(paymentDueDate, creditCardAccount.paymentDueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minPaymentAmount, paymentDueAmount, paymentCurrency, paymentDueDate);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
