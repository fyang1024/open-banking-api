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
 * ProductConstraints
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class ProductConstraints   {
  /**
   * The type of constraint described.  See the next section for an overview of valid values and their meaning
   */
  public enum ConstraintTypeEnum {
    MIN_BALANCE("MIN_BALANCE"),
    
    OPENING_BALANCE("OPENING_BALANCE"),
    
    MAX_LIMIT("MAX_LIMIT"),
    
    MIN_LIMIT("MIN_LIMIT");

    private String value;

    ConstraintTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConstraintTypeEnum fromValue(String text) {
      for (ConstraintTypeEnum b : ConstraintTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("constraintType")
  private ConstraintTypeEnum constraintType;

  @JsonProperty("additionalValue")
  private String additionalValue;

  public ProductConstraints constraintType(ConstraintTypeEnum constraintType) {
    this.constraintType = constraintType;
    return this;
  }

  /**
   * The type of constraint described.  See the next section for an overview of valid values and their meaning
   * @return constraintType
  */
  @ApiModelProperty(required = true, value = "The type of constraint described.  See the next section for an overview of valid values and their meaning")
  @NotNull


  public ConstraintTypeEnum getConstraintType() {
    return constraintType;
  }

  public void setConstraintType(ConstraintTypeEnum constraintType) {
    this.constraintType = constraintType;
  }

  public ProductConstraints additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

  /**
   * Generic field containing additional information relevant to the constraintType specified.  Whether mandatory or not is dependent on the value of constraintType
   * @return additionalValue
  */
  @ApiModelProperty(value = "Generic field containing additional information relevant to the constraintType specified.  Whether mandatory or not is dependent on the value of constraintType")


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
    ProductConstraints productConstraints = (ProductConstraints) o;
    return Objects.equals(this.constraintType, productConstraints.constraintType) &&
        Objects.equals(this.additionalValue, productConstraints.additionalValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraintType, additionalValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductConstraints {\n");
    
    sb.append("    constraintType: ").append(toIndentedString(constraintType)).append("\n");
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

