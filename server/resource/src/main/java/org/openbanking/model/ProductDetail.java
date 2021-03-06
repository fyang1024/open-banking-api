package org.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class ProductDetail   {
  @JsonProperty("productId")
  private String productId;

  @JsonProperty("effectiveFrom")
  private String effectiveFrom;

  @JsonProperty("effectiveTo")
  private String effectiveTo;

  @JsonProperty("lastUpdated")
  private String lastUpdated;

  @JsonProperty("productCategory")
  private EnumProductCategory productCategory;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("brand")
  private String brand;

  @JsonProperty("brandName")
  private String brandName;

  @JsonProperty("applicationUri")
  private String applicationUri;

  @JsonProperty("isTailored")
  private Boolean isTailored;

  @JsonProperty("additionalInformation")
  private ProductAdditionalInformation additionalInformation = null;

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

  public ProductDetail productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.
   * @return productId
  */
  @ApiModelProperty(required = true, value = "A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.")
  @NotNull


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public ProductDetail effectiveFrom(String effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
    return this;
  }

  /**
   * The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate
   * @return effectiveFrom
  */
  @ApiModelProperty(value = "The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate")


  public String getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(String effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }

  public ProductDetail effectiveTo(String effectiveTo) {
    this.effectiveTo = effectiveTo;
    return this;
  }

  /**
   * The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products
   * @return effectiveTo
  */
  @ApiModelProperty(value = "The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products")


  public String getEffectiveTo() {
    return effectiveTo;
  }

  public void setEffectiveTo(String effectiveTo) {
    this.effectiveTo = effectiveTo;
  }

  public ProductDetail lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)
   * @return lastUpdated
  */
  @ApiModelProperty(required = true, value = "The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)")
  @NotNull


  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public ProductDetail productCategory(EnumProductCategory productCategory) {
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

  public ProductDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name of the product
   * @return name
  */
  @ApiModelProperty(required = true, value = "The display name of the product")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductDetail description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the product
   * @return description
  */
  @ApiModelProperty(required = true, value = "A description of the product")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductDetail brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required
   * @return brand
  */
  @ApiModelProperty(required = true, value = "A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required")
  @NotNull


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public ProductDetail brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  /**
   * An optional display name of the brand
   * @return brandName
  */
  @ApiModelProperty(value = "An optional display name of the brand")


  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public ProductDetail applicationUri(String applicationUri) {
    this.applicationUri = applicationUri;
    return this;
  }

  /**
   * A link to the an application web page where this product can be applied for.
   * @return applicationUri
  */
  @ApiModelProperty(value = "A link to the an application web page where this product can be applied for.")


  public String getApplicationUri() {
    return applicationUri;
  }

  public void setApplicationUri(String applicationUri) {
    this.applicationUri = applicationUri;
  }

  public ProductDetail isTailored(Boolean isTailored) {
    this.isTailored = isTailored;
    return this;
  }

  /**
   * Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable
   * @return isTailored
  */
  @ApiModelProperty(required = true, value = "Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable")
  @NotNull


  public Boolean getIsTailored() {
    return isTailored;
  }

  public void setIsTailored(Boolean isTailored) {
    this.isTailored = isTailored;
  }

  public ProductDetail additionalInformation(ProductAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  /**
   * Get additionalInformation
   * @return additionalInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductAdditionalInformation getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(ProductAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public ProductDetail bundles(List<ProductBundles> bundles) {
    this.bundles = bundles;
    return this;
  }

  public ProductDetail addBundlesItem(ProductBundles bundlesItem) {
    if (this.bundles == null) {
      this.bundles = new ArrayList<>();
    }
    this.bundles.add(bundlesItem);
    return this;
  }

  /**
   * Get bundles
   * @return bundles
  */
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
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

  /**
   * Get constraints
   * @return constraints
  */
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
      this.eligibility = new ArrayList<>();
    }
    this.eligibility.add(eligibilityItem);
    return this;
  }

  /**
   * Get eligibility
   * @return eligibility
  */
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
    return Objects.equals(this.productId, productDetail.productId) &&
        Objects.equals(this.effectiveFrom, productDetail.effectiveFrom) &&
        Objects.equals(this.effectiveTo, productDetail.effectiveTo) &&
        Objects.equals(this.lastUpdated, productDetail.lastUpdated) &&
        Objects.equals(this.productCategory, productDetail.productCategory) &&
        Objects.equals(this.name, productDetail.name) &&
        Objects.equals(this.description, productDetail.description) &&
        Objects.equals(this.brand, productDetail.brand) &&
        Objects.equals(this.brandName, productDetail.brandName) &&
        Objects.equals(this.applicationUri, productDetail.applicationUri) &&
        Objects.equals(this.isTailored, productDetail.isTailored) &&
        Objects.equals(this.additionalInformation, productDetail.additionalInformation) &&
        Objects.equals(this.bundles, productDetail.bundles) &&
        Objects.equals(this.features, productDetail.features) &&
        Objects.equals(this.constraints, productDetail.constraints) &&
        Objects.equals(this.eligibility, productDetail.eligibility) &&
        Objects.equals(this.fees, productDetail.fees) &&
        Objects.equals(this.depositRates, productDetail.depositRates) &&
        Objects.equals(this.lendingRates, productDetail.lendingRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, effectiveFrom, effectiveTo, lastUpdated, productCategory, name, description, brand, brandName, applicationUri, isTailored, additionalInformation, bundles, features, constraints, eligibility, fees, depositRates, lendingRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetail {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
    sb.append("    effectiveTo: ").append(toIndentedString(effectiveTo)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    applicationUri: ").append(toIndentedString(applicationUri)).append("\n");
    sb.append("    isTailored: ").append(toIndentedString(isTailored)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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

