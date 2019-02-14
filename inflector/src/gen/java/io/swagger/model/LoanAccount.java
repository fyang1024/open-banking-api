package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class LoanAccount   {
  @JsonProperty("originalStartDate")
  private String originalStartDate = null;
  @JsonProperty("originalLoanAmount")
  private String originalLoanAmount = null;
  @JsonProperty("originalLoanCurrency")
  private String originalLoanCurrency = null;
  @JsonProperty("loanEndDate")
  private String loanEndDate = null;
  @JsonProperty("nextInstalmentDate")
  private String nextInstalmentDate = null;
  @JsonProperty("minInstalmentAmount")
  private String minInstalmentAmount = null;
  @JsonProperty("minInstalmentCurrency")
  private String minInstalmentCurrency = null;
  @JsonProperty("maxRedraw")
  private String maxRedraw = null;
  @JsonProperty("maxRedrawCurrency")
  private String maxRedrawCurrency = null;
  @JsonProperty("minRedraw")
  private String minRedraw = null;
  @JsonProperty("minRedrawCurrency")
  private String minRedrawCurrency = null;
  @JsonProperty("offsetAccountEnabled")
  private Boolean offsetAccountEnabled = null;
  @JsonProperty("offsetAccountIds")
  private List<String> offsetAccountIds = null;
  @JsonProperty("repaymentFrequency")
  private String repaymentFrequency = null;
  /**
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

    @JsonCreator
    public static RepaymentTypeEnum fromValue(String text) {
      for (RepaymentTypeEnum b : RepaymentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("repaymentType")
  private RepaymentTypeEnum repaymentType = null;
  /**
   * Optional original start date for the loan
   **/
  public LoanAccount originalStartDate(String originalStartDate) {
    this.originalStartDate = originalStartDate;
    return this;
  }

  
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
  public LoanAccount originalLoanAmount(String originalLoanAmount) {
    this.originalLoanAmount = originalLoanAmount;
    return this;
  }

  
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
  public LoanAccount originalLoanCurrency(String originalLoanCurrency) {
    this.originalLoanCurrency = originalLoanCurrency;
    return this;
  }

  
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
  public LoanAccount loanEndDate(String loanEndDate) {
    this.loanEndDate = loanEndDate;
    return this;
  }

  
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
  public LoanAccount nextInstalmentDate(String nextInstalmentDate) {
    this.nextInstalmentDate = nextInstalmentDate;
    return this;
  }

  
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
  public LoanAccount minInstalmentAmount(String minInstalmentAmount) {
    this.minInstalmentAmount = minInstalmentAmount;
    return this;
  }

  
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
  public LoanAccount minInstalmentCurrency(String minInstalmentCurrency) {
    this.minInstalmentCurrency = minInstalmentCurrency;
    return this;
  }

  
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
  public LoanAccount maxRedraw(String maxRedraw) {
    this.maxRedraw = maxRedraw;
    return this;
  }

  
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
  public LoanAccount maxRedrawCurrency(String maxRedrawCurrency) {
    this.maxRedrawCurrency = maxRedrawCurrency;
    return this;
  }

  
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
  public LoanAccount minRedraw(String minRedraw) {
    this.minRedraw = minRedraw;
    return this;
  }

  
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
  public LoanAccount minRedrawCurrency(String minRedrawCurrency) {
    this.minRedrawCurrency = minRedrawCurrency;
    return this;
  }

  
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
  public LoanAccount offsetAccountEnabled(Boolean offsetAccountEnabled) {
    this.offsetAccountEnabled = offsetAccountEnabled;
    return this;
  }

  
  @Schema(description = "Set to true if one or more offset accounts are configured for this loan account")
  @JsonProperty("offsetAccountEnabled")
  public Boolean isOffsetAccountEnabled() {
    return offsetAccountEnabled;
  }
  public void setOffsetAccountEnabled(Boolean offsetAccountEnabled) {
    this.offsetAccountEnabled = offsetAccountEnabled;
  }

  /**
   * The accountIDs of the configured offset accounts attached to this loan. Only offset accounts that can be accesses under the current authorisation should be included. It is expected behaviour that offsetAccountEnabled is set to true but the offsetAccountIds field is absent or empty. This represents a situation where an offset account exists but details can not be accessed under the current authorisation
   **/
  public LoanAccount offsetAccountIds(List<String> offsetAccountIds) {
    this.offsetAccountIds = offsetAccountIds;
    return this;
  }

  
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
  public LoanAccount repaymentFrequency(String repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
    return this;
  }

  
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
  public LoanAccount repaymentType(RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
    return this;
  }

  
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
