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

public class InternationalPayeeBeneficiaryDetails  {
  
  @Schema(description = "Name of the beneficiary")
 /**
   * Name of the beneficiary  
  **/
  private String name = null;
  
  @Schema(description = "Country where the beneficiary resides. A valid ISO 3166 Alpha-3 country code")
 /**
   * Country where the beneficiary resides. A valid ISO 3166 Alpha-3 country code  
  **/
  private String country = null;
  
  @Schema(description = "Response message for the payment")
 /**
   * Response message for the payment  
  **/
  private String message = null;
 /**
   * Name of the beneficiary
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InternationalPayeeBeneficiaryDetails name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Country where the beneficiary resides. A valid ISO 3166 Alpha-3 country code
   * @return country
  **/
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public InternationalPayeeBeneficiaryDetails country(String country) {
    this.country = country;
    return this;
  }

 /**
   * Response message for the payment
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InternationalPayeeBeneficiaryDetails message(String message) {
    this.message = message;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
