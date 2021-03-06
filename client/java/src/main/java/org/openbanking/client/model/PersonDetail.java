/*
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openbanking.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * PersonDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-17T21:56:09.632+11:00[Australia/Sydney]")
public class PersonDetail {
  public static final String SERIALIZED_NAME_LAST_UPDATE_TIME = "lastUpdateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE_TIME)
  private String lastUpdateTime;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MIDDLE_NAMES = "middleNames";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAMES)
  private List<String> middleNames = new ArrayList<String>();

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  private String suffix;

  public static final String SERIALIZED_NAME_OCCUPATION_CODE = "occupationCode";
  @SerializedName(SERIALIZED_NAME_OCCUPATION_CODE)
  private String occupationCode;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phoneNumbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();

  public static final String SERIALIZED_NAME_EMAIL_ADDRESSES = "emailAddresses";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESSES)
  private List<EmailAddress> emailAddresses = new ArrayList<EmailAddress>();

  public static final String SERIALIZED_NAME_PHYSICAL_ADDRESSES = "physicalAddresses";
  @SerializedName(SERIALIZED_NAME_PHYSICAL_ADDRESSES)
  private List<PhysicalAddressWithPurpose> physicalAddresses = new ArrayList<PhysicalAddressWithPurpose>();

  public PersonDetail lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * The date and time that this record was last updated by the customer.  If no update has occurred then this date should reflect the initial creation date for the data
   * @return lastUpdateTime
  **/
  @ApiModelProperty(required = true, value = "The date and time that this record was last updated by the customer.  If no update has occurred then this date should reflect the initial creation date for the data")
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
  **/
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
  **/
  @ApiModelProperty(required = true, value = "For people with single names the single name should be in this field")
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
  **/
  @ApiModelProperty(required = true, value = "Field is mandatory but array may be empty")
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
  **/
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
  **/
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
  **/
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
  **/
  @ApiModelProperty(required = true, value = "At least one record is required")
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
  **/
  @ApiModelProperty(required = true, value = "May be empty")
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
  **/
  @ApiModelProperty(required = true, value = "Must contain at least one address. One and only one address may have the purpose of REGISTERED. Zero or one, and no more than one, record may have the purpose of MAIL. If zero then the REGISTERED address is to be used for mail")
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

