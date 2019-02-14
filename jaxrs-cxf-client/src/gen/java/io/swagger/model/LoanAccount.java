package io.swagger.model;

import java.util.ArrayList;
import java.util.List;

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

public class LoanAccount  {
  
  @Schema(description = "Optional original start date for the loan")
 /**
   * Optional original start date for the loan  
  **/
  private String originalStartDate = null;
  
  @Schema(description = "Optional original loan value")
 /**
   * Optional original loan value  
  **/
  private String originalLoanAmount = null;
  
  @Schema(description = "If absent assumes AUD")
 /**
   * If absent assumes AUD  
  **/
  private String originalLoanCurrency = null;
  
  @Schema(description = "Date that the loan is due to be repaid in full")
 /**
   * Date that the loan is due to be repaid in full  
  **/
  private String loanEndDate = null;
  
  @Schema(description = "Next date that an instalment is required")
 /**
   * Next date that an instalment is required  
  **/
  private String nextInstalmentDate = null;
  
  @Schema(description = "Minimum amount of next instalment")
 /**
   * Minimum amount of next instalment  
  **/
  private String minInstalmentAmount = null;
  
  @Schema(description = "If absent assumes AUD")
 /**
   * If absent assumes AUD  
  **/
  private String minInstalmentCurrency = null;
  
  @Schema(description = "Maximum amount of funds that can be redrawn. If not present redraw is not available even if the feature exists for the account")
 /**
   * Maximum amount of funds that can be redrawn. If not present redraw is not available even if the feature exists for the account  
  **/
  private String maxRedraw = null;
  
  @Schema(description = "If absent assumes AUD")
 /**
   * If absent assumes AUD  
  **/
  private String maxRedrawCurrency = null;
  
  @Schema(description = "Minimum redraw amount")
 /**
   * Minimum redraw amount  
  **/
  private String minRedraw = null;
  
  @Schema(description = "If absent assumes AUD")
 /**
   * If absent assumes AUD  
  **/
  private String minRedrawCurrency = null;
  
  @Schema(description = "Set to true if one or more offset accounts are configured for this loan account")
 /**
   * Set to true if one or more offset accounts are configured for this loan account  
  **/
  private Boolean offsetAccountEnabled = null;
  
  @Schema(description = "The accountIDs of the configured offset accounts attached to this loan. Only offset accounts that can be accesses under the current authorisation should be included. It is expected behaviour that offsetAccountEnabled is set to true but the offsetAccountIds field is absent or empty. This represents a situation where an offset account exists but details can not be accessed under the current authorisation")
 /**
   * The accountIDs of the configured offset accounts attached to this loan. Only offset accounts that can be accesses under the current authorisation should be included. It is expected behaviour that offsetAccountEnabled is set to true but the offsetAccountIds field is absent or empty. This represents a situation where an offset account exists but details can not be accessed under the current authorisation  
  **/
  private List<String> offsetAccountIds = null;
  
  @Schema(description = "The expected or required repayment frequency. Formatted according to ISO 8601 Durations")
 /**
   * The expected or required repayment frequency. Formatted according to ISO 8601 Durations  
  **/
  private String repaymentFrequency = null;
  public enum RepaymentTypeEnum {
    INTEREST_ONLY("INTEREST_ONLY"),
    PRINCIPAL_AND_INTEREST("PRINCIPAL_AND_INTEREST");

    private String value;

