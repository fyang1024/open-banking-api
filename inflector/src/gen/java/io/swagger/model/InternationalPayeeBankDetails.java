package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InternationalPayeeBankDetailsBankAddress;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class InternationalPayeeBankDetails   {
  @JsonProperty("country")
  private String country = null;
  @JsonProperty("accountNumber")
  private String accountNumber = null;
  @JsonProperty("bankAddress")
  private InternationalPayeeBankDetailsBankAddress bankAddress = null;
  @JsonProperty("beneficiaryBankBIC")
  private String beneficiaryBankBIC = null;
  @JsonProperty("fedWireNumber")
  private String fedWireNumber = null;
  @JsonProperty("sortCode")
  private String sortCode = null;
  @JsonProperty("chipNumber")
  private String chipNumber = null;
  @JsonProperty("routingNumber")
  private String routingNumber = null;
  @JsonProperty("legalEntityIdentifier")
  private String legalEntityIdentifier = null;
  /**
   * Country of the recipient institution. A valid ISO 3166 Alpha-3 country code
   **/
  public InternationalPayeeBankDetails country(String country) {
    this.country = country;
    return this;
  }

  
  @Schema(description = "Country of the recipient institution. A valid ISO 3166 Alpha-3 country code")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Account Targeted for payment
   **/
  public InternationalPayeeBankDetails accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  
  @Schema(description = "Account Targeted for payment")
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   **/
  public InternationalPayeeBankDetails bankAddress(InternationalPayeeBankDetailsBankAddress bankAddress) {
    this.bankAddress = bankAddress;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("bankAddress")
  public InternationalPayeeBankDetailsBankAddress getBankAddress() {
    return bankAddress;
  }
  public void setBankAddress(InternationalPayeeBankDetailsBankAddress bankAddress) {
    this.bankAddress = bankAddress;
  }

  /**
   * Swift bank code.  Aligns with standard [ISO 9362](https://www.iso.org/standard/60390.html)
   **/
  public InternationalPayeeBankDetails beneficiaryBankBIC(String beneficiaryBankBIC) {
    this.beneficiaryBankBIC = beneficiaryBankBIC;
    return this;
  }

  
  @Schema(description = "Swift bank code.  Aligns with standard [ISO 9362](https://www.iso.org/standard/60390.html)")
  @JsonProperty("beneficiaryBankBIC")
  public String getBeneficiaryBankBIC() {
    return beneficiaryBankBIC;
  }
  public void setBeneficiaryBankBIC(String beneficiaryBankBIC) {
    this.beneficiaryBankBIC = beneficiaryBankBIC;
  }

  /**
   * Number for Fedwire payment (Federal Reserve Wire Network)
   **/
  public InternationalPayeeBankDetails fedWireNumber(String fedWireNumber) {
    this.fedWireNumber = fedWireNumber;
    return this;
  }

  
  @Schema(description = "Number for Fedwire payment (Federal Reserve Wire Network)")
  @JsonProperty("fedWireNumber")
  public String getFedWireNumber() {
    return fedWireNumber;
  }
  public void setFedWireNumber(String fedWireNumber) {
    this.fedWireNumber = fedWireNumber;
  }

  /**
   * Sort code used for account identification in some jurisdictions
   **/
  public InternationalPayeeBankDetails sortCode(String sortCode) {
    this.sortCode = sortCode;
    return this;
  }

  
  @Schema(description = "Sort code used for account identification in some jurisdictions")
  @JsonProperty("sortCode")
  public String getSortCode() {
    return sortCode;
  }
  public void setSortCode(String sortCode) {
    this.sortCode = sortCode;
  }

  /**
   * Number for the Clearing House Interbank Payments System
   **/
  public InternationalPayeeBankDetails chipNumber(String chipNumber) {
    this.chipNumber = chipNumber;
    return this;
  }

  
  @Schema(description = "Number for the Clearing House Interbank Payments System")
  @JsonProperty("chipNumber")
  public String getChipNumber() {
    return chipNumber;
  }
  public void setChipNumber(String chipNumber) {
    this.chipNumber = chipNumber;
  }

  /**
   * International bank routing number
   **/
  public InternationalPayeeBankDetails routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

  
  @Schema(description = "International bank routing number")
  @JsonProperty("routingNumber")
  public String getRoutingNumber() {
    return routingNumber;
  }
  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  /**
   * The legal entity identifier (LEI) for the beneficiary.  Aligns with [ISO 17442](https://www.iso.org/standard/59771.html)
   **/
  public InternationalPayeeBankDetails legalEntityIdentifier(String legalEntityIdentifier) {
    this.legalEntityIdentifier = legalEntityIdentifier;
    return this;
  }

  
  @Schema(description = "The legal entity identifier (LEI) for the beneficiary.  Aligns with [ISO 17442](https://www.iso.org/standard/59771.html)")
  @JsonProperty("legalEntityIdentifier")
  public String getLegalEntityIdentifier() {
    return legalEntityIdentifier;
  }
  public void setLegalEntityIdentifier(String legalEntityIdentifier) {
    this.legalEntityIdentifier = legalEntityIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternationalPayeeBankDetails internationalPayeeBankDetails = (InternationalPayeeBankDetails) o;
    return Objects.equals(country, internationalPayeeBankDetails.country) &&
        Objects.equals(accountNumber, internationalPayeeBankDetails.accountNumber) &&
        Objects.equals(bankAddress, internationalPayeeBankDetails.bankAddress) &&
        Objects.equals(beneficiaryBankBIC, internationalPayeeBankDetails.beneficiaryBankBIC) &&
        Objects.equals(fedWireNumber, internationalPayeeBankDetails.fedWireNumber) &&
        Objects.equals(sortCode, internationalPayeeBankDetails.sortCode) &&
        Objects.equals(chipNumber, internationalPayeeBankDetails.chipNumber) &&
        Objects.equals(routingNumber, internationalPayeeBankDetails.routingNumber) &&
        Objects.equals(legalEntityIdentifier, internationalPayeeBankDetails.legalEntityIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, accountNumber, bankAddress, beneficiaryBankBIC, fedWireNumber, sortCode, chipNumber, routingNumber, legalEntityIdentifier);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
