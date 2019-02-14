package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class ProductDetail extends Product  {
  @JsonProperty("bundles")
  private List<ProductBundles> bundles = null;
  @JsonProperty("features")
  private List<ProductFeatures> features = null;
  @JsonProperty("constraints")
  private List<ProductConstraints> constraints = null;
  @JsonProperty("eligibility")
  private List<ProductEligibility> eligibility = null;
  @JsonProperty("fees")
  private List<ProductFees> fees = null;
  @JsonProperty("depositRates")
  private List<ProductDepositRates> depositRates = null;
  @JsonProperty("lendingRates")
  private List<ProductLendingRates> lendingRates = null;
  /**
   **/
  public ProductDetail bundles(List<ProductBundles> bundles) {
    this.bundles = bundles;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("bundles")
  public List<ProductBundles> getBundles() {
    return bundles;
  }
  public void setBundles(List<ProductBundles> bundles) {
    this.bundles = bundles;
  }

  /**
   **/
  public ProductDetail features(List<ProductFeatures> features) {
    this.features = features;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("features")
  public List<ProductFeatures> getFeatures() {
    return features;
  }
  public void setFeatures(List<ProductFeatures> features) {
    this.features = features;
  }

  /**
   **/
  public ProductDetail constraints(List<ProductConstraints> constraints) {
    this.constraints = constraints;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("constraints")
  public List<ProductConstraints> getConstraints() {
    return constraints;
  }
  public void setConstraints(List<ProductConstraints> constraints) {
    this.constraints = constraints;
  }

  /**
   **/
  public ProductDetail eligibility(List<ProductEligibility> eligibility) {
    this.eligibility = eligibility;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("eligibility")
  public List<ProductEligibility> getEligibility() {
    return eligibility;
  }
  public void setEligibility(List<ProductEligibility> eligibility) {
    this.eligibility = eligibility;
  }

  /**
   **/
  public ProductDetail fees(List<ProductFees> fees) {
    this.fees = fees;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("fees")
  public List<ProductFees> getFees() {
    return fees;
  }
  public void setFees(List<ProductFees> fees) {
    this.fees = fees;
  }

  /**
   **/
  public ProductDetail depositRates(List<ProductDepositRates> depositRates) {
    this.depositRates = depositRates;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("depositRates")
  public List<ProductDepositRates> getDepositRates() {
    return depositRates;
  }
  public void setDepositRates(List<ProductDepositRates> depositRates) {
    this.depositRates = depositRates;
  }

  /**
   **/
  public ProductDetail lendingRates(List<ProductLendingRates> lendingRates) {
    this.lendingRates = lendingRates;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("lendingRates")
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
    return Objects.equals(bundles, productDetail.bundles) &&
        Objects.equals(features, productDetail.features) &&
        Objects.equals(constraints, productDetail.constraints) &&
        Objects.equals(eligibility, productDetail.eligibility) &&
        Objects.equals(fees, productDetail.fees) &&
        Objects.equals(depositRates, productDetail.depositRates) &&
        Objects.equals(lendingRates, productDetail.lendingRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundles, features, constraints, eligibility, fees, depositRates, lendingRates);
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
