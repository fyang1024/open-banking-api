/*
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * TransactionDetailExtendedData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-14T03:38:22.905Z[GMT]")public class TransactionDetailExtendedData {

  @SerializedName("payer")
  private String payer = null;

  @SerializedName("payee")
  private String payee = null;
  /**
   * Optional extended data provided specific to transaction originated via NPP
   */
  @JsonAdapter(ExtensionUTypeEnum.Adapter.class)
  public enum ExtensionUTypeEnum {
    EXTENDEDDESCRIPTION("extendedDescription");

    private String value;

    ExtensionUTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ExtensionUTypeEnum fromValue(String text) {
      for (ExtensionUTypeEnum b : ExtensionUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ExtensionUTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExtensionUTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExtensionUTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ExtensionUTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("extensionUType")
  private ExtensionUTypeEnum extensionUType = null;

  @SerializedName("extendedDescription")
  private String extendedDescription = null;
  /**
   * Identifier of the applicable NPP payment service
   */
  @JsonAdapter(ServiceIdEnum.Adapter.class)
  public enum ServiceIdEnum {
    _01("X2P1.01");

    private String value;

    ServiceIdEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ServiceIdEnum fromValue(String text) {
      for (ServiceIdEnum b : ServiceIdEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ServiceIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceIdEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceIdEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("serviceId")
  private ServiceIdEnum serviceId = null;
  public TransactionDetailExtendedData payer(String payer) {
    this.payer = payer;
    return this;
  }

  

  /**
  * Name or description of the originating payer.  Mandatory for inbound payment
  * @return payer
  **/
  @Schema(description = "Name or description of the originating payer.  Mandatory for inbound payment")
  public String getPayer() {
    return payer;
  }
  public void setPayer(String payer) {
    this.payer = payer;
  }
  public TransactionDetailExtendedData payee(String payee) {
    this.payee = payee;
    return this;
  }

  

  /**
  * Name or description of the target payee. Mandatory for an outbound payment
  * @return payee
  **/
  @Schema(description = "Name or description of the target payee. Mandatory for an outbound payment")
  public String getPayee() {
    return payee;
  }
  public void setPayee(String payee) {
    this.payee = payee;
  }
  public TransactionDetailExtendedData extensionUType(ExtensionUTypeEnum extensionUType) {
    this.extensionUType = extensionUType;
    return this;
  }

  

  /**
  * Optional extended data provided specific to transaction originated via NPP
  * @return extensionUType
  **/
  @Schema(description = "Optional extended data provided specific to transaction originated via NPP")
  public ExtensionUTypeEnum getExtensionUType() {
    return extensionUType;
  }
  public void setExtensionUType(ExtensionUTypeEnum extensionUType) {
    this.extensionUType = extensionUType;
  }
  public TransactionDetailExtendedData extendedDescription(String extendedDescription) {
    this.extendedDescription = extendedDescription;
    return this;
  }

  

  /**
  * An extended string description. Only present if specified by the extensionUType field
  * @return extendedDescription
  **/
  @Schema(description = "An extended string description. Only present if specified by the extensionUType field")
  public String getExtendedDescription() {
    return extendedDescription;
  }
  public void setExtendedDescription(String extendedDescription) {
    this.extendedDescription = extendedDescription;
  }
  public TransactionDetailExtendedData serviceId(ServiceIdEnum serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  

  /**
  * Identifier of the applicable NPP payment service
  * @return serviceId
  **/
  @Schema(description = "Identifier of the applicable NPP payment service")
  public ServiceIdEnum getServiceId() {
    return serviceId;
  }
  public void setServiceId(ServiceIdEnum serviceId) {
    this.serviceId = serviceId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDetailExtendedData transactionDetailExtendedData = (TransactionDetailExtendedData) o;
    return Objects.equals(this.payer, transactionDetailExtendedData.payer) &&
        Objects.equals(this.payee, transactionDetailExtendedData.payee) &&
        Objects.equals(this.extensionUType, transactionDetailExtendedData.extensionUType) &&
        Objects.equals(this.extendedDescription, transactionDetailExtendedData.extendedDescription) &&
        Objects.equals(this.serviceId, transactionDetailExtendedData.serviceId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(payer, payee, extensionUType, extendedDescription, serviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDetailExtendedData {\n");
    
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    extensionUType: ").append(toIndentedString(extensionUType)).append("\n");
    sb.append("    extendedDescription: ").append(toIndentedString(extendedDescription)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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
