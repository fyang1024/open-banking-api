package io.swagger.model;

import io.swagger.v3.oas.annotations.media.Schema;

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

/**
  * Australian address formatted according to the file format defined by the [PAF file format](https://auspost.com.au/content/dam/auspost_corp/media/documents/australia-post-data-guide.pdf)
 **/
@Schema(description="Australian address formatted according to the file format defined by the [PAF file format](https://auspost.com.au/content/dam/auspost_corp/media/documents/australia-post-data-guide.pdf)")
public class PAFAddress  {
  
  @Schema(description = "Unique identifier for an address as defined by Australia Post.  Also known as Delivery Point Identifier")
 /**
   * Unique identifier for an address as defined by Australia Post.  Also known as Delivery Point Identifier  
  **/
  private String dpid = null;
  
  @Schema(description = "Thoroughfare number for a property (first number in a property ranged address)")
 /**
   * Thoroughfare number for a property (first number in a property ranged address)  
  **/
  private Integer thoroughfareNumber1 = null;
  
  @Schema(description = "Suffix for the thoroughfare number. Only relevant is thoroughfareNumber1 is populated")
 /**
   * Suffix for the thoroughfare number. Only relevant is thoroughfareNumber1 is populated  
  **/
  private String thoroughfareNumber1Suffix = null;
  
  @Schema(description = "Second thoroughfare number (only used if the property has a ranged address eg 23-25)")
 /**
   * Second thoroughfare number (only used if the property has a ranged address eg 23-25)  
  **/
  private Integer thoroughfareNumber2 = null;
  
  @Schema(description = "Suffix for the second thoroughfare number. Only relevant is thoroughfareNumber2 is populated")
 /**
   * Suffix for the second thoroughfare number. Only relevant is thoroughfareNumber2 is populated  
  **/
  private String thoroughfareNumber2Suffix = null;
  
  @Schema(description = "Unit number (including suffix, if applicable)")
 /**
   * Unit number (including suffix, if applicable)  
  **/
  private String flatUnitNumber = null;
  
  @Schema(description = "Floor or level number (including alpha characters)")
 /**
   * Floor or level number (including alpha characters)  
  **/
  private String floorLevelNumber = null;
  
  @Schema(description = "Allotment number for the address")
 /**
   * Allotment number for the address  
  **/
  private Integer lotNumber = null;
  
  @Schema(description = "Building/Property name 1")
 /**
   * Building/Property name 1  
  **/
  private String buildingName1 = null;
  
  @Schema(description = "Building/Property name 2")
 /**
   * Building/Property name 2  
  **/
  private String buildingName2 = null;
  
  @Schema(description = "The name of the street")
 /**
   * The name of the street  
  **/
  private String streetName = null;
  
  @Schema(description = "The street type. Valid enumeration defined by Australia Post PAF code file")
 /**
   * The street type. Valid enumeration defined by Australia Post PAF code file  
  **/
  private String streetType = null;
  
  @Schema(description = "The street type suffix. Valid enumeration defined by Australia Post PAF code file")
 /**
   * The street type suffix. Valid enumeration defined by Australia Post PAF code file  
  **/
  private String streetSuffix = null;
  
  @Schema(description = "Postal delivery type. (eg. PO BOX). Valid enumeration defined by Australia Post PAF code file")
 /**
   * Postal delivery type. (eg. PO BOX). Valid enumeration defined by Australia Post PAF code file  
  **/
  private String postalDeliveryType = null;
  
  @Schema(description = "Postal delivery number if the address is a postal delivery type")
 /**
   * Postal delivery number if the address is a postal delivery type  
  **/
  private Integer postalDeliveryNumber = null;
  
  @Schema(description = "Postal delivery number prefix related to the postal delivery number")
 /**
   * Postal delivery number prefix related to the postal delivery number  
  **/
  private String postalDeliveryNumberPrefix = null;
  
