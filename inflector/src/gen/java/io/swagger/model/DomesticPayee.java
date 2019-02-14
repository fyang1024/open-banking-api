package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.DomesticPayeeAccount;
import io.swagger.model.DomesticPayeeCard;
import io.swagger.model.DomesticPayeePayId;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class DomesticPayee   {
  /**
   * Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP
   */
  public enum PayeeAccountUTypeEnum {
    ACCOUNT("account"),
    
    CARD("card"),
    
    PAYID("payId");

    private String value;

    PayeeAccountUTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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
  @JsonProperty("payeeAccountUType")
  private PayeeAccountUTypeEnum payeeAccountUType = null;
  @JsonProperty("account")
  private DomesticPayeeAccount account = null;
  @JsonProperty("card")
  private DomesticPayeeCard card = null;
  @JsonProperty("payId")
  private DomesticPayeePayId payId = null;
  /**
   * Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP
   **/
  public DomesticPayee payeeAccountUType(PayeeAccountUTypeEnum payeeAccountUType) {
    this.payeeAccountUType = payeeAccountUType;
    return this;
  }

  
  @Schema(required = true, description = "Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP")
  @JsonProperty("payeeAccountUType")
  public PayeeAccountUTypeEnum getPayeeAccountUType() {
    return payeeAccountUType;
  }
  public void setPayeeAccountUType(PayeeAccountUTypeEnum payeeAccountUType) {
    this.payeeAccountUType = payeeAccountUType;
  }

  /**
   **/
  public DomesticPayee account(DomesticPayeeAccount account) {
    this.account = account;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("account")
  public DomesticPayeeAccount getAccount() {
    return account;
  }
  public void setAccount(DomesticPayeeAccount account) {
    this.account = account;
  }

  /**
   **/
  public DomesticPayee card(DomesticPayeeCard card) {
    this.card = card;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("card")
  public DomesticPayeeCard getCard() {
    return card;
  }
  public void setCard(DomesticPayeeCard card) {
    this.card = card;
  }

  /**
   **/
  public DomesticPayee payId(DomesticPayeePayId payId) {
    this.payId = payId;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("payId")
  public DomesticPayeePayId getPayId() {
    return payId;
  }
  public void setPayId(DomesticPayeePayId payId) {
    this.payId = payId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomesticPayee domesticPayee = (DomesticPayee) o;
    return Objects.equals(payeeAccountUType, domesticPayee.payeeAccountUType) &&
        Objects.equals(account, domesticPayee.account) &&
        Objects.equals(card, domesticPayee.card) &&
        Objects.equals(payId, domesticPayee.payId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payeeAccountUType, account, card, payId);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
