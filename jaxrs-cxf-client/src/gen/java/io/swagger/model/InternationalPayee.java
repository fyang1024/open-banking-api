package io.swagger.model;

import io.swagger.model.InternationalPayeeBankDetails;
import io.swagger.model.InternationalPayeeBeneficiaryDetails;

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

public class InternationalPayee  {
  
  @Schema(required = true, description = "")
  private InternationalPayeeBeneficiaryDetails beneficiaryDetails = null;
  
  @Schema(required = true, description = "")
  private InternationalPayeeBankDetails bankDetails = null;
 /**
   * Get beneficiaryDetails
   * @return beneficiaryDetails
  **/
  @JsonProperty("beneficiaryDetails")
  public InternationalPayeeBeneficiaryDetails getBeneficiaryDetails() {
    return beneficiaryDetails;
  }

  public void setBeneficiaryDetails(InternationalPayeeBeneficiaryDetails beneficiaryDetails) {
    this.beneficiaryDetails = beneficiaryDetails;
  }

  public InternationalPayee beneficiaryDetails(InternationalPayeeBeneficiaryDetails beneficiaryDetails) {
    this.beneficiaryDetails = beneficiaryDetails;
    return this;
  }

 /**
   * Get bankDetails
   * @return bankDetails
  **/
  @JsonProperty("bankDetails")
  public InternationalPayeeBankDetails getBankDetails() {
    return bankDetails;
  }

  public void setBankDetails(InternationalPayeeBankDetails bankDetails) {
    this.bankDetails = bankDetails;
  }

  public InternationalPayee bankDetails(InternationalPayeeBankDetails bankDetails) {
    this.bankDetails = bankDetails;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
