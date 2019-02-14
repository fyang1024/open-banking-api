package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class BillerPayee   {
  @JsonProperty("billerCode")
  private String billerCode = null;
  @JsonProperty("crn")
  private String crn = null;
  @JsonProperty("billerName")
  private String billerName = null;
  /**
   * BPay Biller Code of the Biller
   **/
  public BillerPayee billerCode(String billerCode) {
    this.billerCode = billerCode;
    return this;
  }

  
  @Schema(required = true, description = "BPay Biller Code of the Biller")
  @JsonProperty("billerCode")
  public String getBillerCode() {
    return billerCode;
  }
  public void setBillerCode(String billerCode) {
    this.billerCode = billerCode;
  }

  /**
   * BPay CRN of the Biller. If the contents of the CRN match the format of a Credit Card PAN then it should be masked using the rules applicable for the MaskedPANString common type
   **/
  public BillerPayee crn(String crn) {
    this.crn = crn;
    return this;
  }

  
  @Schema(description = "BPay CRN of the Biller. If the contents of the CRN match the format of a Credit Card PAN then it should be masked using the rules applicable for the MaskedPANString common type")
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Name of the Biller
   **/
  public BillerPayee billerName(String billerName) {
    this.billerName = billerName;
    return this;
  }

  
  @Schema(required = true, description = "Name of the Biller")
  @JsonProperty("billerName")
  public String getBillerName() {
    return billerName;
  }
  public void setBillerName(String billerName) {
    this.billerName = billerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillerPayee billerPayee = (BillerPayee) o;
    return Objects.equals(billerCode, billerPayee.billerCode) &&
        Objects.equals(crn, billerPayee.crn) &&
        Objects.equals(billerName, billerPayee.billerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billerCode, crn, billerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillerPayee {\n");
    sb.append("    billerCode: ").append(toIndentedString(billerCode)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    billerName: ").append(toIndentedString(billerName)).append("\n");
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
