package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class ProductDiscounts   {
  @JsonProperty("description")
  private String description = null;
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
      return null;
    }
  }
  @JsonProperty("discountType")
  private DiscountTypeEnum discountType = null;
  @JsonProperty("amount")
  private String amount = null;
  @JsonProperty("additionalValue")
  private String additionalValue = null;
  /**
   * Description of the discount
   **/
  public ProductDiscounts description(String description) {
    this.description = description;
    return this;
  }

  
  @Schema(required = true, description = "Description of the discount")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The type of discount. See the next section for an overview of valid values and their meaning
   **/
  public ProductDiscounts discountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
    return this;
  }

  
  @Schema(required = true, description = "The type of discount. See the next section for an overview of valid values and their meaning")
  @JsonProperty("discountType")
  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }
  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  /**
   * Value of the discount. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself
   **/
  public ProductDiscounts amount(String amount) {
    this.amount = amount;
    return this;
  }

  
  @Schema(required = true, description = "Value of the discount. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself")
  @JsonProperty("amount")
  public String getAmount() {
    return amount;
  }
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * Generic field containing additional information relevant to the discountType specified. Whether mandatory or not is dependent on the value of discountType
   **/
  public ProductDiscounts additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

  
  @Schema(description = "Generic field containing additional information relevant to the discountType specified. Whether mandatory or not is dependent on the value of discountType")
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
    ProductDiscounts productDiscounts = (ProductDiscounts) o;
    return Objects.equals(description, productDiscounts.description) &&
        Objects.equals(discountType, productDiscounts.discountType) &&
        Objects.equals(amount, productDiscounts.amount) &&
        Objects.equals(additionalValue, productDiscounts.additionalValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, discountType, amount, additionalValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDiscounts {\n");
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
