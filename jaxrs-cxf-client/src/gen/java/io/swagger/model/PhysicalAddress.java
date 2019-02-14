package io.swagger.model;

import io.swagger.model.PAFAddress;
import io.swagger.model.SimpleAddress;

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

public class PhysicalAddress  {
  public enum AddressUTypeEnum {
    SIMPLE("simple"),
    PAF("paf");

    private String value;

    AddressUTypeEnum(String value) {
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
    public static AddressUTypeEnum fromValue(String text) {
      for (AddressUTypeEnum b : AddressUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(required = true, description = "The type of address object present")
 /**
   * The type of address object present  
  **/
  private AddressUTypeEnum addressUType = null;
  
  @Schema(description = "")
  private SimpleAddress simple = null;
  
  @Schema(description = "")
  private PAFAddress paf = null;
 /**
   * The type of address object present
   * @return addressUType
  **/
  @JsonProperty("addressUType")
  public String getAddressUType() {
    if (addressUType == null) {
      return null;
    }
    return addressUType.getValue();
  }

  public void setAddressUType(AddressUTypeEnum addressUType) {
    this.addressUType = addressUType;
  }

  public PhysicalAddress addressUType(AddressUTypeEnum addressUType) {
    this.addressUType = addressUType;
    return this;
  }

 /**
   * Get simple
   * @return simple
  **/
  @JsonProperty("simple")
  public SimpleAddress getSimple() {
    return simple;
  }

  public void setSimple(SimpleAddress simple) {
    this.simple = simple;
  }

  public PhysicalAddress simple(SimpleAddress simple) {
    this.simple = simple;
    return this;
  }

 /**
   * Get paf
   * @return paf
  **/
  @JsonProperty("paf")
  public PAFAddress getPaf() {
    return paf;
  }

  public void setPaf(PAFAddress paf) {
    this.paf = paf;
  }

  public PhysicalAddress paf(PAFAddress paf) {
    this.paf = paf;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalAddress {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
