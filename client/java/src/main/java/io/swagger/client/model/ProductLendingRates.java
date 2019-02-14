/*
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * ProductLendingRates
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-14T03:38:22.905Z[GMT]")public class ProductLendingRates {
  /**
   * The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning
   */
  @JsonAdapter(LendingRateTypeEnum.Adapter.class)
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
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static LendingRateTypeEnum fromValue(String text) {
      for (LendingRateTypeEnum b : LendingRateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LendingRateTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LendingRateTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LendingRateTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LendingRateTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("lendingRateType")
  private LendingRateTypeEnum lendingRateType = null;

  @SerializedName("rate")
  private String rate = null;

  @SerializedName("additionalValue")
  private String additionalValue = null;

  @SerializedName("additionalInfo")
  private String additionalInfo = null;

  @SerializedName("additionalInfoUri")
  private String additionalInfoUri = null;
  public ProductLendingRates lendingRateType(LendingRateTypeEnum lendingRateType) {
    this.lendingRateType = lendingRateType;
    return this;
  }

  

  /**
  * The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning
  * @return lendingRateType
  **/
  @Schema(required = true, description = "The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning")
  public LendingRateTypeEnum getLendingRateType() {
    return lendingRateType;
  }
  public void setLendingRateType(LendingRateTypeEnum lendingRateType) {
    this.lendingRateType = lendingRateType;
  }
  public ProductLendingRates rate(String rate) {
    this.rate = rate;
    return this;
  }

  

  /**
  * The rate to be applied
  * @return rate
  **/
  @Schema(required = true, description = "The rate to be applied")
  public String getRate() {
    return rate;
  }
  public void setRate(String rate) {
    this.rate = rate;
  }
  public ProductLendingRates additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

  

  /**
  * Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType
  * @return additionalValue
  **/
  @Schema(description = "Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType")
  public String getAdditionalValue() {
    return additionalValue;
  }
  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }
  public ProductLendingRates additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  

  /**
  * Display text providing more information on the fee.
  * @return additionalInfo
  **/
  @Schema(description = "Display text providing more information on the fee.")
  public String getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }
  public ProductLendingRates additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

  

  /**
  * Link to a web page with more information  on this fee
  * @return additionalInfoUri
  **/
  @Schema(description = "Link to a web page with more information  on this fee")
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
    ProductLendingRates productLendingRates = (ProductLendingRates) o;
    return Objects.equals(this.lendingRateType, productLendingRates.lendingRateType) &&
        Objects.equals(this.rate, productLendingRates.rate) &&
        Objects.equals(this.additionalValue, productLendingRates.additionalValue) &&
        Objects.equals(this.additionalInfo, productLendingRates.additionalInfo) &&
        Objects.equals(this.additionalInfoUri, productLendingRates.additionalInfoUri);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(lendingRateType, rate, additionalValue, additionalInfo, additionalInfoUri);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
