package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.AccountDepositRates;
import org.openapitools.model.AccountFeatures;
import org.openapitools.model.AccountFees;
import org.openapitools.model.AccountLendingRates;
import org.openapitools.model.CreditCardAccount;
import org.openapitools.model.EnumProductCategory;
import org.openapitools.model.LoanAccount;
import org.openapitools.model.PhysicalAddress;
import org.openapitools.model.TermDepositAccount;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-14T17:34:34.379921+11:00[Australia/Sydney]")

public class AccountDetail   {
  @JsonProperty("accountId")
  private String accountId;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("nickname")
  private String nickname;

  @JsonProperty("maskedNumber")
  private String maskedNumber;

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
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("openStatus")
  private OpenStatusEnum openStatus = OpenStatusEnum.OPEN;

  @JsonProperty("isOwned")
  private Boolean isOwned = true;

  @JsonProperty("productCategory")
  private EnumProductCategory productCategory;

  @JsonProperty("productName")
  private String productName;

  @JsonProperty("bsb")
  private String bsb;

  @JsonProperty("accountNumber")
  private String accountNumber;

  @JsonProperty("bundleName")
  private String bundleName;

  /**
   * The type of structure to present account specific fields.
   */
  public enum SpecificAccountUTypeEnum {
    TERMDEPOSIT("termDeposit"),
    
    CREDITCARD("creditCard"),
    
    LOAN("loan");

    private String value;

    SpecificAccountUTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SpecificAccountUTypeEnum fromValue(String text) {
      for (SpecificAccountUTypeEnum b : SpecificAccountUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("specificAccountUType")
  private SpecificAccountUTypeEnum specificAccountUType;

  @JsonProperty("termDeposit")
  private TermDepositAccount termDeposit = null;

  @JsonProperty("creditCard")
  private CreditCardAccount creditCard = null;

  @JsonProperty("loan")
  private LoanAccount loan = null;

  @JsonProperty("features")
  @Valid
  private List<AccountFeatures> features = null;

  @JsonProperty("fees")
  @Valid
  private List<AccountFees> fees = null;

  @JsonProperty("depositRates")
  @Valid
  private List<AccountDepositRates> depositRates = null;

  @JsonProperty("lendingRates")
  @Valid
  private List<AccountLendingRates> lendingRates = null;

  @JsonProperty("address")
  private PhysicalAddress address = null;

  public AccountDetail accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique ID of the account adhering to the standards for ID permanence
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "A unique ID of the account adhering to the standards for ID permanence")
  @NotNull


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AccountDetail displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the account. If a customer provided nickname is available that value should be returned
   * @return displayName
  */
  @ApiModelProperty(required = true, value = "The display name of the account. If a customer provided nickname is available that value should be returned")
  @NotNull


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AccountDetail nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * A customer supplied nick name for the account
   * @return nickname
  */
  @ApiModelProperty(value = "A customer supplied nick name for the account")


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public AccountDetail maskedNumber(String maskedNumber) {
    this.maskedNumber = maskedNumber;
    return this;
  }

  /**
   * A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked
   * @return maskedNumber
  */
  @ApiModelProperty(required = true, value = "A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked")
  @NotNull


  public String getMaskedNumber() {
    return maskedNumber;
  }

  public void setMaskedNumber(String maskedNumber) {
    this.maskedNumber = maskedNumber;
  }

  public AccountDetail openStatus(OpenStatusEnum openStatus) {
    this.openStatus = openStatus;
    return this;
  }

  /**
   * Open or closed status for the account.  If not present then OPEN is assumed
   * @return openStatus
  */
  @ApiModelProperty(value = "Open or closed status for the account.  If not present then OPEN is assumed")


  public OpenStatusEnum getOpenStatus() {
    return openStatus;
  }

  public void setOpenStatus(OpenStatusEnum openStatus) {
    this.openStatus = openStatus;
  }

  public AccountDetail isOwned(Boolean isOwned) {
    this.isOwned = isOwned;
    return this;
  }

  /**
   * Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then 'true' is assumed
   * @return isOwned
  */
  @ApiModelProperty(value = "Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then 'true' is assumed")


  public Boolean getIsOwned() {
    return isOwned;
  }

  public void setIsOwned(Boolean isOwned) {
    this.isOwned = isOwned;
  }

  public AccountDetail productCategory(EnumProductCategory productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  /**
   * Get productCategory
   * @return productCategory
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public EnumProductCategory getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(EnumProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  public AccountDetail productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display
   * @return productName
  */
  @ApiModelProperty(required = true, value = "A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display")
  @NotNull


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public AccountDetail bsb(String bsb) {
    this.bsb = bsb;
    return this;
  }

  /**
   * The unmasked BSB for the account.  Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces
   * @return bsb
  */
  @ApiModelProperty(value = "The unmasked BSB for the account.  Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces")


  public String getBsb() {
    return bsb;
  }

  public void setBsb(String bsb) {
    this.bsb = bsb;
  }

  public AccountDetail accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The unmasked account number for the account.  Should not be supplied if the account number is a PAN requiring PCI compliance. Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces
   * @return accountNumber
  */
  @ApiModelProperty(value = "The unmasked account number for the account.  Should not be supplied if the account number is a PAN requiring PCI compliance. Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public AccountDetail bundleName(String bundleName) {
    this.bundleName = bundleName;
    return this;
  }

  /**
   * Optional field to indicate if this account is part of a bundle that is providing additional benefit for to the customer
   * @return bundleName
  */
  @ApiModelProperty(value = "Optional field to indicate if this account is part of a bundle that is providing additional benefit for to the customer")


  public String getBundleName() {
    return bundleName;
  }

  public void setBundleName(String bundleName) {
    this.bundleName = bundleName;
  }

  public AccountDetail specificAccountUType(SpecificAccountUTypeEnum specificAccountUType) {
    this.specificAccountUType = specificAccountUType;
    return this;
  }

  /**
   * The type of structure to present account specific fields.
   * @return specificAccountUType
  */
  @ApiModelProperty(value = "The type of structure to present account specific fields.")


  public SpecificAccountUTypeEnum getSpecificAccountUType() {
    return specificAccountUType;
  }

  public void setSpecificAccountUType(SpecificAccountUTypeEnum specificAccountUType) {
    this.specificAccountUType = specificAccountUType;
  }

  public AccountDetail termDeposit(TermDepositAccount termDeposit) {
    this.termDeposit = termDeposit;
    return this;
  }

  /**
   * Get termDeposit
   * @return termDeposit
  */
  @ApiModelProperty(value = "")

  @Valid

  public TermDepositAccount getTermDeposit() {
    return termDeposit;
  }

  public void setTermDeposit(TermDepositAccount termDeposit) {
    this.termDeposit = termDeposit;
  }

  public AccountDetail creditCard(CreditCardAccount creditCard) {
    this.creditCard = creditCard;
    return this;
  }

  /**
   * Get creditCard
   * @return creditCard
  */
  @ApiModelProperty(value = "")

  @Valid

  public CreditCardAccount getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(CreditCardAccount creditCard) {
    this.creditCard = creditCard;
  }

  public AccountDetail loan(LoanAccount loan) {
    this.loan = loan;
    return this;
  }

  /**
   * Get loan
   * @return loan
  */
  @ApiModelProperty(value = "")

  @Valid

  public LoanAccount getLoan() {
    return loan;
  }

  public void setLoan(LoanAccount loan) {
    this.loan = loan;
  }

  public AccountDetail features(List<AccountFeatures> features) {
    this.features = features;
    return this;
  }

  public AccountDetail addFeaturesItem(AccountFeatures featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * Get features
   * @return features
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AccountFeatures> getFeatures() {
    return features;
  }

  public void setFeatures(List<AccountFeatures> features) {
    this.features = features;
  }

  public AccountDetail fees(List<AccountFees> fees) {
    this.fees = fees;
    return this;
  }

  public AccountDetail addFeesItem(AccountFees feesItem) {
    if (this.fees == null) {
      this.fees = new ArrayList<>();
    }
    this.fees.add(feesItem);
    return this;
  }

  /**
   * Get fees
   * @return fees
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AccountFees> getFees() {
    return fees;
  }

  public void setFees(List<AccountFees> fees) {
    this.fees = fees;
  }

  public AccountDetail depositRates(List<AccountDepositRates> depositRates) {
    this.depositRates = depositRates;
    return this;
  }

  public AccountDetail addDepositRatesItem(AccountDepositRates depositRatesItem) {
    if (this.depositRates == null) {
      this.depositRates = new ArrayList<>();
    }
    this.depositRates.add(depositRatesItem);
    return this;
  }

  /**
   * Get depositRates
   * @return depositRates
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AccountDepositRates> getDepositRates() {
    return depositRates;
  }

  public void setDepositRates(List<AccountDepositRates> depositRates) {
    this.depositRates = depositRates;
  }

  public AccountDetail lendingRates(List<AccountLendingRates> lendingRates) {
    this.lendingRates = lendingRates;
    return this;
  }

  public AccountDetail addLendingRatesItem(AccountLendingRates lendingRatesItem) {
    if (this.lendingRates == null) {
      this.lendingRates = new ArrayList<>();
    }
    this.lendingRates.add(lendingRatesItem);
    return this;
  }

  /**
   * Get lendingRates
   * @return lendingRates
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AccountLendingRates> getLendingRates() {
    return lendingRates;
  }

  public void setLendingRates(List<AccountLendingRates> lendingRates) {
    this.lendingRates = lendingRates;
  }

  public AccountDetail address(PhysicalAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public PhysicalAddress getAddress() {
    return address;
  }

  public void setAddress(PhysicalAddress address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetail accountDetail = (AccountDetail) o;
    return Objects.equals(this.accountId, accountDetail.accountId) &&
        Objects.equals(this.displayName, accountDetail.displayName) &&
        Objects.equals(this.nickname, accountDetail.nickname) &&
        Objects.equals(this.maskedNumber, accountDetail.maskedNumber) &&
        Objects.equals(this.openStatus, accountDetail.openStatus) &&
        Objects.equals(this.isOwned, accountDetail.isOwned) &&
        Objects.equals(this.productCategory, accountDetail.productCategory) &&
        Objects.equals(this.productName, accountDetail.productName) &&
        Objects.equals(this.bsb, accountDetail.bsb) &&
        Objects.equals(this.accountNumber, accountDetail.accountNumber) &&
        Objects.equals(this.bundleName, accountDetail.bundleName) &&
        Objects.equals(this.specificAccountUType, accountDetail.specificAccountUType) &&
        Objects.equals(this.termDeposit, accountDetail.termDeposit) &&
        Objects.equals(this.creditCard, accountDetail.creditCard) &&
        Objects.equals(this.loan, accountDetail.loan) &&
        Objects.equals(this.features, accountDetail.features) &&
        Objects.equals(this.fees, accountDetail.fees) &&
        Objects.equals(this.depositRates, accountDetail.depositRates) &&
        Objects.equals(this.lendingRates, accountDetail.lendingRates) &&
        Objects.equals(this.address, accountDetail.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, displayName, nickname, maskedNumber, openStatus, isOwned, productCategory, productName, bsb, accountNumber, bundleName, specificAccountUType, termDeposit, creditCard, loan, features, fees, depositRates, lendingRates, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetail {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    maskedNumber: ").append(toIndentedString(maskedNumber)).append("\n");
    sb.append("    openStatus: ").append(toIndentedString(openStatus)).append("\n");
    sb.append("    isOwned: ").append(toIndentedString(isOwned)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    bsb: ").append(toIndentedString(bsb)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bundleName: ").append(toIndentedString(bundleName)).append("\n");
    sb.append("    specificAccountUType: ").append(toIndentedString(specificAccountUType)).append("\n");
    sb.append("    termDeposit: ").append(toIndentedString(termDeposit)).append("\n");
    sb.append("    creditCard: ").append(toIndentedString(creditCard)).append("\n");
    sb.append("    loan: ").append(toIndentedString(loan)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    depositRates: ").append(toIndentedString(depositRates)).append("\n");
    sb.append("    lendingRates: ").append(toIndentedString(lendingRates)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

