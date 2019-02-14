package io.swagger.model;


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

public class Payee  {
  
  @Schema(required = true, description = "ID of the payee adhering to the rules of ID permanence")
 /**
   * ID of the payee adhering to the rules of ID permanence  
  **/
  private String payeeId = null;
  
  @Schema(required = true, description = "The short display name of the payee as provided by the customer")
 /**
   * The short display name of the payee as provided by the customer  
  **/
  private String nickname = null;
  
  @Schema(description = "A description of the payee provided by the customer")
 /**
   * A description of the payee provided by the customer  
  **/
  private String description = null;
  public enum TypeEnum {
    DOMESTIC("DOMESTIC"),
    INTERNATIONAL("INTERNATIONAL"),
    BILLER("BILLER");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(required = true, description = "The type of payee. DOMESTIC means a registered payee for domestic payments including NPP. INTERNATIONAL means a registered payee for international payments. BILLER means a registered payee for BPAY")
 /**
   * The type of payee. DOMESTIC means a registered payee for domestic payments including NPP. INTERNATIONAL means a registered payee for international payments. BILLER means a registered payee for BPAY  
  **/
  private TypeEnum type = null;
  
  @Schema(description = "The date the payee was created by the customer")
 /**
   * The date the payee was created by the customer  
  **/
  private String creationDate = null;
 /**
   * ID of the payee adhering to the rules of ID permanence
   * @return payeeId
  **/
  @JsonProperty("payeeId")
  public String getPayeeId() {
    return payeeId;
  }

  public void setPayeeId(String payeeId) {
    this.payeeId = payeeId;
  }

  public Payee payeeId(String payeeId) {
    this.payeeId = payeeId;
    return this;
  }

 /**
   * The short display name of the payee as provided by the customer
   * @return nickname
  **/
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public Payee nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

 /**
   * A description of the payee provided by the customer
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Payee description(String description) {
    this.description = description;
    return this;
  }

 /**
   * The type of payee. DOMESTIC means a registered payee for domestic payments including NPP. INTERNATIONAL means a registered payee for international payments. BILLER means a registered payee for BPAY
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.getValue();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Payee type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The date the payee was created by the customer
   * @return creationDate
  **/
  @JsonProperty("creationDate")
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public Payee creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payee {\n");
    
    sb.append("    payeeId: ").append(toIndentedString(payeeId)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
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
