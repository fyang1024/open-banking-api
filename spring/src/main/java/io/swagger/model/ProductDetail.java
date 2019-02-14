package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductDetail
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-14T03:26:14.367Z[GMT]")
public class ProductDetail extends Product  {
  @JsonProperty("bundles")
  @Valid
  private List<ProductBundles> bundles = null;

  @JsonProperty("features")
  @Valid
  private List<ProductFeatures> features = null;

  @JsonProperty("constraints")
  @Valid
  private List<ProductConstraints> constraints = null;

  @JsonProperty("eligibility")
  @Valid
  private List<ProductEligibility> eligibility = null;

  @JsonProperty("fees")
  @Valid
  private List<ProductFees> fees = null;

  @JsonProperty("depositRates")
  @Valid
  private List<ProductDepositRates> depositRates = null;

  @JsonProperty("lendingRates")
  @Valid
  private List<ProductLendingRates> lendingRates = null;

  public ProductDetail bundles(List<ProductBundles> bundles) {
    this.bundles = bundles;
    return this;
  }

  public ProductDetail addBundlesItem(ProductBundles bundlesItem) {
    if (this.bundles == null) {
      this.bundles = new ArrayList<ProductBundles>();
    }
    this.bundles.add(bundlesItem);
    return this;
  }

  /**
   * Get bundles
   * @return bundles
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ProductBundles> getBundles() {
    return bundles;
  }

  public void setBundles(List<ProductBundles> bundles) {
    this.bundles = bundles;
  }

  public ProductDetail features(List<ProductFeatures> features) {
    this.features = features;
    return this;
  }

  public ProductDetail addFeaturesItem(ProductFeatures featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<ProductFeatures>();
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
  public List<ProductFeatures> getFeatures() {
    return features;
  }

  public void setFeatures(List<ProductFeatures> features) {
    this.features = features;
  }

  public ProductDetail constraints(List<ProductConstraints> constraints) {
    this.constraints = constraints;
    return this;
  }

  public ProductDetail addConstraintsItem(ProductConstraints constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<ProductConstraints>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

  /**
   * Get constraints
   * @return constraints
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ProductConstraints> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<ProductConstraints> constraints) {
    this.constraints = constraints;
  }

  public ProductDetail eligibility(List<ProductEligibility> eligibility) {
    this.eligibility = eligibility;
    return this;
  }

  public ProductDetail addEligibilityItem(ProductEligibility eligibilityItem) {
    if (this.eligibility == null) {
      this.eligibility = new ArrayList<ProductEligibility>();
    }
    this.eligibility.add(eligibilityItem);
    return this;
  }

  /**
   * Get eligibility
   * @return eligibility
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ProductEligibility> getEligibility() {
    return eligibility;
  }

  public void setEligibility(List<ProductEligibility> eligibility) {
    this.eligibility = eligibility;
  }

  public ProductDetail fees(List<ProductFees> fees) {
    this.fees = fees;
    return this;
  }

  public ProductDetail addFeesItem(ProductFees feesItem) {
    if (this.fees == null) {
      this.fees = new ArrayList<ProductFees>();
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
  public List<ProductFees> getFees() {
    return fees;
  }

  public void setFees(List<ProductFees> fees) {
    this.fees = fees;
  }

  public ProductDetail depositRates(List<ProductDepositRates> depositRates) {
    this.depositRates = depositRates;
    return this;
  }

  public ProductDetail addDepositRatesItem(ProductDepositRates depositRatesItem) {
    if (this.depositRates == null) {
      this.depositRates = new ArrayList<ProductDepositRates>();
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
  public List<ProductDepositRates> getDepositRates() {
    return depositRates;
  }

  public void setDepositRates(List<ProductDepositRates> depositRates) {
    this.depositRates = depositRates;
  }

  public ProductDetail lendingRates(List<ProductLendingRates> lendingRates) {
    this.lendingRates = lendingRates;
    return this;
  }

  public ProductDetail addLendingRatesItem(ProductLendingRates lendingRatesItem) {
    if (this.lendingRates == null) {
      this.lendingRates = new ArrayList<ProductLendingRates>();
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
  public List<ProductLendingRates> getLendingRates() {
    return lendingRates;
  }

  public void setLendingRates(List<ProductLendingRates> lendingRates) {
    this.lendingRates = lendingRates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetail productDetail = (ProductDetail) o;
    return Objects.equals(this.bundles, productDetail.bundles) &&
        Objects.equals(this.features, productDetail.features) &&
        Objects.equals(this.constraints, productDetail.constraints) &&
        Objects.equals(this.eligibility, productDetail.eligibility) &&
        Objects.equals(this.fees, productDetail.fees) &&
        Objects.equals(this.depositRates, productDetail.depositRates) &&
        Objects.equals(this.lendingRates, productDetail.lendingRates) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundles, features, constraints, eligibility, fees, depositRates, lendingRates, super.hashCode());
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
