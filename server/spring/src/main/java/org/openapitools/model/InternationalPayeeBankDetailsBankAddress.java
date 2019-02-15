package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InternationalPayeeBankDetailsBankAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

public class InternationalPayeeBankDetailsBankAddress   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("address")
  private String address;

  public InternationalPayeeBankDetailsBankAddress name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the recipient Bank
   * @return name
  */
  @ApiModelProperty(required = true, value = "Name of the recipient Bank")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InternationalPayeeBankDetailsBankAddress address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address of the recipient Bank
   * @return address
  */
  @ApiModelProperty(required = true, value = "Address of the recipient Bank")
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
    InternationalPayeeBankDetailsBankAddress internationalPayeeBankDetailsBankAddress = (InternationalPayeeBankDetailsBankAddress) o;
    return Objects.equals(this.name, internationalPayeeBankDetailsBankAddress.name) &&
        Objects.equals(this.address, internationalPayeeBankDetailsBankAddress.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternationalPayeeBankDetailsBankAddress {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

