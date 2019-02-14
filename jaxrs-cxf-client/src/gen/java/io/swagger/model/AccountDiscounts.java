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

public class AccountDiscounts  {
  
  @Schema(required = true, description = "Description of the discount")
 /**
   * Description of the discount  
  **/
  private String description = null;
  public enum DiscountTypeEnum {
    BALANCE("BALANCE"),
    DEPOSITS("DEPOSITS"),
    PAYMENTS("PAYMENTS"),
    BUNDLE("BUNDLE");

    private String value;

    DiscountTypeEnum(String value) {
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
    public static DiscountTypeEnum fromValue(String text) {
      for (DiscountTypeEnum b : DiscountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(required = true, description = "The type of discount. See the next section for an overview of valid values and their meaning")
 /**
   * The type of discount. See the next section for an overview of valid values and their meaning  
  **/
  private DiscountTypeEnum discountType = null;
  
  @Schema(required = true, description = "Value of the discount. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself")
 /**
   * Value of the discount. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself  
  **/
  private String amount = null;
  
  @Schema(description = "Generic field containing additional information relevant to the discountType specified. Whether mandatory or not is dependent on the value of discountType")
 /**
   * Generic field containing additional information relevant to the discountType specified. Whether mandatory or not is dependent on the value of discountType  
  **/
  private String additionalValue = null;
 /**
   * Description of the discount
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccountDiscounts description(String description) {
    this.description = description;
    return this;
  }

 /**
   * The type of discount. See the next section for an overview of valid values and their meaning
   * @return discountType
  **/
  @JsonProperty("discountType")
  public String getDiscountType() {
    if (discountType == null) {
      return null;
    }
    return discountType.getValue();
  }

  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  public AccountDiscounts discountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
    return this;
  }

 /**
   * Value of the discount. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself
   * @return amount
  **/
  @JsonProperty("amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public AccountDiscounts amount(String amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Generic field containing additional information relevant to the discountType specified. Whether mandatory or not is dependent on the value of discountType
   * @return additionalValue
  **/
  @JsonProperty("additionalValue")
  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public AccountDiscounts additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
