package io.swagger.model;

import io.swagger.model.CurrencyAmount;
import io.swagger.model.DepositBalance;
import io.swagger.model.LendingBalance;
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

public class Balance  {
  
  @Schema(required = true, description = "A unique ID of the account adhering to the standards for ID permanence")
 /**
   * A unique ID of the account adhering to the standards for ID permanence  
  **/
  private String accountId = null;
  public enum BalanceUTypeEnum {
    DEPOSIT("deposit"),
    LENDING("lending"),
    PURSES("purses");

    private String value;

    BalanceUTypeEnum(String value) {
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
    public static BalanceUTypeEnum fromValue(String text) {
      for (BalanceUTypeEnum b : BalanceUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(required = true, description = "The type of balance object provided for the account")
 /**
   * The type of balance object provided for the account  
  **/
  private BalanceUTypeEnum balanceUType = null;
  
  @Schema(description = "")
  private DepositBalance deposit = null;
  
  @Schema(description = "")
  private LendingBalance lending = null;
  
  @Schema(description = "")
  private List<CurrencyAmount> purses = null;
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

  public Balance accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * The type of balance object provided for the account
   * @return balanceUType
  **/
  @JsonProperty("balanceUType")
  public String getBalanceUType() {
    if (balanceUType == null) {
      return null;
    }
    return balanceUType.getValue();
  }

  public void setBalanceUType(BalanceUTypeEnum balanceUType) {
    this.balanceUType = balanceUType;
  }

  public Balance balanceUType(BalanceUTypeEnum balanceUType) {
    this.balanceUType = balanceUType;
    return this;
  }

 /**
   * Get deposit
   * @return deposit
  **/
  @JsonProperty("deposit")
  public DepositBalance getDeposit() {
    return deposit;
  }

  public void setDeposit(DepositBalance deposit) {
    this.deposit = deposit;
  }

  public Balance deposit(DepositBalance deposit) {
    this.deposit = deposit;
    return this;
  }

 /**
   * Get lending
   * @return lending
  **/
  @JsonProperty("lending")
  public LendingBalance getLending() {
    return lending;
  }

  public void setLending(LendingBalance lending) {
    this.lending = lending;
  }

  public Balance lending(LendingBalance lending) {
    this.lending = lending;
    return this;
  }

 /**
   * Get purses
   * @return purses
  **/
  @JsonProperty("purses")
  public List<CurrencyAmount> getPurses() {
    return purses;
  }

  public void setPurses(List<CurrencyAmount> purses) {
    this.purses = purses;
  }

  public Balance purses(List<CurrencyAmount> purses) {
    this.purses = purses;
    return this;
  }

  public Balance addPursesItem(CurrencyAmount pursesItem) {
    this.purses.add(pursesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
