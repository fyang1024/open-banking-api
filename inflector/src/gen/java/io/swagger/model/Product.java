package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.EnumProductCategory;
import io.swagger.model.ProductAdditionalInformation;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class Product   {
  @JsonProperty("productId")
  private String productId = null;
  @JsonProperty("effectiveFrom")
  private String effectiveFrom = null;
  @JsonProperty("effectiveTo")
  private String effectiveTo = null;
  @JsonProperty("lastUpdated")
  private String lastUpdated = null;
  @JsonProperty("productCategory")
  private EnumProductCategory productCategory = null;
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("description")
  private String description = null;
  @JsonProperty("brand")
  private String brand = null;
  @JsonProperty("brandName")
  private String brandName = null;
  @JsonProperty("applicationUri")
  private String applicationUri = null;
  @JsonProperty("isTailored")
  private Boolean isTailored = null;
  @JsonProperty("additionalInformation")
  private ProductAdditionalInformation additionalInformation = null;
  /**
   * A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.
   **/
  public Product productId(String productId) {
    this.productId = productId;
    return this;
  }

  
  @Schema(required = true, description = "A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.")
  @JsonProperty("productId")
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate
   **/
  public Product effectiveFrom(String effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
    return this;
  }

  
  @Schema(description = "The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate")
  @JsonProperty("effectiveFrom")
  public String getEffectiveFrom() {
    return effectiveFrom;
  }
  public void setEffectiveFrom(String effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }

  /**
   * The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products
   **/
  public Product effectiveTo(String effectiveTo) {
    this.effectiveTo = effectiveTo;
    return this;
  }

  
  @Schema(description = "The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products")
  @JsonProperty("effectiveTo")
  public String getEffectiveTo() {
    return effectiveTo;
  }
  public void setEffectiveTo(String effectiveTo) {
    this.effectiveTo = effectiveTo;
  }

  /**
   * The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)
   **/
  public Product lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  
  @Schema(required = true, description = "The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)")
  @JsonProperty("lastUpdated")
  public String getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  /**
   **/
  public Product productCategory(EnumProductCategory productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  
  @Schema(required = true, description = "")
  @JsonProperty("productCategory")
  public EnumProductCategory getProductCategory() {
    return productCategory;
  }
  public void setProductCategory(EnumProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * The display name of the product
   **/
  public Product name(String name) {
    this.name = name;
    return this;
  }

  
  @Schema(required = true, description = "The display name of the product")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A description of the product
   **/
  public Product description(String description) {
    this.description = description;
    return this;
  }

  
  @Schema(required = true, description = "A description of the product")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required
   **/
  public Product brand(String brand) {
    this.brand = brand;
    return this;
  }

  
  @Schema(required = true, description = "A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required")
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * An optional display name of the brand
   **/
  public Product brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  
  @Schema(description = "An optional display name of the brand")
  @JsonProperty("brandName")
  public String getBrandName() {
    return brandName;
  }
  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  /**
   * A link to the an application web page where this product can be applied for.
   **/
  public Product applicationUri(String applicationUri) {
    this.applicationUri = applicationUri;
    return this;
  }

  
  @Schema(description = "A link to the an application web page where this product can be applied for.")
  @JsonProperty("applicationUri")
  public String getApplicationUri() {
    return applicationUri;
  }
  public void setApplicationUri(String applicationUri) {
    this.applicationUri = applicationUri;
  }

  /**
   * Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable
   **/
  public Product isTailored(Boolean isTailored) {
    this.isTailored = isTailored;
    return this;
  }

  
  @Schema(required = true, description = "Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable")
  @JsonProperty("isTailored")
  public Boolean isIsTailored() {
    return isTailored;
  }
  public void setIsTailored(Boolean isTailored) {
    this.isTailored = isTailored;
  }

  /**
   **/
  public Product additionalInformation(ProductAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("additionalInformation")
  public ProductAdditionalInformation getAdditionalInformation() {
    return additionalInformation;
  }
  public void setAdditionalInformation(ProductAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(productId, product.productId) &&
        Objects.equals(effectiveFrom, product.effectiveFrom) &&
        Objects.equals(effectiveTo, product.effectiveTo) &&
        Objects.equals(lastUpdated, product.lastUpdated) &&
        Objects.equals(productCategory, product.productCategory) &&
        Objects.equals(name, product.name) &&
        Objects.equals(description, product.description) &&
        Objects.equals(brand, product.brand) &&
        Objects.equals(brandName, product.brandName) &&
        Objects.equals(applicationUri, product.applicationUri) &&
        Objects.equals(isTailored, product.isTailored) &&
        Objects.equals(additionalInformation, product.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, effectiveFrom, effectiveTo, lastUpdated, productCategory, name, description, brand, brandName, applicationUri, isTailored, additionalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
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
