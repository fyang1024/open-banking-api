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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * InternationalPayeeBeneficiaryDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-17T21:56:09.632+11:00[Australia/Sydney]")
public class InternationalPayeeBeneficiaryDetails {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public InternationalPayeeBeneficiaryDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the beneficiary
   * @return name
  **/
  @ApiModelProperty(value = "Name of the beneficiary")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InternationalPayeeBeneficiaryDetails country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country where the beneficiary resides. A valid ISO 3166 Alpha-3 country code
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Country where the beneficiary resides. A valid ISO 3166 Alpha-3 country code")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public InternationalPayeeBeneficiaryDetails message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Response message for the payment
   * @return message
  **/
  @ApiModelProperty(value = "Response message for the payment")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternationalPayeeBeneficiaryDetails internationalPayeeBeneficiaryDetails = (InternationalPayeeBeneficiaryDetails) o;
    return Objects.equals(this.name, internationalPayeeBeneficiaryDetails.name) &&
        Objects.equals(this.country, internationalPayeeBeneficiaryDetails.country) &&
        Objects.equals(this.message, internationalPayeeBeneficiaryDetails.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, country, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternationalPayeeBeneficiaryDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

