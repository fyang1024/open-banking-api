package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Account;
import io.swagger.model.AccountDepositRates;
import io.swagger.model.AccountFeatures;
import io.swagger.model.AccountFees;
import io.swagger.model.AccountLendingRates;
import io.swagger.model.CreditCardAccount;
import io.swagger.model.EnumProductCategory;
import io.swagger.model.LoanAccount;
import io.swagger.model.PhysicalAddress;
import io.swagger.model.TermDepositAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountDetail
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-14T03:26:14.367Z[GMT]")
public class AccountDetail extends Account  {
  @JsonProperty("bsb")
  private String bsb = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("bundleName")
  private String bundleName = null;

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
      return null;
    }
  }
  @JsonProperty("specificAccountUType")
  private SpecificAccountUTypeEnum specificAccountUType = null;

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

  public AccountDetail bsb(String bsb) {
    this.bsb = bsb;
    return this;
  }

  /**
   * The unmasked BSB for the account.  Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces
   * @return bsb
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
      this.features = new ArrayList<AccountFeatures>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * Get features
   * @return features
  **/
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
      this.fees = new ArrayList<AccountFees>();
    }
    this.fees.add(feesItem);
    return this;
  }

  /**
   * Get fees
   * @return fees
  **/
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
      this.depositRates = new ArrayList<AccountDepositRates>();
    }
    this.depositRates.add(depositRatesItem);
    return this;
  }

  /**
   * Get depositRates
   * @return depositRates
  **/
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
      this.lendingRates = new ArrayList<AccountLendingRates>();
    }
    this.lendingRates.add(lendingRatesItem);
    return this;
  }

  /**
   * Get lendingRates
   * @return lendingRates
  **/
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
  **/
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
    return Objects.equals(this.bsb, accountDetail.bsb) &&
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
        Objects.equals(this.address, accountDetail.address) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bsb, accountNumber, bundleName, specificAccountUType, termDeposit, creditCard, loan, features, fees, depositRates, lendingRates, address, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
