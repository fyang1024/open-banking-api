package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class DomesticPayeeAccount   {
  private String accountName = null;  private String bsb = null;  private String accountNumber = null;

  /**
   * Name of the account to pay to
   **/
  
  @Schema(required = true, description = "Name of the account to pay to")
  @JsonProperty("accountName")
  @NotNull
  public String getAccountName() {
    return accountName;
  }
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  /**
   * BSB of the account to pay to
   **/
  
  @Schema(required = true, description = "BSB of the account to pay to")
  @JsonProperty("bsb")
  @NotNull
  public String getBsb() {
    return bsb;
  }
  public void setBsb(String bsb) {
    this.bsb = bsb;
  }

  /**
   * Number of the account to pay to
   **/
  
  @Schema(required = true, description = "Number of the account to pay to")
  @JsonProperty("accountNumber")
  @NotNull
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
    return Objects.equals(accountName, domesticPayeeAccount.accountName) &&
        Objects.equals(bsb, domesticPayeeAccount.bsb) &&
        Objects.equals(accountNumber, domesticPayeeAccount.accountNumber);
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
