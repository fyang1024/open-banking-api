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

public class DomesticPayeeAccount  {
  
  @Schema(required = true, description = "Name of the account to pay to")
 /**
   * Name of the account to pay to  
  **/
  private String accountName = null;
  
  @Schema(required = true, description = "BSB of the account to pay to")
 /**
   * BSB of the account to pay to  
  **/
  private String bsb = null;
  
  @Schema(required = true, description = "Number of the account to pay to")
 /**
   * Number of the account to pay to  
  **/
  private String accountNumber = null;
 /**
   * Name of the account to pay to
   * @return accountName
  **/
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public DomesticPayeeAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

 /**
   * BSB of the account to pay to
   * @return bsb
  **/
  @JsonProperty("bsb")
  public String getBsb() {
    return bsb;
  }

  public void setBsb(String bsb) {
    this.bsb = bsb;
  }

  public DomesticPayeeAccount bsb(String bsb) {
    this.bsb = bsb;
    return this;
  }

 /**
   * Number of the account to pay to
   * @return accountNumber
  **/
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public DomesticPayeeAccount accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
