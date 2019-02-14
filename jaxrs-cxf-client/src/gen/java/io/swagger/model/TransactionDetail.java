package io.swagger.model;

import io.swagger.model.Transaction;
import io.swagger.model.TransactionDetailExtendedData;

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

public class TransactionDetail extends Transaction {
  
  @Schema(required = true, description = "")
  private TransactionDetailExtendedData extendedData = null;
 /**
   * Get extendedData
   * @return extendedData
  **/
  @JsonProperty("extendedData")
  public TransactionDetailExtendedData getExtendedData() {
    return extendedData;
  }

  public void setExtendedData(TransactionDetailExtendedData extendedData) {
    this.extendedData = extendedData;
  }

  public TransactionDetail extendedData(TransactionDetailExtendedData extendedData) {
    this.extendedData = extendedData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    extendedData: ").append(toIndentedString(extendedData)).append("\n");
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
