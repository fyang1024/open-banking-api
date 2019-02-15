package org.openbank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseCommonCustomerDetailedData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class ResponseCommonCustomerDetailedData   {
  /**
   * The type of customer object that is present
   */
  public enum CustomerUTypeEnum {
    PERSON("person"),
    
    ORGANISATION("organisation");

    private String value;

    CustomerUTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("customerUType")
  private CustomerUTypeEnum customerUType;

  @JsonProperty("person")
  private PersonDetail person = null;

  @JsonProperty("organisation")
  private OrganisationDetail organisation = null;

  public ResponseCommonCustomerDetailedData customerUType(CustomerUTypeEnum customerUType) {
    this.customerUType = customerUType;
    return this;
  }

  /**
   * The type of customer object that is present
   * @return customerUType
  */
  @ApiModelProperty(required = true, value = "The type of customer object that is present")
  @NotNull


  public CustomerUTypeEnum getCustomerUType() {
    return customerUType;
  }

  public void setCustomerUType(CustomerUTypeEnum customerUType) {
    this.customerUType = customerUType;
  }

  public ResponseCommonCustomerDetailedData person(PersonDetail person) {
    this.person = person;
    return this;
  }

  /**
   * Get person
   * @return person
  */
  @ApiModelProperty(value = "")

  @Valid

  public PersonDetail getPerson() {
    return person;
  }

  public void setPerson(PersonDetail person) {
    this.person = person;
  }

  public ResponseCommonCustomerDetailedData organisation(OrganisationDetail organisation) {
    this.organisation = organisation;
    return this;
  }

  /**
   * Get organisation
   * @return organisation
  */
  @ApiModelProperty(value = "")

  @Valid

  public OrganisationDetail getOrganisation() {
    return organisation;
  }

  public void setOrganisation(OrganisationDetail organisation) {
    this.organisation = organisation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCommonCustomerDetailedData responseCommonCustomerDetailedData = (ResponseCommonCustomerDetailedData) o;
    return Objects.equals(this.customerUType, responseCommonCustomerDetailedData.customerUType) &&
        Objects.equals(this.person, responseCommonCustomerDetailedData.person) &&
        Objects.equals(this.organisation, responseCommonCustomerDetailedData.organisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerUType, person, organisation);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

