package io.swagger.model;

import io.swagger.model.BillerPayee;
import io.swagger.model.DomesticPayee;
import io.swagger.model.InternationalPayee;
import io.swagger.model.Payee;

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

public class PayeeDetail extends Payee {
  public enum PayeeUTypeEnum {
    DOMESTIC("domestic"),
    BILLER("biller"),
    INTERNATIONAL("international");

    private String value;

    PayeeUTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static PayeeUTypeEnum fromValue(String text) {
      for (PayeeUTypeEnum b : PayeeUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(required = true, description = "Type of object included that describes the payee in detail")
 /**
   * Type of object included that describes the payee in detail  
  **/
  private PayeeUTypeEnum payeeUType = null;
  
  @Schema(description = "")
  private DomesticPayee domestic = null;
  
  @Schema(description = "")
  private BillerPayee biller = null;
  
  @Schema(description = "")
  private InternationalPayee international = null;
 /**
   * Type of object included that describes the payee in detail
   * @return payeeUType
  **/
  @JsonProperty("payeeUType")
  public String getPayeeUType() {
    if (payeeUType == null) {
      return null;
    }
    return payeeUType.getValue();
  }

  public void setPayeeUType(PayeeUTypeEnum payeeUType) {
    this.payeeUType = payeeUType;
  }

  public PayeeDetail payeeUType(PayeeUTypeEnum payeeUType) {
    this.payeeUType = payeeUType;
    return this;
  }

 /**
   * Get domestic
   * @return domestic
  **/
  @JsonProperty("domestic")
  public DomesticPayee getDomestic() {
    return domestic;
  }

  public void setDomestic(DomesticPayee domestic) {
    this.domestic = domestic;
  }

  public PayeeDetail domestic(DomesticPayee domestic) {
    this.domestic = domestic;
    return this;
  }

 /**
   * Get biller
   * @return biller
  **/
  @JsonProperty("biller")
  public BillerPayee getBiller() {
    return biller;
  }

  public void setBiller(BillerPayee biller) {
    this.biller = biller;
  }

  public PayeeDetail biller(BillerPayee biller) {
    this.biller = biller;
    return this;
  }

 /**
   * Get international
   * @return international
  **/
  @JsonProperty("international")
  public InternationalPayee getInternational() {
    return international;
  }

  public void setInternational(InternationalPayee international) {
    this.international = international;
  }

  public PayeeDetail international(InternationalPayee international) {
    this.international = international;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
