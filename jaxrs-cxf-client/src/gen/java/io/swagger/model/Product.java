package io.swagger.model;

import io.swagger.model.EnumProductCategory;
import io.swagger.model.ProductAdditionalInformation;

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

public class Product  {
  
  @Schema(required = true, description = "A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.")
 /**
   * A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.  
  **/
  private String productId = null;
  
  @Schema(description = "The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate")
 /**
   * The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate  
  **/
  private String effectiveFrom = null;
  
  @Schema(description = "The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products")
 /**
   * The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products  
  **/
  private String effectiveTo = null;
  
  @Schema(required = true, description = "The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)")
 /**
   * The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)  
  **/
  private String lastUpdated = null;
  
  @Schema(required = true, description = "")
  private EnumProductCategory productCategory = null;
  
  @Schema(required = true, description = "The display name of the product")
 /**
   * The display name of the product  
  **/
  private String name = null;
  
  @Schema(required = true, description = "A description of the product")
 /**
   * A description of the product  
  **/
  private String description = null;
  
  @Schema(required = true, description = "A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required")
 /**
   * A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required  
  **/
  private String brand = null;
  
  @Schema(description = "An optional display name of the brand")
 /**
   * An optional display name of the brand  
  **/
  private String brandName = null;
  
  @Schema(description = "A link to the an application web page where this product can be applied for.")
 /**
   * A link to the an application web page where this product can be applied for.  
  **/
  private String applicationUri = null;
  
  @Schema(required = true, description = "Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable")
 /**
   * Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable  
  **/
  private Boolean isTailored = null;
  
  @Schema(description = "")
  private ProductAdditionalInformation additionalInformation = null;
 /**
   * A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.
   * @return productId
  **/
  @JsonProperty("productId")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public Product productId(String productId) {
    this.productId = productId;
    return this;
  }

 /**
   * The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate
   * @return effectiveFrom
  **/
  @JsonProperty("effectiveFrom")
  public String getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(String effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }

  public Product effectiveFrom(String effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
    return this;
  }

 /**
   * The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products
   * @return effectiveTo
  **/
  @JsonProperty("effectiveTo")
  public String getEffectiveTo() {
    return effectiveTo;
  }

  public void setEffectiveTo(String effectiveTo) {
    this.effectiveTo = effectiveTo;
  }

  public Product effectiveTo(String effectiveTo) {
    this.effectiveTo = effectiveTo;
    return this;
  }

 /**
   * The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)
   * @return lastUpdated
  **/
  @JsonProperty("lastUpdated")
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Product lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

 /**
   * Get productCategory
   * @return productCategory
  **/
  @JsonProperty("productCategory")
  public EnumProductCategory getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(EnumProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  public Product productCategory(EnumProductCategory productCategory) {
    this.productCategory = productCategory;
    return this;
  }

 /**
   * The display name of the product
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

 /**
   * A description of the product
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Product description(String description) {
    this.description = description;
    return this;
  }

 /**
   * A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required
   * @return brand
  **/
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Product brand(String brand) {
    this.brand = brand;
    return this;
  }

 /**
   * An optional display name of the brand
   * @return brandName
  **/
  @JsonProperty("brandName")
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public Product brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

 /**
   * A link to the an application web page where this product can be applied for.
   * @return applicationUri
  **/
  @JsonProperty("applicationUri")
  public String getApplicationUri() {
    return applicationUri;
  }

  public void setApplicationUri(String applicationUri) {
    this.applicationUri = applicationUri;
  }

  public Product applicationUri(String applicationUri) {
    this.applicationUri = applicationUri;
    return this;
  }

 /**
   * Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable
   * @return isTailored
  **/
  @JsonProperty("isTailored")
  public Boolean isisIsTailored() {
    return isTailored;
  }

  public void setIsTailored(Boolean isTailored) {
    this.isTailored = isTailored;
  }

  public Product isTailored(Boolean isTailored) {
    this.isTailored = isTailored;
    return this;
  }

 /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @JsonProperty("additionalInformation")
  public ProductAdditionalInformation getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(ProductAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public Product additionalInformation(ProductAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
