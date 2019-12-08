package org.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/**
 * AuthorisedEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class AuthorisedEntity   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("financialInstitution")
  private String financialInstitution;

  @JsonProperty("abn")
  private String abn;

  @JsonProperty("acn")
  private String acn;

  @JsonProperty("arbn")
  private String arbn;

  public AuthorisedEntity name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the authorised entity
   * @return name
  */
  @ApiModelProperty(required = true, value = "Name of the authorised entity")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuthorisedEntity financialInstitution(String financialInstitution) {
    this.financialInstitution = financialInstitution;
    return this;
  }

  /**
   * Name of the financial institution through which the direct debit will be executed
   * @return financialInstitution
  */
  @ApiModelProperty(required = true, value = "Name of the financial institution through which the direct debit will be executed")
  @NotNull


  public String getFinancialInstitution() {
    return financialInstitution;
  }

  public void setFinancialInstitution(String financialInstitution) {
    this.financialInstitution = financialInstitution;
  }

  public AuthorisedEntity abn(String abn) {
    this.abn = abn;
    return this;
  }

  /**
   * Australian Business Number for the authorised entity
   * @return abn
  */
  @ApiModelProperty(value = "Australian Business Number for the authorised entity")


  public String getAbn() {
    return abn;
  }

  public void setAbn(String abn) {
    this.abn = abn;
  }

  public AuthorisedEntity acn(String acn) {
    this.acn = acn;
    return this;
  }

  /**
   * Australian Business Number for the authorised entity
   * @return acn
  */
  @ApiModelProperty(value = "Australian Business Number for the authorised entity")


  public String getAcn() {
    return acn;
  }

  public void setAcn(String acn) {
    this.acn = acn;
  }

  public AuthorisedEntity arbn(String arbn) {
    this.arbn = arbn;
    return this;
  }

  /**
   * Australian Registered Body Number for the authorised entity
   * @return arbn
  */
  @ApiModelProperty(value = "Australian Registered Body Number for the authorised entity")


  public String getArbn() {
    return arbn;
  }

  public void setArbn(String arbn) {
    this.arbn = arbn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorisedEntity authorisedEntity = (AuthorisedEntity) o;
    return Objects.equals(this.name, authorisedEntity.name) &&
        Objects.equals(this.financialInstitution, authorisedEntity.financialInstitution) &&
        Objects.equals(this.abn, authorisedEntity.abn) &&
        Objects.equals(this.acn, authorisedEntity.acn) &&
        Objects.equals(this.arbn, authorisedEntity.arbn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, financialInstitution, abn, acn, arbn);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

