package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.OrganisationDetail;
import io.swagger.model.PersonDetail;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class ResponseCommonCustomerDetailedData   {
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
      return null;
    }
  }
  @JsonProperty("customerUType")
  private CustomerUTypeEnum customerUType = null;
  @JsonProperty("person")
  private PersonDetail person = null;
  @JsonProperty("organisation")
  private OrganisationDetail organisation = null;
  /**
   * The type of customer object that is present
   **/
  public ResponseCommonCustomerDetailedData customerUType(CustomerUTypeEnum customerUType) {
    this.customerUType = customerUType;
    return this;
  }

  
  @Schema(description = "The type of customer object that is present")
  @JsonProperty("customerUType")
  public CustomerUTypeEnum getCustomerUType() {
    return customerUType;
  }
  public void setCustomerUType(CustomerUTypeEnum customerUType) {
    this.customerUType = customerUType;
  }

  /**
   **/
  public ResponseCommonCustomerDetailedData person(PersonDetail person) {
    this.person = person;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("person")
  public PersonDetail getPerson() {
    return person;
  }
  public void setPerson(PersonDetail person) {
    this.person = person;
  }

  /**
   **/
  public ResponseCommonCustomerDetailedData organisation(OrganisationDetail organisation) {
    this.organisation = organisation;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("organisation")
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
    return Objects.equals(customerUType, responseCommonCustomerDetailedData.customerUType) &&
        Objects.equals(person, responseCommonCustomerDetailedData.person) &&
        Objects.equals(organisation, responseCommonCustomerDetailedData.organisation);
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
