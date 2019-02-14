package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.EnumProductCategory;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class Account   {
  @JsonProperty("accountId")
  private String accountId = null;
  @JsonProperty("displayName")
  private String displayName = null;
  @JsonProperty("nickname")
  private String nickname = null;
  @JsonProperty("maskedNumber")
  private String maskedNumber = null;
  /**
   * Open or closed status for the account.  If not present then OPEN is assumed
   */
  public enum OpenStatusEnum {
    OPEN("OPEN"),
    
    CLOSED("CLOSED");

    private String value;

    OpenStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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
  @JsonProperty("openStatus")
  private OpenStatusEnum openStatus = OpenStatusEnum.OPEN;
  @JsonProperty("isOwned")
  private Boolean isOwned = true;
  @JsonProperty("productCategory")
  private EnumProductCategory productCategory = null;
  @JsonProperty("productName")
  private String productName = null;
  /**
   * A unique ID of the account adhering to the standards for ID permanence
   **/
  public Account accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  
  @Schema(required = true, description = "A unique ID of the account adhering to the standards for ID permanence")
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * The display name of the account. If a customer provided nickname is available that value should be returned
   **/
  public Account displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
  @Schema(required = true, description = "The display name of the account. If a customer provided nickname is available that value should be returned")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * A customer supplied nick name for the account
   **/
  public Account nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  
  @Schema(description = "A customer supplied nick name for the account")
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  /**
   * A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked
   **/
  public Account maskedNumber(String maskedNumber) {
    this.maskedNumber = maskedNumber;
    return this;
  }

  
  @Schema(required = true, description = "A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked")
  @JsonProperty("maskedNumber")
  public String getMaskedNumber() {
    return maskedNumber;
  }
  public void setMaskedNumber(String maskedNumber) {
    this.maskedNumber = maskedNumber;
  }

  /**
   * Open or closed status for the account.  If not present then OPEN is assumed
   **/
  public Account openStatus(OpenStatusEnum openStatus) {
    this.openStatus = openStatus;
    return this;
  }

  
  @Schema(description = "Open or closed status for the account.  If not present then OPEN is assumed")
  @JsonProperty("openStatus")
  public OpenStatusEnum getOpenStatus() {
    return openStatus;
  }
  public void setOpenStatus(OpenStatusEnum openStatus) {
    this.openStatus = openStatus;
  }

  /**
   * Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then 'true' is assumed
   **/
  public Account isOwned(Boolean isOwned) {
    this.isOwned = isOwned;
    return this;
  }

  
  @Schema(description = "Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then 'true' is assumed")
  @JsonProperty("isOwned")
  public Boolean isIsOwned() {
    return isOwned;
  }
  public void setIsOwned(Boolean isOwned) {
    this.isOwned = isOwned;
  }

  /**
   **/
  public Account productCategory(EnumProductCategory productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  
  @Schema(required = true, description = "")
  @JsonProperty("productCategory")
  public EnumProductCategory getProductCategory() {
    return productCategory;
  }
  public void setProductCategory(EnumProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display
   **/
  public Account productName(String productName) {
    this.productName = productName;
    return this;
  }

  
  @Schema(required = true, description = "A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display")
  @JsonProperty("productName")
  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(accountId, account.accountId) &&
        Objects.equals(displayName, account.displayName) &&
        Objects.equals(nickname, account.nickname) &&
        Objects.equals(maskedNumber, account.maskedNumber) &&
        Objects.equals(openStatus, account.openStatus) &&
        Objects.equals(isOwned, account.isOwned) &&
        Objects.equals(productCategory, account.productCategory) &&
        Objects.equals(productName, account.productName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, displayName, nickname, maskedNumber, openStatus, isOwned, productCategory, productName);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
