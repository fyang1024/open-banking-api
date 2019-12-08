package org.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/**
 * Transaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class Transaction   {
  @JsonProperty("accountId")
  private String accountId;

  @JsonProperty("transactionId")
  private String transactionId;

  @JsonProperty("isDetailAvailable")
  private Boolean isDetailAvailable;

  /**
   * The type of the transaction
   */
  public enum TypeEnum {
    FEE("FEE"),
    
    INTEREST_CHARGED("INTEREST_CHARGED"),
    
    INTEREST_PAID("INTEREST_PAID"),
    
    TRANSFER_OUTGOING("TRANSFER_OUTGOING"),
    
    TRANSFER_INCOMING("TRANSFER_INCOMING"),
    
    PAYMENT("PAYMENT"),
    
    OTHER("OTHER");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  /**
   * Status of the transaction whether pending or posted.  Note that there is currently no provision in the standards to gaurantee the ability to correlate a pending transaction with an associated posted transaction
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    POSTED("POSTED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("description")
  private String description;

  @JsonProperty("postingDateTime")
  private String postingDateTime;

  @JsonProperty("valueDateTime")
  private String valueDateTime;

  @JsonProperty("executionDateTime")
  private String executionDateTime;

  @JsonProperty("amount")
  private String amount;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("reference")
  private String reference;

  @JsonProperty("merchantName")
  private String merchantName;

  @JsonProperty("merchantCategoryCode")
  private String merchantCategoryCode;

  @JsonProperty("billerCode")
  private String billerCode;

  @JsonProperty("billerName")
  private String billerName;

  @JsonProperty("crn")
  private String crn;

  @JsonProperty("apcaNumber")
  private String apcaNumber;

  public Transaction accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique ID of the account adhering to the standards for ID permanence
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "A unique ID of the account adhering to the standards for ID permanence")
  @NotNull


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Transaction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * A unique ID of the transaction adhering to the standards for ID permanence. This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type
   * @return transactionId
  */
  @ApiModelProperty(value = "A unique ID of the transaction adhering to the standards for ID permanence. This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type")


  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Transaction isDetailAvailable(Boolean isDetailAvailable) {
    this.isDetailAvailable = isDetailAvailable;
    return this;
  }

  /**
   * True if extended information is available using the transaction detail end point. False if extended data is not available
   * @return isDetailAvailable
  */
  @ApiModelProperty(required = true, value = "True if extended information is available using the transaction detail end point. False if extended data is not available")
  @NotNull


  public Boolean getIsDetailAvailable() {
    return isDetailAvailable;
  }

  public void setIsDetailAvailable(Boolean isDetailAvailable) {
    this.isDetailAvailable = isDetailAvailable;
  }

  public Transaction type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the transaction
   * @return type
  */
  @ApiModelProperty(required = true, value = "The type of the transaction")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Transaction status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the transaction whether pending or posted.  Note that there is currently no provision in the standards to gaurantee the ability to correlate a pending transaction with an associated posted transaction
   * @return status
  */
  @ApiModelProperty(required = true, value = "Status of the transaction whether pending or posted.  Note that there is currently no provision in the standards to gaurantee the ability to correlate a pending transaction with an associated posted transaction")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Transaction description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The transaction description as applied by the financial institution
   * @return description
  */
  @ApiModelProperty(required = true, value = "The transaction description as applied by the financial institution")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Transaction postingDateTime(String postingDateTime) {
    this.postingDateTime = postingDateTime;
    return this;
  }

  /**
   * The time the transaction was posted. This field is mandatory if the transaction has status POSTED. This is the time that appears on a standard statement
   * @return postingDateTime
  */
  @ApiModelProperty(value = "The time the transaction was posted. This field is mandatory if the transaction has status POSTED. This is the time that appears on a standard statement")


  public String getPostingDateTime() {
    return postingDateTime;
  }

  public void setPostingDateTime(String postingDateTime) {
    this.postingDateTime = postingDateTime;
  }

  public Transaction valueDateTime(String valueDateTime) {
    this.valueDateTime = valueDateTime;
    return this;
  }

  /**
   * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry
   * @return valueDateTime
  */
  @ApiModelProperty(value = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry")


  public String getValueDateTime() {
    return valueDateTime;
  }

  public void setValueDateTime(String valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public Transaction executionDateTime(String executionDateTime) {
    this.executionDateTime = executionDateTime;
    return this;
  }

  /**
   * The time the transaction was executed by the originating customer, if available
   * @return executionDateTime
  */
  @ApiModelProperty(value = "The time the transaction was executed by the originating customer, if available")


  public String getExecutionDateTime() {
    return executionDateTime;
  }

  public void setExecutionDateTime(String executionDateTime) {
    this.executionDateTime = executionDateTime;
  }

  public Transaction amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The value of the transaction. Negative values mean money was outgoing from the account
   * @return amount
  */
  @ApiModelProperty(value = "The value of the transaction. Negative values mean money was outgoing from the account")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Transaction currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency for the transaction amount. AUD assumed if not present
   * @return currency
  */
  @ApiModelProperty(value = "The currency for the transaction amount. AUD assumed if not present")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Transaction reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * The reference for the transaction provided by the originating institution.  Empty string if no data provided
   * @return reference
  */
  @ApiModelProperty(required = true, value = "The reference for the transaction provided by the originating institution.  Empty string if no data provided")
  @NotNull


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Transaction merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

  /**
   * Name of the merchant for an outgoing payment to a merchant
   * @return merchantName
  */
  @ApiModelProperty(value = "Name of the merchant for an outgoing payment to a merchant")


  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public Transaction merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  /**
   * The merchant category code (or MCC) for an outgoing payment to a merchant
   * @return merchantCategoryCode
  */
  @ApiModelProperty(value = "The merchant category code (or MCC) for an outgoing payment to a merchant")


  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  public Transaction billerCode(String billerCode) {
    this.billerCode = billerCode;
    return this;
  }

  /**
   * BPay Biller Code for the transaction (if available)
   * @return billerCode
  */
  @ApiModelProperty(value = "BPay Biller Code for the transaction (if available)")


  public String getBillerCode() {
    return billerCode;
  }

  public void setBillerCode(String billerCode) {
    this.billerCode = billerCode;
  }

  public Transaction billerName(String billerName) {
    this.billerName = billerName;
    return this;
  }

  /**
   * Name of the BPay biller for the transaction (if available)
   * @return billerName
  */
  @ApiModelProperty(value = "Name of the BPay biller for the transaction (if available)")


  public String getBillerName() {
    return billerName;
  }

  public void setBillerName(String billerName) {
    this.billerName = billerName;
  }

  public Transaction crn(String crn) {
    this.crn = crn;
    return this;
  }

  /**
   * BPay CRN for the transaction (if available)
   * @return crn
  */
  @ApiModelProperty(value = "BPay CRN for the transaction (if available)")


  public String getCrn() {
    return crn;
  }

  public void setCrn(String crn) {
    this.crn = crn;
  }

  public Transaction apcaNumber(String apcaNumber) {
    this.apcaNumber = apcaNumber;
    return this;
  }

  /**
   * 6 Digit APCA number for the initiating institution
   * @return apcaNumber
  */
  @ApiModelProperty(value = "6 Digit APCA number for the initiating institution")


  public String getApcaNumber() {
    return apcaNumber;
  }

  public void setApcaNumber(String apcaNumber) {
    this.apcaNumber = apcaNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.accountId, transaction.accountId) &&
        Objects.equals(this.transactionId, transaction.transactionId) &&
        Objects.equals(this.isDetailAvailable, transaction.isDetailAvailable) &&
        Objects.equals(this.type, transaction.type) &&
        Objects.equals(this.status, transaction.status) &&
        Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.postingDateTime, transaction.postingDateTime) &&
        Objects.equals(this.valueDateTime, transaction.valueDateTime) &&
        Objects.equals(this.executionDateTime, transaction.executionDateTime) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.currency, transaction.currency) &&
        Objects.equals(this.reference, transaction.reference) &&
        Objects.equals(this.merchantName, transaction.merchantName) &&
        Objects.equals(this.merchantCategoryCode, transaction.merchantCategoryCode) &&
        Objects.equals(this.billerCode, transaction.billerCode) &&
        Objects.equals(this.billerName, transaction.billerName) &&
        Objects.equals(this.crn, transaction.crn) &&
        Objects.equals(this.apcaNumber, transaction.apcaNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, transactionId, isDetailAvailable, type, status, description, postingDateTime, valueDateTime, executionDateTime, amount, currency, reference, merchantName, merchantCategoryCode, billerCode, billerName, crn, apcaNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    isDetailAvailable: ").append(toIndentedString(isDetailAvailable)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    postingDateTime: ").append(toIndentedString(postingDateTime)).append("\n");
    sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
    sb.append("    executionDateTime: ").append(toIndentedString(executionDateTime)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    billerCode: ").append(toIndentedString(billerCode)).append("\n");
    sb.append("    billerName: ").append(toIndentedString(billerName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    apcaNumber: ").append(toIndentedString(apcaNumber)).append("\n");
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