    RepaymentTypeEnum(String value) {
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
    public static RepaymentTypeEnum fromValue(String text) {
      for (RepaymentTypeEnum b : RepaymentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "Options in place for repayments. If absent defaults to PRINCIPAL_AND_INTEREST")
 /**
   * Options in place for repayments. If absent defaults to PRINCIPAL_AND_INTEREST  
  **/
  private RepaymentTypeEnum repaymentType = null;
 /**
   * Optional original start date for the loan
   * @return originalStartDate
  **/
  @JsonProperty("originalStartDate")
  public String getOriginalStartDate() {
    return originalStartDate;
  }

  public void setOriginalStartDate(String originalStartDate) {
    this.originalStartDate = originalStartDate;
  }

  public LoanAccount originalStartDate(String originalStartDate) {
    this.originalStartDate = originalStartDate;
    return this;
  }

 /**
   * Optional original loan value
   * @return originalLoanAmount
  **/
  @JsonProperty("originalLoanAmount")
  public String getOriginalLoanAmount() {
    return originalLoanAmount;
  }

  public void setOriginalLoanAmount(String originalLoanAmount) {
    this.originalLoanAmount = originalLoanAmount;
  }

  public LoanAccount originalLoanAmount(String originalLoanAmount) {
    this.originalLoanAmount = originalLoanAmount;
    return this;
  }

 /**
   * If absent assumes AUD
   * @return originalLoanCurrency
  **/
  @JsonProperty("originalLoanCurrency")
  public String getOriginalLoanCurrency() {
    return originalLoanCurrency;
  }

  public void setOriginalLoanCurrency(String originalLoanCurrency) {
    this.originalLoanCurrency = originalLoanCurrency;
  }

  public LoanAccount originalLoanCurrency(String originalLoanCurrency) {
    this.originalLoanCurrency = originalLoanCurrency;
    return this;
  }

 /**
   * Date that the loan is due to be repaid in full
   * @return loanEndDate
  **/
  @JsonProperty("loanEndDate")
  public String getLoanEndDate() {
    return loanEndDate;
  }

  public void setLoanEndDate(String loanEndDate) {
    this.loanEndDate = loanEndDate;
  }

  public LoanAccount loanEndDate(String loanEndDate) {
    this.loanEndDate = loanEndDate;
    return this;
  }

 /**
   * Next date that an instalment is required
   * @return nextInstalmentDate
  **/
  @JsonProperty("nextInstalmentDate")
  public String getNextInstalmentDate() {
    return nextInstalmentDate;
  }

  public void setNextInstalmentDate(String nextInstalmentDate) {
    this.nextInstalmentDate = nextInstalmentDate;
  }

  public LoanAccount nextInstalmentDate(String nextInstalmentDate) {
    this.nextInstalmentDate = nextInstalmentDate;
    return this;
  }

 /**
   * Minimum amount of next instalment
   * @return minInstalmentAmount
  **/
  @JsonProperty("minInstalmentAmount")
  public String getMinInstalmentAmount() {
    return minInstalmentAmount;
  }

  public void setMinInstalmentAmount(String minInstalmentAmount) {
    this.minInstalmentAmount = minInstalmentAmount;
  }

  public LoanAccount minInstalmentAmount(String minInstalmentAmount) {
    this.minInstalmentAmount = minInstalmentAmount;
    return this;
  }

 /**
   * If absent assumes AUD
   * @return minInstalmentCurrency
  **/
  @JsonProperty("minInstalmentCurrency")
  public String getMinInstalmentCurrency() {
    return minInstalmentCurrency;
  }

  public void setMinInstalmentCurrency(String minInstalmentCurrency) {
    this.minInstalmentCurrency = minInstalmentCurrency;
  }

  public LoanAccount minInstalmentCurrency(String minInstalmentCurrency) {
    this.minInstalmentCurrency = minInstalmentCurrency;
    return this;
  }

 /**
   * Maximum amount of funds that can be redrawn. If not present redraw is not available even if the feature exists for the account
   * @return maxRedraw
  **/
  @JsonProperty("maxRedraw")
  public String getMaxRedraw() {
    return maxRedraw;
  }

  public void setMaxRedraw(String maxRedraw) {
    this.maxRedraw = maxRedraw;
  }

  public LoanAccount maxRedraw(String maxRedraw) {
    this.maxRedraw = maxRedraw;
    return this;
  }

 /**
   * If absent assumes AUD
   * @return maxRedrawCurrency
  **/
  @JsonProperty("maxRedrawCurrency")
  public String getMaxRedrawCurrency() {
    return maxRedrawCurrency;
  }

  public void setMaxRedrawCurrency(String maxRedrawCurrency) {
    this.maxRedrawCurrency = maxRedrawCurrency;
  }

  public LoanAccount maxRedrawCurrency(String maxRedrawCurrency) {
    this.maxRedrawCurrency = maxRedrawCurrency;
    return this;
  }

 /**
   * Minimum redraw amount
   * @return minRedraw
  **/
  @JsonProperty("minRedraw")
  public String getMinRedraw() {
    return minRedraw;
  }

  public void setMinRedraw(String minRedraw) {
    this.minRedraw = minRedraw;
  }

  public LoanAccount minRedraw(String minRedraw) {
    this.minRedraw = minRedraw;
    return this;
  }

 /**
   * If absent assumes AUD
   * @return minRedrawCurrency
  **/
  @JsonProperty("minRedrawCurrency")
  public String getMinRedrawCurrency() {
    return minRedrawCurrency;
  }

  public void setMinRedrawCurrency(String minRedrawCurrency) {
    this.minRedrawCurrency = minRedrawCurrency;
  }

  public LoanAccount minRedrawCurrency(String minRedrawCurrency) {
    this.minRedrawCurrency = minRedrawCurrency;
    return this;
  }

 /**
   * Set to true if one or more offset accounts are configured for this loan account
   * @return offsetAccountEnabled
  **/
  @JsonProperty("offsetAccountEnabled")
  public Boolean isisOffsetAccountEnabled() {
    return offsetAccountEnabled;
  }

  public void setOffsetAccountEnabled(Boolean offsetAccountEnabled) {
    this.offsetAccountEnabled = offsetAccountEnabled;
  }

  public LoanAccount offsetAccountEnabled(Boolean offsetAccountEnabled) {
    this.offsetAccountEnabled = offsetAccountEnabled;
    return this;
  }

 /**
   * The accountIDs of the configured offset accounts attached to this loan. Only offset accounts that can be accesses under the current authorisation should be included. It is expected behaviour that offsetAccountEnabled is set to true but the offsetAccountIds field is absent or empty. This represents a situation where an offset account exists but details can not be accessed under the current authorisation
   * @return offsetAccountIds
  **/
  @JsonProperty("offsetAccountIds")
  public List<String> getOffsetAccountIds() {
    return offsetAccountIds;
  }

  public void setOffsetAccountIds(List<String> offsetAccountIds) {
    this.offsetAccountIds = offsetAccountIds;
  }

  public LoanAccount offsetAccountIds(List<String> offsetAccountIds) {
    this.offsetAccountIds = offsetAccountIds;
    return this;
  }

  public LoanAccount addOffsetAccountIdsItem(String offsetAccountIdsItem) {
    this.offsetAccountIds.add(offsetAccountIdsItem);
    return this;
  }

 /**
   * The expected or required repayment frequency. Formatted according to ISO 8601 Durations
   * @return repaymentFrequency
  **/
  @JsonProperty("repaymentFrequency")
  public String getRepaymentFrequency() {
    return repaymentFrequency;
  }

  public void setRepaymentFrequency(String repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
  }

  public LoanAccount repaymentFrequency(String repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
    return this;
  }

 /**
   * Options in place for repayments. If absent defaults to PRINCIPAL_AND_INTEREST
   * @return repaymentType
  **/
  @JsonProperty("repaymentType")
  public String getRepaymentType() {
    if (repaymentType == null) {
      return null;
    }
    return repaymentType.getValue();
  }

  public void setRepaymentType(RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
  }

  public LoanAccount repaymentType(RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
