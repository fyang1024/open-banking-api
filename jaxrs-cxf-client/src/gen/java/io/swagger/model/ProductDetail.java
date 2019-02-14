package io.swagger.model;

import io.swagger.model.EnumProductCategory;
import io.swagger.model.Product;
import io.swagger.model.ProductAdditionalInformation;
import io.swagger.model.ProductBundles;
import io.swagger.model.ProductConstraints;
import io.swagger.model.ProductDepositRates;
import io.swagger.model.ProductEligibility;
import io.swagger.model.ProductFeatures;
import io.swagger.model.ProductFees;
import io.swagger.model.ProductLendingRates;
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

public class ProductDetail extends Product {
  
  @Schema(description = "")
  private List<ProductBundles> bundles = null;
  
  @Schema(description = "")
  private List<ProductFeatures> features = null;
  
  @Schema(description = "")
  private List<ProductConstraints> constraints = null;
  
  @Schema(description = "")
  private List<ProductEligibility> eligibility = null;
  
  @Schema(description = "")
  private List<ProductFees> fees = null;
  
  @Schema(description = "")
  private List<ProductDepositRates> depositRates = null;
  
  @Schema(description = "")
  private List<ProductLendingRates> lendingRates = null;
 /**
   * Get bundles
   * @return bundles
  **/
  @JsonProperty("bundles")
  public List<ProductBundles> getBundles() {
    return bundles;
  }

  public void setBundles(List<ProductBundles> bundles) {
    this.bundles = bundles;
  }

  public ProductDetail bundles(List<ProductBundles> bundles) {
    this.bundles = bundles;
    return this;
  }

  public ProductDetail addBundlesItem(ProductBundles bundlesItem) {
    this.bundles.add(bundlesItem);
    return this;
  }

 /**
   * Get features
   * @return features
  **/
  @JsonProperty("features")
  public List<ProductFeatures> getFeatures() {
    return features;
  }

  public void setFeatures(List<ProductFeatures> features) {
    this.features = features;
  }

  public ProductDetail features(List<ProductFeatures> features) {
    this.features = features;
    return this;
  }

  public ProductDetail addFeaturesItem(ProductFeatures featuresItem) {
    this.features.add(featuresItem);
    return this;
  }

 /**
   * Get constraints
   * @return constraints
  **/
  @JsonProperty("constraints")
  public List<ProductConstraints> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<ProductConstraints> constraints) {
    this.constraints = constraints;
  }

  public ProductDetail constraints(List<ProductConstraints> constraints) {
    this.constraints = constraints;
    return this;
  }

  public ProductDetail addConstraintsItem(ProductConstraints constraintsItem) {
    this.constraints.add(constraintsItem);
    return this;
  }

 /**
   * Get eligibility
   * @return eligibility
  **/
  @JsonProperty("eligibility")
  public List<ProductEligibility> getEligibility() {
    return eligibility;
  }

  public void setEligibility(List<ProductEligibility> eligibility) {
    this.eligibility = eligibility;
  }

  public ProductDetail eligibility(List<ProductEligibility> eligibility) {
    this.eligibility = eligibility;
    return this;
  }

  public ProductDetail addEligibilityItem(ProductEligibility eligibilityItem) {
    this.eligibility.add(eligibilityItem);
    return this;
  }

 /**
   * Get fees
   * @return fees
  **/
  @JsonProperty("fees")
  public List<ProductFees> getFees() {
    return fees;
  }

  public void setFees(List<ProductFees> fees) {
    this.fees = fees;
  }

  public ProductDetail fees(List<ProductFees> fees) {
    this.fees = fees;
    return this;
  }

  public ProductDetail addFeesItem(ProductFees feesItem) {
    this.fees.add(feesItem);
    return this;
  }

 /**
   * Get depositRates
   * @return depositRates
  **/
  @JsonProperty("depositRates")
  public List<ProductDepositRates> getDepositRates() {
    return depositRates;
  }

  public void setDepositRates(List<ProductDepositRates> depositRates) {
    this.depositRates = depositRates;
  }

  public ProductDetail depositRates(List<ProductDepositRates> depositRates) {
    this.depositRates = depositRates;
    return this;
  }

  public ProductDetail addDepositRatesItem(ProductDepositRates depositRatesItem) {
    this.depositRates.add(depositRatesItem);
    return this;
  }

 /**
   * Get lendingRates
   * @return lendingRates
  **/
  @JsonProperty("lendingRates")
  public List<ProductLendingRates> getLendingRates() {
    return lendingRates;
  }

  public void setLendingRates(List<ProductLendingRates> lendingRates) {
    this.lendingRates = lendingRates;
  }

  public ProductDetail lendingRates(List<ProductLendingRates> lendingRates) {
    this.lendingRates = lendingRates;
    return this;
  }

  public ProductDetail addLendingRatesItem(ProductLendingRates lendingRatesItem) {
    this.lendingRates.add(lendingRatesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bundles: ").append(toIndentedString(bundles)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    eligibility: ").append(toIndentedString(eligibility)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    depositRates: ").append(toIndentedString(depositRates)).append("\n");
    sb.append("    lendingRates: ").append(toIndentedString(lendingRates)).append("\n");
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
