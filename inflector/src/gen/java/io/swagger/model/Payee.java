package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class Payee   {
  @JsonProperty("payeeId")
  private String payeeId = null;
  @JsonProperty("nickname")
  private String nickname = null;
  @JsonProperty("description")
  private String description = null;
  /**
   * The type of payee. DOMESTIC means a registered payee for domestic payments including NPP. INTERNATIONAL means a registered payee for international payments. BILLER means a registered payee for BPAY
   */
  public enum TypeEnum {
    DOMESTIC("DOMESTIC"),
    
    INTERNATIONAL("INTERNATIONAL"),
    
    BILLER("BILLER");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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
  @JsonProperty("type")
  private TypeEnum type = null;
  @JsonProperty("creationDate")
  private String creationDate = null;
  /**
   * ID of the payee adhering to the rules of ID permanence
   **/
  public Payee payeeId(String payeeId) {
    this.payeeId = payeeId;
    return this;
  }

  
  @Schema(required = true, description = "ID of the payee adhering to the rules of ID permanence")
  @JsonProperty("payeeId")
  public String getPayeeId() {
    return payeeId;
  }
  public void setPayeeId(String payeeId) {
    this.payeeId = payeeId;
  }

  /**
   * The short display name of the payee as provided by the customer
   **/
  public Payee nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  
  @Schema(required = true, description = "The short display name of the payee as provided by the customer")
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  /**
   * A description of the payee provided by the customer
   **/
  public Payee description(String description) {
    this.description = description;
    return this;
  }

  
  @Schema(description = "A description of the payee provided by the customer")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The type of payee. DOMESTIC means a registered payee for domestic payments including NPP. INTERNATIONAL means a registered payee for international payments. BILLER means a registered payee for BPAY
   **/
  public Payee type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @Schema(required = true, description = "The type of payee. DOMESTIC means a registered payee for domestic payments including NPP. INTERNATIONAL means a registered payee for international payments. BILLER means a registered payee for BPAY")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The date the payee was created by the customer
   **/
  public Payee creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  
  @Schema(description = "The date the payee was created by the customer")
  @JsonProperty("creationDate")
  public String getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payee payee = (Payee) o;
    return Objects.equals(payeeId, payee.payeeId) &&
        Objects.equals(nickname, payee.nickname) &&
        Objects.equals(description, payee.description) &&
        Objects.equals(type, payee.type) &&
        Objects.equals(creationDate, payee.creationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payeeId, nickname, description, type, creationDate);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
