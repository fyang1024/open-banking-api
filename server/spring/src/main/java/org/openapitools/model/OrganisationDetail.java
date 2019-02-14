package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Organisation;
import org.openapitools.model.PhysicalAddressWithPurpose;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrganisationDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-14T17:34:34.379921+11:00[Australia/Sydney]")

public class OrganisationDetail   {
  @JsonProperty("lastUpdateTime")
  private String lastUpdateTime;

  @JsonProperty("agentFirstName")
  private String agentFirstName;

  @JsonProperty("agentLastName")
  private String agentLastName;

  @JsonProperty("agentRole")
  private String agentRole;

  @JsonProperty("businessName")
  private String businessName;

  @JsonProperty("legalName")
  private String legalName;

  @JsonProperty("shortName")
  private String shortName;

  @JsonProperty("abn")
  private String abn;

  @JsonProperty("acn")
  private String acn;

  @JsonProperty("isACNCRegistered")
  private Boolean isACNCRegistered;

  @JsonProperty("industryCode")
  private String industryCode;

  /**
   * Legal organisation type
   */
  public enum OrganisationTypeEnum {
    SOLE_TRADER("SOLE_TRADER"),
    
    COMPANY("COMPANY"),
    
    PARTNERSHIP("PARTNERSHIP"),
    
    TRUST("TRUST"),
    
    GOVERNMENT_ENTITY("GOVERNMENT_ENTITY"),
    
    OTHER("OTHER");

    private String value;

    OrganisationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OrganisationTypeEnum fromValue(String text) {
      for (OrganisationTypeEnum b : OrganisationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("organisationType")
  private OrganisationTypeEnum organisationType;

  @JsonProperty("registeredCountry")
  private String registeredCountry;

  @JsonProperty("establishmentDate")
  private String establishmentDate;

  @JsonProperty("physicalAddresses")
  @Valid
  private List<PhysicalAddressWithPurpose> physicalAddresses = new ArrayList<>();

  public OrganisationDetail lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data
   * @return lastUpdateTime
  */
  @ApiModelProperty(required = true, value = "The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data")
  @NotNull


  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public OrganisationDetail agentFirstName(String agentFirstName) {
    this.agentFirstName = agentFirstName;
    return this;
  }

  /**
   * The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field
   * @return agentFirstName
  */
  @ApiModelProperty(value = "The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field")


  public String getAgentFirstName() {
    return agentFirstName;
  }

  public void setAgentFirstName(String agentFirstName) {
    this.agentFirstName = agentFirstName;
  }

  public OrganisationDetail agentLastName(String agentLastName) {
    this.agentLastName = agentLastName;
    return this;
  }

  /**
   * The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field
   * @return agentLastName
  */
  @ApiModelProperty(required = true, value = "The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field")
  @NotNull


  public String getAgentLastName() {
    return agentLastName;
  }

  public void setAgentLastName(String agentLastName) {
    this.agentLastName = agentLastName;
  }

  public OrganisationDetail agentRole(String agentRole) {
    this.agentRole = agentRole;
    return this;
  }

  /**
   * The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display.  Default to “Unspecified” if the role is not known
   * @return agentRole
  */
  @ApiModelProperty(required = true, value = "The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display.  Default to “Unspecified” if the role is not known")
  @NotNull


  public String getAgentRole() {
    return agentRole;
  }

  public void setAgentRole(String agentRole) {
    this.agentRole = agentRole;
  }

  public OrganisationDetail businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

  /**
   * Name of the organisation
   * @return businessName
  */
  @ApiModelProperty(required = true, value = "Name of the organisation")
  @NotNull


  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public OrganisationDetail legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

  /**
   * Legal name, if different to the business name
   * @return legalName
  */
  @ApiModelProperty(value = "Legal name, if different to the business name")


  public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  public OrganisationDetail shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * Short name used for communication, if  different to the business name
   * @return shortName
  */
  @ApiModelProperty(value = "Short name used for communication, if  different to the business name")


  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public OrganisationDetail abn(String abn) {
    this.abn = abn;
    return this;
  }

  /**
   * Australian Business Number for the organisation
   * @return abn
  */
  @ApiModelProperty(value = "Australian Business Number for the organisation")


  public String getAbn() {
    return abn;
  }

  public void setAbn(String abn) {
    this.abn = abn;
  }

  public OrganisationDetail acn(String acn) {
    this.acn = acn;
    return this;
  }

  /**
   * Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type
   * @return acn
  */
  @ApiModelProperty(value = "Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type")


  public String getAcn() {
    return acn;
  }

  public void setAcn(String acn) {
    this.acn = acn;
  }

  public OrganisationDetail isACNCRegistered(Boolean isACNCRegistered) {
    this.isACNCRegistered = isACNCRegistered;
    return this;
  }

  /**
   * True if registered with the ACNC.  False if not. Absent or null if not confirmed.
   * @return isACNCRegistered
  */
  @ApiModelProperty(value = "True if registered with the ACNC.  False if not. Absent or null if not confirmed.")


  public Boolean getIsACNCRegistered() {
    return isACNCRegistered;
  }

  public void setIsACNCRegistered(Boolean isACNCRegistered) {
    this.isACNCRegistered = isACNCRegistered;
  }

  public OrganisationDetail industryCode(String industryCode) {
    this.industryCode = industryCode;
    return this;
  }

  /**
   * [ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the organisation.
   * @return industryCode
  */
  @ApiModelProperty(value = "[ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the organisation.")


  public String getIndustryCode() {
    return industryCode;
  }

  public void setIndustryCode(String industryCode) {
    this.industryCode = industryCode;
  }

  public OrganisationDetail organisationType(OrganisationTypeEnum organisationType) {
    this.organisationType = organisationType;
    return this;
  }

  /**
   * Legal organisation type
   * @return organisationType
  */
  @ApiModelProperty(required = true, value = "Legal organisation type")
  @NotNull


  public OrganisationTypeEnum getOrganisationType() {
    return organisationType;
  }

  public void setOrganisationType(OrganisationTypeEnum organisationType) {
    this.organisationType = organisationType;
  }

  public OrganisationDetail registeredCountry(String registeredCountry) {
    this.registeredCountry = registeredCountry;
    return this;
  }

  /**
   * Enumeration with values from ISO 3166 Alpha-3 country codes.  Assumed to be AUS if absent
   * @return registeredCountry
  */
  @ApiModelProperty(value = "Enumeration with values from ISO 3166 Alpha-3 country codes.  Assumed to be AUS if absent")


  public String getRegisteredCountry() {
    return registeredCountry;
  }

  public void setRegisteredCountry(String registeredCountry) {
    this.registeredCountry = registeredCountry;
  }

  public OrganisationDetail establishmentDate(String establishmentDate) {
    this.establishmentDate = establishmentDate;
    return this;
  }

  /**
   * The date the organisation described was established
   * @return establishmentDate
  */
  @ApiModelProperty(value = "The date the organisation described was established")


  public String getEstablishmentDate() {
    return establishmentDate;
  }

  public void setEstablishmentDate(String establishmentDate) {
    this.establishmentDate = establishmentDate;
  }

  public OrganisationDetail physicalAddresses(List<PhysicalAddressWithPurpose> physicalAddresses) {
    this.physicalAddresses = physicalAddresses;
    return this;
  }

  public OrganisationDetail addPhysicalAddressesItem(PhysicalAddressWithPurpose physicalAddressesItem) {
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
    OrganisationDetail organisationDetail = (OrganisationDetail) o;
    return Objects.equals(this.lastUpdateTime, organisationDetail.lastUpdateTime) &&
        Objects.equals(this.agentFirstName, organisationDetail.agentFirstName) &&
        Objects.equals(this.agentLastName, organisationDetail.agentLastName) &&
        Objects.equals(this.agentRole, organisationDetail.agentRole) &&
        Objects.equals(this.businessName, organisationDetail.businessName) &&
        Objects.equals(this.legalName, organisationDetail.legalName) &&
        Objects.equals(this.shortName, organisationDetail.shortName) &&
        Objects.equals(this.abn, organisationDetail.abn) &&
        Objects.equals(this.acn, organisationDetail.acn) &&
        Objects.equals(this.isACNCRegistered, organisationDetail.isACNCRegistered) &&
        Objects.equals(this.industryCode, organisationDetail.industryCode) &&
        Objects.equals(this.organisationType, organisationDetail.organisationType) &&
        Objects.equals(this.registeredCountry, organisationDetail.registeredCountry) &&
        Objects.equals(this.establishmentDate, organisationDetail.establishmentDate) &&
        Objects.equals(this.physicalAddresses, organisationDetail.physicalAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdateTime, agentFirstName, agentLastName, agentRole, businessName, legalName, shortName, abn, acn, isACNCRegistered, industryCode, organisationType, registeredCountry, establishmentDate, physicalAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisationDetail {\n");
    
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    agentFirstName: ").append(toIndentedString(agentFirstName)).append("\n");
    sb.append("    agentLastName: ").append(toIndentedString(agentLastName)).append("\n");
    sb.append("    agentRole: ").append(toIndentedString(agentRole)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    abn: ").append(toIndentedString(abn)).append("\n");
    sb.append("    acn: ").append(toIndentedString(acn)).append("\n");
    sb.append("    isACNCRegistered: ").append(toIndentedString(isACNCRegistered)).append("\n");
    sb.append("    industryCode: ").append(toIndentedString(industryCode)).append("\n");
    sb.append("    organisationType: ").append(toIndentedString(organisationType)).append("\n");
    sb.append("    registeredCountry: ").append(toIndentedString(registeredCountry)).append("\n");
    sb.append("    establishmentDate: ").append(toIndentedString(establishmentDate)).append("\n");
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

