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

public class ProductEligibility  {
  public enum EligibilityTypeEnum {
    BUSINESS("BUSINESS"),
    PENSION_RECIPIENT("PENSION_RECIPIENT"),
    MIN_AGE("MIN_AGE"),
    MAX_AGE("MAX_AGE"),
    MIN_INCOME("MIN_INCOME"),
    MIN_TURNOVER("MIN_TURNOVER"),
    STAFF("STAFF"),
    STUDENT("STUDENT"),
    EMPLOYMENT_STATUS("EMPLOYMENT_STATUS"),
    RESIDENCY_STATUS("RESIDENCY_STATUS"),
    OTHER("OTHER");

    private String value;

    EligibilityTypeEnum(String value) {
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
    public static EligibilityTypeEnum fromValue(String text) {
      for (EligibilityTypeEnum b : EligibilityTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(required = true, description = "The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning")
 /**
   * The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning  
  **/
  private EligibilityTypeEnum eligibilityType = null;
  
  @Schema(description = "Generic field containing additional information relevant to the eligibilityType specified.  Whether mandatory or not is dependent on the value of eligibilityType")
 /**
   * Generic field containing additional information relevant to the eligibilityType specified.  Whether mandatory or not is dependent on the value of eligibilityType  
  **/
  private String additionalValue = null;
  
  @Schema(description = "Display text providing more information on the eligibility criteria. Mandatory if the eligibilityType field is set to OTHER")
 /**
   * Display text providing more information on the eligibility criteria. Mandatory if the eligibilityType field is set to OTHER  
  **/
  private String additionalInfo = null;
  
  @Schema(description = "Link to a web page with more information on this eligibility criteria")
 /**
   * Link to a web page with more information on this eligibility criteria  
  **/
  private String additionalInfoUri = null;
 /**
   * The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning
   * @return eligibilityType
  **/
  @JsonProperty("eligibilityType")
  public String getEligibilityType() {
    if (eligibilityType == null) {
      return null;
    }
    return eligibilityType.getValue();
  }

  public void setEligibilityType(EligibilityTypeEnum eligibilityType) {
    this.eligibilityType = eligibilityType;
  }

  public ProductEligibility eligibilityType(EligibilityTypeEnum eligibilityType) {
    this.eligibilityType = eligibilityType;
    return this;
  }

 /**
   * Generic field containing additional information relevant to the eligibilityType specified.  Whether mandatory or not is dependent on the value of eligibilityType
   * @return additionalValue
  **/
  @JsonProperty("additionalValue")
  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public ProductEligibility additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

 /**
   * Display text providing more information on the eligibility criteria. Mandatory if the eligibilityType field is set to OTHER
   * @return additionalInfo
  **/
  @JsonProperty("additionalInfo")
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public ProductEligibility additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

 /**
   * Link to a web page with more information on this eligibility criteria
   * @return additionalInfoUri
  **/
  @JsonProperty("additionalInfoUri")
  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  public ProductEligibility additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductEligibility {\n");
    
    sb.append("    eligibilityType: ").append(toIndentedString(eligibilityType)).append("\n");
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
