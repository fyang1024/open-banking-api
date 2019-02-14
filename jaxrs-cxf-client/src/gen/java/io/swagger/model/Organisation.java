package io.swagger.model;


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

public class Organisation  {
  
  @Schema(required = true, description = "The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data")
 /**
   * The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data  
  **/
  private String lastUpdateTime = null;
  
  @Schema(description = "The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field")
 /**
   * The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field  
  **/
  private String agentFirstName = null;
  
  @Schema(required = true, description = "The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field")
 /**
   * The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field  
  **/
  private String agentLastName = null;
  
  @Schema(required = true, description = "The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display.  Default to “Unspecified” if the role is not known")
 /**
   * The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display.  Default to “Unspecified” if the role is not known  
  **/
  private String agentRole = null;
  
  @Schema(required = true, description = "Name of the organisation")
 /**
   * Name of the organisation  
  **/
  private String businessName = null;
  
  @Schema(description = "Legal name, if different to the business name")
 /**
   * Legal name, if different to the business name  
  **/
  private String legalName = null;
  
  @Schema(description = "Short name used for communication, if  different to the business name")
 /**
   * Short name used for communication, if  different to the business name  
  **/
  private String shortName = null;
  
  @Schema(description = "Australian Business Number for the organisation")
 /**
   * Australian Business Number for the organisation  
  **/
  private String abn = null;
  
  @Schema(description = "Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type")
 /**
   * Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type  
  **/
  private String acn = null;
  
  @Schema(description = "True if registered with the ACNC.  False if not. Absent or null if not confirmed.")
 /**
   * True if registered with the ACNC.  False if not. Absent or null if not confirmed.  
  **/
  private Boolean isACNCRegistered = null;
  
  @Schema(description = "[ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the organisation.")
 /**
   * [ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the organisation.  
  **/
  private String industryCode = null;
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
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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
  @Schema(required = true, description = "Legal organisation type")
 /**
   * Legal organisation type  
  **/
  private OrganisationTypeEnum organisationType = null;
  
  @Schema(description = "Enumeration with values from ISO 3166 Alpha-3 country codes.  Assumed to be AUS if absent")
 /**
   * Enumeration with values from ISO 3166 Alpha-3 country codes.  Assumed to be AUS if absent  
  **/
  private String registeredCountry = null;
  
  @Schema(description = "The date the organisation described was established")
 /**
   * The date the organisation described was established  
  **/
  private String establishmentDate = null;
 /**
   * The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data
   * @return lastUpdateTime
  **/
  @JsonProperty("lastUpdateTime")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public Organisation lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

 /**
   * The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field
   * @return agentFirstName
  **/
  @JsonProperty("agentFirstName")
  public String getAgentFirstName() {
    return agentFirstName;
  }

  public void setAgentFirstName(String agentFirstName) {
    this.agentFirstName = agentFirstName;
  }

  public Organisation agentFirstName(String agentFirstName) {
    this.agentFirstName = agentFirstName;
    return this;
  }

 /**
   * The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field
   * @return agentLastName
  **/
  @JsonProperty("agentLastName")
  public String getAgentLastName() {
    return agentLastName;
  }

  public void setAgentLastName(String agentLastName) {
    this.agentLastName = agentLastName;
  }

  public Organisation agentLastName(String agentLastName) {
    this.agentLastName = agentLastName;
    return this;
  }

 /**
   * The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display.  Default to “Unspecified” if the role is not known
   * @return agentRole
  **/
  @JsonProperty("agentRole")
  public String getAgentRole() {
    return agentRole;
  }

  public void setAgentRole(String agentRole) {
    this.agentRole = agentRole;
  }

  public Organisation agentRole(String agentRole) {
    this.agentRole = agentRole;
    return this;
  }

 /**
   * Name of the organisation
   * @return businessName
  **/
  @JsonProperty("businessName")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public Organisation businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

 /**
   * Legal name, if different to the business name
   * @return legalName
  **/
  @JsonProperty("legalName")
  public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  public Organisation legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

 /**
   * Short name used for communication, if  different to the business name
   * @return shortName
  **/
  @JsonProperty("shortName")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public Organisation shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

 /**
   * Australian Business Number for the organisation
   * @return abn
  **/
  @JsonProperty("abn")
  public String getAbn() {
    return abn;
  }

  public void setAbn(String abn) {
    this.abn = abn;
  }

  public Organisation abn(String abn) {
    this.abn = abn;
    return this;
  }

 /**
   * Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type
   * @return acn
  **/
  @JsonProperty("acn")
  public String getAcn() {
    return acn;
  }

  public void setAcn(String acn) {
    this.acn = acn;
  }

  public Organisation acn(String acn) {
    this.acn = acn;
    return this;
  }

 /**
   * True if registered with the ACNC.  False if not. Absent or null if not confirmed.
   * @return isACNCRegistered
  **/
  @JsonProperty("isACNCRegistered")
  public Boolean isisIsACNCRegistered() {
    return isACNCRegistered;
  }

  public void setIsACNCRegistered(Boolean isACNCRegistered) {
    this.isACNCRegistered = isACNCRegistered;
  }

  public Organisation isACNCRegistered(Boolean isACNCRegistered) {
    this.isACNCRegistered = isACNCRegistered;
    return this;
  }

 /**
   * [ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the organisation.
   * @return industryCode
  **/
  @JsonProperty("industryCode")
  public String getIndustryCode() {
    return industryCode;
  }

  public void setIndustryCode(String industryCode) {
    this.industryCode = industryCode;
  }

  public Organisation industryCode(String industryCode) {
    this.industryCode = industryCode;
    return this;
  }

 /**
   * Legal organisation type
   * @return organisationType
  **/
  @JsonProperty("organisationType")
  public String getOrganisationType() {
    if (organisationType == null) {
      return null;
    }
    return organisationType.getValue();
  }

  public void setOrganisationType(OrganisationTypeEnum organisationType) {
    this.organisationType = organisationType;
  }

  public Organisation organisationType(OrganisationTypeEnum organisationType) {
    this.organisationType = organisationType;
    return this;
  }

 /**
   * Enumeration with values from ISO 3166 Alpha-3 country codes.  Assumed to be AUS if absent
   * @return registeredCountry
  **/
  @JsonProperty("registeredCountry")
  public String getRegisteredCountry() {
    return registeredCountry;
  }

  public void setRegisteredCountry(String registeredCountry) {
    this.registeredCountry = registeredCountry;
  }

  public Organisation registeredCountry(String registeredCountry) {
    this.registeredCountry = registeredCountry;
    return this;
  }

 /**
   * The date the organisation described was established
   * @return establishmentDate
  **/
  @JsonProperty("establishmentDate")
  public String getEstablishmentDate() {
    return establishmentDate;
  }

  public void setEstablishmentDate(String establishmentDate) {
    this.establishmentDate = establishmentDate;
  }

  public Organisation establishmentDate(String establishmentDate) {
    this.establishmentDate = establishmentDate;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
