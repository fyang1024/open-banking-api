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

public class ProductFeatures  {
  public enum FeatureTypeEnum {
    CARD_ACCESS("CARD_ACCESS"),
    ADDITIONAL_CARDS("ADDITIONAL_CARDS"),
    UNLIMITED_TXNS("UNLIMITED_TXNS"),
    FREE_TXNS("FREE_TXNS"),
    FREE_TXNS_ALLOWANCE("FREE_TXNS_ALLOWANCE"),
    LOYALTY_PROGRAM("LOYALTY_PROGRAM"),
    OFFSET("OFFSET"),
    OVERDRAFT("OVERDRAFT"),
    REDRAW("REDRAW"),
    INSURANCE("INSURANCE"),
    BALANCE_TRANSFERS("BALANCE_TRANSFERS"),
    INTEREST_FREE("INTEREST_FREE"),
    INTEREST_FREE_TRANSFERS("INTEREST_FREE_TRANSFERS"),
    DIGITAL_WALLET("DIGITAL_WALLET"),
    DIGITAL_BANKING("DIGITAL_BANKING"),
    NPP_PAYID("NPP_PAYID"),
    NPP_ENABLED("NPP_ENABLED"),
    DONATE_INTEREST("DONATE_INTEREST"),
    BILL_PAYMENT("BILL_PAYMENT");

    private String value;

    FeatureTypeEnum(String value) {
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
    public static FeatureTypeEnum fromValue(String text) {
      for (FeatureTypeEnum b : FeatureTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(required = true, description = "The type of feature described")
 /**
   * The type of feature described  
  **/
  private FeatureTypeEnum featureType = null;
  
  @Schema(description = "Generic field containing additional information relevant to the featureType specified. Whether mandatory or not is dependent on the value of featureType")
 /**
   * Generic field containing additional information relevant to the featureType specified. Whether mandatory or not is dependent on the value of featureType  
  **/
  private String additionalValue = null;
 /**
   * The type of feature described
   * @return featureType
  **/
  @JsonProperty("featureType")
  public String getFeatureType() {
    if (featureType == null) {
      return null;
    }
    return featureType.getValue();
  }

  public void setFeatureType(FeatureTypeEnum featureType) {
    this.featureType = featureType;
  }

  public ProductFeatures featureType(FeatureTypeEnum featureType) {
    this.featureType = featureType;
    return this;
  }

 /**
   * Generic field containing additional information relevant to the featureType specified. Whether mandatory or not is dependent on the value of featureType
   * @return additionalValue
  **/
  @JsonProperty("additionalValue")
  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public ProductFeatures additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductFeatures {\n");
    
    sb.append("    featureType: ").append(toIndentedString(featureType)).append("\n");
    sb.append("    additionalValue: ").append(toIndentedString(additionalValue)).append("\n");
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
