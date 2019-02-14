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

public class AuthorisedEntity  {
  
  @Schema(required = true, description = "Name of the authorised entity")
 /**
   * Name of the authorised entity  
  **/
  private String name = null;
  
  @Schema(required = true, description = "Name of the financial institution through which the direct debit will be executed")
 /**
   * Name of the financial institution through which the direct debit will be executed  
  **/
  private String financialInstitution = null;
  
  @Schema(description = "Australian Business Number for the authorised entity")
 /**
   * Australian Business Number for the authorised entity  
  **/
  private String abn = null;
  
  @Schema(description = "Australian Business Number for the authorised entity")
 /**
   * Australian Business Number for the authorised entity  
  **/
  private String acn = null;
  
  @Schema(description = "Australian Registered Body Number for the authorised entity")
 /**
   * Australian Registered Body Number for the authorised entity  
  **/
  private String arbn = null;
 /**
   * Name of the authorised entity
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuthorisedEntity name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Name of the financial institution through which the direct debit will be executed
   * @return financialInstitution
  **/
  @JsonProperty("financialInstitution")
  public String getFinancialInstitution() {
    return financialInstitution;
  }

  public void setFinancialInstitution(String financialInstitution) {
    this.financialInstitution = financialInstitution;
  }

  public AuthorisedEntity financialInstitution(String financialInstitution) {
    this.financialInstitution = financialInstitution;
    return this;
  }

 /**
   * Australian Business Number for the authorised entity
   * @return abn
  **/
  @JsonProperty("abn")
  public String getAbn() {
    return abn;
  }

  public void setAbn(String abn) {
    this.abn = abn;
  }

  public AuthorisedEntity abn(String abn) {
    this.abn = abn;
    return this;
  }

 /**
   * Australian Business Number for the authorised entity
   * @return acn
  **/
  @JsonProperty("acn")
  public String getAcn() {
    return acn;
  }

  public void setAcn(String acn) {
    this.acn = acn;
  }

  public AuthorisedEntity acn(String acn) {
    this.acn = acn;
    return this;
  }

 /**
   * Australian Registered Body Number for the authorised entity
   * @return arbn
  **/
  @JsonProperty("arbn")
  public String getArbn() {
    return arbn;
  }

  public void setArbn(String arbn) {
    this.arbn = arbn;
  }

  public AuthorisedEntity arbn(String arbn) {
    this.arbn = arbn;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorisedEntity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    financialInstitution: ").append(toIndentedString(financialInstitution)).append("\n");
    sb.append("    abn: ").append(toIndentedString(abn)).append("\n");
    sb.append("    acn: ").append(toIndentedString(acn)).append("\n");
    sb.append("    arbn: ").append(toIndentedString(arbn)).append("\n");
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
