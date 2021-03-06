/*
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openbanking.client.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PhoneNumber
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-17T21:56:09.632+11:00[Australia/Sydney]")
public class PhoneNumber {
  public static final String SERIALIZED_NAME_IS_PREFERRED = "isPreferred";
  @SerializedName(SERIALIZED_NAME_IS_PREFERRED)
  private Boolean isPreferred;

  /**
   * The purpose of the number as specified by the customer
   */
  @JsonAdapter(PurposeEnum.Adapter.class)
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

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PurposeEnum fromValue(String text) {
      for (PurposeEnum b : PurposeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<PurposeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PurposeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PurposeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PurposeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_PURPOSE = "purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE)
  private PurposeEnum purpose;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_AREA_CODE = "areaCode";
  @SerializedName(SERIALIZED_NAME_AREA_CODE)
  private String areaCode;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_FULL_NUMBER = "fullNumber";
  @SerializedName(SERIALIZED_NAME_FULL_NUMBER)
  private String fullNumber;

  public PhoneNumber isPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
    return this;
  }

   /**
   * Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be &#39;false&#39; if not present
   * @return isPreferred
  **/
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
  **/
  @ApiModelProperty(required = true, value = "The purpose of the number as specified by the customer")
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
  **/
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
  **/
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
  **/
  @ApiModelProperty(required = true, value = "The actual phone number, with leading zeros as appropriate")
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
  **/
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
  **/
  @ApiModelProperty(required = true, value = "Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966")
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

