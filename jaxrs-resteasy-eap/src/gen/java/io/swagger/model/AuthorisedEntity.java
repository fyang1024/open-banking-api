package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2019-02-14T03:34:59.075Z[GMT]")public class AuthorisedEntity   {
  private String name = null;
  private String financialInstitution = null;
  private String abn = null;
  private String acn = null;
  private String arbn = null;

  /**
   * Name of the authorised entity
   **/
  
  @Schema(required = true, description = "Name of the authorised entity")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Name of the financial institution through which the direct debit will be executed
   **/
  
  @Schema(required = true, description = "Name of the financial institution through which the direct debit will be executed")
  @JsonProperty("financialInstitution")
  @NotNull
  public String getFinancialInstitution() {
    return financialInstitution;
  }
  public void setFinancialInstitution(String financialInstitution) {
    this.financialInstitution = financialInstitution;
  }

  /**
   * Australian Business Number for the authorised entity
   **/
  
  @Schema(description = "Australian Business Number for the authorised entity")
  @JsonProperty("abn")
  public String getAbn() {
    return abn;
  }
  public void setAbn(String abn) {
    this.abn = abn;
  }

  /**
   * Australian Business Number for the authorised entity
   **/
  
  @Schema(description = "Australian Business Number for the authorised entity")
  @JsonProperty("acn")
  public String getAcn() {
    return acn;
  }
  public void setAcn(String acn) {
    this.acn = acn;
  }

  /**
   * Australian Registered Body Number for the authorised entity
   **/
  
  @Schema(description = "Australian Registered Body Number for the authorised entity")
  @JsonProperty("arbn")
  public String getArbn() {
    return arbn;
  }
  public void setArbn(String arbn) {
    this.arbn = arbn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorisedEntity authorisedEntity = (AuthorisedEntity) o;
    return Objects.equals(name, authorisedEntity.name) &&
        Objects.equals(financialInstitution, authorisedEntity.financialInstitution) &&
        Objects.equals(abn, authorisedEntity.abn) &&
        Objects.equals(acn, authorisedEntity.acn) &&
        Objects.equals(arbn, authorisedEntity.arbn);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
