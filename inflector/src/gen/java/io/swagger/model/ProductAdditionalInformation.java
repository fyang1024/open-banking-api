package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class ProductAdditionalInformation   {
  @JsonProperty("overviewUri")
  private String overviewUri = null;
  @JsonProperty("termsUri")
  private String termsUri = null;
  @JsonProperty("eligibilityUri")
  private String eligibilityUri = null;
  @JsonProperty("feesAndPricingUri")
  private String feesAndPricingUri = null;
  @JsonProperty("bundleUri")
  private String bundleUri = null;
  /**
   * General overview of the product
   **/
  public ProductAdditionalInformation overviewUri(String overviewUri) {
    this.overviewUri = overviewUri;
    return this;
  }

  
  @Schema(description = "General overview of the product")
  @JsonProperty("overviewUri")
  public String getOverviewUri() {
    return overviewUri;
  }
  public void setOverviewUri(String overviewUri) {
    this.overviewUri = overviewUri;
  }

  /**
   * Terms and conditions for the product
   **/
  public ProductAdditionalInformation termsUri(String termsUri) {
    this.termsUri = termsUri;
    return this;
  }

  
  @Schema(description = "Terms and conditions for the product")
  @JsonProperty("termsUri")
  public String getTermsUri() {
    return termsUri;
  }
  public void setTermsUri(String termsUri) {
    this.termsUri = termsUri;
  }

  /**
   * Eligibility rules and criteria for the product
   **/
  public ProductAdditionalInformation eligibilityUri(String eligibilityUri) {
    this.eligibilityUri = eligibilityUri;
    return this;
  }

  
  @Schema(description = "Eligibility rules and criteria for the product")
  @JsonProperty("eligibilityUri")
  public String getEligibilityUri() {
    return eligibilityUri;
  }
  public void setEligibilityUri(String eligibilityUri) {
    this.eligibilityUri = eligibilityUri;
  }

  /**
   * Description of fees, pricing, discounts, exemptions and bonuses for the product
   **/
  public ProductAdditionalInformation feesAndPricingUri(String feesAndPricingUri) {
    this.feesAndPricingUri = feesAndPricingUri;
    return this;
  }

  
  @Schema(description = "Description of fees, pricing, discounts, exemptions and bonuses for the product")
  @JsonProperty("feesAndPricingUri")
  public String getFeesAndPricingUri() {
    return feesAndPricingUri;
  }
  public void setFeesAndPricingUri(String feesAndPricingUri) {
    this.feesAndPricingUri = feesAndPricingUri;
  }

  /**
   * Description of a bundle that this product can be part of
   **/
  public ProductAdditionalInformation bundleUri(String bundleUri) {
    this.bundleUri = bundleUri;
    return this;
  }

  
  @Schema(description = "Description of a bundle that this product can be part of")
  @JsonProperty("bundleUri")
  public String getBundleUri() {
    return bundleUri;
  }
  public void setBundleUri(String bundleUri) {
    this.bundleUri = bundleUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAdditionalInformation productAdditionalInformation = (ProductAdditionalInformation) o;
    return Objects.equals(overviewUri, productAdditionalInformation.overviewUri) &&
        Objects.equals(termsUri, productAdditionalInformation.termsUri) &&
        Objects.equals(eligibilityUri, productAdditionalInformation.eligibilityUri) &&
        Objects.equals(feesAndPricingUri, productAdditionalInformation.feesAndPricingUri) &&
        Objects.equals(bundleUri, productAdditionalInformation.bundleUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overviewUri, termsUri, eligibilityUri, feesAndPricingUri, bundleUri);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
