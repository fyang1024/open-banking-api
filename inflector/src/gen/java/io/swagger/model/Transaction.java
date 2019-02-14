package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class Transaction   {
  @JsonProperty("accountId")
  private String accountId = null;
  @JsonProperty("transactionId")
  private String transactionId = null;
  @JsonProperty("isDetailAvailable")
  private Boolean isDetailAvailable = null;
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
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;
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
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;
  @JsonProperty("description")
  private String description = null;
  @JsonProperty("postingDateTime")
  private String postingDateTime = null;
  @JsonProperty("valueDateTime")
  private String valueDateTime = null;
  @JsonProperty("executionDateTime")
  private String executionDateTime = null;
  @JsonProperty("amount")
  private String amount = null;
  @JsonProperty("currency")
  private String currency = null;
  @JsonProperty("reference")
  private String reference = null;
  @JsonProperty("merchantName")
  private String merchantName = null;
  @JsonProperty("merchantCategoryCode")
  private String merchantCategoryCode = null;
  @JsonProperty("billerCode")
  private String billerCode = null;
  @JsonProperty("billerName")
  private String billerName = null;
  @JsonProperty("crn")
  private String crn = null;
  @JsonProperty("apcaNumber")
  private String apcaNumber = null;
  /**
   * A unique ID of the account adhering to the standards for ID permanence
   **/
  public Transaction accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  
  @Schema(required = true, description = "A unique ID of the account adhering to the standards for ID permanence")
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * A unique ID of the transaction adhering to the standards for ID permanence. This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type
   **/
  public Transaction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  
  @Schema(description = "A unique ID of the transaction adhering to the standards for ID permanence. This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type")
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * True if extended information is available using the transaction detail end point. False if extended data is not available
   **/
  public Transaction isDetailAvailable(Boolean isDetailAvailable) {
    this.isDetailAvailable = isDetailAvailable;
    return this;
  }

  
  @Schema(required = true, description = "True if extended information is available using the transaction detail end point. False if extended data is not available")
  @JsonProperty("isDetailAvailable")
  public Boolean isIsDetailAvailable() {
    return isDetailAvailable;
  }
  public void setIsDetailAvailable(Boolean isDetailAvailable) {
    this.isDetailAvailable = isDetailAvailable;
  }

  /**
   * The type of the transaction
   **/
  public Transaction type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @Schema(required = true, description = "The type of the transaction")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Status of the transaction whether pending or posted.  Note that there is currently no provision in the standards to gaurantee the ability to correlate a pending transaction with an associated posted transaction
   **/
  public Transaction status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @Schema(required = true, description = "Status of the transaction whether pending or posted.  Note that there is currently no provision in the standards to gaurantee the ability to correlate a pending transaction with an associated posted transaction")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The transaction description as applied by the financial institution
   **/
  public Transaction description(String description) {
    this.description = description;
    return this;
  }

  
  @Schema(required = true, description = "The transaction description as applied by the financial institution")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The time the transaction was posted. This field is mandatory if the transaction has status POSTED. This is the time that appears on a standard statement
   **/
  public Transaction postingDateTime(String postingDateTime) {
    this.postingDateTime = postingDateTime;
    return this;
  }

  
  @Schema(description = "The time the transaction was posted. This field is mandatory if the transaction has status POSTED. This is the time that appears on a standard statement")
  @JsonProperty("postingDateTime")
  public String getPostingDateTime() {
    return postingDateTime;
  }
  public void setPostingDateTime(String postingDateTime) {
    this.postingDateTime = postingDateTime;
  }

  /**
   * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry
   **/
  public Transaction valueDateTime(String valueDateTime) {
    this.valueDateTime = valueDateTime;
    return this;
  }

  
  @Schema(description = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry")
  @JsonProperty("valueDateTime")
  public String getValueDateTime() {
    return valueDateTime;
  }
  public void setValueDateTime(String valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  /**
   * The time the transaction was executed by the originating customer, if available
   **/
  public Transaction executionDateTime(String executionDateTime) {
    this.executionDateTime = executionDateTime;
    return this;
  }

  
  @Schema(description = "The time the transaction was executed by the originating customer, if available")
  @JsonProperty("executionDateTime")
  public String getExecutionDateTime() {
    return executionDateTime;
  }
  public void setExecutionDateTime(String executionDateTime) {
    this.executionDateTime = executionDateTime;
  }

  /**
   * The value of the transaction. Negative values mean money was outgoing from the account
   **/
  public Transaction amount(String amount) {
    this.amount = amount;
    return this;
  }

  
  @Schema(description = "The value of the transaction. Negative values mean money was outgoing from the account")
  @JsonProperty("amount")
  public String getAmount() {
    return amount;
  }
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * The currency for the transaction amount. AUD assumed if not present
   **/
  public Transaction currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  @Schema(description = "The currency for the transaction amount. AUD assumed if not present")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The reference for the transaction provided by the originating institution.  Empty string if no data provided
   **/
  public Transaction reference(String reference) {
    this.reference = reference;
    return this;
  }

  
  @Schema(required = true, description = "The reference for the transaction provided by the originating institution.  Empty string if no data provided")
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * Name of the merchant for an outgoing payment to a merchant
   **/
  public Transaction merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

  
  @Schema(description = "Name of the merchant for an outgoing payment to a merchant")
  @JsonProperty("merchantName")
  public String getMerchantName() {
    return merchantName;
  }
  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  /**
   * The merchant category code (or MCC) for an outgoing payment to a merchant
   **/
  public Transaction merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  
  @Schema(description = "The merchant category code (or MCC) for an outgoing payment to a merchant")
  @JsonProperty("merchantCategoryCode")
  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }
  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  /**
   * BPay Biller Code for the transaction (if available)
   **/
  public Transaction billerCode(String billerCode) {
    this.billerCode = billerCode;
    return this;
  }

  
  @Schema(description = "BPay Biller Code for the transaction (if available)")
  @JsonProperty("billerCode")
  public String getBillerCode() {
    return billerCode;
  }
  public void setBillerCode(String billerCode) {
    this.billerCode = billerCode;
  }

  /**
   * Name of the BPay biller for the transaction (if available)
   **/
  public Transaction billerName(String billerName) {
    this.billerName = billerName;
    return this;
  }

  
  @Schema(description = "Name of the BPay biller for the transaction (if available)")
  @JsonProperty("billerName")
  public String getBillerName() {
    return billerName;
  }
  public void setBillerName(String billerName) {
    this.billerName = billerName;
  }

  /**
   * BPay CRN for the transaction (if available)
   **/
  public Transaction crn(String crn) {
    this.crn = crn;
    return this;
  }

  
  @Schema(description = "BPay CRN for the transaction (if available)")
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * 6 Digit APCA number for the initiating institution
   **/
  public Transaction apcaNumber(String apcaNumber) {
    this.apcaNumber = apcaNumber;
    return this;
  }

  
  @Schema(description = "6 Digit APCA number for the initiating institution")
  @JsonProperty("apcaNumber")
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
    return Objects.equals(accountId, transaction.accountId) &&
        Objects.equals(transactionId, transaction.transactionId) &&
        Objects.equals(isDetailAvailable, transaction.isDetailAvailable) &&
        Objects.equals(type, transaction.type) &&
        Objects.equals(status, transaction.status) &&
        Objects.equals(description, transaction.description) &&
        Objects.equals(postingDateTime, transaction.postingDateTime) &&
        Objects.equals(valueDateTime, transaction.valueDateTime) &&
        Objects.equals(executionDateTime, transaction.executionDateTime) &&
        Objects.equals(amount, transaction.amount) &&
        Objects.equals(currency, transaction.currency) &&
        Objects.equals(reference, transaction.reference) &&
        Objects.equals(merchantName, transaction.merchantName) &&
        Objects.equals(merchantCategoryCode, transaction.merchantCategoryCode) &&
        Objects.equals(billerCode, transaction.billerCode) &&
        Objects.equals(billerName, transaction.billerName) &&
        Objects.equals(crn, transaction.crn) &&
        Objects.equals(apcaNumber, transaction.apcaNumber);
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
