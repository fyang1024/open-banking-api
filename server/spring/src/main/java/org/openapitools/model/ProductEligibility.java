package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductEligibility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-14T17:34:34.379921+11:00[Australia/Sydney]")

public class ProductEligibility   {
  /**
   * The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning
   */
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

    @Override
    @JsonValue
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
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("eligibilityType")
  private EligibilityTypeEnum eligibilityType;

  @JsonProperty("additionalValue")
  private String additionalValue;

  @JsonProperty("additionalInfo")
  private String additionalInfo;

  @JsonProperty("additionalInfoUri")
  private String additionalInfoUri;

  public ProductEligibility eligibilityType(EligibilityTypeEnum eligibilityType) {
    this.eligibilityType = eligibilityType;
    return this;
  }

  /**
   * The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning
   * @return eligibilityType
  */
  @ApiModelProperty(required = true, value = "The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning")
  @NotNull


  public EligibilityTypeEnum getEligibilityType() {
    return eligibilityType;
  }

  public void setEligibilityType(EligibilityTypeEnum eligibilityType) {
    this.eligibilityType = eligibilityType;
  }

  public ProductEligibility additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

  /**
   * Generic field containing additional information relevant to the eligibilityType specified.  Whether mandatory or not is dependent on the value of eligibilityType
   * @return additionalValue
  */
  @ApiModelProperty(value = "Generic field containing additional information relevant to the eligibilityType specified.  Whether mandatory or not is dependent on the value of eligibilityType")


  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public ProductEligibility additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Display text providing more information on the eligibility criteria. Mandatory if the eligibilityType field is set to OTHER
   * @return additionalInfo
  */
  @ApiModelProperty(value = "Display text providing more information on the eligibility criteria. Mandatory if the eligibilityType field is set to OTHER")


  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public ProductEligibility additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

  /**
   * Link to a web page with more information on this eligibility criteria
   * @return additionalInfoUri
  */
  @ApiModelProperty(value = "Link to a web page with more information on this eligibility criteria")


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
    ProductEligibility productEligibility = (ProductEligibility) o;
    return Objects.equals(this.eligibilityType, productEligibility.eligibilityType) &&
        Objects.equals(this.additionalValue, productEligibility.additionalValue) &&
        Objects.equals(this.additionalInfo, productEligibility.additionalInfo) &&
        Objects.equals(this.additionalInfoUri, productEligibility.additionalInfoUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligibilityType, additionalValue, additionalInfo, additionalInfoUri);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

