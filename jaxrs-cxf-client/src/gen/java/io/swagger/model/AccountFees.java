package io.swagger.model;

import io.swagger.model.AccountDiscounts;
import java.util.ArrayList;
import java.util.List;

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

public class AccountFees  {
  
  @Schema(required = true, description = "Name of the fee")
 /**
   * Name of the fee  
  **/
  private String name = null;
  public enum FeeTypeEnum {
    PERIODIC("PERIODIC"),
    TRANSACTION("TRANSACTION"),
    EXIT("EXIT"),
    OVERDRAW("OVERDRAW"),
    MIN_BALANCE("MIN_BALANCE"),
    REDRAW("REDRAW"),
    CHEQUE_CASH("CHEQUE_CASH"),
    CHEQUE_STOP("CHEQUE_STOP"),
    CHEQUE_BOOK("CHEQUE_BOOK"),
    CARD_REPLACE("CARD_REPLACE"),
    PAPER_STATEMENT("PAPER_STATEMENT"),
    OTHER_EVENT("OTHER_EVENT");

    private String value;

    FeeTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static FeeTypeEnum fromValue(String text) {
      for (FeeTypeEnum b : FeeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(required = true, description = "The type of fee")
 /**
   * The type of fee  
  **/
  private FeeTypeEnum feeType = null;
  
  @Schema(description = "The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory")
 /**
   * The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory  
  **/
  private String amount = null;
  
  @Schema(description = "A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory")
 /**
   * A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory  
  **/
  private String balanceRate = null;
  
  @Schema(description = "A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory")
 /**
   * A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory  
  **/
  private String transactionRate = null;
  
  @Schema(description = "The currency the fee will be charged in. Assumes AUD if absent")
 /**
   * The currency the fee will be charged in. Assumes AUD if absent  
  **/
  private String currency = null;
  
  @Schema(description = "Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType")
 /**
   * Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType  
  **/
  private String additionalValue = null;
  
  @Schema(description = "Display text providing more information on the fee")
 /**
   * Display text providing more information on the fee  
  **/
  private String additionalInfo = null;
  
  @Schema(description = "Link to a web page with more information on this fee")
 /**
   * Link to a web page with more information on this fee  
  **/
  private String additionalInfoUri = null;
  
  @Schema(description = "")
  private List<AccountDiscounts> discounts = null;
 /**
   * Name of the fee
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountFees name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The type of fee
   * @return feeType
  **/
  @JsonProperty("feeType")
  public String getFeeType() {
    if (feeType == null) {
      return null;
    }
    return feeType.getValue();
  }

  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }

  public AccountFees feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

 /**
   * The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
   * @return amount
  **/
  @JsonProperty("amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public AccountFees amount(String amount) {
    this.amount = amount;
    return this;
  }

 /**
   * A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
   * @return balanceRate
  **/
  @JsonProperty("balanceRate")
  public String getBalanceRate() {
    return balanceRate;
  }

  public void setBalanceRate(String balanceRate) {
    this.balanceRate = balanceRate;
  }

  public AccountFees balanceRate(String balanceRate) {
    this.balanceRate = balanceRate;
    return this;
  }

 /**
   * A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
   * @return transactionRate
  **/
  @JsonProperty("transactionRate")
  public String getTransactionRate() {
    return transactionRate;
  }

  public void setTransactionRate(String transactionRate) {
    this.transactionRate = transactionRate;
  }

  public AccountFees transactionRate(String transactionRate) {
    this.transactionRate = transactionRate;
    return this;
  }

 /**
   * The currency the fee will be charged in. Assumes AUD if absent
   * @return currency
  **/
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AccountFees currency(String currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType
   * @return additionalValue
  **/
  @JsonProperty("additionalValue")
  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public AccountFees additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

 /**
   * Display text providing more information on the fee
   * @return additionalInfo
  **/
  @JsonProperty("additionalInfo")
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public AccountFees additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

 /**
   * Link to a web page with more information on this fee
   * @return additionalInfoUri
  **/
  @JsonProperty("additionalInfoUri")
  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  public AccountFees additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

 /**
   * Get discounts
   * @return discounts
  **/
  @JsonProperty("discounts")
  public List<AccountDiscounts> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<AccountDiscounts> discounts) {
    this.discounts = discounts;
  }

  public AccountFees discounts(List<AccountDiscounts> discounts) {
    this.discounts = discounts;
    return this;
  }

  public AccountFees addDiscountsItem(AccountDiscounts discountsItem) {
    this.discounts.add(discountsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFees {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balanceRate: ").append(toIndentedString(balanceRate)).append("\n");
    sb.append("    transactionRate: ").append(toIndentedString(transactionRate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    additionalValue: ").append(toIndentedString(additionalValue)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    additionalInfoUri: ").append(toIndentedString(additionalInfoUri)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
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
