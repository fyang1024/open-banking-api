package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.CurrencyAmount;
import io.swagger.model.DepositBalance;
import io.swagger.model.LendingBalance;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2019-02-14T03:34:59.075Z[GMT]")public class Balance   {
  private String accountId = null;
  /**
   * The type of balance object provided for the account
   */
  public enum BalanceUTypeEnum {
    DEPOSIT("deposit"),

        LENDING("lending"),

        PURSES("purses");
    private String value;

    BalanceUTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private BalanceUTypeEnum balanceUType = null;
  private DepositBalance deposit = null;
  private LendingBalance lending = null;
  private List<CurrencyAmount> purses = new ArrayList<CurrencyAmount>();

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
   * The type of balance object provided for the account
   **/
  
  @Schema(required = true, description = "The type of balance object provided for the account")
  @JsonProperty("balanceUType")
  @NotNull
  public BalanceUTypeEnum getBalanceUType() {
    return balanceUType;
  }
  public void setBalanceUType(BalanceUTypeEnum balanceUType) {
    this.balanceUType = balanceUType;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("deposit")
  public DepositBalance getDeposit() {
    return deposit;
  }
  public void setDeposit(DepositBalance deposit) {
    this.deposit = deposit;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("lending")
  public LendingBalance getLending() {
    return lending;
  }
  public void setLending(LendingBalance lending) {
    this.lending = lending;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("purses")
  public List<CurrencyAmount> getPurses() {
    return purses;
  }
  public void setPurses(List<CurrencyAmount> purses) {
    this.purses = purses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(accountId, balance.accountId) &&
        Objects.equals(balanceUType, balance.balanceUType) &&
        Objects.equals(deposit, balance.deposit) &&
        Objects.equals(lending, balance.lending) &&
        Objects.equals(purses, balance.purses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, balanceUType, deposit, lending, purses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    balanceUType: ").append(toIndentedString(balanceUType)).append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    lending: ").append(toIndentedString(lending)).append("\n");
    sb.append("    purses: ").append(toIndentedString(purses)).append("\n");
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
