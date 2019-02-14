package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.DirectDebits;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class ResponseBankingDirectDebitsData   {
  private List<DirectDebits> directDebitAuthorisations = new ArrayList<DirectDebits>();

  /**
   * The list of authorisations returned
   **/
  
  @Schema(description = "The list of authorisations returned")
  @JsonProperty("directDebitAuthorisations")
  public List<DirectDebits> getDirectDebitAuthorisations() {
    return directDebitAuthorisations;
  }
  public void setDirectDebitAuthorisations(List<DirectDebits> directDebitAuthorisations) {
    this.directDebitAuthorisations = directDebitAuthorisations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBankingDirectDebitsData responseBankingDirectDebitsData = (ResponseBankingDirectDebitsData) o;
    return Objects.equals(directDebitAuthorisations, responseBankingDirectDebitsData.directDebitAuthorisations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebitAuthorisations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingDirectDebitsData {\n");
    
    sb.append("    directDebitAuthorisations: ").append(toIndentedString(directDebitAuthorisations)).append("\n");
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
