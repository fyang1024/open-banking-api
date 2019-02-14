package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Balance;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseBankingAccountsBalancesData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-14T17:34:34.379921+11:00[Australia/Sydney]")

public class ResponseBankingAccountsBalancesData   {
  @JsonProperty("balances")
  @Valid
  private List<Balance> balances = new ArrayList<>();

  public ResponseBankingAccountsBalancesData balances(List<Balance> balances) {
    this.balances = balances;
    return this;
  }

  public ResponseBankingAccountsBalancesData addBalancesItem(Balance balancesItem) {
    this.balances.add(balancesItem);
    return this;
  }

  /**
   * Get balances
   * @return balances
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Balance> getBalances() {
    return balances;
  }

  public void setBalances(List<Balance> balances) {
    this.balances = balances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBankingAccountsBalancesData responseBankingAccountsBalancesData = (ResponseBankingAccountsBalancesData) o;
    return Objects.equals(this.balances, responseBankingAccountsBalancesData.balances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingAccountsBalancesData {\n");
    
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
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

