package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2019-02-14T03:34:59.075Z[GMT]")public class Transaction   {
  private String accountId = null;
  private String transactionId = null;
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
  }
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
  }
  private StatusEnum status = null;
  private String description = null;
  private String postingDateTime = null;
  private String valueDateTime = null;
  private String executionDateTime = null;
  private String amount = null;
  private String currency = null;
  private String reference = null;
  private String merchantName = null;
  private String merchantCategoryCode = null;
  private String billerCode = null;
  private String billerName = null;
  private String crn = null;
  private String apcaNumber = null;

  /**
   * A unique ID of the account adhering to the standards for ID permanence
   **/
  
  @Schema(required = true, description = "A unique ID of the account adhering to the standards for ID permanence")
  @JsonProperty("accountId")
  @NotNull
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * A unique ID of the transaction adhering to the standards for ID permanence. This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type
   **/
  
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
  
  @Schema(required = true, description = "True if extended information is available using the transaction detail end point. False if extended data is not available")
  @JsonProperty("isDetailAvailable")
  @NotNull
  public Boolean isisIsDetailAvailable() {
    return isDetailAvailable;
  }
  public void setIsDetailAvailable(Boolean isDetailAvailable) {
    this.isDetailAvailable = isDetailAvailable;
  }

  /**
   * The type of the transaction
   **/
  
  @Schema(required = true, description = "The type of the transaction")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Status of the transaction whether pending or posted.  Note that there is currently no provision in the standards to gaurantee the ability to correlate a pending transaction with an associated posted transaction
   **/
  
  @Schema(required = true, description = "Status of the transaction whether pending or posted.  Note that there is currently no provision in the standards to gaurantee the ability to correlate a pending transaction with an associated posted transaction")
  @JsonProperty("status")
  @NotNull
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The transaction description as applied by the financial institution
   **/
  
  @Schema(required = true, description = "The transaction description as applied by the financial institution")
  @JsonProperty("description")
  @NotNull
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The time the transaction was posted. This field is mandatory if the transaction has status POSTED. This is the time that appears on a standard statement
   **/
  
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
  
  @Schema(required = true, description = "The reference for the transaction provided by the originating institution.  Empty string if no data provided")
  @JsonProperty("reference")
  @NotNull
  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * Name of the merchant for an outgoing payment to a merchant
   **/
  
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
  
  @Schema(description = "6 Digit APCA number for the initiating institution")
  @JsonProperty("apcaNumber")
  public String getApcaNumber() {
    return apcaNumber;
  }
  public void setApcaNumber(String apcaNumber) {
    this.apcaNumber = apcaNumber;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
