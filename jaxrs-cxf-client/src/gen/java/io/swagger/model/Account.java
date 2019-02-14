package io.swagger.model;

import io.swagger.model.EnumProductCategory;

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

public class Account  {
  
  @Schema(required = true, description = "A unique ID of the account adhering to the standards for ID permanence")
 /**
   * A unique ID of the account adhering to the standards for ID permanence  
  **/
  private String accountId = null;
  
  @Schema(required = true, description = "The display name of the account. If a customer provided nickname is available that value should be returned")
 /**
   * The display name of the account. If a customer provided nickname is available that value should be returned  
  **/
  private String displayName = null;
  
  @Schema(description = "A customer supplied nick name for the account")
 /**
   * A customer supplied nick name for the account  
  **/
  private String nickname = null;
  
  @Schema(required = true, description = "A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked")
 /**
   * A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked  
  **/
  private String maskedNumber = null;
  public enum OpenStatusEnum {
    OPEN("OPEN"),
    CLOSED("CLOSED");

    private String value;

    OpenStatusEnum(String value) {
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
    public static OpenStatusEnum fromValue(String text) {
      for (OpenStatusEnum b : OpenStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "Open or closed status for the account.  If not present then OPEN is assumed")
 /**
   * Open or closed status for the account.  If not present then OPEN is assumed  
  **/
  private OpenStatusEnum openStatus = OpenStatusEnum.OPEN;
  
  @Schema(description = "Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then 'true' is assumed")
 /**
   * Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then 'true' is assumed  
  **/
  private Boolean isOwned = true;
  
  @Schema(required = true, description = "")
  private EnumProductCategory productCategory = null;
  
  @Schema(required = true, description = "A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display")
 /**
   * A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display  
  **/
  private String productName = null;
 /**
   * A unique ID of the account adhering to the standards for ID permanence
   * @return accountId
  **/
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Account accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * The display name of the account. If a customer provided nickname is available that value should be returned
   * @return displayName
  **/
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Account displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

 /**
   * A customer supplied nick name for the account
   * @return nickname
  **/
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public Account nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

 /**
   * A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked
   * @return maskedNumber
  **/
  @JsonProperty("maskedNumber")
  public String getMaskedNumber() {
    return maskedNumber;
  }

  public void setMaskedNumber(String maskedNumber) {
    this.maskedNumber = maskedNumber;
  }

  public Account maskedNumber(String maskedNumber) {
    this.maskedNumber = maskedNumber;
    return this;
  }

 /**
   * Open or closed status for the account.  If not present then OPEN is assumed
   * @return openStatus
  **/
  @JsonProperty("openStatus")
  public String getOpenStatus() {
    if (openStatus == null) {
      return null;
    }
    return openStatus.getValue();
  }

  public void setOpenStatus(OpenStatusEnum openStatus) {
    this.openStatus = openStatus;
  }

  public Account openStatus(OpenStatusEnum openStatus) {
    this.openStatus = openStatus;
    return this;
  }

 /**
   * Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then &#x27;true&#x27; is assumed
   * @return isOwned
  **/
  @JsonProperty("isOwned")
  public Boolean isisIsOwned() {
    return isOwned;
  }

  public void setIsOwned(Boolean isOwned) {
    this.isOwned = isOwned;
  }

  public Account isOwned(Boolean isOwned) {
    this.isOwned = isOwned;
    return this;
  }

 /**
   * Get productCategory
   * @return productCategory
  **/
  @JsonProperty("productCategory")
  public EnumProductCategory getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(EnumProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  public Account productCategory(EnumProductCategory productCategory) {
    this.productCategory = productCategory;
    return this;
  }

 /**
   * A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display
   * @return productName
  **/
  @JsonProperty("productName")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Account productName(String productName) {
    this.productName = productName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    maskedNumber: ").append(toIndentedString(maskedNumber)).append("\n");
    sb.append("    openStatus: ").append(toIndentedString(openStatus)).append("\n");
    sb.append("    isOwned: ").append(toIndentedString(isOwned)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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
