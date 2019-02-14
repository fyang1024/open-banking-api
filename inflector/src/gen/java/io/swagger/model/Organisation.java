package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class Organisation   {
  @JsonProperty("lastUpdateTime")
  private String lastUpdateTime = null;
  @JsonProperty("agentFirstName")
  private String agentFirstName = null;
  @JsonProperty("agentLastName")
  private String agentLastName = null;
  @JsonProperty("agentRole")
  private String agentRole = null;
  @JsonProperty("businessName")
  private String businessName = null;
  @JsonProperty("legalName")
  private String legalName = null;
  @JsonProperty("shortName")
  private String shortName = null;
  @JsonProperty("abn")
  private String abn = null;
  @JsonProperty("acn")
  private String acn = null;
  @JsonProperty("isACNCRegistered")
  private Boolean isACNCRegistered = null;
  @JsonProperty("industryCode")
  private String industryCode = null;
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
      return null;
    }
  }
  @JsonProperty("organisationType")
  private OrganisationTypeEnum organisationType = null;
  @JsonProperty("registeredCountry")
  private String registeredCountry = null;
  @JsonProperty("establishmentDate")
  private String establishmentDate = null;
  /**
   * The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data
   **/
  public Organisation lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  
  @Schema(required = true, description = "The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data")
  @JsonProperty("lastUpdateTime")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }
  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  /**
   * The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field
   **/
  public Organisation agentFirstName(String agentFirstName) {
    this.agentFirstName = agentFirstName;
    return this;
  }

  
  @Schema(description = "The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field")
  @JsonProperty("agentFirstName")
  public String getAgentFirstName() {
    return agentFirstName;
  }
  public void setAgentFirstName(String agentFirstName) {
    this.agentFirstName = agentFirstName;
  }

  /**
   * The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field
   **/
  public Organisation agentLastName(String agentLastName) {
    this.agentLastName = agentLastName;
    return this;
  }

  
  @Schema(required = true, description = "The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field")
  @JsonProperty("agentLastName")
  public String getAgentLastName() {
    return agentLastName;
  }
  public void setAgentLastName(String agentLastName) {
    this.agentLastName = agentLastName;
  }

  /**
   * The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display.  Default to “Unspecified” if the role is not known
   **/
  public Organisation agentRole(String agentRole) {
    this.agentRole = agentRole;
    return this;
  }

  
  @Schema(required = true, description = "The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display.  Default to “Unspecified” if the role is not known")
  @JsonProperty("agentRole")
  public String getAgentRole() {
    return agentRole;
  }
  public void setAgentRole(String agentRole) {
    this.agentRole = agentRole;
  }

  /**
   * Name of the organisation
   **/
  public Organisation businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

  
  @Schema(required = true, description = "Name of the organisation")
  @JsonProperty("businessName")
  public String getBusinessName() {
    return businessName;
  }
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  /**
   * Legal name, if different to the business name
   **/
  public Organisation legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

  
  @Schema(description = "Legal name, if different to the business name")
  @JsonProperty("legalName")
  public String getLegalName() {
    return legalName;
  }
  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  /**
   * Short name used for communication, if  different to the business name
   **/
  public Organisation shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  
  @Schema(description = "Short name used for communication, if  different to the business name")
  @JsonProperty("shortName")
  public String getShortName() {
    return shortName;
  }
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  /**
   * Australian Business Number for the organisation
   **/
  public Organisation abn(String abn) {
    this.abn = abn;
    return this;
  }

  
  @Schema(description = "Australian Business Number for the organisation")
  @JsonProperty("abn")
  public String getAbn() {
    return abn;
  }
  public void setAbn(String abn) {
    this.abn = abn;
  }

  /**
   * Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type
   **/
  public Organisation acn(String acn) {
    this.acn = acn;
    return this;
  }

  
  @Schema(description = "Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type")
  @JsonProperty("acn")
  public String getAcn() {
    return acn;
  }
  public void setAcn(String acn) {
    this.acn = acn;
  }

  /**
   * True if registered with the ACNC.  False if not. Absent or null if not confirmed.
   **/
  public Organisation isACNCRegistered(Boolean isACNCRegistered) {
    this.isACNCRegistered = isACNCRegistered;
    return this;
  }

  
  @Schema(description = "True if registered with the ACNC.  False if not. Absent or null if not confirmed.")
  @JsonProperty("isACNCRegistered")
  public Boolean isIsACNCRegistered() {
    return isACNCRegistered;
  }
  public void setIsACNCRegistered(Boolean isACNCRegistered) {
    this.isACNCRegistered = isACNCRegistered;
  }

  /**
   * [ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the organisation.
   **/
  public Organisation industryCode(String industryCode) {
    this.industryCode = industryCode;
    return this;
  }

  
  @Schema(description = "[ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the organisation.")
  @JsonProperty("industryCode")
  public String getIndustryCode() {
    return industryCode;
  }
  public void setIndustryCode(String industryCode) {
    this.industryCode = industryCode;
  }

  /**
   * Legal organisation type
   **/
  public Organisation organisationType(OrganisationTypeEnum organisationType) {
    this.organisationType = organisationType;
    return this;
  }

  
  @Schema(required = true, description = "Legal organisation type")
  @JsonProperty("organisationType")
  public OrganisationTypeEnum getOrganisationType() {
    return organisationType;
  }
  public void setOrganisationType(OrganisationTypeEnum organisationType) {
    this.organisationType = organisationType;
  }

  /**
   * Enumeration with values from ISO 3166 Alpha-3 country codes.  Assumed to be AUS if absent
   **/
  public Organisation registeredCountry(String registeredCountry) {
    this.registeredCountry = registeredCountry;
    return this;
  }

  
  @Schema(description = "Enumeration with values from ISO 3166 Alpha-3 country codes.  Assumed to be AUS if absent")
  @JsonProperty("registeredCountry")
  public String getRegisteredCountry() {
    return registeredCountry;
  }
  public void setRegisteredCountry(String registeredCountry) {
    this.registeredCountry = registeredCountry;
  }

  /**
   * The date the organisation described was established
   **/
  public Organisation establishmentDate(String establishmentDate) {
    this.establishmentDate = establishmentDate;
    return this;
  }

  
  @Schema(description = "The date the organisation described was established")
  @JsonProperty("establishmentDate")
  public String getEstablishmentDate() {
    return establishmentDate;
  }
  public void setEstablishmentDate(String establishmentDate) {
    this.establishmentDate = establishmentDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organisation organisation = (Organisation) o;
    return Objects.equals(lastUpdateTime, organisation.lastUpdateTime) &&
        Objects.equals(agentFirstName, organisation.agentFirstName) &&
        Objects.equals(agentLastName, organisation.agentLastName) &&
        Objects.equals(agentRole, organisation.agentRole) &&
        Objects.equals(businessName, organisation.businessName) &&
        Objects.equals(legalName, organisation.legalName) &&
        Objects.equals(shortName, organisation.shortName) &&
        Objects.equals(abn, organisation.abn) &&
        Objects.equals(acn, organisation.acn) &&
        Objects.equals(isACNCRegistered, organisation.isACNCRegistered) &&
        Objects.equals(industryCode, organisation.industryCode) &&
        Objects.equals(organisationType, organisation.organisationType) &&
        Objects.equals(registeredCountry, organisation.registeredCountry) &&
        Objects.equals(establishmentDate, organisation.establishmentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdateTime, agentFirstName, agentLastName, agentRole, businessName, legalName, shortName, abn, acn, isACNCRegistered, industryCode, organisationType, registeredCountry, establishmentDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organisation {\n");
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
