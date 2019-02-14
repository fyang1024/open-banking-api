package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EnumProductCategory;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Account
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-14T03:26:14.367Z[GMT]")
public class Account   {
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

  public Account accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique ID of the account adhering to the standards for ID permanence
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "A unique ID of the account adhering to the standards for ID permanence")
  @NotNull

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Account displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the account. If a customer provided nickname is available that value should be returned
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "The display name of the account. If a customer provided nickname is available that value should be returned")
  @NotNull

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Account nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * A customer supplied nick name for the account
   * @return nickname
  **/
  @ApiModelProperty(value = "A customer supplied nick name for the account")

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public Account maskedNumber(String maskedNumber) {
    this.maskedNumber = maskedNumber;
    return this;
  }

  /**
   * A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked
   * @return maskedNumber
  **/
  @ApiModelProperty(required = true, value = "A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked")
  @NotNull

  public String getMaskedNumber() {
    return maskedNumber;
  }

  public void setMaskedNumber(String maskedNumber) {
    this.maskedNumber = maskedNumber;
  }

  public Account openStatus(OpenStatusEnum openStatus) {
    this.openStatus = openStatus;
    return this;
  }

  /**
   * Open or closed status for the account.  If not present then OPEN is assumed
   * @return openStatus
  **/
  @ApiModelProperty(value = "Open or closed status for the account.  If not present then OPEN is assumed")

  public OpenStatusEnum getOpenStatus() {
    return openStatus;
  }

  public void setOpenStatus(OpenStatusEnum openStatus) {
    this.openStatus = openStatus;
  }

  public Account isOwned(Boolean isOwned) {
    this.isOwned = isOwned;
    return this;
  }

  /**
   * Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then 'true' is assumed
   * @return isOwned
  **/
  @ApiModelProperty(value = "Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then 'true' is assumed")

  public Boolean isIsOwned() {
    return isOwned;
  }

  public void setIsOwned(Boolean isOwned) {
    this.isOwned = isOwned;
  }

  public Account productCategory(EnumProductCategory productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  /**
   * Get productCategory
   * @return productCategory
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public EnumProductCategory getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(EnumProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  public Account productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display
   * @return productName
  **/
  @ApiModelProperty(required = true, value = "A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display")
  @NotNull

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
    return Objects.equals(this.accountId, account.accountId) &&
        Objects.equals(this.displayName, account.displayName) &&
        Objects.equals(this.nickname, account.nickname) &&
        Objects.equals(this.maskedNumber, account.maskedNumber) &&
        Objects.equals(this.openStatus, account.openStatus) &&
        Objects.equals(this.isOwned, account.isOwned) &&
        Objects.equals(this.productCategory, account.productCategory) &&
        Objects.equals(this.productName, account.productName);
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
