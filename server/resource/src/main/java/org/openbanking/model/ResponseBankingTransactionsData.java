package org.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseBankingTransactionsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class ResponseBankingTransactionsData   {
  @JsonProperty("accountId")
  private String accountId;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("nickname")
  private String nickname;

  @JsonProperty("transactions")
  @Valid
  private List<Transaction> transactions = new ArrayList<>();

  public ResponseBankingTransactionsData accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * ID of the account for which transactions are provided
   * @return accountId
  */
  @ApiModelProperty(value = "ID of the account for which transactions are provided")


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public ResponseBankingTransactionsData displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type.
   * @return displayName
  */
  @ApiModelProperty(value = "The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type.")


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ResponseBankingTransactionsData nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * A customer supplied nick name for the account
   * @return nickname
  */
  @ApiModelProperty(value = "A customer supplied nick name for the account")


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public ResponseBankingTransactionsData transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public ResponseBankingTransactionsData addTransactionsItem(Transaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Get transactions
   * @return transactions
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

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
    return Objects.equals(this.accountId, responseBankingTransactionsData.accountId) &&
        Objects.equals(this.displayName, responseBankingTransactionsData.displayName) &&
        Objects.equals(this.nickname, responseBankingTransactionsData.nickname) &&
        Objects.equals(this.transactions, responseBankingTransactionsData.transactions);
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

