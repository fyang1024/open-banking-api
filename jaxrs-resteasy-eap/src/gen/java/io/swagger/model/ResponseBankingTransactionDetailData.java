package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.TransactionDetail;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2019-02-14T03:34:59.075Z[GMT]")public class ResponseBankingTransactionDetailData   {
  private String accountId = null;
  private String displayName = null;
  private String nickname = null;
  private List<TransactionDetail> transaction = new ArrayList<TransactionDetail>();

  /**
   * ID of the account for which transactions are provided
   **/
  
  @Schema(description = "ID of the account for which transactions are provided")
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type.
   **/
  
  @Schema(description = "The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type.")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * A customer supplied nick name for the account
   **/
  
  @Schema(description = "A customer supplied nick name for the account")
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("transaction")
  public List<TransactionDetail> getTransaction() {
    return transaction;
  }
  public void setTransaction(List<TransactionDetail> transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBankingTransactionDetailData responseBankingTransactionDetailData = (ResponseBankingTransactionDetailData) o;
    return Objects.equals(accountId, responseBankingTransactionDetailData.accountId) &&
        Objects.equals(displayName, responseBankingTransactionDetailData.displayName) &&
        Objects.equals(nickname, responseBankingTransactionDetailData.nickname) &&
        Objects.equals(transaction, responseBankingTransactionDetailData.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, displayName, nickname, transaction);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
