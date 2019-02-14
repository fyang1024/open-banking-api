package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class PhoneNumber   {
  @JsonProperty("isPreferred")
  private Boolean isPreferred = null;
  /**
   * The purpose of the number as specified by the customer
   */
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

    @Override
    @JsonValue
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
  @JsonProperty("purpose")
  private PurposeEnum purpose = null;
  @JsonProperty("countryCode")
  private String countryCode = null;
  @JsonProperty("areaCode")
  private String areaCode = null;
  @JsonProperty("number")
  private String number = null;
  @JsonProperty("extension")
  private String extension = null;
  @JsonProperty("fullNumber")
  private String fullNumber = null;
  /**
   * Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be 'false' if not present
   **/
  public PhoneNumber isPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
    return this;
  }

  
  @Schema(description = "Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be 'false' if not present")
  @JsonProperty("isPreferred")
  public Boolean isIsPreferred() {
    return isPreferred;
  }
  public void setIsPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
  }

  /**
   * The purpose of the number as specified by the customer
   **/
  public PhoneNumber purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

  
  @Schema(required = true, description = "The purpose of the number as specified by the customer")
  @JsonProperty("purpose")
  public PurposeEnum getPurpose() {
    return purpose;
  }
  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }

  /**
   * If absent, assumed to be Australia (+61). The + should be included
   **/
  public PhoneNumber countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  
  @Schema(description = "If absent, assumed to be Australia (+61). The + should be included")
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted.
   **/
  public PhoneNumber areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

  
  @Schema(description = "Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted.")
  @JsonProperty("areaCode")
  public String getAreaCode() {
    return areaCode;
  }
  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  /**
   * The actual phone number, with leading zeros as appropriate
   **/
  public PhoneNumber number(String number) {
    this.number = number;
    return this;
  }

  
  @Schema(required = true, description = "The actual phone number, with leading zeros as appropriate")
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * An extension number (if applicable)
   **/
  public PhoneNumber extension(String extension) {
    this.extension = extension;
    return this;
  }

  
  @Schema(description = "An extension number (if applicable)")
  @JsonProperty("extension")
  public String getExtension() {
    return extension;
  }
  public void setExtension(String extension) {
    this.extension = extension;
  }

  /**
   * Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966
   **/
  public PhoneNumber fullNumber(String fullNumber) {
    this.fullNumber = fullNumber;
    return this;
  }

  
  @Schema(required = true, description = "Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966")
  @JsonProperty("fullNumber")
  public String getFullNumber() {
    return fullNumber;
  }
  public void setFullNumber(String fullNumber) {
    this.fullNumber = fullNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumber phoneNumber = (PhoneNumber) o;
    return Objects.equals(isPreferred, phoneNumber.isPreferred) &&
        Objects.equals(purpose, phoneNumber.purpose) &&
        Objects.equals(countryCode, phoneNumber.countryCode) &&
        Objects.equals(areaCode, phoneNumber.areaCode) &&
        Objects.equals(number, phoneNumber.number) &&
        Objects.equals(extension, phoneNumber.extension) &&
        Objects.equals(fullNumber, phoneNumber.fullNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPreferred, purpose, countryCode, areaCode, number, extension, fullNumber);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
