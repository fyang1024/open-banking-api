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

public class ProductLendingRates  {
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
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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
  @Schema(required = true, description = "The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning")
 /**
   * The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning  
  **/
  private LendingRateTypeEnum lendingRateType = null;
  
  @Schema(required = true, description = "The rate to be applied")
 /**
   * The rate to be applied  
  **/
  private String rate = null;
  
  @Schema(description = "Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType")
 /**
   * Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType  
  **/
  private String additionalValue = null;
  
  @Schema(description = "Display text providing more information on the fee.")
 /**
   * Display text providing more information on the fee.  
  **/
  private String additionalInfo = null;
  
  @Schema(description = "Link to a web page with more information  on this fee")
 /**
   * Link to a web page with more information  on this fee  
  **/
  private String additionalInfoUri = null;
 /**
   * The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning
   * @return lendingRateType
  **/
  @JsonProperty("lendingRateType")
  public String getLendingRateType() {
    if (lendingRateType == null) {
      return null;
    }
    return lendingRateType.getValue();
  }

  public void setLendingRateType(LendingRateTypeEnum lendingRateType) {
    this.lendingRateType = lendingRateType;
  }

  public ProductLendingRates lendingRateType(LendingRateTypeEnum lendingRateType) {
    this.lendingRateType = lendingRateType;
    return this;
  }

 /**
   * The rate to be applied
   * @return rate
  **/
  @JsonProperty("rate")
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public ProductLendingRates rate(String rate) {
    this.rate = rate;
    return this;
  }

 /**
   * Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType
   * @return additionalValue
  **/
  @JsonProperty("additionalValue")
  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public ProductLendingRates additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

 /**
   * Display text providing more information on the fee.
   * @return additionalInfo
  **/
  @JsonProperty("additionalInfo")
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public ProductLendingRates additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

 /**
   * Link to a web page with more information  on this fee
   * @return additionalInfoUri
  **/
  @JsonProperty("additionalInfoUri")
  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  public ProductLendingRates additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductLendingRates {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
