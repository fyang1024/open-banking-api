package io.swagger.model;

import io.swagger.model.DomesticPayeeAccount;
import io.swagger.model.DomesticPayeeCard;
import io.swagger.model.DomesticPayeePayId;

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

public class DomesticPayee  {
  public enum PayeeAccountUTypeEnum {
    ACCOUNT("account"),
    CARD("card"),
    PAYID("payId");

    private String value;

    PayeeAccountUTypeEnum(String value) {
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
    public static PayeeAccountUTypeEnum fromValue(String text) {
      for (PayeeAccountUTypeEnum b : PayeeAccountUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(required = true, description = "Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP")
 /**
   * Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP  
  **/
  private PayeeAccountUTypeEnum payeeAccountUType = null;
  
  @Schema(description = "")
  private DomesticPayeeAccount account = null;
  
  @Schema(description = "")
  private DomesticPayeeCard card = null;
  
  @Schema(description = "")
  private DomesticPayeePayId payId = null;
 /**
   * Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP
   * @return payeeAccountUType
  **/
  @JsonProperty("payeeAccountUType")
  public String getPayeeAccountUType() {
    if (payeeAccountUType == null) {
      return null;
    }
    return payeeAccountUType.getValue();
  }

  public void setPayeeAccountUType(PayeeAccountUTypeEnum payeeAccountUType) {
    this.payeeAccountUType = payeeAccountUType;
  }

  public DomesticPayee payeeAccountUType(PayeeAccountUTypeEnum payeeAccountUType) {
    this.payeeAccountUType = payeeAccountUType;
    return this;
  }

 /**
   * Get account
   * @return account
  **/
  @JsonProperty("account")
  public DomesticPayeeAccount getAccount() {
    return account;
  }

  public void setAccount(DomesticPayeeAccount account) {
    this.account = account;
  }

  public DomesticPayee account(DomesticPayeeAccount account) {
    this.account = account;
    return this;
  }

 /**
   * Get card
   * @return card
  **/
  @JsonProperty("card")
  public DomesticPayeeCard getCard() {
    return card;
  }

  public void setCard(DomesticPayeeCard card) {
    this.card = card;
  }

  public DomesticPayee card(DomesticPayeeCard card) {
    this.card = card;
    return this;
  }

 /**
   * Get payId
   * @return payId
  **/
  @JsonProperty("payId")
  public DomesticPayeePayId getPayId() {
    return payId;
  }

  public void setPayId(DomesticPayeePayId payId) {
    this.payId = payId;
  }

  public DomesticPayee payId(DomesticPayeePayId payId) {
    this.payId = payId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomesticPayee {\n");
    
    sb.append("    payeeAccountUType: ").append(toIndentedString(payeeAccountUType)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    payId: ").append(toIndentedString(payId)).append("\n");
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
