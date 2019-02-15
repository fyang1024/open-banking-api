package org.openbank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Balance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class Balance   {
  @JsonProperty("accountId")
  private String accountId;

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

    @JsonCreator
    public static BalanceUTypeEnum fromValue(String text) {
      for (BalanceUTypeEnum b : BalanceUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("balanceUType")
  private BalanceUTypeEnum balanceUType;

  @JsonProperty("deposit")
  private DepositBalance deposit = null;

  @JsonProperty("lending")
  private LendingBalance lending = null;

  @JsonProperty("purses")
  @Valid
  private List<CurrencyAmount> purses = null;

  public Balance accountId(String accountId) {
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

  public Balance balanceUType(BalanceUTypeEnum balanceUType) {
    this.balanceUType = balanceUType;
    return this;
  }

  /**
   * The type of balance object provided for the account
   * @return balanceUType
  */
  @ApiModelProperty(required = true, value = "The type of balance object provided for the account")
  @NotNull


  public BalanceUTypeEnum getBalanceUType() {
    return balanceUType;
  }

  public void setBalanceUType(BalanceUTypeEnum balanceUType) {
    this.balanceUType = balanceUType;
  }

  public Balance deposit(DepositBalance deposit) {
    this.deposit = deposit;
    return this;
  }

  /**
   * Get deposit
   * @return deposit
  */
  @ApiModelProperty(value = "")

  @Valid

  public DepositBalance getDeposit() {
    return deposit;
  }

  public void setDeposit(DepositBalance deposit) {
    this.deposit = deposit;
  }

  public Balance lending(LendingBalance lending) {
    this.lending = lending;
    return this;
  }

  /**
   * Get lending
   * @return lending
  */
  @ApiModelProperty(value = "")

  @Valid

  public LendingBalance getLending() {
    return lending;
  }

  public void setLending(LendingBalance lending) {
    this.lending = lending;
  }

  public Balance purses(List<CurrencyAmount> purses) {
    this.purses = purses;
    return this;
  }

  public Balance addPursesItem(CurrencyAmount pursesItem) {
    if (this.purses == null) {
      this.purses = new ArrayList<>();
    }
    this.purses.add(pursesItem);
    return this;
  }

  /**
   * Get purses
   * @return purses
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CurrencyAmount> getPurses() {
    return purses;
  }

  public void setPurses(List<CurrencyAmount> purses) {
    this.purses = purses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.accountId, balance.accountId) &&
        Objects.equals(this.balanceUType, balance.balanceUType) &&
        Objects.equals(this.deposit, balance.deposit) &&
        Objects.equals(this.lending, balance.lending) &&
        Objects.equals(this.purses, balance.purses);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

