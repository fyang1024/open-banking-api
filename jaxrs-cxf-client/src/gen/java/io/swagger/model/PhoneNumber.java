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

public class PhoneNumber  {
  
  @Schema(description = "Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be 'false' if not present")
 /**
   * Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be 'false' if not present  
  **/
  private Boolean isPreferred = null;
  public enum PurposeEnum {
    MOBILE("MOBILE"),
    HOME("HOME"),
    WORK("WORK"),
    OTHER("OTHER"),
    INTERNATIONAL("INTERNATIONAL"),
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
  @Schema(required = true, description = "The purpose of the number as specified by the customer")
 /**
   * The purpose of the number as specified by the customer  
  **/
  private PurposeEnum purpose = null;
  
  @Schema(description = "If absent, assumed to be Australia (+61). The + should be included")
 /**
   * If absent, assumed to be Australia (+61). The + should be included  
  **/
  private String countryCode = null;
  
  @Schema(description = "Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted.")
 /**
   * Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted.  
  **/
  private String areaCode = null;
  
  @Schema(required = true, description = "The actual phone number, with leading zeros as appropriate")
 /**
   * The actual phone number, with leading zeros as appropriate  
  **/
  private String number = null;
  
  @Schema(description = "An extension number (if applicable)")
 /**
   * An extension number (if applicable)  
  **/
  private String extension = null;
  
  @Schema(required = true, description = "Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966")
 /**
   * Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966  
  **/
  private String fullNumber = null;
 /**
   * Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be &#x27;false&#x27; if not present
   * @return isPreferred
  **/
  @JsonProperty("isPreferred")
  public Boolean isisIsPreferred() {
    return isPreferred;
  }

  public void setIsPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
  }

  public PhoneNumber isPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
    return this;
  }

 /**
   * The purpose of the number as specified by the customer
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

  public PhoneNumber purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

 /**
   * If absent, assumed to be Australia (+61). The + should be included
   * @return countryCode
  **/
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public PhoneNumber countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

 /**
   * Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted.
   * @return areaCode
  **/
  @JsonProperty("areaCode")
  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public PhoneNumber areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

 /**
   * The actual phone number, with leading zeros as appropriate
   * @return number
  **/
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public PhoneNumber number(String number) {
    this.number = number;
    return this;
  }

 /**
   * An extension number (if applicable)
   * @return extension
  **/
  @JsonProperty("extension")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public PhoneNumber extension(String extension) {
    this.extension = extension;
    return this;
  }

 /**
   * Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966
   * @return fullNumber
  **/
  @JsonProperty("fullNumber")
  public String getFullNumber() {
    return fullNumber;
  }

  public void setFullNumber(String fullNumber) {
    this.fullNumber = fullNumber;
  }

  public PhoneNumber fullNumber(String fullNumber) {
    this.fullNumber = fullNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumber {\n");
    
    sb.append("    isPreferred: ").append(toIndentedString(isPreferred)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    fullNumber: ").append(toIndentedString(fullNumber)).append("\n");
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
