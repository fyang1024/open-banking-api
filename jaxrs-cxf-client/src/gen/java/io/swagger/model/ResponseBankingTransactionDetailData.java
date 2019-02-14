package io.swagger.model;

import io.swagger.model.TransactionDetail;
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

public class ResponseBankingTransactionDetailData  {
  
  @Schema(description = "ID of the account for which transactions are provided")
 /**
   * ID of the account for which transactions are provided  
  **/
  private String accountId = null;
  
  @Schema(description = "The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type.")
 /**
   * The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type.  
  **/
  private String displayName = null;
  
  @Schema(description = "A customer supplied nick name for the account")
 /**
   * A customer supplied nick name for the account  
  **/
  private String nickname = null;
  
  @Schema(description = "")
  private List<TransactionDetail> transaction = null;
 /**
   * ID of the account for which transactions are provided
   * @return accountId
  **/
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public ResponseBankingTransactionDetailData accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type.
   * @return displayName
  **/
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ResponseBankingTransactionDetailData displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

 /**
   * A customer supplied nick name for the account
   * @return nickname
  **/
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public ResponseBankingTransactionDetailData nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

 /**
   * Get transaction
   * @return transaction
  **/
  @JsonProperty("transaction")
  public List<TransactionDetail> getTransaction() {
    return transaction;
  }

  public void setTransaction(List<TransactionDetail> transaction) {
    this.transaction = transaction;
  }

  public ResponseBankingTransactionDetailData transaction(List<TransactionDetail> transaction) {
    this.transaction = transaction;
    return this;
  }

  public ResponseBankingTransactionDetailData addTransactionItem(TransactionDetail transactionItem) {
    this.transaction.add(transactionItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingTransactionDetailData {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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
