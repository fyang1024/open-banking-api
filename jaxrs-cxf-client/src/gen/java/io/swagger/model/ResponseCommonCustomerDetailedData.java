package io.swagger.model;

import io.swagger.model.OrganisationDetail;
import io.swagger.model.PersonDetail;

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

public class ResponseCommonCustomerDetailedData  {
  public enum CustomerUTypeEnum {
    PERSON("person"),
    ORGANISATION("organisation");

    private String value;

    CustomerUTypeEnum(String value) {
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
    public static CustomerUTypeEnum fromValue(String text) {
      for (CustomerUTypeEnum b : CustomerUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "The type of customer object that is present")
 /**
   * The type of customer object that is present  
  **/
  private CustomerUTypeEnum customerUType = null;
  
  @Schema(description = "")
  private PersonDetail person = null;
  
  @Schema(description = "")
  private OrganisationDetail organisation = null;
 /**
   * The type of customer object that is present
   * @return customerUType
  **/
  @JsonProperty("customerUType")
  public String getCustomerUType() {
    if (customerUType == null) {
      return null;
    }
    return customerUType.getValue();
  }

  public void setCustomerUType(CustomerUTypeEnum customerUType) {
    this.customerUType = customerUType;
  }

  public ResponseCommonCustomerDetailedData customerUType(CustomerUTypeEnum customerUType) {
    this.customerUType = customerUType;
    return this;
  }

 /**
   * Get person
   * @return person
  **/
  @JsonProperty("person")
  public PersonDetail getPerson() {
    return person;
  }

  public void setPerson(PersonDetail person) {
    this.person = person;
  }

  public ResponseCommonCustomerDetailedData person(PersonDetail person) {
    this.person = person;
    return this;
  }

 /**
   * Get organisation
   * @return organisation
  **/
  @JsonProperty("organisation")
  public OrganisationDetail getOrganisation() {
    return organisation;
  }

  public void setOrganisation(OrganisationDetail organisation) {
    this.organisation = organisation;
  }

  public ResponseCommonCustomerDetailedData organisation(OrganisationDetail organisation) {
    this.organisation = organisation;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCommonCustomerDetailedData {\n");
    
    sb.append("    customerUType: ").append(toIndentedString(customerUType)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
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
