package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class SimpleAddress   {
  @JsonProperty("mailingName")
  private String mailingName = null;
  @JsonProperty("addressLine1")
  private String addressLine1 = null;
  @JsonProperty("addressLine2")
  private String addressLine2 = null;
  @JsonProperty("addressLine3")
  private String addressLine3 = null;
  @JsonProperty("postcode")
  private String postcode = null;
  @JsonProperty("city")
  private String city = null;
  @JsonProperty("state")
  private String state = null;
  @JsonProperty("country")
  private String country = null;
  /**
   * Name of the individual or business formatted for inclusion in an address used for physical mail
   **/
  public SimpleAddress mailingName(String mailingName) {
    this.mailingName = mailingName;
    return this;
  }

  
  @Schema(description = "Name of the individual or business formatted for inclusion in an address used for physical mail")
  @JsonProperty("mailingName")
  public String getMailingName() {
    return mailingName;
  }
  public void setMailingName(String mailingName) {
    this.mailingName = mailingName;
  }

  /**
   * First line of the standard address object
   **/
  public SimpleAddress addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  
  @Schema(required = true, description = "First line of the standard address object")
  @JsonProperty("addressLine1")
  public String getAddressLine1() {
    return addressLine1;
  }
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  /**
   * Second line of the standard address object
   **/
  public SimpleAddress addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  
  @Schema(description = "Second line of the standard address object")
  @JsonProperty("addressLine2")
  public String getAddressLine2() {
    return addressLine2;
  }
  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  /**
   * Third line of the standard address object
   **/
  public SimpleAddress addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

  
  @Schema(description = "Third line of the standard address object")
  @JsonProperty("addressLine3")
  public String getAddressLine3() {
    return addressLine3;
  }
  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

  /**
   * Mandatory for Australian addresses
   **/
  public SimpleAddress postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  
  @Schema(description = "Mandatory for Australian addresses")
  @JsonProperty("postcode")
  public String getPostcode() {
    return postcode;
  }
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  /**
   * Name of the city or locality
   **/
  public SimpleAddress city(String city) {
    this.city = city;
    return this;
  }

  
  @Schema(required = true, description = "Name of the city or locality")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * Free text if the country is not Australia. If country is Australia then must be one of the values defined by the ISO 3166:AU standard
   **/
  public SimpleAddress state(String state) {
    this.state = state;
    return this;
  }

  
  @Schema(required = true, description = "Free text if the country is not Australia. If country is Australia then must be one of the values defined by the ISO 3166:AU standard")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   * A valid ISO 3166 Alpha-3 country code
   **/
  public SimpleAddress country(String country) {
    this.country = country;
    return this;
  }

  
  @Schema(description = "A valid ISO 3166 Alpha-3 country code")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleAddress simpleAddress = (SimpleAddress) o;
    return Objects.equals(mailingName, simpleAddress.mailingName) &&
        Objects.equals(addressLine1, simpleAddress.addressLine1) &&
        Objects.equals(addressLine2, simpleAddress.addressLine2) &&
        Objects.equals(addressLine3, simpleAddress.addressLine3) &&
        Objects.equals(postcode, simpleAddress.postcode) &&
        Objects.equals(city, simpleAddress.city) &&
        Objects.equals(state, simpleAddress.state) &&
        Objects.equals(country, simpleAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailingName, addressLine1, addressLine2, addressLine3, postcode, city, state, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleAddress {\n");
    sb.append("    mailingName: ").append(toIndentedString(mailingName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
