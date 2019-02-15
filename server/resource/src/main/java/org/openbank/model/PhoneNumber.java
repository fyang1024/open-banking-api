package org.openbank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/**
 * PhoneNumber
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class PhoneNumber   {
  @JsonProperty("isPreferred")
  private Boolean isPreferred;

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
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("purpose")
  private PurposeEnum purpose;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("areaCode")
  private String areaCode;

  @JsonProperty("number")
  private String number;

  @JsonProperty("extension")
  private String extension;

  @JsonProperty("fullNumber")
  private String fullNumber;

  public PhoneNumber isPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
    return this;
  }

  /**
   * Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be 'false' if not present
   * @return isPreferred
  */
  @ApiModelProperty(value = "Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be 'false' if not present")


  public Boolean getIsPreferred() {
    return isPreferred;
  }

  public void setIsPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
  }

  public PhoneNumber purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * The purpose of the number as specified by the customer
   * @return purpose
  */
  @ApiModelProperty(required = true, value = "The purpose of the number as specified by the customer")
  @NotNull


  public PurposeEnum getPurpose() {
    return purpose;
  }

  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }

  public PhoneNumber countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * If absent, assumed to be Australia (+61). The + should be included
   * @return countryCode
  */
  @ApiModelProperty(value = "If absent, assumed to be Australia (+61). The + should be included")


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public PhoneNumber areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

  /**
   * Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted.
   * @return areaCode
  */
  @ApiModelProperty(value = "Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted.")


  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public PhoneNumber number(String number) {
    this.number = number;
    return this;
  }

  /**
   * The actual phone number, with leading zeros as appropriate
   * @return number
  */
  @ApiModelProperty(required = true, value = "The actual phone number, with leading zeros as appropriate")
  @NotNull


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public PhoneNumber extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * An extension number (if applicable)
   * @return extension
  */
  @ApiModelProperty(value = "An extension number (if applicable)")


  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public PhoneNumber fullNumber(String fullNumber) {
    this.fullNumber = fullNumber;
    return this;
  }

  /**
   * Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966
   * @return fullNumber
  */
  @ApiModelProperty(required = true, value = "Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966")
  @NotNull


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
    return Objects.equals(this.isPreferred, phoneNumber.isPreferred) &&
        Objects.equals(this.purpose, phoneNumber.purpose) &&
        Objects.equals(this.countryCode, phoneNumber.countryCode) &&
        Objects.equals(this.areaCode, phoneNumber.areaCode) &&
        Objects.equals(this.number, phoneNumber.number) &&
        Objects.equals(this.extension, phoneNumber.extension) &&
        Objects.equals(this.fullNumber, phoneNumber.fullNumber);
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

