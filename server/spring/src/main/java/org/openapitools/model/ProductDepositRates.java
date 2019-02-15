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
 * ProductDepositRates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class ProductDepositRates   {
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

    @JsonCreator
    public static DepositRateTypeEnum fromValue(String text) {
      for (DepositRateTypeEnum b : DepositRateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("depositRateType")
  private DepositRateTypeEnum depositRateType;

  @JsonProperty("rate")
  private String rate;

  @JsonProperty("additionalValue")
  private String additionalValue;

  @JsonProperty("additionalInfo")
  private String additionalInfo;

  @JsonProperty("additionalInfoUri")
  private String additionalInfoUri;

  public ProductDepositRates depositRateType(DepositRateTypeEnum depositRateType) {
    this.depositRateType = depositRateType;
    return this;
  }

  /**
   * The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning
   * @return depositRateType
  */
  @ApiModelProperty(required = true, value = "The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning")
  @NotNull


  public DepositRateTypeEnum getDepositRateType() {
    return depositRateType;
  }

  public void setDepositRateType(DepositRateTypeEnum depositRateType) {
    this.depositRateType = depositRateType;
  }

  public ProductDepositRates rate(String rate) {
    this.rate = rate;
    return this;
  }

  /**
   * The rate to be applied
   * @return rate
  */
  @ApiModelProperty(required = true, value = "The rate to be applied")
  @NotNull


  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public ProductDepositRates additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

  /**
   * Generic field containing additional information relevant to the depositRateType specified. Whether mandatory or not is dependent on the value of depositRateType
   * @return additionalValue
  */
  @ApiModelProperty(value = "Generic field containing additional information relevant to the depositRateType specified. Whether mandatory or not is dependent on the value of depositRateType")


  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public ProductDepositRates additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Display text providing more information on the fee
   * @return additionalInfo
  */
  @ApiModelProperty(value = "Display text providing more information on the fee")


  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public ProductDepositRates additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

  /**
   * Link to a web page with more information on this fee
   * @return additionalInfoUri
  */
  @ApiModelProperty(value = "Link to a web page with more information on this fee")


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
    ProductDepositRates productDepositRates = (ProductDepositRates) o;
    return Objects.equals(this.depositRateType, productDepositRates.depositRateType) &&
        Objects.equals(this.rate, productDepositRates.rate) &&
        Objects.equals(this.additionalValue, productDepositRates.additionalValue) &&
        Objects.equals(this.additionalInfo, productDepositRates.additionalInfo) &&
        Objects.equals(this.additionalInfoUri, productDepositRates.additionalInfoUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositRateType, rate, additionalValue, additionalInfo, additionalInfoUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDepositRates {\n");
    
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

