package io.swagger.model;

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

public class AccountDetail extends Account {
  
  @Schema(description = "The unmasked BSB for the account.  Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces")
 /**
   * The unmasked BSB for the account.  Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces  
  **/
  private String bsb = null;
  
  @Schema(description = "The unmasked account number for the account.  Should not be supplied if the account number is a PAN requiring PCI compliance. Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces")
 /**
   * The unmasked account number for the account.  Should not be supplied if the account number is a PAN requiring PCI compliance. Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces  
  **/
  private String accountNumber = null;
  
  @Schema(description = "Optional field to indicate if this account is part of a bundle that is providing additional benefit for to the customer")
 /**
   * Optional field to indicate if this account is part of a bundle that is providing additional benefit for to the customer  
  **/
  private String bundleName = null;
  public enum SpecificAccountUTypeEnum {
    TERMDEPOSIT("termDeposit"),
    CREDITCARD("creditCard"),
    LOAN("loan");

    private String value;

    SpecificAccountUTypeEnum(String value) {
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
    public static SpecificAccountUTypeEnum fromValue(String text) {
      for (SpecificAccountUTypeEnum b : SpecificAccountUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "The type of structure to present account specific fields.")
 /**
   * The type of structure to present account specific fields.  
  **/
  private SpecificAccountUTypeEnum specificAccountUType = null;
  
  @Schema(description = "")
  private TermDepositAccount termDeposit = null;
  
  @Schema(description = "")
  private CreditCardAccount creditCard = null;
  
  @Schema(description = "")
  private LoanAccount loan = null;
  
  @Schema(description = "")
  private List<AccountFeatures> features = null;
  
  @Schema(description = "")
  private List<AccountFees> fees = null;
  
  @Schema(description = "")
  private List<AccountDepositRates> depositRates = null;
  
  @Schema(description = "")
  private List<AccountLendingRates> lendingRates = null;
  
  @Schema(description = "")
  private PhysicalAddress address = null;
 /**
   * The unmasked BSB for the account.  Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces
   * @return bsb
  **/
  @JsonProperty("bsb")
  public String getBsb() {
    return bsb;
  }

  public void setBsb(String bsb) {
    this.bsb = bsb;
  }

  public AccountDetail bsb(String bsb) {
    this.bsb = bsb;
    return this;
  }

 /**
   * The unmasked account number for the account.  Should not be supplied if the account number is a PAN requiring PCI compliance. Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces
   * @return accountNumber
  **/
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public AccountDetail accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

 /**
   * Optional field to indicate if this account is part of a bundle that is providing additional benefit for to the customer
   * @return bundleName
  **/
  @JsonProperty("bundleName")
  public String getBundleName() {
    return bundleName;
  }

  public void setBundleName(String bundleName) {
    this.bundleName = bundleName;
  }

  public AccountDetail bundleName(String bundleName) {
    this.bundleName = bundleName;
    return this;
  }

 /**
   * The type of structure to present account specific fields.
   * @return specificAccountUType
  **/
  @JsonProperty("specificAccountUType")
  public String getSpecificAccountUType() {
    if (specificAccountUType == null) {
      return null;
    }
    return specificAccountUType.getValue();
  }

  public void setSpecificAccountUType(SpecificAccountUTypeEnum specificAccountUType) {
    this.specificAccountUType = specificAccountUType;
  }

  public AccountDetail specificAccountUType(SpecificAccountUTypeEnum specificAccountUType) {
    this.specificAccountUType = specificAccountUType;
    return this;
  }

 /**
   * Get termDeposit
   * @return termDeposit
  **/
  @JsonProperty("termDeposit")
  public TermDepositAccount getTermDeposit() {
    return termDeposit;
  }

  public void setTermDeposit(TermDepositAccount termDeposit) {
    this.termDeposit = termDeposit;
  }

  public AccountDetail termDeposit(TermDepositAccount termDeposit) {
    this.termDeposit = termDeposit;
    return this;
  }

 /**
   * Get creditCard
   * @return creditCard
  **/
  @JsonProperty("creditCard")
  public CreditCardAccount getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(CreditCardAccount creditCard) {
    this.creditCard = creditCard;
  }

  public AccountDetail creditCard(CreditCardAccount creditCard) {
    this.creditCard = creditCard;
    return this;
  }

 /**
   * Get loan
   * @return loan
  **/
  @JsonProperty("loan")
  public LoanAccount getLoan() {
    return loan;
  }

  public void setLoan(LoanAccount loan) {
    this.loan = loan;
  }

  public AccountDetail loan(LoanAccount loan) {
    this.loan = loan;
    return this;
  }

 /**
   * Get features
   * @return features
  **/
  @JsonProperty("features")
  public List<AccountFeatures> getFeatures() {
    return features;
  }

  public void setFeatures(List<AccountFeatures> features) {
    this.features = features;
  }

  public AccountDetail features(List<AccountFeatures> features) {
    this.features = features;
    return this;
  }

  public AccountDetail addFeaturesItem(AccountFeatures featuresItem) {
    this.features.add(featuresItem);
    return this;
  }

 /**
   * Get fees
   * @return fees
  **/
  @JsonProperty("fees")
  public List<AccountFees> getFees() {
    return fees;
  }

  public void setFees(List<AccountFees> fees) {
    this.fees = fees;
  }

  public AccountDetail fees(List<AccountFees> fees) {
    this.fees = fees;
    return this;
  }

  public AccountDetail addFeesItem(AccountFees feesItem) {
    this.fees.add(feesItem);
    return this;
  }

 /**
   * Get depositRates
   * @return depositRates
  **/
  @JsonProperty("depositRates")
  public List<AccountDepositRates> getDepositRates() {
    return depositRates;
  }

  public void setDepositRates(List<AccountDepositRates> depositRates) {
    this.depositRates = depositRates;
  }

  public AccountDetail depositRates(List<AccountDepositRates> depositRates) {
    this.depositRates = depositRates;
    return this;
  }

  public AccountDetail addDepositRatesItem(AccountDepositRates depositRatesItem) {
    this.depositRates.add(depositRatesItem);
    return this;
  }

 /**
   * Get lendingRates
   * @return lendingRates
  **/
  @JsonProperty("lendingRates")
  public List<AccountLendingRates> getLendingRates() {
    return lendingRates;
  }

  public void setLendingRates(List<AccountLendingRates> lendingRates) {
    this.lendingRates = lendingRates;
  }

  public AccountDetail lendingRates(List<AccountLendingRates> lendingRates) {
    this.lendingRates = lendingRates;
    return this;
  }

  public AccountDetail addLendingRatesItem(AccountLendingRates lendingRatesItem) {
    this.lendingRates.add(lendingRatesItem);
    return this;
  }

 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public PhysicalAddress getAddress() {
    return address;
  }

  public void setAddress(PhysicalAddress address) {
    this.address = address;
  }

  public AccountDetail address(PhysicalAddress address) {
    this.address = address;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
