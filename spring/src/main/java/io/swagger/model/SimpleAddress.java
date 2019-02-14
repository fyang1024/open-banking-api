package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SimpleAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-14T03:26:14.367Z[GMT]")
public class SimpleAddress   {
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

  public SimpleAddress mailingName(String mailingName) {
    this.mailingName = mailingName;
    return this;
  }

  /**
   * Name of the individual or business formatted for inclusion in an address used for physical mail
   * @return mailingName
  **/
  @ApiModelProperty(value = "Name of the individual or business formatted for inclusion in an address used for physical mail")

  public String getMailingName() {
    return mailingName;
  }

  public void setMailingName(String mailingName) {
    this.mailingName = mailingName;
  }

  public SimpleAddress addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * First line of the standard address object
   * @return addressLine1
  **/
  @ApiModelProperty(required = true, value = "First line of the standard address object")
  @NotNull

  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public SimpleAddress addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Second line of the standard address object
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Second line of the standard address object")

  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public SimpleAddress addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

  /**
   * Third line of the standard address object
   * @return addressLine3
  **/
  @ApiModelProperty(value = "Third line of the standard address object")

  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

  public SimpleAddress postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  /**
   * Mandatory for Australian addresses
   * @return postcode
  **/
  @ApiModelProperty(value = "Mandatory for Australian addresses")

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public SimpleAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Name of the city or locality
   * @return city
  **/
  @ApiModelProperty(required = true, value = "Name of the city or locality")
  @NotNull

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public SimpleAddress state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Free text if the country is not Australia. If country is Australia then must be one of the values defined by the ISO 3166:AU standard
   * @return state
  **/
  @ApiModelProperty(required = true, value = "Free text if the country is not Australia. If country is Australia then must be one of the values defined by the ISO 3166:AU standard")
  @NotNull

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public SimpleAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * A valid ISO 3166 Alpha-3 country code
   * @return country
  **/
  @ApiModelProperty(value = "A valid ISO 3166 Alpha-3 country code")

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
    return Objects.equals(this.mailingName, simpleAddress.mailingName) &&
        Objects.equals(this.addressLine1, simpleAddress.addressLine1) &&
        Objects.equals(this.addressLine2, simpleAddress.addressLine2) &&
        Objects.equals(this.addressLine3, simpleAddress.addressLine3) &&
        Objects.equals(this.postcode, simpleAddress.postcode) &&
        Objects.equals(this.city, simpleAddress.city) &&
        Objects.equals(this.state, simpleAddress.state) &&
        Objects.equals(this.country, simpleAddress.country);
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
