package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class ProductConstraints   {
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
  }
  private ConstraintTypeEnum constraintType = null;  private String additionalValue = null;

  /**
   * The type of constraint described.  See the next section for an overview of valid values and their meaning
   **/
  
  @Schema(required = true, description = "The type of constraint described.  See the next section for an overview of valid values and their meaning")
  @JsonProperty("constraintType")
  @NotNull
  public ConstraintTypeEnum getConstraintType() {
    return constraintType;
  }
  public void setConstraintType(ConstraintTypeEnum constraintType) {
    this.constraintType = constraintType;
  }

  /**
   * Generic field containing additional information relevant to the constraintType specified.  Whether mandatory or not is dependent on the value of constraintType
   **/
  
  @Schema(description = "Generic field containing additional information relevant to the constraintType specified.  Whether mandatory or not is dependent on the value of constraintType")
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
    ProductConstraints productConstraints = (ProductConstraints) o;
    return Objects.equals(constraintType, productConstraints.constraintType) &&
        Objects.equals(additionalValue, productConstraints.additionalValue);
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
