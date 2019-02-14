package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.BillerPayee;
import io.swagger.model.DomesticPayee;
import io.swagger.model.InternationalPayee;
import io.swagger.model.Payee;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class PayeeDetail extends Payee  {
  /**
   * Type of object included that describes the payee in detail
   */
  public enum PayeeUTypeEnum {
    DOMESTIC("domestic"),

        BILLER("biller"),

        INTERNATIONAL("international");
    private String value;

    PayeeUTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PayeeUTypeEnum payeeUType = null;  private DomesticPayee domestic = null;  private BillerPayee biller = null;  private InternationalPayee international = null;

  /**
   * Type of object included that describes the payee in detail
   **/
  
  @Schema(required = true, description = "Type of object included that describes the payee in detail")
  @JsonProperty("payeeUType")
  @NotNull
  public PayeeUTypeEnum getPayeeUType() {
    return payeeUType;
  }
  public void setPayeeUType(PayeeUTypeEnum payeeUType) {
    this.payeeUType = payeeUType;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("domestic")
  public DomesticPayee getDomestic() {
    return domestic;
  }
  public void setDomestic(DomesticPayee domestic) {
    this.domestic = domestic;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("biller")
  public BillerPayee getBiller() {
    return biller;
  }
  public void setBiller(BillerPayee biller) {
    this.biller = biller;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("international")
  public InternationalPayee getInternational() {
    return international;
  }
  public void setInternational(InternationalPayee international) {
    this.international = international;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayeeDetail payeeDetail = (PayeeDetail) o;
    return Objects.equals(payeeUType, payeeDetail.payeeUType) &&
        Objects.equals(domestic, payeeDetail.domestic) &&
        Objects.equals(biller, payeeDetail.biller) &&
        Objects.equals(international, payeeDetail.international);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payeeUType, domestic, biller, international);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayeeDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    payeeUType: ").append(toIndentedString(payeeUType)).append("\n");
    sb.append("    domestic: ").append(toIndentedString(domestic)).append("\n");
    sb.append("    biller: ").append(toIndentedString(biller)).append("\n");
    sb.append("    international: ").append(toIndentedString(international)).append("\n");
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
