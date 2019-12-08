package org.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseBankingPayeesData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class ResponseBankingPayeesData   {
  @JsonProperty("payees")
  @Valid
  private List<Payee> payees = new ArrayList<>();

  public ResponseBankingPayeesData payees(List<Payee> payees) {
    this.payees = payees;
    return this;
  }

  public ResponseBankingPayeesData addPayeesItem(Payee payeesItem) {
    this.payees.add(payeesItem);
    return this;
  }

  /**
   * The list of payees returned
   * @return payees
  */
  @ApiModelProperty(required = true, value = "The list of payees returned")
  @NotNull

  @Valid

  public List<Payee> getPayees() {
    return payees;
  }

  public void setPayees(List<Payee> payees) {
    this.payees = payees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBankingPayeesData responseBankingPayeesData = (ResponseBankingPayeesData) o;
    return Objects.equals(this.payees, responseBankingPayeesData.payees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingPayeesData {\n");
    
    sb.append("    payees: ").append(toIndentedString(payees)).append("\n");
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

