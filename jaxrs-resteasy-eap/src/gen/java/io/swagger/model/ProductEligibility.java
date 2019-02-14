package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2019-02-14T03:34:59.075Z[GMT]")public class ProductEligibility   {
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
  }
  private EligibilityTypeEnum eligibilityType = null;
  private String additionalValue = null;
  private String additionalInfo = null;
  private String additionalInfoUri = null;

  /**
   * The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning
   **/
  
  @Schema(required = true, description = "The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning")
  @JsonProperty("eligibilityType")
  @NotNull
  public EligibilityTypeEnum getEligibilityType() {
    return eligibilityType;
  }
  public void setEligibilityType(EligibilityTypeEnum eligibilityType) {
    this.eligibilityType = eligibilityType;
  }

  /**
   * Generic field containing additional information relevant to the eligibilityType specified.  Whether mandatory or not is dependent on the value of eligibilityType
   **/
  
  @Schema(description = "Generic field containing additional information relevant to the eligibilityType specified.  Whether mandatory or not is dependent on the value of eligibilityType")
  @JsonProperty("additionalValue")
  public String getAdditionalValue() {
    return additionalValue;
  }
  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  /**
   * Display text providing more information on the eligibility criteria. Mandatory if the eligibilityType field is set to OTHER
   **/
  
  @Schema(description = "Display text providing more information on the eligibility criteria. Mandatory if the eligibilityType field is set to OTHER")
  @JsonProperty("additionalInfo")
  public String getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  /**
   * Link to a web page with more information on this eligibility criteria
   **/
  
  @Schema(description = "Link to a web page with more information on this eligibility criteria")
  @JsonProperty("additionalInfoUri")
  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }
  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductEligibility productEligibility = (ProductEligibility) o;
    return Objects.equals(eligibilityType, productEligibility.eligibilityType) &&
        Objects.equals(additionalValue, productEligibility.additionalValue) &&
        Objects.equals(additionalInfo, productEligibility.additionalInfo) &&
        Objects.equals(additionalInfoUri, productEligibility.additionalInfoUri);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
