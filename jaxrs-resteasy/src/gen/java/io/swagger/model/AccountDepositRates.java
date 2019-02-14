package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class AccountDepositRates   {
  /**
   * The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning
   */
  public enum DepositRateTypeEnum {
    FIXED("FIXED"),

        BONUS("BONUS"),

        BUNDLE_BONUS("BUNDLE_BONUS"),

        VARIABLE("VARIABLE"),

        INTRODUCTORY("INTRODUCTORY");
    private String value;

    DepositRateTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DepositRateTypeEnum depositRateType = null;  private String rate = null;  private String additionalValue = null;  private String additionalInfo = null;  private String additionalInfoUri = null;

  /**
   * The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning
   **/
  
  @Schema(required = true, description = "The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning")
  @JsonProperty("depositRateType")
  @NotNull
  public DepositRateTypeEnum getDepositRateType() {
    return depositRateType;
  }
  public void setDepositRateType(DepositRateTypeEnum depositRateType) {
    this.depositRateType = depositRateType;
  }

  /**
   * The rate to be applied
   **/
  
  @Schema(required = true, description = "The rate to be applied")
  @JsonProperty("rate")
  @NotNull
  public String getRate() {
    return rate;
  }
  public void setRate(String rate) {
    this.rate = rate;
  }

  /**
   * Generic field containing additional information relevant to the depositRateType specified. Whether mandatory or not is dependent on the value of depositRateType
   **/
  
  @Schema(description = "Generic field containing additional information relevant to the depositRateType specified. Whether mandatory or not is dependent on the value of depositRateType")
  @JsonProperty("additionalValue")
  public String getAdditionalValue() {
    return additionalValue;
  }
  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  /**
   * Display text providing more information on the fee
   **/
  
  @Schema(description = "Display text providing more information on the fee")
  @JsonProperty("additionalInfo")
  public String getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  /**
   * Link to a web page with more information on this fee
   **/
  
  @Schema(description = "Link to a web page with more information on this fee")
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
    AccountDepositRates accountDepositRates = (AccountDepositRates) o;
    return Objects.equals(depositRateType, accountDepositRates.depositRateType) &&
        Objects.equals(rate, accountDepositRates.rate) &&
        Objects.equals(additionalValue, accountDepositRates.additionalValue) &&
        Objects.equals(additionalInfo, accountDepositRates.additionalInfo) &&
        Objects.equals(additionalInfoUri, accountDepositRates.additionalInfoUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositRateType, rate, additionalValue, additionalInfo, additionalInfoUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDepositRates {\n");
    
    sb.append("    depositRateType: ").append(toIndentedString(depositRateType)).append("\n");
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
