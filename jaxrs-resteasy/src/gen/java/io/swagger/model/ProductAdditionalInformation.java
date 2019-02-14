package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class ProductAdditionalInformation   {
  private String overviewUri = null;  private String termsUri = null;  private String eligibilityUri = null;  private String feesAndPricingUri = null;  private String bundleUri = null;

  /**
   * General overview of the product
   **/
  
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
