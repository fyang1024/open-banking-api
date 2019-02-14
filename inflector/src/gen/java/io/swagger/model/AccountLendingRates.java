package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class AccountLendingRates   {
  /**
   * The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning
   */
  public enum LendingRateTypeEnum {
    FIXED("FIXED"),
    
    INTRODUCTORY("INTRODUCTORY"),
    
    DISCOUNT("DISCOUNT"),
    
    PENALTY("PENALTY"),
    
    BUNDLE_DISCOUNT("BUNDLE_DISCOUNT"),
    
    FLOATING("FLOATING"),
    
    MARKET_LINKED("MARKET_LINKED"),
    
    CASH_ADVANCE("CASH_ADVANCE"),
    
    VARIABLE("VARIABLE"),
    
    COMPARISON("COMPARISON");

    private String value;

    LendingRateTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LendingRateTypeEnum fromValue(String text) {
      for (LendingRateTypeEnum b : LendingRateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("lendingRateType")
  private LendingRateTypeEnum lendingRateType = null;
  @JsonProperty("rate")
  private String rate = null;
  @JsonProperty("additionalValue")
  private String additionalValue = null;
  @JsonProperty("additionalInfo")
  private String additionalInfo = null;
  @JsonProperty("additionalInfoUri")
  private String additionalInfoUri = null;
  /**
   * The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning
   **/
  public AccountLendingRates lendingRateType(LendingRateTypeEnum lendingRateType) {
    this.lendingRateType = lendingRateType;
    return this;
  }

  
  @Schema(required = true, description = "The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning")
  @JsonProperty("lendingRateType")
  public LendingRateTypeEnum getLendingRateType() {
    return lendingRateType;
  }
  public void setLendingRateType(LendingRateTypeEnum lendingRateType) {
    this.lendingRateType = lendingRateType;
  }

  /**
   * The rate to be applied
   **/
  public AccountLendingRates rate(String rate) {
    this.rate = rate;
    return this;
  }

  
  @Schema(required = true, description = "The rate to be applied")
  @JsonProperty("rate")
  public String getRate() {
    return rate;
  }
  public void setRate(String rate) {
    this.rate = rate;
  }

  /**
   * Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType
   **/
  public AccountLendingRates additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

  
  @Schema(description = "Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType")
  @JsonProperty("additionalValue")
  public String getAdditionalValue() {
    return additionalValue;
  }
  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  /**
   * Display text providing more information on the fee.
   **/
  public AccountLendingRates additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  
  @Schema(description = "Display text providing more information on the fee.")
  @JsonProperty("additionalInfo")
  public String getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  /**
   * Link to a web page with more information  on this fee
   **/
  public AccountLendingRates additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

  
  @Schema(description = "Link to a web page with more information  on this fee")
  @JsonProperty("additionalInfoUri")
  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }
  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountLendingRates accountLendingRates = (AccountLendingRates) o;
    return Objects.equals(lendingRateType, accountLendingRates.lendingRateType) &&
        Objects.equals(rate, accountLendingRates.rate) &&
        Objects.equals(additionalValue, accountLendingRates.additionalValue) &&
        Objects.equals(additionalInfo, accountLendingRates.additionalInfo) &&
        Objects.equals(additionalInfoUri, accountLendingRates.additionalInfoUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lendingRateType, rate, additionalValue, additionalInfo, additionalInfoUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountLendingRates {\n");
    sb.append("    lendingRateType: ").append(toIndentedString(lendingRateType)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    additionalValue: ").append(toIndentedString(additionalValue)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    additionalInfoUri: ").append(toIndentedString(additionalInfoUri)).append("\n");
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