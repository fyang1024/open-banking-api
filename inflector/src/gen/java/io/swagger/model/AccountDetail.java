package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class AccountDetail extends Account  {
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
  private List<AccountFeatures> features = null;
  @JsonProperty("fees")
  private List<AccountFees> fees = null;
  @JsonProperty("depositRates")
  private List<AccountDepositRates> depositRates = null;
  @JsonProperty("lendingRates")
  private List<AccountLendingRates> lendingRates = null;
  @JsonProperty("address")
  private PhysicalAddress address = null;
  /**
   * The unmasked BSB for the account.  Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces
   **/
  public AccountDetail bsb(String bsb) {
    this.bsb = bsb;
    return this;
  }

  
  @Schema(description = "The unmasked BSB for the account.  Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces")
  @JsonProperty("bsb")
  public String getBsb() {
    return bsb;
  }
  public void setBsb(String bsb) {
    this.bsb = bsb;
  }

  /**
   * The unmasked account number for the account.  Should not be supplied if the account number is a PAN requiring PCI compliance. Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces
   **/
  public AccountDetail accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  
  @Schema(description = "The unmasked account number for the account.  Should not be supplied if the account number is a PAN requiring PCI compliance. Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces")
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   * Optional field to indicate if this account is part of a bundle that is providing additional benefit for to the customer
   **/
  public AccountDetail bundleName(String bundleName) {
    this.bundleName = bundleName;
    return this;
  }

  
  @Schema(description = "Optional field to indicate if this account is part of a bundle that is providing additional benefit for to the customer")
  @JsonProperty("bundleName")
  public String getBundleName() {
    return bundleName;
  }
  public void setBundleName(String bundleName) {
    this.bundleName = bundleName;
  }

  /**
   * The type of structure to present account specific fields.
   **/
  public AccountDetail specificAccountUType(SpecificAccountUTypeEnum specificAccountUType) {
    this.specificAccountUType = specificAccountUType;
    return this;
  }

  
  @Schema(description = "The type of structure to present account specific fields.")
  @JsonProperty("specificAccountUType")
  public SpecificAccountUTypeEnum getSpecificAccountUType() {
    return specificAccountUType;
  }
  public void setSpecificAccountUType(SpecificAccountUTypeEnum specificAccountUType) {
    this.specificAccountUType = specificAccountUType;
  }

  /**
   **/
  public AccountDetail termDeposit(TermDepositAccount termDeposit) {
    this.termDeposit = termDeposit;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("termDeposit")
  public TermDepositAccount getTermDeposit() {
    return termDeposit;
  }
  public void setTermDeposit(TermDepositAccount termDeposit) {
    this.termDeposit = termDeposit;
  }

  /**
   **/
  public AccountDetail creditCard(CreditCardAccount creditCard) {
    this.creditCard = creditCard;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("creditCard")
  public CreditCardAccount getCreditCard() {
    return creditCard;
  }
  public void setCreditCard(CreditCardAccount creditCard) {
    this.creditCard = creditCard;
  }

  /**
   **/
  public AccountDetail loan(LoanAccount loan) {
    this.loan = loan;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("loan")
  public LoanAccount getLoan() {
    return loan;
  }
  public void setLoan(LoanAccount loan) {
    this.loan = loan;
  }

  /**
   **/
  public AccountDetail features(List<AccountFeatures> features) {
    this.features = features;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("features")
  public List<AccountFeatures> getFeatures() {
    return features;
  }
  public void setFeatures(List<AccountFeatures> features) {
    this.features = features;
  }

  /**
   **/
  public AccountDetail fees(List<AccountFees> fees) {
    this.fees = fees;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("fees")
  public List<AccountFees> getFees() {
    return fees;
  }
  public void setFees(List<AccountFees> fees) {
    this.fees = fees;
  }

  /**
   **/
  public AccountDetail depositRates(List<AccountDepositRates> depositRates) {
    this.depositRates = depositRates;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("depositRates")
  public List<AccountDepositRates> getDepositRates() {
    return depositRates;
  }
  public void setDepositRates(List<AccountDepositRates> depositRates) {
    this.depositRates = depositRates;
  }

  /**
   **/
  public AccountDetail lendingRates(List<AccountLendingRates> lendingRates) {
    this.lendingRates = lendingRates;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("lendingRates")
  public List<AccountLendingRates> getLendingRates() {
    return lendingRates;
  }
  public void setLendingRates(List<AccountLendingRates> lendingRates) {
    this.lendingRates = lendingRates;
  }

  /**
   **/
  public AccountDetail address(PhysicalAddress address) {
    this.address = address;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("address")
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
    return Objects.equals(bsb, accountDetail.bsb) &&
        Objects.equals(accountNumber, accountDetail.accountNumber) &&
        Objects.equals(bundleName, accountDetail.bundleName) &&
        Objects.equals(specificAccountUType, accountDetail.specificAccountUType) &&
        Objects.equals(termDeposit, accountDetail.termDeposit) &&
        Objects.equals(creditCard, accountDetail.creditCard) &&
        Objects.equals(loan, accountDetail.loan) &&
        Objects.equals(features, accountDetail.features) &&
        Objects.equals(fees, accountDetail.fees) &&
        Objects.equals(depositRates, accountDetail.depositRates) &&
        Objects.equals(lendingRates, accountDetail.lendingRates) &&
        Objects.equals(address, accountDetail.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bsb, accountNumber, bundleName, specificAccountUType, termDeposit, creditCard, loan, features, fees, depositRates, lendingRates, address);
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
