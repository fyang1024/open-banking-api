package io.swagger.model;

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

public class ProductBundles  {
  
  @Schema(required = true, description = "Name of the bundle")
 /**
   * Name of the bundle  
  **/
  private String name = null;
  
  @Schema(required = true, description = "Description of the bundle")
 /**
   * Description of the bundle  
  **/
  private String description = null;
  
  @Schema(description = "Link to a web page with more information on the bundle criteria and benefits")
 /**
   * Link to a web page with more information on the bundle criteria and benefits  
  **/
  private String additionalInfoUri = null;
  
  @Schema(required = true, description = "Array of product IDs for products included in the bundle")
 /**
   * Array of product IDs for products included in the bundle  
  **/
  private List<String> productIds = new ArrayList<String>();
 /**
   * Name of the bundle
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductBundles name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Description of the bundle
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductBundles description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Link to a web page with more information on the bundle criteria and benefits
   * @return additionalInfoUri
  **/
  @JsonProperty("additionalInfoUri")
  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  public ProductBundles additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

 /**
   * Array of product IDs for products included in the bundle
   * @return productIds
  **/
  @JsonProperty("productIds")
  public List<String> getProductIds() {
    return productIds;
  }

  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }

  public ProductBundles productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }

  public ProductBundles addProductIdsItem(String productIdsItem) {
    this.productIds.add(productIdsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
