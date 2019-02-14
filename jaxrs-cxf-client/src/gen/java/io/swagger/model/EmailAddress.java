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

public class EmailAddress  {
  
  @Schema(required = true, description = "Required for one and only one email record in the collection. Denotes the default email address")
 /**
   * Required for one and only one email record in the collection. Denotes the default email address  
  **/
  private Boolean isPreferred = null;
  public enum PurposeEnum {
    WORK("WORK"),
    HOME("HOME"),
    OTHER("OTHER"),
    UNSPECIFIED("UNSPECIFIED");

    private String value;

    PurposeEnum(String value) {
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
    public static PurposeEnum fromValue(String text) {
      for (PurposeEnum b : PurposeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(required = true, description = "The purpose for the email, as specified by the customer (Enumeration)")
 /**
   * The purpose for the email, as specified by the customer (Enumeration)  
  **/
  private PurposeEnum purpose = null;
  
  @Schema(required = true, description = "A correctly formatted email address, as defined by the addr_spec format in RFC_5322")
 /**
   * A correctly formatted email address, as defined by the addr_spec format in RFC_5322  
  **/
  private String address = null;
 /**
   * Required for one and only one email record in the collection. Denotes the default email address
   * @return isPreferred
  **/
  @JsonProperty("isPreferred")
  public Boolean isisIsPreferred() {
    return isPreferred;
  }

  public void setIsPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
  }

  public EmailAddress isPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
    return this;
  }

 /**
   * The purpose for the email, as specified by the customer (Enumeration)
   * @return purpose
  **/
  @JsonProperty("purpose")
  public String getPurpose() {
    if (purpose == null) {
      return null;
    }
    return purpose.getValue();
  }

  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }

  public EmailAddress purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

 /**
   * A correctly formatted email address, as defined by the addr_spec format in RFC_5322
   * @return address
  **/
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public EmailAddress address(String address) {
    this.address = address;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAddress {\n");
    
    sb.append("    isPreferred: ").append(toIndentedString(isPreferred)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
