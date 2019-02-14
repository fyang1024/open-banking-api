package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LoanAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-14T17:34:34.379921+11:00[Australia/Sydney]")

public class LoanAccount   {
  @JsonProperty("originalStartDate")
  private String originalStartDate;

  @JsonProperty("originalLoanAmount")
  private String originalLoanAmount;

  @JsonProperty("originalLoanCurrency")
  private String originalLoanCurrency;

  @JsonProperty("loanEndDate")
  private String loanEndDate;

  @JsonProperty("nextInstalmentDate")
  private String nextInstalmentDate;

  @JsonProperty("minInstalmentAmount")
  private String minInstalmentAmount;

  @JsonProperty("minInstalmentCurrency")
  private String minInstalmentCurrency;

  @JsonProperty("maxRedraw")
  private String maxRedraw;

  @JsonProperty("maxRedrawCurrency")
  private String maxRedrawCurrency;

  @JsonProperty("minRedraw")
  private String minRedraw;

  @JsonProperty("minRedrawCurrency")
  private String minRedrawCurrency;

  @JsonProperty("offsetAccountEnabled")
  private Boolean offsetAccountEnabled;

  @JsonProperty("offsetAccountIds")
  @Valid
  private List<String> offsetAccountIds = null;

  @JsonProperty("repaymentFrequency")
  private String repaymentFrequency;

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
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("repaymentType")
  private RepaymentTypeEnum repaymentType;

  public LoanAccount originalStartDate(String originalStartDate) {
    this.originalStartDate = originalStartDate;
    return this;
  }

  /**
   * Optional original start date for the loan
   * @return originalStartDate
  */
  @ApiModelProperty(value = "Optional original start date for the loan")


  public String getOriginalStartDate() {
    return originalStartDate;
  }

  public void setOriginalStartDate(String originalStartDate) {
    this.originalStartDate = originalStartDate;
  }

  public LoanAccount originalLoanAmount(String originalLoanAmount) {
    this.originalLoanAmount = originalLoanAmount;
    return this;
  }

  /**
   * Optional original loan value
   * @return originalLoanAmount
  */
  @ApiModelProperty(value = "Optional original loan value")


  public String getOriginalLoanAmount() {
    return originalLoanAmount;
  }

  public void setOriginalLoanAmount(String originalLoanAmount) {
    this.originalLoanAmount = originalLoanAmount;
  }

  public LoanAccount originalLoanCurrency(String originalLoanCurrency) {
    this.originalLoanCurrency = originalLoanCurrency;
    return this;
  }

  /**
   * If absent assumes AUD
   * @return originalLoanCurrency
  */
  @ApiModelProperty(value = "If absent assumes AUD")


  public String getOriginalLoanCurrency() {
    return originalLoanCurrency;
  }

  public void setOriginalLoanCurrency(String originalLoanCurrency) {
    this.originalLoanCurrency = originalLoanCurrency;
  }

  public LoanAccount loanEndDate(String loanEndDate) {
    this.loanEndDate = loanEndDate;
    return this;
  }

  /**
   * Date that the loan is due to be repaid in full
   * @return loanEndDate
  */
  @ApiModelProperty(value = "Date that the loan is due to be repaid in full")


  public String getLoanEndDate() {
    return loanEndDate;
  }

  public void setLoanEndDate(String loanEndDate) {
    this.loanEndDate = loanEndDate;
  }

  public LoanAccount nextInstalmentDate(String nextInstalmentDate) {
    this.nextInstalmentDate = nextInstalmentDate;
    return this;
  }

  /**
   * Next date that an instalment is required
   * @return nextInstalmentDate
  */
  @ApiModelProperty(value = "Next date that an instalment is required")


  public String getNextInstalmentDate() {
    return nextInstalmentDate;
  }

  public void setNextInstalmentDate(String nextInstalmentDate) {
    this.nextInstalmentDate = nextInstalmentDate;
  }

  public LoanAccount minInstalmentAmount(String minInstalmentAmount) {
    this.minInstalmentAmount = minInstalmentAmount;
    return this;
  }

  /**
   * Minimum amount of next instalment
   * @return minInstalmentAmount
  */
  @ApiModelProperty(value = "Minimum amount of next instalment")


  public String getMinInstalmentAmount() {
    return minInstalmentAmount;
  }

  public void setMinInstalmentAmount(String minInstalmentAmount) {
    this.minInstalmentAmount = minInstalmentAmount;
  }

  public LoanAccount minInstalmentCurrency(String minInstalmentCurrency) {
    this.minInstalmentCurrency = minInstalmentCurrency;
    return this;
  }

  /**
   * If absent assumes AUD
   * @return minInstalmentCurrency
  */
  @ApiModelProperty(value = "If absent assumes AUD")


  public String getMinInstalmentCurrency() {
    return minInstalmentCurrency;
  }

  public void setMinInstalmentCurrency(String minInstalmentCurrency) {
    this.minInstalmentCurrency = minInstalmentCurrency;
  }

  public LoanAccount maxRedraw(String maxRedraw) {
    this.maxRedraw = maxRedraw;
    return this;
  }

  /**
   * Maximum amount of funds that can be redrawn. If not present redraw is not available even if the feature exists for the account
   * @return maxRedraw
  */
  @ApiModelProperty(value = "Maximum amount of funds that can be redrawn. If not present redraw is not available even if the feature exists for the account")


  public String getMaxRedraw() {
    return maxRedraw;
  }

  public void setMaxRedraw(String maxRedraw) {
    this.maxRedraw = maxRedraw;
  }

