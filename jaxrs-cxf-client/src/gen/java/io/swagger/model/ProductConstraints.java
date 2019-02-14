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

public class ProductConstraints  {
  public enum ConstraintTypeEnum {
    MIN_BALANCE("MIN_BALANCE"),
    OPENING_BALANCE("OPENING_BALANCE"),
    MAX_LIMIT("MAX_LIMIT"),
    MIN_LIMIT("MIN_LIMIT");

    private String value;

    ConstraintTypeEnum(String value) {
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
    public static ConstraintTypeEnum fromValue(String text) {
      for (ConstraintTypeEnum b : ConstraintTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(required = true, description = "The type of constraint described.  See the next section for an overview of valid values and their meaning")
 /**
   * The type of constraint described.  See the next section for an overview of valid values and their meaning  
  **/
  private ConstraintTypeEnum constraintType = null;
  
  @Schema(description = "Generic field containing additional information relevant to the constraintType specified.  Whether mandatory or not is dependent on the value of constraintType")
 /**
   * Generic field containing additional information relevant to the constraintType specified.  Whether mandatory or not is dependent on the value of constraintType  
  **/
  private String additionalValue = null;
 /**
   * The type of constraint described.  See the next section for an overview of valid values and their meaning
   * @return constraintType
  **/
  @JsonProperty("constraintType")
  public String getConstraintType() {
    if (constraintType == null) {
      return null;
    }
    return constraintType.getValue();
  }

  public void setConstraintType(ConstraintTypeEnum constraintType) {
    this.constraintType = constraintType;
  }

  public ProductConstraints constraintType(ConstraintTypeEnum constraintType) {
    this.constraintType = constraintType;
    return this;
  }

 /**
   * Generic field containing additional information relevant to the constraintType specified.  Whether mandatory or not is dependent on the value of constraintType
   * @return additionalValue
  **/
  @JsonProperty("additionalValue")
  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public ProductConstraints additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
