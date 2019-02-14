package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Transaction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class ResponseBankingTransactionsData   {
  @JsonProperty("accountId")
  private String accountId = null;
  @JsonProperty("displayName")
  private String displayName = null;
  @JsonProperty("nickname")
  private String nickname = null;
  @JsonProperty("transactions")
  private List<Transaction> transactions = null;
  /**
   * ID of the account for which transactions are provided
   **/
  public ResponseBankingTransactionsData accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  
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
  public ResponseBankingTransactionsData displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
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
  public ResponseBankingTransactionsData nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  
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
  public ResponseBankingTransactionsData transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("transactions")
  public List<Transaction> getTransactions() {
    return transactions;
  }
  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBankingTransactionsData responseBankingTransactionsData = (ResponseBankingTransactionsData) o;
    return Objects.equals(accountId, responseBankingTransactionsData.accountId) &&
        Objects.equals(displayName, responseBankingTransactionsData.displayName) &&
        Objects.equals(nickname, responseBankingTransactionsData.nickname) &&
        Objects.equals(transactions, responseBankingTransactionsData.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, displayName, nickname, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingTransactionsData {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
