package io.swagger.model;

import io.swagger.model.AuthorisedEntity;

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

public class DirectDebits  {
  
  @Schema(required = true, description = "A unique ID of the account adhering to the standards for ID permanence.")
 /**
   * A unique ID of the account adhering to the standards for ID permanence.  
  **/
  private String accountId = null;
  
  @Schema(description = "")
  private AuthorisedEntity authorisedEntity = null;
  
  @Schema(description = "The date and time of the last debit executed under this authorisation")
 /**
   * The date and time of the last debit executed under this authorisation  
  **/
  private String lastDebitDateTime = null;
  
  @Schema(description = "The amount of the last debit executed under this authorisation")
 /**
   * The amount of the last debit executed under this authorisation  
  **/
  private String lastDebitAmount = null;
 /**
   * A unique ID of the account adhering to the standards for ID permanence.
   * @return accountId
  **/
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public DirectDebits accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get authorisedEntity
   * @return authorisedEntity
  **/
  @JsonProperty("authorisedEntity")
  public AuthorisedEntity getAuthorisedEntity() {
    return authorisedEntity;
  }

  public void setAuthorisedEntity(AuthorisedEntity authorisedEntity) {
    this.authorisedEntity = authorisedEntity;
  }

  public DirectDebits authorisedEntity(AuthorisedEntity authorisedEntity) {
    this.authorisedEntity = authorisedEntity;
    return this;
  }

 /**
   * The date and time of the last debit executed under this authorisation
   * @return lastDebitDateTime
  **/
  @JsonProperty("lastDebitDateTime")
  public String getLastDebitDateTime() {
    return lastDebitDateTime;
  }

  public void setLastDebitDateTime(String lastDebitDateTime) {
    this.lastDebitDateTime = lastDebitDateTime;
  }

  public DirectDebits lastDebitDateTime(String lastDebitDateTime) {
    this.lastDebitDateTime = lastDebitDateTime;
    return this;
  }

 /**
   * The amount of the last debit executed under this authorisation
   * @return lastDebitAmount
  **/
  @JsonProperty("lastDebitAmount")
  public String getLastDebitAmount() {
    return lastDebitAmount;
  }

  public void setLastDebitAmount(String lastDebitAmount) {
    this.lastDebitAmount = lastDebitAmount;
  }

  public DirectDebits lastDebitAmount(String lastDebitAmount) {
    this.lastDebitAmount = lastDebitAmount;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebits {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    authorisedEntity: ").append(toIndentedString(authorisedEntity)).append("\n");
    sb.append("    lastDebitDateTime: ").append(toIndentedString(lastDebitDateTime)).append("\n");
    sb.append("    lastDebitAmount: ").append(toIndentedString(lastDebitAmount)).append("\n");
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
