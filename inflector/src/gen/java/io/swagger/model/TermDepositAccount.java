package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class TermDepositAccount   {
  @JsonProperty("lodgementDate")
  private String lodgementDate = null;
  @JsonProperty("maturityDate")
  private String maturityDate = null;
  @JsonProperty("maturityAmount")
  private String maturityAmount = null;
  @JsonProperty("maturityCurrency")
  private String maturityCurrency = null;
  /**
   * Current instructions on action to be taken at maturity
   */
  public enum MaturityInstructionsEnum {
    ROLLED_OVER("ROLLED_OVER"),
    
    PAID_OUT_AT_MATURITY("PAID_OUT_AT_MATURITY");

    private String value;

    MaturityInstructionsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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
  @JsonProperty("maturityInstructions")
  private MaturityInstructionsEnum maturityInstructions = null;
  /**
   * The lodgement date of the original deposit
   **/
  public TermDepositAccount lodgementDate(String lodgementDate) {
    this.lodgementDate = lodgementDate;
    return this;
  }

  
  @Schema(required = true, description = "The lodgement date of the original deposit")
  @JsonProperty("lodgementDate")
  public String getLodgementDate() {
    return lodgementDate;
  }
  public void setLodgementDate(String lodgementDate) {
    this.lodgementDate = lodgementDate;
  }

  /**
   * Maturity date for the term deposit
   **/
  public TermDepositAccount maturityDate(String maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

  
  @Schema(required = true, description = "Maturity date for the term deposit")
  @JsonProperty("maturityDate")
  public String getMaturityDate() {
    return maturityDate;
  }
  public void setMaturityDate(String maturityDate) {
    this.maturityDate = maturityDate;
  }

  /**
   * Amount to be paid upon maturity. If absent it implies the amount to paid is variable and cannot currently be calculated
   **/
  public TermDepositAccount maturityAmount(String maturityAmount) {
    this.maturityAmount = maturityAmount;
    return this;
  }

  
  @Schema(description = "Amount to be paid upon maturity. If absent it implies the amount to paid is variable and cannot currently be calculated")
  @JsonProperty("maturityAmount")
  public String getMaturityAmount() {
    return maturityAmount;
  }
  public void setMaturityAmount(String maturityAmount) {
    this.maturityAmount = maturityAmount;
  }

  /**
   * If absent assumes AUD
   **/
  public TermDepositAccount maturityCurrency(String maturityCurrency) {
    this.maturityCurrency = maturityCurrency;
    return this;
  }

  
  @Schema(description = "If absent assumes AUD")
  @JsonProperty("maturityCurrency")
  public String getMaturityCurrency() {
    return maturityCurrency;
  }
  public void setMaturityCurrency(String maturityCurrency) {
    this.maturityCurrency = maturityCurrency;
  }

  /**
   * Current instructions on action to be taken at maturity
   **/
  public TermDepositAccount maturityInstructions(MaturityInstructionsEnum maturityInstructions) {
    this.maturityInstructions = maturityInstructions;
    return this;
  }

  
  @Schema(required = true, description = "Current instructions on action to be taken at maturity")
  @JsonProperty("maturityInstructions")
  public MaturityInstructionsEnum getMaturityInstructions() {
    return maturityInstructions;
  }
  public void setMaturityInstructions(MaturityInstructionsEnum maturityInstructions) {
    this.maturityInstructions = maturityInstructions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TermDepositAccount termDepositAccount = (TermDepositAccount) o;
    return Objects.equals(lodgementDate, termDepositAccount.lodgementDate) &&
        Objects.equals(maturityDate, termDepositAccount.maturityDate) &&
        Objects.equals(maturityAmount, termDepositAccount.maturityAmount) &&
        Objects.equals(maturityCurrency, termDepositAccount.maturityCurrency) &&
        Objects.equals(maturityInstructions, termDepositAccount.maturityInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lodgementDate, maturityDate, maturityAmount, maturityCurrency, maturityInstructions);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