  @Schema(description = "Postal delivery number suffix related to the postal delivery number")
 /**
   * Postal delivery number suffix related to the postal delivery number  
  **/
  private String postalDeliveryNumberSuffix = null;
  
  @Schema(required = true, description = "Full name of locality")
 /**
   * Full name of locality  
  **/
  private String localityName = null;
  
  @Schema(required = true, description = "Postcode for the locality")
 /**
   * Postcode for the locality  
  **/
  private String postcode = null;
  
  @Schema(required = true, description = "State in which the address belongs. Valid enumeration defined by Australia Post PAF code file")
 /**
   * State in which the address belongs. Valid enumeration defined by Australia Post PAF code file  
  **/
  private String state = null;
 /**
   * Unique identifier for an address as defined by Australia Post.  Also known as Delivery Point Identifier
   * @return dpid
  **/
  @JsonProperty("dpid")
  public String getDpid() {
    return dpid;
  }

  public void setDpid(String dpid) {
    this.dpid = dpid;
  }

  public PAFAddress dpid(String dpid) {
    this.dpid = dpid;
    return this;
  }

 /**
   * Thoroughfare number for a property (first number in a property ranged address)
   * @return thoroughfareNumber1
  **/
  @JsonProperty("thoroughfareNumber1")
  public Integer getThoroughfareNumber1() {
    return thoroughfareNumber1;
  }

  public void setThoroughfareNumber1(Integer thoroughfareNumber1) {
    this.thoroughfareNumber1 = thoroughfareNumber1;
  }

  public PAFAddress thoroughfareNumber1(Integer thoroughfareNumber1) {
    this.thoroughfareNumber1 = thoroughfareNumber1;
    return this;
  }

 /**
   * Suffix for the thoroughfare number. Only relevant is thoroughfareNumber1 is populated
   * @return thoroughfareNumber1Suffix
  **/
  @JsonProperty("thoroughfareNumber1Suffix")
  public String getThoroughfareNumber1Suffix() {
    return thoroughfareNumber1Suffix;
  }

  public void setThoroughfareNumber1Suffix(String thoroughfareNumber1Suffix) {
    this.thoroughfareNumber1Suffix = thoroughfareNumber1Suffix;
  }

  public PAFAddress thoroughfareNumber1Suffix(String thoroughfareNumber1Suffix) {
    this.thoroughfareNumber1Suffix = thoroughfareNumber1Suffix;
    return this;
  }

 /**
   * Second thoroughfare number (only used if the property has a ranged address eg 23-25)
   * @return thoroughfareNumber2
  **/
  @JsonProperty("thoroughfareNumber2")
  public Integer getThoroughfareNumber2() {
    return thoroughfareNumber2;
  }

  public void setThoroughfareNumber2(Integer thoroughfareNumber2) {
    this.thoroughfareNumber2 = thoroughfareNumber2;
  }

  public PAFAddress thoroughfareNumber2(Integer thoroughfareNumber2) {
    this.thoroughfareNumber2 = thoroughfareNumber2;
    return this;
  }

 /**
   * Suffix for the second thoroughfare number. Only relevant is thoroughfareNumber2 is populated
   * @return thoroughfareNumber2Suffix
  **/
  @JsonProperty("thoroughfareNumber2Suffix")
  public String getThoroughfareNumber2Suffix() {
    return thoroughfareNumber2Suffix;
  }

  public void setThoroughfareNumber2Suffix(String thoroughfareNumber2Suffix) {
    this.thoroughfareNumber2Suffix = thoroughfareNumber2Suffix;
  }

  public PAFAddress thoroughfareNumber2Suffix(String thoroughfareNumber2Suffix) {
    this.thoroughfareNumber2Suffix = thoroughfareNumber2Suffix;
    return this;
  }

 /**
   * Unit number (including suffix, if applicable)
   * @return flatUnitNumber
  **/
  @JsonProperty("flatUnitNumber")
  public String getFlatUnitNumber() {
    return flatUnitNumber;
  }

