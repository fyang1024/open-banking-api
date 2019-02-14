package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Transaction;
import io.swagger.model.TransactionDetailExtendedData;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class TransactionDetail extends Transaction  {
  @JsonProperty("extendedData")
  private TransactionDetailExtendedData extendedData = null;
  /**
   **/
  public TransactionDetail extendedData(TransactionDetailExtendedData extendedData) {
    this.extendedData = extendedData;
    return this;
  }

  
  @Schema(required = true, description = "")
  @JsonProperty("extendedData")
  public TransactionDetailExtendedData getExtendedData() {
    return extendedData;
  }
  public void setExtendedData(TransactionDetailExtendedData extendedData) {
    this.extendedData = extendedData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDetail transactionDetail = (TransactionDetail) o;
    return Objects.equals(extendedData, transactionDetail.extendedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendedData);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
