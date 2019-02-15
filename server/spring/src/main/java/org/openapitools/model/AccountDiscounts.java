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
 * AccountDiscounts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class AccountDiscounts   {
  @JsonProperty("description")
  private String description;

  /**
   * The type of discount. See the next section for an overview of valid values and their meaning
   */
  public enum DiscountTypeEnum {
    BALANCE("BALANCE"),
    
    DEPOSITS("DEPOSITS"),
    
    PAYMENTS("PAYMENTS"),
    
    BUNDLE("BUNDLE");

    private String value;

    DiscountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DiscountTypeEnum fromValue(String text) {
      for (DiscountTypeEnum b : DiscountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("discountType")
  private DiscountTypeEnum discountType;

  @JsonProperty("amount")
  private String amount;

  @JsonProperty("additionalValue")
  private String additionalValue;

  public AccountDiscounts description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the discount
   * @return description
  */
  @ApiModelProperty(required = true, value = "Description of the discount")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccountDiscounts discountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
    return this;
  }

  /**
   * The type of discount. See the next section for an overview of valid values and their meaning
   * @return discountType
  */
  @ApiModelProperty(required = true, value = "The type of discount. See the next section for an overview of valid values and their meaning")
  @NotNull


  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }

  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  public AccountDiscounts amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Value of the discount. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself
   * @return amount
  */
  @ApiModelProperty(required = true, value = "Value of the discount. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself")
  @NotNull


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public AccountDiscounts additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

  /**
   * Generic field containing additional information relevant to the discountType specified. Whether mandatory or not is dependent on the value of discountType
   * @return additionalValue
  */
  @ApiModelProperty(value = "Generic field containing additional information relevant to the discountType specified. Whether mandatory or not is dependent on the value of discountType")


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
    AccountDiscounts accountDiscounts = (AccountDiscounts) o;
    return Objects.equals(this.description, accountDiscounts.description) &&
        Objects.equals(this.discountType, accountDiscounts.discountType) &&
        Objects.equals(this.amount, accountDiscounts.amount) &&
        Objects.equals(this.additionalValue, accountDiscounts.additionalValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, discountType, amount, additionalValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDiscounts {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

