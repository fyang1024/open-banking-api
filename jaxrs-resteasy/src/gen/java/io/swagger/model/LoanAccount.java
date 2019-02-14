package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class LoanAccount   {
  private String originalStartDate = null;  private String originalLoanAmount = null;  private String originalLoanCurrency = null;  private String loanEndDate = null;  private String nextInstalmentDate = null;  private String minInstalmentAmount = null;  private String minInstalmentCurrency = null;  private String maxRedraw = null;  private String maxRedrawCurrency = null;  private String minRedraw = null;  private String minRedrawCurrency = null;  private Boolean offsetAccountEnabled = null;  private List<String> offsetAccountIds = new ArrayList<String>();  private String repaymentFrequency = null;  /**
   * Options in place for repayments. If absent defaults to PRINCIPAL_AND_INTEREST
   */
  public enum RepaymentTypeEnum {
    INTEREST_ONLY("INTEREST_ONLY"),

        PRINCIPAL_AND_INTEREST("PRINCIPAL_AND_INTEREST");
    private String value;

    RepaymentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RepaymentTypeEnum repaymentType = null;

  /**
   * Optional original start date for the loan
   **/
  
  @Schema(description = "Optional original start date for the loan")
  @JsonProperty("originalStartDate")
  public String getOriginalStartDate() {
    return originalStartDate;
  }
  public void setOriginalStartDate(String originalStartDate) {
    this.originalStartDate = originalStartDate;
  }

  /**
   * Optional original loan value
   **/
  
  @Schema(description = "Optional original loan value")
  @JsonProperty("originalLoanAmount")
  public String getOriginalLoanAmount() {
    return originalLoanAmount;
  }
  public void setOriginalLoanAmount(String originalLoanAmount) {
    this.originalLoanAmount = originalLoanAmount;
  }

  /**
   * If absent assumes AUD
   **/
  
  @Schema(description = "If absent assumes AUD")
  @JsonProperty("originalLoanCurrency")
  public String getOriginalLoanCurrency() {
    return originalLoanCurrency;
  }
  public void setOriginalLoanCurrency(String originalLoanCurrency) {
    this.originalLoanCurrency = originalLoanCurrency;
  }

  /**
   * Date that the loan is due to be repaid in full
   **/
  
  @Schema(description = "Date that the loan is due to be repaid in full")
  @JsonProperty("loanEndDate")
  public String getLoanEndDate() {
    return loanEndDate;
  }
  public void setLoanEndDate(String loanEndDate) {
    this.loanEndDate = loanEndDate;
  }

  /**
   * Next date that an instalment is required
   **/
  
  @Schema(description = "Next date that an instalment is required")
  @JsonProperty("nextInstalmentDate")
  public String getNextInstalmentDate() {
    return nextInstalmentDate;
  }
  public void setNextInstalmentDate(String nextInstalmentDate) {
    this.nextInstalmentDate = nextInstalmentDate;
  }

  /**
   * Minimum amount of next instalment
   **/
  
  @Schema(description = "Minimum amount of next instalment")
  @JsonProperty("minInstalmentAmount")
  public String getMinInstalmentAmount() {
    return minInstalmentAmount;
  }
  public void setMinInstalmentAmount(String minInstalmentAmount) {
    this.minInstalmentAmount = minInstalmentAmount;
  }

  /**
   * If absent assumes AUD
   **/
  
  @Schema(description = "If absent assumes AUD")
  @JsonProperty("minInstalmentCurrency")
  public String getMinInstalmentCurrency() {
    return minInstalmentCurrency;
  }
  public void setMinInstalmentCurrency(String minInstalmentCurrency) {
    this.minInstalmentCurrency = minInstalmentCurrency;
  }

  /**
   * Maximum amount of funds that can be redrawn. If not present redraw is not available even if the feature exists for the account
   **/
  
  @Schema(description = "Maximum amount of funds that can be redrawn. If not present redraw is not available even if the feature exists for the account")
  @JsonProperty("maxRedraw")
  public String getMaxRedraw() {
    return maxRedraw;
  }
  public void setMaxRedraw(String maxRedraw) {
    this.maxRedraw = maxRedraw;
  }

  /**
   * If absent assumes AUD
   **/
  
  @Schema(description = "If absent assumes AUD")
  @JsonProperty("maxRedrawCurrency")
  public String getMaxRedrawCurrency() {
    return maxRedrawCurrency;
  }
  public void setMaxRedrawCurrency(String maxRedrawCurrency) {
    this.maxRedrawCurrency = maxRedrawCurrency;
  }

  /**
   * Minimum redraw amount
   **/
  
  @Schema(description = "Minimum redraw amount")
  @JsonProperty("minRedraw")
  public String getMinRedraw() {
    return minRedraw;
  }
  public void setMinRedraw(String minRedraw) {
    this.minRedraw = minRedraw;
  }

  /**
   * If absent assumes AUD
   **/
  
  @Schema(description = "If absent assumes AUD")
  @JsonProperty("minRedrawCurrency")
  public String getMinRedrawCurrency() {
    return minRedrawCurrency;
  }
  public void setMinRedrawCurrency(String minRedrawCurrency) {
    this.minRedrawCurrency = minRedrawCurrency;
  }

  /**
   * Set to true if one or more offset accounts are configured for this loan account
   **/
  
  @Schema(description = "Set to true if one or more offset accounts are configured for this loan account")
  @JsonProperty("offsetAccountEnabled")
  public Boolean isisOffsetAccountEnabled() {
    return offsetAccountEnabled;
  }
  public void setOffsetAccountEnabled(Boolean offsetAccountEnabled) {
    this.offsetAccountEnabled = offsetAccountEnabled;
  }

  /**
   * The accountIDs of the configured offset accounts attached to this loan. Only offset accounts that can be accesses under the current authorisation should be included. It is expected behaviour that offsetAccountEnabled is set to true but the offsetAccountIds field is absent or empty. This represents a situation where an offset account exists but details can not be accessed under the current authorisation
   **/
  
  @Schema(description = "The accountIDs of the configured offset accounts attached to this loan. Only offset accounts that can be accesses under the current authorisation should be included. It is expected behaviour that offsetAccountEnabled is set to true but the offsetAccountIds field is absent or empty. This represents a situation where an offset account exists but details can not be accessed under the current authorisation")
  @JsonProperty("offsetAccountIds")
  public List<String> getOffsetAccountIds() {
    return offsetAccountIds;
  }
  public void setOffsetAccountIds(List<String> offsetAccountIds) {
    this.offsetAccountIds = offsetAccountIds;
  }

  /**
   * The expected or required repayment frequency. Formatted according to ISO 8601 Durations
   **/
  
  @Schema(description = "The expected or required repayment frequency. Formatted according to ISO 8601 Durations")
  @JsonProperty("repaymentFrequency")
  public String getRepaymentFrequency() {
    return repaymentFrequency;
  }
  public void setRepaymentFrequency(String repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
  }

  /**
   * Options in place for repayments. If absent defaults to PRINCIPAL_AND_INTEREST
   **/
  
  @Schema(description = "Options in place for repayments. If absent defaults to PRINCIPAL_AND_INTEREST")
  @JsonProperty("repaymentType")
  public RepaymentTypeEnum getRepaymentType() {
    return repaymentType;
  }
  public void setRepaymentType(RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanAccount loanAccount = (LoanAccount) o;
    return Objects.equals(originalStartDate, loanAccount.originalStartDate) &&
        Objects.equals(originalLoanAmount, loanAccount.originalLoanAmount) &&
        Objects.equals(originalLoanCurrency, loanAccount.originalLoanCurrency) &&
        Objects.equals(loanEndDate, loanAccount.loanEndDate) &&
        Objects.equals(nextInstalmentDate, loanAccount.nextInstalmentDate) &&
        Objects.equals(minInstalmentAmount, loanAccount.minInstalmentAmount) &&
        Objects.equals(minInstalmentCurrency, loanAccount.minInstalmentCurrency) &&
        Objects.equals(maxRedraw, loanAccount.maxRedraw) &&
        Objects.equals(maxRedrawCurrency, loanAccount.maxRedrawCurrency) &&
        Objects.equals(minRedraw, loanAccount.minRedraw) &&
        Objects.equals(minRedrawCurrency, loanAccount.minRedrawCurrency) &&
        Objects.equals(offsetAccountEnabled, loanAccount.offsetAccountEnabled) &&
        Objects.equals(offsetAccountIds, loanAccount.offsetAccountIds) &&
        Objects.equals(repaymentFrequency, loanAccount.repaymentFrequency) &&
        Objects.equals(repaymentType, loanAccount.repaymentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalStartDate, originalLoanAmount, originalLoanCurrency, loanEndDate, nextInstalmentDate, minInstalmentAmount, minInstalmentCurrency, maxRedraw, maxRedrawCurrency, minRedraw, minRedrawCurrency, offsetAccountEnabled, offsetAccountIds, repaymentFrequency, repaymentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanAccount {\n");
    
    sb.append("    originalStartDate: ").append(toIndentedString(originalStartDate)).append("\n");
    sb.append("    originalLoanAmount: ").append(toIndentedString(originalLoanAmount)).append("\n");
    sb.append("    originalLoanCurrency: ").append(toIndentedString(originalLoanCurrency)).append("\n");
    sb.append("    loanEndDate: ").append(toIndentedString(loanEndDate)).append("\n");
    sb.append("    nextInstalmentDate: ").append(toIndentedString(nextInstalmentDate)).append("\n");
    sb.append("    minInstalmentAmount: ").append(toIndentedString(minInstalmentAmount)).append("\n");
    sb.append("    minInstalmentCurrency: ").append(toIndentedString(minInstalmentCurrency)).append("\n");
    sb.append("    maxRedraw: ").append(toIndentedString(maxRedraw)).append("\n");
    sb.append("    maxRedrawCurrency: ").append(toIndentedString(maxRedrawCurrency)).append("\n");
    sb.append("    minRedraw: ").append(toIndentedString(minRedraw)).append("\n");
    sb.append("    minRedrawCurrency: ").append(toIndentedString(minRedrawCurrency)).append("\n");
    sb.append("    offsetAccountEnabled: ").append(toIndentedString(offsetAccountEnabled)).append("\n");
    sb.append("    offsetAccountIds: ").append(toIndentedString(offsetAccountIds)).append("\n");
    sb.append("    repaymentFrequency: ").append(toIndentedString(repaymentFrequency)).append("\n");
    sb.append("    repaymentType: ").append(toIndentedString(repaymentType)).append("\n");
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
