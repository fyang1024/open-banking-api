package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DomesticPayeeAccount;
import org.openapitools.model.DomesticPayeeCard;
import org.openapitools.model.DomesticPayeePayId;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DomesticPayee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class DomesticPayee   {
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
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("payeeAccountUType")
  private PayeeAccountUTypeEnum payeeAccountUType;

  @JsonProperty("account")
  private DomesticPayeeAccount account = null;

  @JsonProperty("card")
  private DomesticPayeeCard card = null;

  @JsonProperty("payId")
  private DomesticPayeePayId payId = null;

  public DomesticPayee payeeAccountUType(PayeeAccountUTypeEnum payeeAccountUType) {
    this.payeeAccountUType = payeeAccountUType;
    return this;
  }

  /**
   * Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP
   * @return payeeAccountUType
  */
  @ApiModelProperty(required = true, value = "Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP")
  @NotNull


  public PayeeAccountUTypeEnum getPayeeAccountUType() {
    return payeeAccountUType;
  }

  public void setPayeeAccountUType(PayeeAccountUTypeEnum payeeAccountUType) {
    this.payeeAccountUType = payeeAccountUType;
  }

  public DomesticPayee account(DomesticPayeeAccount account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @ApiModelProperty(value = "")

  @Valid

  public DomesticPayeeAccount getAccount() {
    return account;
  }

  public void setAccount(DomesticPayeeAccount account) {
    this.account = account;
  }

  public DomesticPayee card(DomesticPayeeCard card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
  */
  @ApiModelProperty(value = "")

  @Valid

  public DomesticPayeeCard getCard() {
    return card;
  }

  public void setCard(DomesticPayeeCard card) {
    this.card = card;
  }

  public DomesticPayee payId(DomesticPayeePayId payId) {
    this.payId = payId;
    return this;
  }

  /**
   * Get payId
   * @return payId
  */
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.payeeAccountUType, domesticPayee.payeeAccountUType) &&
        Objects.equals(this.account, domesticPayee.account) &&
        Objects.equals(this.card, domesticPayee.card) &&
        Objects.equals(this.payId, domesticPayee.payId);
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

