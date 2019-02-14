package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.EnumProductCategory;
import io.swagger.model.ProductAdditionalInformation;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class Product   {
  private String productId = null;  private String effectiveFrom = null;  private String effectiveTo = null;  private String lastUpdated = null;  private EnumProductCategory productCategory = null;  private String name = null;  private String description = null;  private String brand = null;  private String brandName = null;  private String applicationUri = null;  private Boolean isTailored = null;  private ProductAdditionalInformation additionalInformation = null;

  /**
   * A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.
   **/
  
  @Schema(required = true, description = "A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.")
  @JsonProperty("productId")
  @NotNull
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate
   **/
  
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
  
  @Schema(required = true, description = "The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)")
  @JsonProperty("lastUpdated")
  @NotNull
  public String getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("productCategory")
  @NotNull
  public EnumProductCategory getProductCategory() {
    return productCategory;
  }
  public void setProductCategory(EnumProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * The display name of the product
   **/
  
  @Schema(required = true, description = "The display name of the product")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A description of the product
   **/
  
  @Schema(required = true, description = "A description of the product")
  @JsonProperty("description")
  @NotNull
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required
   **/
  
  @Schema(required = true, description = "A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required")
  @JsonProperty("brand")
  @NotNull
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * An optional display name of the brand
   **/
  
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
  
  @Schema(required = true, description = "Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable")
  @JsonProperty("isTailored")
  @NotNull
  public Boolean isisIsTailored() {
    return isTailored;
  }
  public void setIsTailored(Boolean isTailored) {
    this.isTailored = isTailored;
  }

  /**
   **/
  
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
