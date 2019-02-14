package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.EnumProductCategory;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2019-02-14T03:34:59.075Z[GMT]")public class Account   {
  private String accountId = null;
  private String displayName = null;
  private String nickname = null;
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
  }
  private OpenStatusEnum openStatus = OpenStatusEnum.OPEN;
  private Boolean isOwned = true;
  private EnumProductCategory productCategory = null;
  private String productName = null;

  /**
   * A unique ID of the account adhering to the standards for ID permanence
   **/
  
  @Schema(required = true, description = "A unique ID of the account adhering to the standards for ID permanence")
  @JsonProperty("accountId")
  @NotNull
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * The display name of the account. If a customer provided nickname is available that value should be returned
   **/
  
  @Schema(required = true, description = "The display name of the account. If a customer provided nickname is available that value should be returned")
  @JsonProperty("displayName")
  @NotNull
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * A customer supplied nick name for the account
   **/
  
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
  
  @Schema(required = true, description = "A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked")
  @JsonProperty("maskedNumber")
  @NotNull
  public String getMaskedNumber() {
    return maskedNumber;
  }
  public void setMaskedNumber(String maskedNumber) {
    this.maskedNumber = maskedNumber;
  }

  /**
   * Open or closed status for the account.  If not present then OPEN is assumed
   **/
  
  @Schema(description = "Open or closed status for the account.  If not present then OPEN is assumed")
  @JsonProperty("openStatus")
  public OpenStatusEnum getOpenStatus() {
    return openStatus;
  }
  public void setOpenStatus(OpenStatusEnum openStatus) {
    this.openStatus = openStatus;
  }

  /**
   * Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then &#x27;true&#x27; is assumed
   **/
  
  @Schema(description = "Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then 'true' is assumed")
  @JsonProperty("isOwned")
  public Boolean isisIsOwned() {
    return isOwned;
  }
  public void setIsOwned(Boolean isOwned) {
    this.isOwned = isOwned;
  }

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("productCategory")
  @NotNull
  public EnumProductCategory getProductCategory() {
    return productCategory;
  }
  public void setProductCategory(EnumProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display
   **/
  
  @Schema(required = true, description = "A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display")
  @JsonProperty("productName")
  @NotNull
  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
