/*
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.OrganisationDetail;
import io.swagger.client.model.PersonDetail;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * ResponseCommonCustomerDetailedData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-14T03:38:22.905Z[GMT]")public class ResponseCommonCustomerDetailedData {
  /**
   * The type of customer object that is present
   */
  @JsonAdapter(CustomerUTypeEnum.Adapter.class)
  public enum CustomerUTypeEnum {
    PERSON("person"),
    ORGANISATION("organisation");

    private String value;

    CustomerUTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CustomerUTypeEnum fromValue(String text) {
      for (CustomerUTypeEnum b : CustomerUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CustomerUTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CustomerUTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CustomerUTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CustomerUTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("customerUType")
  private CustomerUTypeEnum customerUType = null;

  @SerializedName("person")
  private PersonDetail person = null;

  @SerializedName("organisation")
  private OrganisationDetail organisation = null;
  public ResponseCommonCustomerDetailedData customerUType(CustomerUTypeEnum customerUType) {
    this.customerUType = customerUType;
    return this;
  }

  

  /**
  * The type of customer object that is present
  * @return customerUType
  **/
  @Schema(description = "The type of customer object that is present")
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
  **/
  @Schema(description = "")
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
  **/
  @Schema(description = "")
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
    return java.util.Objects.hash(customerUType, person, organisation);
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
