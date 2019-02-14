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

public class TermDepositAccount  {
  
  @Schema(required = true, description = "The lodgement date of the original deposit")
 /**
   * The lodgement date of the original deposit  
  **/
  private String lodgementDate = null;
  
  @Schema(required = true, description = "Maturity date for the term deposit")
 /**
   * Maturity date for the term deposit  
  **/
  private String maturityDate = null;
  
  @Schema(description = "Amount to be paid upon maturity. If absent it implies the amount to paid is variable and cannot currently be calculated")
 /**
   * Amount to be paid upon maturity. If absent it implies the amount to paid is variable and cannot currently be calculated  
  **/
  private String maturityAmount = null;
  
  @Schema(description = "If absent assumes AUD")
 /**
   * If absent assumes AUD  
  **/
  private String maturityCurrency = null;
  public enum MaturityInstructionsEnum {
    ROLLED_OVER("ROLLED_OVER"),
    PAID_OUT_AT_MATURITY("PAID_OUT_AT_MATURITY");

    private String value;

    MaturityInstructionsEnum(String value) {
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
    public static MaturityInstructionsEnum fromValue(String text) {
      for (MaturityInstructionsEnum b : MaturityInstructionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(required = true, description = "Current instructions on action to be taken at maturity")
 /**
   * Current instructions on action to be taken at maturity  
  **/
  private MaturityInstructionsEnum maturityInstructions = null;
 /**
   * The lodgement date of the original deposit
   * @return lodgementDate
  **/
  @JsonProperty("lodgementDate")
  public String getLodgementDate() {
    return lodgementDate;
  }

  public void setLodgementDate(String lodgementDate) {
    this.lodgementDate = lodgementDate;
  }

  public TermDepositAccount lodgementDate(String lodgementDate) {
    this.lodgementDate = lodgementDate;
    return this;
  }

 /**
   * Maturity date for the term deposit
   * @return maturityDate
  **/
  @JsonProperty("maturityDate")
  public String getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(String maturityDate) {
    this.maturityDate = maturityDate;
  }

  public TermDepositAccount maturityDate(String maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

 /**
   * Amount to be paid upon maturity. If absent it implies the amount to paid is variable and cannot currently be calculated
   * @return maturityAmount
  **/
  @JsonProperty("maturityAmount")
  public String getMaturityAmount() {
    return maturityAmount;
  }

  public void setMaturityAmount(String maturityAmount) {
    this.maturityAmount = maturityAmount;
  }

  public TermDepositAccount maturityAmount(String maturityAmount) {
    this.maturityAmount = maturityAmount;
    return this;
  }

 /**
   * If absent assumes AUD
   * @return maturityCurrency
  **/
  @JsonProperty("maturityCurrency")
  public String getMaturityCurrency() {
    return maturityCurrency;
  }

  public void setMaturityCurrency(String maturityCurrency) {
    this.maturityCurrency = maturityCurrency;
  }

  public TermDepositAccount maturityCurrency(String maturityCurrency) {
    this.maturityCurrency = maturityCurrency;
    return this;
  }

 /**
   * Current instructions on action to be taken at maturity
   * @return maturityInstructions
  **/
  @JsonProperty("maturityInstructions")
  public String getMaturityInstructions() {
    if (maturityInstructions == null) {
      return null;
    }
    return maturityInstructions.getValue();
  }

  public void setMaturityInstructions(MaturityInstructionsEnum maturityInstructions) {
    this.maturityInstructions = maturityInstructions;
  }

  public TermDepositAccount maturityInstructions(MaturityInstructionsEnum maturityInstructions) {
    this.maturityInstructions = maturityInstructions;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TermDepositAccount {\n");
    
    sb.append("    lodgementDate: ").append(toIndentedString(lodgementDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    maturityAmount: ").append(toIndentedString(maturityAmount)).append("\n");
    sb.append("    maturityCurrency: ").append(toIndentedString(maturityCurrency)).append("\n");
    sb.append("    maturityInstructions: ").append(toIndentedString(maturityInstructions)).append("\n");
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
