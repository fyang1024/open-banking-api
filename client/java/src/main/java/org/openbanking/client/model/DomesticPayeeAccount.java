/*
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openbanking.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * DomesticPayeeAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-17T21:56:09.632+11:00[Australia/Sydney]")
public class DomesticPayeeAccount {
  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "accountName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_BSB = "bsb";
  @SerializedName(SERIALIZED_NAME_BSB)
  private String bsb;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public DomesticPayeeAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Name of the account to pay to
   * @return accountName
  **/
  @ApiModelProperty(required = true, value = "Name of the account to pay to")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public DomesticPayeeAccount bsb(String bsb) {
    this.bsb = bsb;
    return this;
  }

   /**
   * BSB of the account to pay to
   * @return bsb
  **/
  @ApiModelProperty(required = true, value = "BSB of the account to pay to")
  public String getBsb() {
    return bsb;
  }

  public void setBsb(String bsb) {
    this.bsb = bsb;
  }

  public DomesticPayeeAccount accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Number of the account to pay to
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "Number of the account to pay to")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomesticPayeeAccount domesticPayeeAccount = (DomesticPayeeAccount) o;
    return Objects.equals(this.accountName, domesticPayeeAccount.accountName) &&
        Objects.equals(this.bsb, domesticPayeeAccount.bsb) &&
        Objects.equals(this.accountNumber, domesticPayeeAccount.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, bsb, accountNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomesticPayeeAccount {\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    bsb: ").append(toIndentedString(bsb)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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

