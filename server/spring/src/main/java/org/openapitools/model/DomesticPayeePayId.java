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
 * DomesticPayeePayId
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-14T17:34:34.379921+11:00[Australia/Sydney]")

public class DomesticPayeePayId   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("identifier")
  private String identifier;

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
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  public DomesticPayeePayId name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name assigned to the PayID by the owner of the PayID
   * @return name
  */
  @ApiModelProperty(value = "The name assigned to the PayID by the owner of the PayID")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DomesticPayeePayId identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * The identifier of the PayID (dependent on type)
   * @return identifier
  */
  @ApiModelProperty(required = true, value = "The identifier of the PayID (dependent on type)")
  @NotNull


  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public DomesticPayeePayId type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the PayID
   * @return type
  */
  @ApiModelProperty(required = true, value = "The type of the PayID")
  @NotNull


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
    return Objects.equals(this.name, domesticPayeePayId.name) &&
        Objects.equals(this.identifier, domesticPayeePayId.identifier) &&
        Objects.equals(this.type, domesticPayeePayId.type);
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

