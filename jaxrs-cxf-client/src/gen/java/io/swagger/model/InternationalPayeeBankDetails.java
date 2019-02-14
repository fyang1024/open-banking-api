package io.swagger.model;

import io.swagger.model.InternationalPayeeBankDetailsBankAddress;

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

public class InternationalPayeeBankDetails  {
  
  @Schema(description = "Country of the recipient institution. A valid ISO 3166 Alpha-3 country code")
 /**
   * Country of the recipient institution. A valid ISO 3166 Alpha-3 country code  
  **/
  private String country = null;
  
  @Schema(description = "Account Targeted for payment")
 /**
   * Account Targeted for payment  
  **/
  private String accountNumber = null;
  
  @Schema(description = "")
  private InternationalPayeeBankDetailsBankAddress bankAddress = null;
  
  @Schema(description = "Swift bank code.  Aligns with standard [ISO 9362](https://www.iso.org/standard/60390.html)")
 /**
   * Swift bank code.  Aligns with standard [ISO 9362](https://www.iso.org/standard/60390.html)  
  **/
  private String beneficiaryBankBIC = null;
  
  @Schema(description = "Number for Fedwire payment (Federal Reserve Wire Network)")
 /**
   * Number for Fedwire payment (Federal Reserve Wire Network)  
  **/
  private String fedWireNumber = null;
  
  @Schema(description = "Sort code used for account identification in some jurisdictions")
 /**
   * Sort code used for account identification in some jurisdictions  
  **/
  private String sortCode = null;
  
  @Schema(description = "Number for the Clearing House Interbank Payments System")
 /**
   * Number for the Clearing House Interbank Payments System  
  **/
  private String chipNumber = null;
  
  @Schema(description = "International bank routing number")
 /**
   * International bank routing number  
  **/
  private String routingNumber = null;
  
  @Schema(description = "The legal entity identifier (LEI) for the beneficiary.  Aligns with [ISO 17442](https://www.iso.org/standard/59771.html)")
 /**
   * The legal entity identifier (LEI) for the beneficiary.  Aligns with [ISO 17442](https://www.iso.org/standard/59771.html)  
  **/
  private String legalEntityIdentifier = null;
 /**
   * Country of the recipient institution. A valid ISO 3166 Alpha-3 country code
   * @return country
  **/
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public InternationalPayeeBankDetails country(String country) {
    this.country = country;
    return this;
  }

 /**
   * Account Targeted for payment
   * @return accountNumber
  **/
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public InternationalPayeeBankDetails accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

 /**
   * Get bankAddress
   * @return bankAddress
  **/
  @JsonProperty("bankAddress")
  public InternationalPayeeBankDetailsBankAddress getBankAddress() {
    return bankAddress;
  }

  public void setBankAddress(InternationalPayeeBankDetailsBankAddress bankAddress) {
    this.bankAddress = bankAddress;
  }

  public InternationalPayeeBankDetails bankAddress(InternationalPayeeBankDetailsBankAddress bankAddress) {
    this.bankAddress = bankAddress;
    return this;
  }

 /**
   * Swift bank code.  Aligns with standard [ISO 9362](https://www.iso.org/standard/60390.html)
   * @return beneficiaryBankBIC
  **/
  @JsonProperty("beneficiaryBankBIC")
  public String getBeneficiaryBankBIC() {
    return beneficiaryBankBIC;
  }

  public void setBeneficiaryBankBIC(String beneficiaryBankBIC) {
    this.beneficiaryBankBIC = beneficiaryBankBIC;
  }

  public InternationalPayeeBankDetails beneficiaryBankBIC(String beneficiaryBankBIC) {
    this.beneficiaryBankBIC = beneficiaryBankBIC;
    return this;
  }

 /**
   * Number for Fedwire payment (Federal Reserve Wire Network)
   * @return fedWireNumber
  **/
  @JsonProperty("fedWireNumber")
  public String getFedWireNumber() {
    return fedWireNumber;
  }

  public void setFedWireNumber(String fedWireNumber) {
    this.fedWireNumber = fedWireNumber;
  }

  public InternationalPayeeBankDetails fedWireNumber(String fedWireNumber) {
    this.fedWireNumber = fedWireNumber;
    return this;
  }

 /**
   * Sort code used for account identification in some jurisdictions
   * @return sortCode
  **/
  @JsonProperty("sortCode")
  public String getSortCode() {
    return sortCode;
  }

  public void setSortCode(String sortCode) {
    this.sortCode = sortCode;
  }

  public InternationalPayeeBankDetails sortCode(String sortCode) {
    this.sortCode = sortCode;
    return this;
  }

 /**
   * Number for the Clearing House Interbank Payments System
   * @return chipNumber
  **/
  @JsonProperty("chipNumber")
  public String getChipNumber() {
    return chipNumber;
  }

  public void setChipNumber(String chipNumber) {
    this.chipNumber = chipNumber;
  }

  public InternationalPayeeBankDetails chipNumber(String chipNumber) {
    this.chipNumber = chipNumber;
    return this;
  }

 /**
   * International bank routing number
   * @return routingNumber
  **/
  @JsonProperty("routingNumber")
  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public InternationalPayeeBankDetails routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

 /**
   * The legal entity identifier (LEI) for the beneficiary.  Aligns with [ISO 17442](https://www.iso.org/standard/59771.html)
   * @return legalEntityIdentifier
  **/
  @JsonProperty("legalEntityIdentifier")
  public String getLegalEntityIdentifier() {
    return legalEntityIdentifier;
  }

  public void setLegalEntityIdentifier(String legalEntityIdentifier) {
    this.legalEntityIdentifier = legalEntityIdentifier;
  }

  public InternationalPayeeBankDetails legalEntityIdentifier(String legalEntityIdentifier) {
    this.legalEntityIdentifier = legalEntityIdentifier;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternationalPayeeBankDetails {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bankAddress: ").append(toIndentedString(bankAddress)).append("\n");
    sb.append("    beneficiaryBankBIC: ").append(toIndentedString(beneficiaryBankBIC)).append("\n");
    sb.append("    fedWireNumber: ").append(toIndentedString(fedWireNumber)).append("\n");
    sb.append("    sortCode: ").append(toIndentedString(sortCode)).append("\n");
    sb.append("    chipNumber: ").append(toIndentedString(chipNumber)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    legalEntityIdentifier: ").append(toIndentedString(legalEntityIdentifier)).append("\n");
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
