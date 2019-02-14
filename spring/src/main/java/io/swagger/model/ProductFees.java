package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ProductDiscounts;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductFees
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-14T03:26:14.367Z[GMT]")
public class ProductFees   {
  @JsonProperty("name")
  private String name = null;

  /**
   * The type of fee
   */
  public enum FeeTypeEnum {
    PERIODIC("PERIODIC"),
    
    TRANSACTION("TRANSACTION"),
    
    ESTABLISHMENT("ESTABLISHMENT"),
    
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
  @Valid
  private List<ProductDiscounts> discounts = null;

  public ProductFees name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the fee
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the fee")
  @NotNull

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductFees feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * The type of fee
   * @return feeType
  **/
  @ApiModelProperty(required = true, value = "The type of fee")
  @NotNull

  public FeeTypeEnum getFeeType() {
    return feeType;
  }

  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }

  public ProductFees amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
   * @return amount
  **/
  @ApiModelProperty(value = "The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory")

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public ProductFees balanceRate(String balanceRate) {
    this.balanceRate = balanceRate;
    return this;
  }

  /**
   * A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
   * @return balanceRate
  **/
  @ApiModelProperty(value = "A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory")

  public String getBalanceRate() {
    return balanceRate;
  }

  public void setBalanceRate(String balanceRate) {
    this.balanceRate = balanceRate;
  }

  public ProductFees transactionRate(String transactionRate) {
    this.transactionRate = transactionRate;
    return this;
  }

  /**
   * A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
   * @return transactionRate
  **/
  @ApiModelProperty(value = "A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory")

  public String getTransactionRate() {
    return transactionRate;
  }

  public void setTransactionRate(String transactionRate) {
    this.transactionRate = transactionRate;
  }

  public ProductFees currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency the fee will be charged in. Assumes AUD if absent
   * @return currency
  **/
  @ApiModelProperty(value = "The currency the fee will be charged in. Assumes AUD if absent")

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ProductFees additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

  /**
   * Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType
   * @return additionalValue
  **/
  @ApiModelProperty(value = "Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType")

  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public ProductFees additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Display text providing more information on the fee
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "Display text providing more information on the fee")

  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public ProductFees additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

  /**
   * Link to a web page with more information on this fee
   * @return additionalInfoUri
  **/
  @ApiModelProperty(value = "Link to a web page with more information on this fee")

  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  public ProductFees discounts(List<ProductDiscounts> discounts) {
    this.discounts = discounts;
    return this;
  }

  public ProductFees addDiscountsItem(ProductDiscounts discountsItem) {
    if (this.discounts == null) {
      this.discounts = new ArrayList<ProductDiscounts>();
    }
    this.discounts.add(discountsItem);
    return this;
  }

  /**
   * Get discounts
   * @return discounts
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ProductDiscounts> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<ProductDiscounts> discounts) {
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
    ProductFees productFees = (ProductFees) o;
    return Objects.equals(this.name, productFees.name) &&
        Objects.equals(this.feeType, productFees.feeType) &&
        Objects.equals(this.amount, productFees.amount) &&
        Objects.equals(this.balanceRate, productFees.balanceRate) &&
        Objects.equals(this.transactionRate, productFees.transactionRate) &&
        Objects.equals(this.currency, productFees.currency) &&
        Objects.equals(this.additionalValue, productFees.additionalValue) &&
        Objects.equals(this.additionalInfo, productFees.additionalInfo) &&
        Objects.equals(this.additionalInfoUri, productFees.additionalInfoUri) &&
        Objects.equals(this.discounts, productFees.discounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, feeType, amount, balanceRate, transactionRate, currency, additionalValue, additionalInfo, additionalInfoUri, discounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductFees {\n");
    
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
