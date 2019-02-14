package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class InternationalPayeeBankDetailsBankAddress   {
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("address")
  private String address = null;
  /**
   * Name of the recipient Bank
   **/
  public InternationalPayeeBankDetailsBankAddress name(String name) {
    this.name = name;
    return this;
  }

  
  @Schema(description = "Name of the recipient Bank")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Address of the recipient Bank
   **/
  public InternationalPayeeBankDetailsBankAddress address(String address) {
    this.address = address;
    return this;
  }

  
  @Schema(description = "Address of the recipient Bank")
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
    InternationalPayeeBankDetailsBankAddress internationalPayeeBankDetailsBankAddress = (InternationalPayeeBankDetailsBankAddress) o;
    return Objects.equals(name, internationalPayeeBankDetailsBankAddress.name) &&
        Objects.equals(address, internationalPayeeBankDetailsBankAddress.address);
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