  public void setFlatUnitNumber(String flatUnitNumber) {
    this.flatUnitNumber = flatUnitNumber;
  }

  public PAFAddress flatUnitNumber(String flatUnitNumber) {
    this.flatUnitNumber = flatUnitNumber;
    return this;
  }

 /**
   * Floor or level number (including alpha characters)
   * @return floorLevelNumber
  **/
  @JsonProperty("floorLevelNumber")
  public String getFloorLevelNumber() {
    return floorLevelNumber;
  }

  public void setFloorLevelNumber(String floorLevelNumber) {
    this.floorLevelNumber = floorLevelNumber;
  }

  public PAFAddress floorLevelNumber(String floorLevelNumber) {
    this.floorLevelNumber = floorLevelNumber;
    return this;
  }

 /**
   * Allotment number for the address
   * @return lotNumber
  **/
  @JsonProperty("lotNumber")
  public Integer getLotNumber() {
    return lotNumber;
  }

  public void setLotNumber(Integer lotNumber) {
    this.lotNumber = lotNumber;
  }

  public PAFAddress lotNumber(Integer lotNumber) {
    this.lotNumber = lotNumber;
    return this;
  }

 /**
   * Building/Property name 1
   * @return buildingName1
  **/
  @JsonProperty("buildingName1")
  public String getBuildingName1() {
    return buildingName1;
  }

  public void setBuildingName1(String buildingName1) {
    this.buildingName1 = buildingName1;
  }

  public PAFAddress buildingName1(String buildingName1) {
    this.buildingName1 = buildingName1;
    return this;
  }

 /**
   * Building/Property name 2
   * @return buildingName2
  **/
  @JsonProperty("buildingName2")
  public String getBuildingName2() {
    return buildingName2;
  }

  public void setBuildingName2(String buildingName2) {
    this.buildingName2 = buildingName2;
  }

  public PAFAddress buildingName2(String buildingName2) {
    this.buildingName2 = buildingName2;
    return this;
  }

 /**
   * The name of the street
   * @return streetName
  **/
  @JsonProperty("streetName")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public PAFAddress streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

