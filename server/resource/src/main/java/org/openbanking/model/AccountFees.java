package org.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountFees
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class AccountFees   {
  @JsonProperty("name")
  private String name;

  /**
   * The type of fee
   */
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

    @Override
    @JsonValue
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
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("feeType")
  private FeeTypeEnum feeType;

  @JsonProperty("amount")
  private String amount;

  @JsonProperty("balanceRate")
  private String balanceRate;

  @JsonProperty("transactionRate")
  private String transactionRate;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("additionalValue")
  private String additionalValue;

  @JsonProperty("additionalInfo")
  private String additionalInfo;

  @JsonProperty("additionalInfoUri")
  private String additionalInfoUri;

  @JsonProperty("discounts")
  @Valid
  private List<AccountDiscounts> discounts = null;

  public AccountFees name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the fee
   * @return name
  */
  @ApiModelProperty(required = true, value = "Name of the fee")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountFees feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * The type of fee
   * @return feeType
  */
  @ApiModelProperty(required = true, value = "The type of fee")
  @NotNull


  public FeeTypeEnum getFeeType() {
    return feeType;
  }

  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }

  public AccountFees amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
   * @return amount
  */
  @ApiModelProperty(value = "The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public AccountFees balanceRate(String balanceRate) {
    this.balanceRate = balanceRate;
    return this;
  }

  /**
   * A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
   * @return balanceRate
  */
  @ApiModelProperty(value = "A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory")


  public String getBalanceRate() {
    return balanceRate;
  }

  public void setBalanceRate(String balanceRate) {
    this.balanceRate = balanceRate;
  }

  public AccountFees transactionRate(String transactionRate) {
    this.transactionRate = transactionRate;
    return this;
  }

  /**
   * A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
   * @return transactionRate
  */
  @ApiModelProperty(value = "A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory")


  public String getTransactionRate() {
    return transactionRate;
  }

  public void setTransactionRate(String transactionRate) {
    this.transactionRate = transactionRate;
  }

  public AccountFees currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency the fee will be charged in. Assumes AUD if absent
   * @return currency
  */
  @ApiModelProperty(value = "The currency the fee will be charged in. Assumes AUD if absent")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AccountFees additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

  /**
   * Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType
   * @return additionalValue
  */
  @ApiModelProperty(value = "Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType")


  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public AccountFees additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Display text providing more information on the fee
   * @return additionalInfo
  */
  @ApiModelProperty(value = "Display text providing more information on the fee")


  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public AccountFees additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

  /**
   * Link to a web page with more information on this fee
   * @return additionalInfoUri
  */
  @ApiModelProperty(value = "Link to a web page with more information on this fee")


  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  public AccountFees discounts(List<AccountDiscounts> discounts) {
    this.discounts = discounts;
    return this;
  }

  public AccountFees addDiscountsItem(AccountDiscounts discountsItem) {
    if (this.discounts == null) {
      this.discounts = new ArrayList<>();
    }
    this.discounts.add(discountsItem);
    return this;
  }

  /**
   * Get discounts
   * @return discounts
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AccountDiscounts> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<AccountDiscounts> discounts) {
    this.discounts = discounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountFees accountFees = (AccountFees) o;
    return Objects.equals(this.name, accountFees.name) &&
        Objects.equals(this.feeType, accountFees.feeType) &&
        Objects.equals(this.amount, accountFees.amount) &&
        Objects.equals(this.balanceRate, accountFees.balanceRate) &&
        Objects.equals(this.transactionRate, accountFees.transactionRate) &&
        Objects.equals(this.currency, accountFees.currency) &&
        Objects.equals(this.additionalValue, accountFees.additionalValue) &&
        Objects.equals(this.additionalInfo, accountFees.additionalInfo) &&
        Objects.equals(this.additionalInfoUri, accountFees.additionalInfoUri) &&
        Objects.equals(this.discounts, accountFees.discounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, feeType, amount, balanceRate, transactionRate, currency, additionalValue, additionalInfo, additionalInfoUri, discounts);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

