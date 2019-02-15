package org.openbank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductBundles
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class ProductBundles   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("additionalInfoUri")
  private String additionalInfoUri;

  @JsonProperty("productIds")
  @Valid
  private List<String> productIds = new ArrayList<>();

  public ProductBundles name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the bundle
   * @return name
  */
  @ApiModelProperty(required = true, value = "Name of the bundle")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductBundles description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the bundle
   * @return description
  */
  @ApiModelProperty(required = true, value = "Description of the bundle")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductBundles additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

  /**
   * Link to a web page with more information on the bundle criteria and benefits
   * @return additionalInfoUri
  */
  @ApiModelProperty(value = "Link to a web page with more information on the bundle criteria and benefits")


  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  public ProductBundles productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }

  public ProductBundles addProductIdsItem(String productIdsItem) {
    this.productIds.add(productIdsItem);
    return this;
  }

  /**
   * Array of product IDs for products included in the bundle
   * @return productIds
  */
  @ApiModelProperty(required = true, value = "Array of product IDs for products included in the bundle")
  @NotNull


  public List<String> getProductIds() {
    return productIds;
  }

  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductBundles productBundles = (ProductBundles) o;
    return Objects.equals(this.name, productBundles.name) &&
        Objects.equals(this.description, productBundles.description) &&
        Objects.equals(this.additionalInfoUri, productBundles.additionalInfoUri) &&
        Objects.equals(this.productIds, productBundles.productIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, additionalInfoUri, productIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductBundles {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    additionalInfoUri: ").append(toIndentedString(additionalInfoUri)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
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

