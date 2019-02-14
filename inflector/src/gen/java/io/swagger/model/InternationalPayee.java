package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InternationalPayeeBankDetails;
import io.swagger.model.InternationalPayeeBeneficiaryDetails;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class InternationalPayee   {
  @JsonProperty("beneficiaryDetails")
  private InternationalPayeeBeneficiaryDetails beneficiaryDetails = null;
  @JsonProperty("bankDetails")
  private InternationalPayeeBankDetails bankDetails = null;
  /**
   **/
  public InternationalPayee beneficiaryDetails(InternationalPayeeBeneficiaryDetails beneficiaryDetails) {
    this.beneficiaryDetails = beneficiaryDetails;
    return this;
  }

  
  @Schema(required = true, description = "")
  @JsonProperty("beneficiaryDetails")
  public InternationalPayeeBeneficiaryDetails getBeneficiaryDetails() {
    return beneficiaryDetails;
  }
  public void setBeneficiaryDetails(InternationalPayeeBeneficiaryDetails beneficiaryDetails) {
    this.beneficiaryDetails = beneficiaryDetails;
  }

  /**
   **/
  public InternationalPayee bankDetails(InternationalPayeeBankDetails bankDetails) {
    this.bankDetails = bankDetails;
    return this;
  }

  
  @Schema(required = true, description = "")
  @JsonProperty("bankDetails")
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
    return Objects.equals(beneficiaryDetails, internationalPayee.beneficiaryDetails) &&
        Objects.equals(bankDetails, internationalPayee.bankDetails);
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
