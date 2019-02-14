package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EmailAddress;
import io.swagger.model.Person;
import io.swagger.model.PhoneNumber;
import io.swagger.model.PhysicalAddressWithPurpose;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PersonDetail
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-14T03:26:14.367Z[GMT]")
public class PersonDetail extends Person  {
  @JsonProperty("phoneNumbers")
  @Valid
  private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();

  @JsonProperty("emailAddresses")
  @Valid
  private List<EmailAddress> emailAddresses = new ArrayList<EmailAddress>();

  @JsonProperty("physicalAddresses")
  @Valid
  private List<PhysicalAddressWithPurpose> physicalAddresses = new ArrayList<PhysicalAddressWithPurpose>();

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
  **/
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
  **/
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
    return Objects.equals(this.phoneNumbers, personDetail.phoneNumbers) &&
        Objects.equals(this.emailAddresses, personDetail.emailAddresses) &&
        Objects.equals(this.physicalAddresses, personDetail.physicalAddresses) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumbers, emailAddresses, physicalAddresses, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