  public LoanAccount maxRedrawCurrency(String maxRedrawCurrency) {
    this.maxRedrawCurrency = maxRedrawCurrency;
    return this;
  }

  /**
   * If absent assumes AUD
   * @return maxRedrawCurrency
  */
  @ApiModelProperty(value = "If absent assumes AUD")


  public String getMaxRedrawCurrency() {
    return maxRedrawCurrency;
  }

  public void setMaxRedrawCurrency(String maxRedrawCurrency) {
    this.maxRedrawCurrency = maxRedrawCurrency;
  }

  public LoanAccount minRedraw(String minRedraw) {
    this.minRedraw = minRedraw;
    return this;
  }

  /**
   * Minimum redraw amount
   * @return minRedraw
  */
  @ApiModelProperty(value = "Minimum redraw amount")


  public String getMinRedraw() {
    return minRedraw;
  }

  public void setMinRedraw(String minRedraw) {
    this.minRedraw = minRedraw;
  }

  public LoanAccount minRedrawCurrency(String minRedrawCurrency) {
    this.minRedrawCurrency = minRedrawCurrency;
    return this;
  }

  /**
   * If absent assumes AUD
   * @return minRedrawCurrency
  */
  @ApiModelProperty(value = "If absent assumes AUD")


  public String getMinRedrawCurrency() {
    return minRedrawCurrency;
  }

  public void setMinRedrawCurrency(String minRedrawCurrency) {
    this.minRedrawCurrency = minRedrawCurrency;
  }

  public LoanAccount offsetAccountEnabled(Boolean offsetAccountEnabled) {
    this.offsetAccountEnabled = offsetAccountEnabled;
    return this;
  }

  /**
   * Set to true if one or more offset accounts are configured for this loan account
   * @return offsetAccountEnabled
  */
  @ApiModelProperty(value = "Set to true if one or more offset accounts are configured for this loan account")


  public Boolean getOffsetAccountEnabled() {
    return offsetAccountEnabled;
  }

  public void setOffsetAccountEnabled(Boolean offsetAccountEnabled) {
    this.offsetAccountEnabled = offsetAccountEnabled;
  }

  public LoanAccount offsetAccountIds(List<String> offsetAccountIds) {
    this.offsetAccountIds = offsetAccountIds;
    return this;
  }

  public LoanAccount addOffsetAccountIdsItem(String offsetAccountIdsItem) {
    if (this.offsetAccountIds == null) {
      this.offsetAccountIds = new ArrayList<>();
    }
    this.offsetAccountIds.add(offsetAccountIdsItem);
    return this;
  }

  /**
   * The accountIDs of the configured offset accounts attached to this loan. Only offset accounts that can be accesses under the current authorisation should be included. It is expected behaviour that offsetAccountEnabled is set to true but the offsetAccountIds field is absent or empty. This represents a situation where an offset account exists but details can not be accessed under the current authorisation
   * @return offsetAccountIds
  */
  @ApiModelProperty(value = "The accountIDs of the configured offset accounts attached to this loan. Only offset accounts that can be accesses under the current authorisation should be included. It is expected behaviour that offsetAccountEnabled is set to true but the offsetAccountIds field is absent or empty. This represents a situation where an offset account exists but details can not be accessed under the current authorisation")


  public List<String> getOffsetAccountIds() {
    return offsetAccountIds;
  }

  public void setOffsetAccountIds(List<String> offsetAccountIds) {
    this.offsetAccountIds = offsetAccountIds;
  }

  public LoanAccount repaymentFrequency(String repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
    return this;
  }

  /**
   * The expected or required repayment frequency. Formatted according to ISO 8601 Durations
   * @return repaymentFrequency
  */
  @ApiModelProperty(value = "The expected or required repayment frequency. Formatted according to ISO 8601 Durations")


  public String getRepaymentFrequency() {
    return repaymentFrequency;
  }

  public void setRepaymentFrequency(String repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
  }

  public LoanAccount repaymentType(RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
    return this;
  }

  /**
   * Options in place for repayments. If absent defaults to PRINCIPAL_AND_INTEREST
   * @return repaymentType
  */
  @ApiModelProperty(value = "Options in place for repayments. If absent defaults to PRINCIPAL_AND_INTEREST")


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
    return Objects.equals(this.originalStartDate, loanAccount.originalStartDate) &&
        Objects.equals(this.originalLoanAmount, loanAccount.originalLoanAmount) &&
        Objects.equals(this.originalLoanCurrency, loanAccount.originalLoanCurrency) &&
        Objects.equals(this.loanEndDate, loanAccount.loanEndDate) &&
        Objects.equals(this.nextInstalmentDate, loanAccount.nextInstalmentDate) &&
        Objects.equals(this.minInstalmentAmount, loanAccount.minInstalmentAmount) &&
        Objects.equals(this.minInstalmentCurrency, loanAccount.minInstalmentCurrency) &&
        Objects.equals(this.maxRedraw, loanAccount.maxRedraw) &&
        Objects.equals(this.maxRedrawCurrency, loanAccount.maxRedrawCurrency) &&
        Objects.equals(this.minRedraw, loanAccount.minRedraw) &&
        Objects.equals(this.minRedrawCurrency, loanAccount.minRedrawCurrency) &&
        Objects.equals(this.offsetAccountEnabled, loanAccount.offsetAccountEnabled) &&
        Objects.equals(this.offsetAccountIds, loanAccount.offsetAccountIds) &&
        Objects.equals(this.repaymentFrequency, loanAccount.repaymentFrequency) &&
        Objects.equals(this.repaymentType, loanAccount.repaymentType);
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

