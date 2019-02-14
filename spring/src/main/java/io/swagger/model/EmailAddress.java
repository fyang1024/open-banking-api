package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EmailAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-14T03:26:14.367Z[GMT]")
public class EmailAddress   {
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

  public EmailAddress isPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
    return this;
  }

  /**
   * Required for one and only one email record in the collection. Denotes the default email address
   * @return isPreferred
  **/
  @ApiModelProperty(required = true, value = "Required for one and only one email record in the collection. Denotes the default email address")
  @NotNull

  public Boolean isIsPreferred() {
    return isPreferred;
  }

  public void setIsPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
  }

  public EmailAddress purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * The purpose for the email, as specified by the customer (Enumeration)
   * @return purpose
  **/
  @ApiModelProperty(required = true, value = "The purpose for the email, as specified by the customer (Enumeration)")
  @NotNull

  public PurposeEnum getPurpose() {
    return purpose;
  }

  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }

  public EmailAddress address(String address) {
    this.address = address;
    return this;
  }

  /**
   * A correctly formatted email address, as defined by the addr_spec format in RFC_5322
   * @return address
  **/
  @ApiModelProperty(required = true, value = "A correctly formatted email address, as defined by the addr_spec format in RFC_5322")
  @NotNull

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
    return Objects.equals(this.isPreferred, emailAddress.isPreferred) &&
        Objects.equals(this.purpose, emailAddress.purpose) &&
        Objects.equals(this.address, emailAddress.address);
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
