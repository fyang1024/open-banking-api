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

public class SimpleAddress  {
  
  @Schema(description = "Name of the individual or business formatted for inclusion in an address used for physical mail")
 /**
   * Name of the individual or business formatted for inclusion in an address used for physical mail  
  **/
  private String mailingName = null;
  
  @Schema(required = true, description = "First line of the standard address object")
 /**
   * First line of the standard address object  
  **/
  private String addressLine1 = null;
  
  @Schema(description = "Second line of the standard address object")
 /**
   * Second line of the standard address object  
  **/
  private String addressLine2 = null;
  
  @Schema(description = "Third line of the standard address object")
 /**
   * Third line of the standard address object  
  **/
  private String addressLine3 = null;
  
  @Schema(description = "Mandatory for Australian addresses")
 /**
   * Mandatory for Australian addresses  
  **/
  private String postcode = null;
  
  @Schema(required = true, description = "Name of the city or locality")
 /**
   * Name of the city or locality  
  **/
  private String city = null;
  
  @Schema(required = true, description = "Free text if the country is not Australia. If country is Australia then must be one of the values defined by the ISO 3166:AU standard")
 /**
   * Free text if the country is not Australia. If country is Australia then must be one of the values defined by the ISO 3166:AU standard  
  **/
  private String state = null;
  
  @Schema(description = "A valid ISO 3166 Alpha-3 country code")
 /**
   * A valid ISO 3166 Alpha-3 country code  
  **/
  private String country = null;
 /**
   * Name of the individual or business formatted for inclusion in an address used for physical mail
   * @return mailingName
  **/
  @JsonProperty("mailingName")
  public String getMailingName() {
    return mailingName;
  }

  public void setMailingName(String mailingName) {
    this.mailingName = mailingName;
  }

  public SimpleAddress mailingName(String mailingName) {
    this.mailingName = mailingName;
    return this;
  }

 /**
   * First line of the standard address object
   * @return addressLine1
  **/
  @JsonProperty("addressLine1")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public SimpleAddress addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

 /**
   * Second line of the standard address object
   * @return addressLine2
  **/
  @JsonProperty("addressLine2")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public SimpleAddress addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

 /**
   * Third line of the standard address object
   * @return addressLine3
  **/
  @JsonProperty("addressLine3")
  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

  public SimpleAddress addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

 /**
   * Mandatory for Australian addresses
   * @return postcode
  **/
  @JsonProperty("postcode")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public SimpleAddress postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

 /**
   * Name of the city or locality
   * @return city
  **/
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public SimpleAddress city(String city) {
    this.city = city;
    return this;
  }

 /**
   * Free text if the country is not Australia. If country is Australia then must be one of the values defined by the ISO 3166:AU standard
   * @return state
  **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public SimpleAddress state(String state) {
    this.state = state;
    return this;
  }

 /**
   * A valid ISO 3166 Alpha-3 country code
   * @return country
  **/
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public SimpleAddress country(String country) {
    this.country = country;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
