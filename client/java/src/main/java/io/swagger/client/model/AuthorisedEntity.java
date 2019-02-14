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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * AuthorisedEntity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-14T03:38:22.905Z[GMT]")public class AuthorisedEntity {

  @SerializedName("name")
  private String name = null;

  @SerializedName("financialInstitution")
  private String financialInstitution = null;

  @SerializedName("abn")
  private String abn = null;

  @SerializedName("acn")
  private String acn = null;

  @SerializedName("arbn")
  private String arbn = null;
  public AuthorisedEntity name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * Name of the authorised entity
  * @return name
  **/
  @Schema(required = true, description = "Name of the authorised entity")
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
  **/
  @Schema(required = true, description = "Name of the financial institution through which the direct debit will be executed")
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
  **/
  @Schema(description = "Australian Business Number for the authorised entity")
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
  **/
  @Schema(description = "Australian Business Number for the authorised entity")
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
  **/
  @Schema(description = "Australian Registered Body Number for the authorised entity")
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
    return java.util.Objects.hash(name, financialInstitution, abn, acn, arbn);
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