 /**
   * The street type. Valid enumeration defined by Australia Post PAF code file
   * @return streetType
  **/
  @JsonProperty("streetType")
  public String getStreetType() {
    return streetType;
  }

  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }

  public PAFAddress streetType(String streetType) {
    this.streetType = streetType;
    return this;
  }

 /**
   * The street type suffix. Valid enumeration defined by Australia Post PAF code file
   * @return streetSuffix
  **/
  @JsonProperty("streetSuffix")
  public String getStreetSuffix() {
    return streetSuffix;
  }

  public void setStreetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
  }

  public PAFAddress streetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
    return this;
  }

 /**
   * Postal delivery type. (eg. PO BOX). Valid enumeration defined by Australia Post PAF code file
   * @return postalDeliveryType
  **/
  @JsonProperty("postalDeliveryType")
  public String getPostalDeliveryType() {
    return postalDeliveryType;
  }

  public void setPostalDeliveryType(String postalDeliveryType) {
    this.postalDeliveryType = postalDeliveryType;
  }

  public PAFAddress postalDeliveryType(String postalDeliveryType) {
    this.postalDeliveryType = postalDeliveryType;
    return this;
  }

 /**
   * Postal delivery number if the address is a postal delivery type
   * @return postalDeliveryNumber
  **/
  @JsonProperty("postalDeliveryNumber")
  public Integer getPostalDeliveryNumber() {
    return postalDeliveryNumber;
  }

  public void setPostalDeliveryNumber(Integer postalDeliveryNumber) {
    this.postalDeliveryNumber = postalDeliveryNumber;
  }

  public PAFAddress postalDeliveryNumber(Integer postalDeliveryNumber) {
    this.postalDeliveryNumber = postalDeliveryNumber;
    return this;
  }

 /**
   * Postal delivery number prefix related to the postal delivery number
   * @return postalDeliveryNumberPrefix
  **/
  @JsonProperty("postalDeliveryNumberPrefix")
  public String getPostalDeliveryNumberPrefix() {
    return postalDeliveryNumberPrefix;
  }

  public void setPostalDeliveryNumberPrefix(String postalDeliveryNumberPrefix) {
    this.postalDeliveryNumberPrefix = postalDeliveryNumberPrefix;
  }

  public PAFAddress postalDeliveryNumberPrefix(String postalDeliveryNumberPrefix) {
    this.postalDeliveryNumberPrefix = postalDeliveryNumberPrefix;
    return this;
  }

 /**
   * Postal delivery number suffix related to the postal delivery number
   * @return postalDeliveryNumberSuffix
  **/
  @JsonProperty("postalDeliveryNumberSuffix")
  public String getPostalDeliveryNumberSuffix() {
    return postalDeliveryNumberSuffix;
  }

  public void setPostalDeliveryNumberSuffix(String postalDeliveryNumberSuffix) {
    this.postalDeliveryNumberSuffix = postalDeliveryNumberSuffix;
  }

  public PAFAddress postalDeliveryNumberSuffix(String postalDeliveryNumberSuffix) {
    this.postalDeliveryNumberSuffix = postalDeliveryNumberSuffix;
    return this;
  }

 /**
   * Full name of locality
   * @return localityName
  **/
  @JsonProperty("localityName")
  public String getLocalityName() {
    return localityName;
  }

  public void setLocalityName(String localityName) {
    this.localityName = localityName;
  }

  public PAFAddress localityName(String localityName) {
    this.localityName = localityName;
    return this;
  }

 /**
   * Postcode for the locality
   * @return postcode
  **/
  @JsonProperty("postcode")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public PAFAddress postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

 /**
   * State in which the address belongs. Valid enumeration defined by Australia Post PAF code file
   * @return state
  **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public PAFAddress state(String state) {
    this.state = state;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PAFAddress {\n");
    
    sb.append("    dpid: ").append(toIndentedString(dpid)).append("\n");
    sb.append("    thoroughfareNumber1: ").append(toIndentedString(thoroughfareNumber1)).append("\n");
    sb.append("    thoroughfareNumber1Suffix: ").append(toIndentedString(thoroughfareNumber1Suffix)).append("\n");
    sb.append("    thoroughfareNumber2: ").append(toIndentedString(thoroughfareNumber2)).append("\n");
    sb.append("    thoroughfareNumber2Suffix: ").append(toIndentedString(thoroughfareNumber2Suffix)).append("\n");
    sb.append("    flatUnitNumber: ").append(toIndentedString(flatUnitNumber)).append("\n");
    sb.append("    floorLevelNumber: ").append(toIndentedString(floorLevelNumber)).append("\n");
    sb.append("    lotNumber: ").append(toIndentedString(lotNumber)).append("\n");
    sb.append("    buildingName1: ").append(toIndentedString(buildingName1)).append("\n");
    sb.append("    buildingName2: ").append(toIndentedString(buildingName2)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    streetSuffix: ").append(toIndentedString(streetSuffix)).append("\n");
    sb.append("    postalDeliveryType: ").append(toIndentedString(postalDeliveryType)).append("\n");
    sb.append("    postalDeliveryNumber: ").append(toIndentedString(postalDeliveryNumber)).append("\n");
    sb.append("    postalDeliveryNumberPrefix: ").append(toIndentedString(postalDeliveryNumberPrefix)).append("\n");
    sb.append("    postalDeliveryNumberSuffix: ").append(toIndentedString(postalDeliveryNumberSuffix)).append("\n");
    sb.append("    localityName: ").append(toIndentedString(localityName)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
