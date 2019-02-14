package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class DomesticPayeePayId   {
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("identifier")
  private String identifier = null;
  /**
   * The type of the PayID
   */
  public enum TypeEnum {
    EMAIL("EMAIL"),
    
    MOBILE("MOBILE"),
    
    ORG_NUMBER("ORG_NUMBER"),
    
    ORG_NAME("ORG_NAME");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;
  /**
   * The name assigned to the PayID by the owner of the PayID
   **/
  public DomesticPayeePayId name(String name) {
    this.name = name;
    return this;
  }

  
  @Schema(description = "The name assigned to the PayID by the owner of the PayID")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The identifier of the PayID (dependent on type)
   **/
  public DomesticPayeePayId identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  
  @Schema(required = true, description = "The identifier of the PayID (dependent on type)")
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  /**
   * The type of the PayID
   **/
  public DomesticPayeePayId type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @Schema(required = true, description = "The type of the PayID")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomesticPayeePayId domesticPayeePayId = (DomesticPayeePayId) o;
    return Objects.equals(name, domesticPayeePayId.name) &&
        Objects.equals(identifier, domesticPayeePayId.identifier) &&
        Objects.equals(type, domesticPayeePayId.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, identifier, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomesticPayeePayId {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
