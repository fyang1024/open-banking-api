package io.swagger.model;

import io.swagger.model.CurrencyAmount;

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

public class DepositBalance  {
  
  @Schema(required = true, description = "")
  private CurrencyAmount currentBalance = null;
  
  @Schema(required = true, description = "")
  private CurrencyAmount availableBalance = null;
 /**
   * Get currentBalance
   * @return currentBalance
  **/
  @JsonProperty("currentBalance")
  public CurrencyAmount getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(CurrencyAmount currentBalance) {
    this.currentBalance = currentBalance;
  }

  public DepositBalance currentBalance(CurrencyAmount currentBalance) {
    this.currentBalance = currentBalance;
    return this;
  }

 /**
   * Get availableBalance
   * @return availableBalance
  **/
  @JsonProperty("availableBalance")
  public CurrencyAmount getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(CurrencyAmount availableBalance) {
    this.availableBalance = availableBalance;
  }

  public DepositBalance availableBalance(CurrencyAmount availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositBalance {\n");
    
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
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
