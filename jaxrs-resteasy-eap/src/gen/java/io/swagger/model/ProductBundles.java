package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2019-02-14T03:34:59.075Z[GMT]")public class ProductBundles   {
  private String name = null;
  private String description = null;
  private String additionalInfoUri = null;
  private List<String> productIds = new ArrayList<String>();

  /**
   * Name of the bundle
   **/
  
  @Schema(required = true, description = "Name of the bundle")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Description of the bundle
   **/
  
  @Schema(required = true, description = "Description of the bundle")
  @JsonProperty("description")
  @NotNull
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Link to a web page with more information on the bundle criteria and benefits
   **/
  
  @Schema(description = "Link to a web page with more information on the bundle criteria and benefits")
  @JsonProperty("additionalInfoUri")
  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }
  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  /**
   * Array of product IDs for products included in the bundle
   **/
  
  @Schema(required = true, description = "Array of product IDs for products included in the bundle")
  @JsonProperty("productIds")
  @NotNull
  public List<String> getProductIds() {
    return productIds;
  }
  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductBundles productBundles = (ProductBundles) o;
    return Objects.equals(name, productBundles.name) &&
        Objects.equals(description, productBundles.description) &&
        Objects.equals(additionalInfoUri, productBundles.additionalInfoUri) &&
        Objects.equals(productIds, productBundles.productIds);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
