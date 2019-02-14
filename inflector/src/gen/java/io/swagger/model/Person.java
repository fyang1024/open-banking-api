package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class Person   {
  @JsonProperty("lastUpdateTime")
  private String lastUpdateTime = null;
  @JsonProperty("firstName")
  private String firstName = null;
  @JsonProperty("lastName")
  private String lastName = null;
  @JsonProperty("middleNames")
  private List<String> middleNames = new ArrayList<String>();
  @JsonProperty("prefix")
  private String prefix = null;
  @JsonProperty("suffix")
  private String suffix = null;
  @JsonProperty("occupationCode")
  private String occupationCode = null;
  /**
   * The date and time that this record was last updated by the customer.  If no update has occurred then this date should reflect the initial creation date for the data
   **/
  public Person lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  
  @Schema(required = true, description = "The date and time that this record was last updated by the customer.  If no update has occurred then this date should reflect the initial creation date for the data")
  @JsonProperty("lastUpdateTime")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }
  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  /**
   * For people with single names this field need not be present.  The single name should be in the lastName field
   **/
  public Person firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  
  @Schema(description = "For people with single names this field need not be present.  The single name should be in the lastName field")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * For people with single names the single name should be in this field
   **/
  public Person lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  
  @Schema(required = true, description = "For people with single names the single name should be in this field")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Field is mandatory but array may be empty
   **/
  public Person middleNames(List<String> middleNames) {
    this.middleNames = middleNames;
    return this;
  }

  
  @Schema(required = true, description = "Field is mandatory but array may be empty")
  @JsonProperty("middleNames")
  public List<String> getMiddleNames() {
    return middleNames;
  }
  public void setMiddleNames(List<String> middleNames) {
    this.middleNames = middleNames;
  }

  /**
   * Also known as title or salutation.  The prefix to the name (e.g. Mr, Mrs, Ms, Miss, Sir, etc)
   **/
  public Person prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  
  @Schema(description = "Also known as title or salutation.  The prefix to the name (e.g. Mr, Mrs, Ms, Miss, Sir, etc)")
  @JsonProperty("prefix")
  public String getPrefix() {
    return prefix;
  }
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  /**
   * Used for a trailing suffix to the name (e.g. Jr)
   **/
  public Person suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  
  @Schema(description = "Used for a trailing suffix to the name (e.g. Jr)")
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  /**
   * Value is a valid [ANZCO v1.2](http://www.abs.gov.au/ANZSCO) Standard Occupation classification.
   **/
  public Person occupationCode(String occupationCode) {
    this.occupationCode = occupationCode;
    return this;
  }

  
  @Schema(description = "Value is a valid [ANZCO v1.2](http://www.abs.gov.au/ANZSCO) Standard Occupation classification.")
  @JsonProperty("occupationCode")
  public String getOccupationCode() {
    return occupationCode;
  }
  public void setOccupationCode(String occupationCode) {
    this.occupationCode = occupationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(lastUpdateTime, person.lastUpdateTime) &&
        Objects.equals(firstName, person.firstName) &&
        Objects.equals(lastName, person.lastName) &&
        Objects.equals(middleNames, person.middleNames) &&
        Objects.equals(prefix, person.prefix) &&
        Objects.equals(suffix, person.suffix) &&
        Objects.equals(occupationCode, person.occupationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdateTime, firstName, lastName, middleNames, prefix, suffix, occupationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleNames: ").append(toIndentedString(middleNames)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    occupationCode: ").append(toIndentedString(occupationCode)).append("\n");
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
