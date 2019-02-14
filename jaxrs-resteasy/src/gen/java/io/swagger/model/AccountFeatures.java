package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class AccountFeatures   {
  /**
   * The type of feature described
   */
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FeatureTypeEnum featureType = null;  private String additionalValue = null;

  /**
   * The type of feature described
   **/
  
  @Schema(required = true, description = "The type of feature described")
  @JsonProperty("featureType")
  @NotNull
  public FeatureTypeEnum getFeatureType() {
    return featureType;
  }
  public void setFeatureType(FeatureTypeEnum featureType) {
    this.featureType = featureType;
  }

  /**
   * Generic field containing additional information relevant to the featureType specified. Whether mandatory or not is dependent on the value of featureType
   **/
  
  @Schema(description = "Generic field containing additional information relevant to the featureType specified. Whether mandatory or not is dependent on the value of featureType")
  @JsonProperty("additionalValue")
  public String getAdditionalValue() {
    return additionalValue;
  }
  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountFeatures accountFeatures = (AccountFeatures) o;
    return Objects.equals(featureType, accountFeatures.featureType) &&
        Objects.equals(additionalValue, accountFeatures.additionalValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureType, additionalValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFeatures {\n");
    
    sb.append("    featureType: ").append(toIndentedString(featureType)).append("\n");
    sb.append("    additionalValue: ").append(toIndentedString(additionalValue)).append("\n");
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
