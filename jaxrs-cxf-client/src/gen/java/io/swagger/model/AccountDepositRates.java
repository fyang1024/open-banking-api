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

public class AccountDepositRates  {
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
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static DepositRateTypeEnum fromValue(String text) {
      for (DepositRateTypeEnum b : DepositRateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(required = true, description = "The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning")
 /**
   * The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning  
  **/
  private DepositRateTypeEnum depositRateType = null;
  
  @Schema(required = true, description = "The rate to be applied")
 /**
   * The rate to be applied  
  **/
  private String rate = null;
  
  @Schema(description = "Generic field containing additional information relevant to the depositRateType specified. Whether mandatory or not is dependent on the value of depositRateType")
 /**
   * Generic field containing additional information relevant to the depositRateType specified. Whether mandatory or not is dependent on the value of depositRateType  
  **/
  private String additionalValue = null;
  
  @Schema(description = "Display text providing more information on the fee")
 /**
   * Display text providing more information on the fee  
  **/
  private String additionalInfo = null;
  
  @Schema(description = "Link to a web page with more information on this fee")
 /**
   * Link to a web page with more information on this fee  
  **/
  private String additionalInfoUri = null;
 /**
   * The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning
   * @return depositRateType
  **/
  @JsonProperty("depositRateType")
  public String getDepositRateType() {
    if (depositRateType == null) {
      return null;
    }
    return depositRateType.getValue();
  }

  public void setDepositRateType(DepositRateTypeEnum depositRateType) {
    this.depositRateType = depositRateType;
  }

  public AccountDepositRates depositRateType(DepositRateTypeEnum depositRateType) {
    this.depositRateType = depositRateType;
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

  public AccountDepositRates rate(String rate) {
    this.rate = rate;
    return this;
  }

 /**
   * Generic field containing additional information relevant to the depositRateType specified. Whether mandatory or not is dependent on the value of depositRateType
   * @return additionalValue
  **/
  @JsonProperty("additionalValue")
  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public AccountDepositRates additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

 /**
   * Display text providing more information on the fee
   * @return additionalInfo
  **/
  @JsonProperty("additionalInfo")
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public AccountDepositRates additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

 /**
   * Link to a web page with more information on this fee
   * @return additionalInfoUri
  **/
  @JsonProperty("additionalInfoUri")
  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  public AccountDepositRates additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
