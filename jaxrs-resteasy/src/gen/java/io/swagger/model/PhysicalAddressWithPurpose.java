package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.PAFAddress;
import io.swagger.model.PhysicalAddress;
import io.swagger.model.SimpleAddress;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class PhysicalAddressWithPurpose   {
  /**
   * The type of address object present
   */
  public enum AddressUTypeEnum {
    SIMPLE("simple"),

        PAF("paf");
    private String value;

    AddressUTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AddressUTypeEnum addressUType = null;  private SimpleAddress simple = null;  private PAFAddress paf = null;

  /**
   * The type of address object present
   **/
  
  @Schema(required = true, description = "The type of address object present")
  @JsonProperty("addressUType")
  @NotNull
  public AddressUTypeEnum getAddressUType() {
    return addressUType;
  }
  public void setAddressUType(AddressUTypeEnum addressUType) {
    this.addressUType = addressUType;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("simple")
  public SimpleAddress getSimple() {
    return simple;
  }
  public void setSimple(SimpleAddress simple) {
    this.simple = simple;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("paf")
  public PAFAddress getPaf() {
    return paf;
  }
  public void setPaf(PAFAddress paf) {
    this.paf = paf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhysicalAddressWithPurpose physicalAddressWithPurpose = (PhysicalAddressWithPurpose) o;
    return Objects.equals(addressUType, physicalAddressWithPurpose.addressUType) &&
        Objects.equals(simple, physicalAddressWithPurpose.simple) &&
        Objects.equals(paf, physicalAddressWithPurpose.paf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressUType, simple, paf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalAddressWithPurpose {\n");
    
    sb.append("    addressUType: ").append(toIndentedString(addressUType)).append("\n");
    sb.append("    simple: ").append(toIndentedString(simple)).append("\n");
    sb.append("    paf: ").append(toIndentedString(paf)).append("\n");
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
