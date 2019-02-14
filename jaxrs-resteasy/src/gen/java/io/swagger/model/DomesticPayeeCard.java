package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class DomesticPayeeCard   {
  private String cardNumber = null;

  /**
   * Name of the account to pay to
   **/
  
  @Schema(required = true, description = "Name of the account to pay to")
  @JsonProperty("cardNumber")
  @NotNull
  public String getCardNumber() {
    return cardNumber;
  }
  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomesticPayeeCard domesticPayeeCard = (DomesticPayeeCard) o;
    return Objects.equals(cardNumber, domesticPayeeCard.cardNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomesticPayeeCard {\n");
    
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
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
