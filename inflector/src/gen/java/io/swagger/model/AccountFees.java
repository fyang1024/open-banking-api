package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.AccountDiscounts;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class AccountFees   {
  @JsonProperty("name")
  private String name = null;
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
      return null;
    }
  }
  @JsonProperty("feeType")
  private FeeTypeEnum feeType = null;
  @JsonProperty("amount")
  private String amount = null;
  @JsonProperty("balanceRate")
  private String balanceRate = null;
  @JsonProperty("transactionRate")
  private String transactionRate = null;
  @JsonProperty("currency")
  private String currency = null;
  @JsonProperty("additionalValue")
  private String additionalValue = null;
  @JsonProperty("additionalInfo")
  private String additionalInfo = null;
  @JsonProperty("additionalInfoUri")
  private String additionalInfoUri = null;
  @JsonProperty("discounts")
  private List<AccountDiscounts> discounts = null;
  /**
   * Name of the fee
   **/
  public AccountFees name(String name) {
    this.name = name;
    return this;
  }

  
  @Schema(required = true, description = "Name of the fee")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The type of fee
   **/
  public AccountFees feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

  
  @Schema(required = true, description = "The type of fee")
  @JsonProperty("feeType")
  public FeeTypeEnum getFeeType() {
    return feeType;
  }
  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }

  /**
   * The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
   **/
  public AccountFees amount(String amount) {
    this.amount = amount;
    return this;
  }

  
  @Schema(description = "The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory")
  @JsonProperty("amount")
  public String getAmount() {
    return amount;
  }
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
   **/
  public AccountFees balanceRate(String balanceRate) {
    this.balanceRate = balanceRate;
    return this;
  }

  
  @Schema(description = "A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory")
  @JsonProperty("balanceRate")
  public String getBalanceRate() {
    return balanceRate;
  }
  public void setBalanceRate(String balanceRate) {
    this.balanceRate = balanceRate;
  }

  /**
   * A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
   **/
  public AccountFees transactionRate(String transactionRate) {
    this.transactionRate = transactionRate;
    return this;
  }

  
  @Schema(description = "A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory")
  @JsonProperty("transactionRate")
  public String getTransactionRate() {
    return transactionRate;
  }
  public void setTransactionRate(String transactionRate) {
    this.transactionRate = transactionRate;
  }

  /**
   * The currency the fee will be charged in. Assumes AUD if absent
   **/
  public AccountFees currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  @Schema(description = "The currency the fee will be charged in. Assumes AUD if absent")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType
   **/
  public AccountFees additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

  
  @Schema(description = "Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType")
  @JsonProperty("additionalValue")
  public String getAdditionalValue() {
    return additionalValue;
  }
  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  /**
   * Display text providing more information on the fee
   **/
  public AccountFees additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  
  @Schema(description = "Display text providing more information on the fee")
  @JsonProperty("additionalInfo")
  public String getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  /**
   * Link to a web page with more information on this fee
   **/
  public AccountFees additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

  
  @Schema(description = "Link to a web page with more information on this fee")
  @JsonProperty("additionalInfoUri")
  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }
  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  /**
   **/
  public AccountFees discounts(List<AccountDiscounts> discounts) {
    this.discounts = discounts;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("discounts")
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
    return Objects.equals(name, accountFees.name) &&
        Objects.equals(feeType, accountFees.feeType) &&
        Objects.equals(amount, accountFees.amount) &&
        Objects.equals(balanceRate, accountFees.balanceRate) &&
        Objects.equals(transactionRate, accountFees.transactionRate) &&
        Objects.equals(currency, accountFees.currency) &&
        Objects.equals(additionalValue, accountFees.additionalValue) &&
        Objects.equals(additionalInfo, accountFees.additionalInfo) &&
        Objects.equals(additionalInfoUri, accountFees.additionalInfoUri) &&
        Objects.equals(discounts, accountFees.discounts);
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
