package org.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InternationalPayee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class InternationalPayee   {
  @JsonProperty("beneficiaryDetails")
  private InternationalPayeeBeneficiaryDetails beneficiaryDetails = null;

  @JsonProperty("bankDetails")
  private InternationalPayeeBankDetails bankDetails = null;

  public InternationalPayee beneficiaryDetails(InternationalPayeeBeneficiaryDetails beneficiaryDetails) {
    this.beneficiaryDetails = beneficiaryDetails;
    return this;
  }

  /**
   * Get beneficiaryDetails
   * @return beneficiaryDetails
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public InternationalPayeeBeneficiaryDetails getBeneficiaryDetails() {
    return beneficiaryDetails;
  }

  public void setBeneficiaryDetails(InternationalPayeeBeneficiaryDetails beneficiaryDetails) {
    this.beneficiaryDetails = beneficiaryDetails;
  }

  public InternationalPayee bankDetails(InternationalPayeeBankDetails bankDetails) {
    this.bankDetails = bankDetails;
    return this;
  }

  /**
   * Get bankDetails
   * @return bankDetails
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public InternationalPayeeBankDetails getBankDetails() {
    return bankDetails;
  }

  public void setBankDetails(InternationalPayeeBankDetails bankDetails) {
    this.bankDetails = bankDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternationalPayee internationalPayee = (InternationalPayee) o;
    return Objects.equals(this.beneficiaryDetails, internationalPayee.beneficiaryDetails) &&
        Objects.equals(this.bankDetails, internationalPayee.bankDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiaryDetails, bankDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternationalPayee {\n");
    
    sb.append("    beneficiaryDetails: ").append(toIndentedString(beneficiaryDetails)).append("\n");
    sb.append("    bankDetails: ").append(toIndentedString(bankDetails)).append("\n");
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

