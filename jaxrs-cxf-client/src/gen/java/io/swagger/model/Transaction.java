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

public class Transaction  {
  
  @Schema(required = true, description = "A unique ID of the account adhering to the standards for ID permanence")
 /**
   * A unique ID of the account adhering to the standards for ID permanence  
  **/
  private String accountId = null;
  
  @Schema(description = "A unique ID of the transaction adhering to the standards for ID permanence. This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type")
 /**
   * A unique ID of the transaction adhering to the standards for ID permanence. This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type  
  **/
  private String transactionId = null;
  
  @Schema(required = true, description = "True if extended information is available using the transaction detail end point. False if extended data is not available")
 /**
   * True if extended information is available using the transaction detail end point. False if extended data is not available  
  **/
  private Boolean isDetailAvailable = null;
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
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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
  @Schema(required = true, description = "The type of the transaction")
 /**
   * The type of the transaction  
  **/
  private TypeEnum type = null;
  public enum StatusEnum {
    PENDING("PENDING"),
    POSTED("POSTED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(required = true, description = "Status of the transaction whether pending or posted.  Note that there is currently no provision in the standards to gaurantee the ability to correlate a pending transaction with an associated posted transaction")
 /**
   * Status of the transaction whether pending or posted.  Note that there is currently no provision in the standards to gaurantee the ability to correlate a pending transaction with an associated posted transaction  
  **/
  private StatusEnum status = null;
  
  @Schema(required = true, description = "The transaction description as applied by the financial institution")
 /**
   * The transaction description as applied by the financial institution  
  **/
  private String description = null;
  
  @Schema(description = "The time the transaction was posted. This field is mandatory if the transaction has status POSTED. This is the time that appears on a standard statement")
 /**
   * The time the transaction was posted. This field is mandatory if the transaction has status POSTED. This is the time that appears on a standard statement  
  **/
  private String postingDateTime = null;
  
  @Schema(description = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry")
 /**
   * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry  
  **/
  private String valueDateTime = null;
  
  @Schema(description = "The time the transaction was executed by the originating customer, if available")
 /**
   * The time the transaction was executed by the originating customer, if available  
  **/
  private String executionDateTime = null;
  
  @Schema(description = "The value of the transaction. Negative values mean money was outgoing from the account")
 /**
   * The value of the transaction. Negative values mean money was outgoing from the account  
  **/
  private String amount = null;
  
  @Schema(description = "The currency for the transaction amount. AUD assumed if not present")
 /**
   * The currency for the transaction amount. AUD assumed if not present  
  **/
  private String currency = null;
  
  @Schema(required = true, description = "The reference for the transaction provided by the originating institution.  Empty string if no data provided")
 /**
   * The reference for the transaction provided by the originating institution.  Empty string if no data provided  
  **/
  private String reference = null;
  
  @Schema(description = "Name of the merchant for an outgoing payment to a merchant")
 /**
   * Name of the merchant for an outgoing payment to a merchant  
  **/
  private String merchantName = null;
  
  @Schema(description = "The merchant category code (or MCC) for an outgoing payment to a merchant")
 /**
   * The merchant category code (or MCC) for an outgoing payment to a merchant  
  **/
  private String merchantCategoryCode = null;
  
  @Schema(description = "BPay Biller Code for the transaction (if available)")
 /**
   * BPay Biller Code for the transaction (if available)  
  **/
  private String billerCode = null;
  
  @Schema(description = "Name of the BPay biller for the transaction (if available)")
 /**
   * Name of the BPay biller for the transaction (if available)  
  **/
  private String billerName = null;
  
  @Schema(description = "BPay CRN for the transaction (if available)")
 /**
   * BPay CRN for the transaction (if available)  
  **/
  private String crn = null;
  
  @Schema(description = "6 Digit APCA number for the initiating institution")
 /**
   * 6 Digit APCA number for the initiating institution  
  **/
  private String apcaNumber = null;
 /**
   * A unique ID of the account adhering to the standards for ID permanence
   * @return accountId
  **/
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Transaction accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * A unique ID of the transaction adhering to the standards for ID permanence. This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type
   * @return transactionId
  **/
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Transaction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

 /**
   * True if extended information is available using the transaction detail end point. False if extended data is not available
   * @return isDetailAvailable
  **/
  @JsonProperty("isDetailAvailable")
  public Boolean isisIsDetailAvailable() {
    return isDetailAvailable;
  }

  public void setIsDetailAvailable(Boolean isDetailAvailable) {
    this.isDetailAvailable = isDetailAvailable;
  }

  public Transaction isDetailAvailable(Boolean isDetailAvailable) {
    this.isDetailAvailable = isDetailAvailable;
    return this;
  }

 /**
   * The type of the transaction
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.getValue();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Transaction type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Status of the transaction whether pending or posted.  Note that there is currently no provision in the standards to gaurantee the ability to correlate a pending transaction with an associated posted transaction
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.getValue();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Transaction status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * The transaction description as applied by the financial institution
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Transaction description(String description) {
    this.description = description;
    return this;
  }

 /**
   * The time the transaction was posted. This field is mandatory if the transaction has status POSTED. This is the time that appears on a standard statement
   * @return postingDateTime
  **/
  @JsonProperty("postingDateTime")
  public String getPostingDateTime() {
    return postingDateTime;
  }

  public void setPostingDateTime(String postingDateTime) {
    this.postingDateTime = postingDateTime;
  }

  public Transaction postingDateTime(String postingDateTime) {
    this.postingDateTime = postingDateTime;
    return this;
  }

 /**
   * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry
   * @return valueDateTime
  **/
  @JsonProperty("valueDateTime")
  public String getValueDateTime() {
    return valueDateTime;
  }

  public void setValueDateTime(String valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public Transaction valueDateTime(String valueDateTime) {
    this.valueDateTime = valueDateTime;
    return this;
  }

 /**
   * The time the transaction was executed by the originating customer, if available
   * @return executionDateTime
  **/
  @JsonProperty("executionDateTime")
  public String getExecutionDateTime() {
    return executionDateTime;
  }

  public void setExecutionDateTime(String executionDateTime) {
    this.executionDateTime = executionDateTime;
  }

  public Transaction executionDateTime(String executionDateTime) {
    this.executionDateTime = executionDateTime;
    return this;
  }

 /**
   * The value of the transaction. Negative values mean money was outgoing from the account
   * @return amount
  **/
  @JsonProperty("amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Transaction amount(String amount) {
    this.amount = amount;
    return this;
  }

 /**
   * The currency for the transaction amount. AUD assumed if not present
   * @return currency
  **/
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Transaction currency(String currency) {
    this.currency = currency;
    return this;
  }

 /**
   * The reference for the transaction provided by the originating institution.  Empty string if no data provided
   * @return reference
  **/
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Transaction reference(String reference) {
    this.reference = reference;
    return this;
  }

 /**
   * Name of the merchant for an outgoing payment to a merchant
   * @return merchantName
  **/
  @JsonProperty("merchantName")
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public Transaction merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

 /**
   * The merchant category code (or MCC) for an outgoing payment to a merchant
   * @return merchantCategoryCode
  **/
  @JsonProperty("merchantCategoryCode")
  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  public Transaction merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

 /**
   * BPay Biller Code for the transaction (if available)
   * @return billerCode
  **/
  @JsonProperty("billerCode")
  public String getBillerCode() {
    return billerCode;
  }

  public void setBillerCode(String billerCode) {
    this.billerCode = billerCode;
  }

  public Transaction billerCode(String billerCode) {
    this.billerCode = billerCode;
    return this;
  }

 /**
   * Name of the BPay biller for the transaction (if available)
   * @return billerName
  **/
  @JsonProperty("billerName")
  public String getBillerName() {
    return billerName;
  }

  public void setBillerName(String billerName) {
    this.billerName = billerName;
  }

  public Transaction billerName(String billerName) {
    this.billerName = billerName;
    return this;
  }

 /**
   * BPay CRN for the transaction (if available)
   * @return crn
  **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  public void setCrn(String crn) {
    this.crn = crn;
  }

  public Transaction crn(String crn) {
    this.crn = crn;
    return this;
  }

 /**
   * 6 Digit APCA number for the initiating institution
   * @return apcaNumber
  **/
  @JsonProperty("apcaNumber")
  public String getApcaNumber() {
    return apcaNumber;
  }

  public void setApcaNumber(String apcaNumber) {
    this.apcaNumber = apcaNumber;
  }

  public Transaction apcaNumber(String apcaNumber) {
    this.apcaNumber = apcaNumber;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
