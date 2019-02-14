package io.swagger.model;

import io.swagger.model.Payee;
import java.util.ArrayList;
import java.util.List;

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

public class ResponseBankingPayeesData  {
  
  @Schema(description = "The list of payees returned")
 /**
   * The list of payees returned  
  **/
  private List<Payee> payees = null;
 /**
   * The list of payees returned
   * @return payees
  **/
  @JsonProperty("payees")
  public List<Payee> getPayees() {
    return payees;
  }

  public void setPayees(List<Payee> payees) {
    this.payees = payees;
  }

  public ResponseBankingPayeesData payees(List<Payee> payees) {
    this.payees = payees;
    return this;
  }

  public ResponseBankingPayeesData addPayeesItem(Payee payeesItem) {
    this.payees.add(payeesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
