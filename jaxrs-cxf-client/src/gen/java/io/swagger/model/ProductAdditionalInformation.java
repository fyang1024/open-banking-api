package io.swagger.model;


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

public class ProductAdditionalInformation  {
  
  @Schema(description = "General overview of the product")
 /**
   * General overview of the product  
  **/
  private String overviewUri = null;
  
  @Schema(description = "Terms and conditions for the product")
 /**
   * Terms and conditions for the product  
  **/
  private String termsUri = null;
  
  @Schema(description = "Eligibility rules and criteria for the product")
 /**
   * Eligibility rules and criteria for the product  
  **/
  private String eligibilityUri = null;
  
  @Schema(description = "Description of fees, pricing, discounts, exemptions and bonuses for the product")
 /**
   * Description of fees, pricing, discounts, exemptions and bonuses for the product  
  **/
  private String feesAndPricingUri = null;
  
  @Schema(description = "Description of a bundle that this product can be part of")
 /**
   * Description of a bundle that this product can be part of  
  **/
  private String bundleUri = null;
 /**
   * General overview of the product
   * @return overviewUri
  **/
  @JsonProperty("overviewUri")
  public String getOverviewUri() {
    return overviewUri;
  }

  public void setOverviewUri(String overviewUri) {
    this.overviewUri = overviewUri;
  }

  public ProductAdditionalInformation overviewUri(String overviewUri) {
    this.overviewUri = overviewUri;
    return this;
  }

 /**
   * Terms and conditions for the product
   * @return termsUri
  **/
  @JsonProperty("termsUri")
  public String getTermsUri() {
    return termsUri;
  }

  public void setTermsUri(String termsUri) {
    this.termsUri = termsUri;
  }

  public ProductAdditionalInformation termsUri(String termsUri) {
    this.termsUri = termsUri;
    return this;
  }

 /**
   * Eligibility rules and criteria for the product
   * @return eligibilityUri
  **/
  @JsonProperty("eligibilityUri")
  public String getEligibilityUri() {
    return eligibilityUri;
  }

  public void setEligibilityUri(String eligibilityUri) {
    this.eligibilityUri = eligibilityUri;
  }

  public ProductAdditionalInformation eligibilityUri(String eligibilityUri) {
    this.eligibilityUri = eligibilityUri;
    return this;
  }

 /**
   * Description of fees, pricing, discounts, exemptions and bonuses for the product
   * @return feesAndPricingUri
  **/
  @JsonProperty("feesAndPricingUri")
  public String getFeesAndPricingUri() {
    return feesAndPricingUri;
  }

  public void setFeesAndPricingUri(String feesAndPricingUri) {
    this.feesAndPricingUri = feesAndPricingUri;
  }

  public ProductAdditionalInformation feesAndPricingUri(String feesAndPricingUri) {
    this.feesAndPricingUri = feesAndPricingUri;
    return this;
  }

 /**
   * Description of a bundle that this product can be part of
   * @return bundleUri
  **/
  @JsonProperty("bundleUri")
  public String getBundleUri() {
    return bundleUri;
  }

  public void setBundleUri(String bundleUri) {
    this.bundleUri = bundleUri;
  }

  public ProductAdditionalInformation bundleUri(String bundleUri) {
    this.bundleUri = bundleUri;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAdditionalInformation {\n");
    
    sb.append("    overviewUri: ").append(toIndentedString(overviewUri)).append("\n");
    sb.append("    termsUri: ").append(toIndentedString(termsUri)).append("\n");
    sb.append("    eligibilityUri: ").append(toIndentedString(eligibilityUri)).append("\n");
    sb.append("    feesAndPricingUri: ").append(toIndentedString(feesAndPricingUri)).append("\n");
    sb.append("    bundleUri: ").append(toIndentedString(bundleUri)).append("\n");
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
