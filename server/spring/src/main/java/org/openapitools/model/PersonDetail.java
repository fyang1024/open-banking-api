package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EmailAddress;
import org.openapitools.model.Person;
import org.openapitools.model.PhoneNumber;
import org.openapitools.model.PhysicalAddressWithPurpose;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PersonDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class PersonDetail   {
  @JsonProperty("lastUpdateTime")
  private String lastUpdateTime;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("middleNames")
  @Valid
  private List<String> middleNames = new ArrayList<>();

  @JsonProperty("prefix")
  private String prefix;

  @JsonProperty("suffix")
  private String suffix;

  @JsonProperty("occupationCode")
  private String occupationCode;

  @JsonProperty("phoneNumbers")
  @Valid
  private List<PhoneNumber> phoneNumbers = new ArrayList<>();

  @JsonProperty("emailAddresses")
  @Valid
  private List<EmailAddress> emailAddresses = new ArrayList<>();

  @JsonProperty("physicalAddresses")
  @Valid
  private List<PhysicalAddressWithPurpose> physicalAddresses = new ArrayList<>();

  public PersonDetail lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * The date and time that this record was last updated by the customer.  If no update has occurred then this date should reflect the initial creation date for the data
   * @return lastUpdateTime
  */
  @ApiModelProperty(required = true, value = "The date and time that this record was last updated by the customer.  If no update has occurred then this date should reflect the initial creation date for the data")
  @NotNull


  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public PersonDetail firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * For people with single names this field need not be present.  The single name should be in the lastName field
   * @return firstName
  */
  @ApiModelProperty(value = "For people with single names this field need not be present.  The single name should be in the lastName field")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PersonDetail lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * For people with single names the single name should be in this field
   * @return lastName
  */
  @ApiModelProperty(required = true, value = "For people with single names the single name should be in this field")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PersonDetail middleNames(List<String> middleNames) {
    this.middleNames = middleNames;
    return this;
  }

  public PersonDetail addMiddleNamesItem(String middleNamesItem) {
    this.middleNames.add(middleNamesItem);
    return this;
  }

  /**
   * Field is mandatory but array may be empty
   * @return middleNames
  */
  @ApiModelProperty(required = true, value = "Field is mandatory but array may be empty")
  @NotNull


  public List<String> getMiddleNames() {
    return middleNames;
  }

  public void setMiddleNames(List<String> middleNames) {
    this.middleNames = middleNames;
  }

  public PersonDetail prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Also known as title or salutation.  The prefix to the name (e.g. Mr, Mrs, Ms, Miss, Sir, etc)
   * @return prefix
  */
  @ApiModelProperty(value = "Also known as title or salutation.  The prefix to the name (e.g. Mr, Mrs, Ms, Miss, Sir, etc)")


  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public PersonDetail suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Used for a trailing suffix to the name (e.g. Jr)
   * @return suffix
  */
  @ApiModelProperty(value = "Used for a trailing suffix to the name (e.g. Jr)")


  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public PersonDetail occupationCode(String occupationCode) {
    this.occupationCode = occupationCode;
    return this;
  }

  /**
   * Value is a valid [ANZCO v1.2](http://www.abs.gov.au/ANZSCO) Standard Occupation classification.
   * @return occupationCode
  */
  @ApiModelProperty(value = "Value is a valid [ANZCO v1.2](http://www.abs.gov.au/ANZSCO) Standard Occupation classification.")


  public String getOccupationCode() {
    return occupationCode;
  }

  public void setOccupationCode(String occupationCode) {
    this.occupationCode = occupationCode;
  }

  public PersonDetail phoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public PersonDetail addPhoneNumbersItem(PhoneNumber phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

  /**
   * At least one record is required
   * @return phoneNumbers
  */
  @ApiModelProperty(required = true, value = "At least one record is required")
  @NotNull

  @Valid

  public List<PhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public PersonDetail emailAddresses(List<EmailAddress> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public PersonDetail addEmailAddressesItem(EmailAddress emailAddressesItem) {
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

  /**
   * May be empty
   * @return emailAddresses
  */
  @ApiModelProperty(required = true, value = "May be empty")
  @NotNull

  @Valid

  public List<EmailAddress> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(List<EmailAddress> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  public PersonDetail physicalAddresses(List<PhysicalAddressWithPurpose> physicalAddresses) {
    this.physicalAddresses = physicalAddresses;
    return this;
  }

  public PersonDetail addPhysicalAddressesItem(PhysicalAddressWithPurpose physicalAddressesItem) {
    this.physicalAddresses.add(physicalAddressesItem);
    return this;
  }

  /**
   * Must contain at least one address. One and only one address may have the purpose of REGISTERED. Zero or one, and no more than one, record may have the purpose of MAIL. If zero then the REGISTERED address is to be used for mail
   * @return physicalAddresses
  */
  @ApiModelProperty(required = true, value = "Must contain at least one address. One and only one address may have the purpose of REGISTERED. Zero or one, and no more than one, record may have the purpose of MAIL. If zero then the REGISTERED address is to be used for mail")
  @NotNull

  @Valid

  public List<PhysicalAddressWithPurpose> getPhysicalAddresses() {
    return physicalAddresses;
  }

  public void setPhysicalAddresses(List<PhysicalAddressWithPurpose> physicalAddresses) {
    this.physicalAddresses = physicalAddresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonDetail personDetail = (PersonDetail) o;
    return Objects.equals(this.lastUpdateTime, personDetail.lastUpdateTime) &&
        Objects.equals(this.firstName, personDetail.firstName) &&
        Objects.equals(this.lastName, personDetail.lastName) &&
        Objects.equals(this.middleNames, personDetail.middleNames) &&
        Objects.equals(this.prefix, personDetail.prefix) &&
        Objects.equals(this.suffix, personDetail.suffix) &&
        Objects.equals(this.occupationCode, personDetail.occupationCode) &&
        Objects.equals(this.phoneNumbers, personDetail.phoneNumbers) &&
        Objects.equals(this.emailAddresses, personDetail.emailAddresses) &&
        Objects.equals(this.physicalAddresses, personDetail.physicalAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdateTime, firstName, lastName, middleNames, prefix, suffix, occupationCode, phoneNumbers, emailAddresses, physicalAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonDetail {\n");
    
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleNames: ").append(toIndentedString(middleNames)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    occupationCode: ").append(toIndentedString(occupationCode)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    physicalAddresses: ").append(toIndentedString(physicalAddresses)).append("\n");
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

