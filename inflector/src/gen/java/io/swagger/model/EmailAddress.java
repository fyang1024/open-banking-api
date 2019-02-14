package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class EmailAddress   {
  @JsonProperty("isPreferred")
  private Boolean isPreferred = null;
  /**
   * The purpose for the email, as specified by the customer (Enumeration)
   */
  public enum PurposeEnum {
    WORK("WORK"),
    
    HOME("HOME"),
    
    OTHER("OTHER"),
    
    UNSPECIFIED("UNSPECIFIED");

    private String value;

    PurposeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PurposeEnum fromValue(String text) {
      for (PurposeEnum b : PurposeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("purpose")
  private PurposeEnum purpose = null;
  @JsonProperty("address")
  private String address = null;
  /**
   * Required for one and only one email record in the collection. Denotes the default email address
   **/
  public EmailAddress isPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
    return this;
  }

  
  @Schema(required = true, description = "Required for one and only one email record in the collection. Denotes the default email address")
  @JsonProperty("isPreferred")
  public Boolean isIsPreferred() {
    return isPreferred;
  }
  public void setIsPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
  }

  /**
   * The purpose for the email, as specified by the customer (Enumeration)
   **/
  public EmailAddress purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

  
  @Schema(required = true, description = "The purpose for the email, as specified by the customer (Enumeration)")
  @JsonProperty("purpose")
  public PurposeEnum getPurpose() {
    return purpose;
  }
  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }

  /**
   * A correctly formatted email address, as defined by the addr_spec format in RFC_5322
   **/
  public EmailAddress address(String address) {
    this.address = address;
    return this;
  }

  
  @Schema(required = true, description = "A correctly formatted email address, as defined by the addr_spec format in RFC_5322")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailAddress emailAddress = (EmailAddress) o;
    return Objects.equals(isPreferred, emailAddress.isPreferred) &&
        Objects.equals(purpose, emailAddress.purpose) &&
        Objects.equals(address, emailAddress.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPreferred, purpose, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAddress {\n");
    sb.append("    isPreferred: ").append(toIndentedString(isPreferred)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
