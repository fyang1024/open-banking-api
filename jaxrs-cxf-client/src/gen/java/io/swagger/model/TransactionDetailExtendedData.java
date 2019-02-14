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

public class TransactionDetailExtendedData  {
  
  @Schema(description = "Name or description of the originating payer.  Mandatory for inbound payment")
 /**
   * Name or description of the originating payer.  Mandatory for inbound payment  
  **/
  private String payer = null;
  
  @Schema(description = "Name or description of the target payee. Mandatory for an outbound payment")
 /**
   * Name or description of the target payee. Mandatory for an outbound payment  
  **/
  private String payee = null;
  public enum ExtensionUTypeEnum {
    EXTENDEDDESCRIPTION("extendedDescription");

    private String value;

    ExtensionUTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ExtensionUTypeEnum fromValue(String text) {
      for (ExtensionUTypeEnum b : ExtensionUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "Optional extended data provided specific to transaction originated via NPP")
 /**
   * Optional extended data provided specific to transaction originated via NPP  
  **/
  private ExtensionUTypeEnum extensionUType = null;
  
  @Schema(description = "An extended string description. Only present if specified by the extensionUType field")
 /**
   * An extended string description. Only present if specified by the extensionUType field  
  **/
  private String extendedDescription = null;
  public enum ServiceIdEnum {
    _01("X2P1.01");

    private String value;

    ServiceIdEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ServiceIdEnum fromValue(String text) {
      for (ServiceIdEnum b : ServiceIdEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "Identifier of the applicable NPP payment service")
 /**
   * Identifier of the applicable NPP payment service  
  **/
  private ServiceIdEnum serviceId = null;
 /**
   * Name or description of the originating payer.  Mandatory for inbound payment
   * @return payer
  **/
  @JsonProperty("payer")
  public String getPayer() {
    return payer;
  }

  public void setPayer(String payer) {
    this.payer = payer;
  }

  public TransactionDetailExtendedData payer(String payer) {
    this.payer = payer;
    return this;
  }

 /**
   * Name or description of the target payee. Mandatory for an outbound payment
   * @return payee
  **/
  @JsonProperty("payee")
  public String getPayee() {
    return payee;
  }

  public void setPayee(String payee) {
    this.payee = payee;
  }

  public TransactionDetailExtendedData payee(String payee) {
    this.payee = payee;
    return this;
  }

 /**
   * Optional extended data provided specific to transaction originated via NPP
   * @return extensionUType
  **/
  @JsonProperty("extensionUType")
  public String getExtensionUType() {
    if (extensionUType == null) {
      return null;
    }
    return extensionUType.getValue();
  }

  public void setExtensionUType(ExtensionUTypeEnum extensionUType) {
    this.extensionUType = extensionUType;
  }

  public TransactionDetailExtendedData extensionUType(ExtensionUTypeEnum extensionUType) {
    this.extensionUType = extensionUType;
    return this;
  }

 /**
   * An extended string description. Only present if specified by the extensionUType field
   * @return extendedDescription
  **/
  @JsonProperty("extendedDescription")
  public String getExtendedDescription() {
    return extendedDescription;
  }

  public void setExtendedDescription(String extendedDescription) {
    this.extendedDescription = extendedDescription;
  }

  public TransactionDetailExtendedData extendedDescription(String extendedDescription) {
    this.extendedDescription = extendedDescription;
    return this;
  }

 /**
   * Identifier of the applicable NPP payment service
   * @return serviceId
  **/
  @JsonProperty("serviceId")
  public String getServiceId() {
    if (serviceId == null) {
      return null;
    }
    return serviceId.getValue();
  }

  public void setServiceId(ServiceIdEnum serviceId) {
    this.serviceId = serviceId;
  }

  public TransactionDetailExtendedData serviceId(ServiceIdEnum serviceId) {
    this.serviceId = serviceId;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
