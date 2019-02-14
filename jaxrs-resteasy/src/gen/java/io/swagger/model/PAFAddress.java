package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="Australian address formatted according to the file format defined by the [PAF file format](https://auspost.com.au/content/dam/auspost_corp/media/documents/australia-post-data-guide.pdf)")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class PAFAddress   {
  private String dpid = null;  private Integer thoroughfareNumber1 = null;  private String thoroughfareNumber1Suffix = null;  private Integer thoroughfareNumber2 = null;  private String thoroughfareNumber2Suffix = null;  private String flatUnitNumber = null;  private String floorLevelNumber = null;  private Integer lotNumber = null;  private String buildingName1 = null;  private String buildingName2 = null;  private String streetName = null;  private String streetType = null;  private String streetSuffix = null;  private String postalDeliveryType = null;  private Integer postalDeliveryNumber = null;  private String postalDeliveryNumberPrefix = null;  private String postalDeliveryNumberSuffix = null;  private String localityName = null;  private String postcode = null;  private String state = null;

  /**
   * Unique identifier for an address as defined by Australia Post.  Also known as Delivery Point Identifier
   **/
  
  @Schema(description = "Unique identifier for an address as defined by Australia Post.  Also known as Delivery Point Identifier")
  @JsonProperty("dpid")
  public String getDpid() {
    return dpid;
  }
  public void setDpid(String dpid) {
    this.dpid = dpid;
  }

  /**
   * Thoroughfare number for a property (first number in a property ranged address)
   **/
  
  @Schema(description = "Thoroughfare number for a property (first number in a property ranged address)")
  @JsonProperty("thoroughfareNumber1")
  public Integer getThoroughfareNumber1() {
    return thoroughfareNumber1;
  }
  public void setThoroughfareNumber1(Integer thoroughfareNumber1) {
    this.thoroughfareNumber1 = thoroughfareNumber1;
  }

  /**
   * Suffix for the thoroughfare number. Only relevant is thoroughfareNumber1 is populated
   **/
  
  @Schema(description = "Suffix for the thoroughfare number. Only relevant is thoroughfareNumber1 is populated")
  @JsonProperty("thoroughfareNumber1Suffix")
  public String getThoroughfareNumber1Suffix() {
    return thoroughfareNumber1Suffix;
  }
  public void setThoroughfareNumber1Suffix(String thoroughfareNumber1Suffix) {
    this.thoroughfareNumber1Suffix = thoroughfareNumber1Suffix;
  }

  /**
   * Second thoroughfare number (only used if the property has a ranged address eg 23-25)
   **/
  
  @Schema(description = "Second thoroughfare number (only used if the property has a ranged address eg 23-25)")
  @JsonProperty("thoroughfareNumber2")
  public Integer getThoroughfareNumber2() {
    return thoroughfareNumber2;
  }
  public void setThoroughfareNumber2(Integer thoroughfareNumber2) {
    this.thoroughfareNumber2 = thoroughfareNumber2;
  }

  /**
   * Suffix for the second thoroughfare number. Only relevant is thoroughfareNumber2 is populated
   **/
  
  @Schema(description = "Suffix for the second thoroughfare number. Only relevant is thoroughfareNumber2 is populated")
  @JsonProperty("thoroughfareNumber2Suffix")
  public String getThoroughfareNumber2Suffix() {
    return thoroughfareNumber2Suffix;
  }
  public void setThoroughfareNumber2Suffix(String thoroughfareNumber2Suffix) {
    this.thoroughfareNumber2Suffix = thoroughfareNumber2Suffix;
  }

  /**
   * Unit number (including suffix, if applicable)
   **/
  
  @Schema(description = "Unit number (including suffix, if applicable)")
  @JsonProperty("flatUnitNumber")
  public String getFlatUnitNumber() {
    return flatUnitNumber;
  }
  public void setFlatUnitNumber(String flatUnitNumber) {
    this.flatUnitNumber = flatUnitNumber;
  }

  /**
   * Floor or level number (including alpha characters)
   **/
  
  @Schema(description = "Floor or level number (including alpha characters)")
  @JsonProperty("floorLevelNumber")
  public String getFloorLevelNumber() {
    return floorLevelNumber;
  }
  public void setFloorLevelNumber(String floorLevelNumber) {
    this.floorLevelNumber = floorLevelNumber;
  }

  /**
   * Allotment number for the address
   **/
  
  @Schema(description = "Allotment number for the address")
  @JsonProperty("lotNumber")
  public Integer getLotNumber() {
    return lotNumber;
  }
  public void setLotNumber(Integer lotNumber) {
    this.lotNumber = lotNumber;
  }

  /**
   * Building/Property name 1
   **/
  
  @Schema(description = "Building/Property name 1")
  @JsonProperty("buildingName1")
  public String getBuildingName1() {
    return buildingName1;
  }
  public void setBuildingName1(String buildingName1) {
    this.buildingName1 = buildingName1;
  }

  /**
   * Building/Property name 2
   **/
  
  @Schema(description = "Building/Property name 2")
  @JsonProperty("buildingName2")
  public String getBuildingName2() {
    return buildingName2;
  }
  public void setBuildingName2(String buildingName2) {
    this.buildingName2 = buildingName2;
  }

  /**
   * The name of the street
   **/
  
  @Schema(description = "The name of the street")
  @JsonProperty("streetName")
  public String getStreetName() {
    return streetName;
  }
  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  /**
   * The street type. Valid enumeration defined by Australia Post PAF code file
   **/
  
  @Schema(description = "The street type. Valid enumeration defined by Australia Post PAF code file")
  @JsonProperty("streetType")
  public String getStreetType() {
    return streetType;
  }
  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }

  /**
   * The street type suffix. Valid enumeration defined by Australia Post PAF code file
   **/
  
  @Schema(description = "The street type suffix. Valid enumeration defined by Australia Post PAF code file")
  @JsonProperty("streetSuffix")
  public String getStreetSuffix() {
    return streetSuffix;
  }
  public void setStreetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
  }

  /**
   * Postal delivery type. (eg. PO BOX). Valid enumeration defined by Australia Post PAF code file
   **/
  
  @Schema(description = "Postal delivery type. (eg. PO BOX). Valid enumeration defined by Australia Post PAF code file")
  @JsonProperty("postalDeliveryType")
  public String getPostalDeliveryType() {
    return postalDeliveryType;
  }
  public void setPostalDeliveryType(String postalDeliveryType) {
    this.postalDeliveryType = postalDeliveryType;
  }

  /**
   * Postal delivery number if the address is a postal delivery type
   **/
  
  @Schema(description = "Postal delivery number if the address is a postal delivery type")
  @JsonProperty("postalDeliveryNumber")
  public Integer getPostalDeliveryNumber() {
    return postalDeliveryNumber;
  }
  public void setPostalDeliveryNumber(Integer postalDeliveryNumber) {
    this.postalDeliveryNumber = postalDeliveryNumber;
  }

  /**
   * Postal delivery number prefix related to the postal delivery number
   **/
  
  @Schema(description = "Postal delivery number prefix related to the postal delivery number")
  @JsonProperty("postalDeliveryNumberPrefix")
  public String getPostalDeliveryNumberPrefix() {
    return postalDeliveryNumberPrefix;
  }
  public void setPostalDeliveryNumberPrefix(String postalDeliveryNumberPrefix) {
    this.postalDeliveryNumberPrefix = postalDeliveryNumberPrefix;
  }

  /**
   * Postal delivery number suffix related to the postal delivery number
   **/
  
  @Schema(description = "Postal delivery number suffix related to the postal delivery number")
  @JsonProperty("postalDeliveryNumberSuffix")
  public String getPostalDeliveryNumberSuffix() {
    return postalDeliveryNumberSuffix;
  }
  public void setPostalDeliveryNumberSuffix(String postalDeliveryNumberSuffix) {
    this.postalDeliveryNumberSuffix = postalDeliveryNumberSuffix;
  }

  /**
   * Full name of locality
   **/
  
  @Schema(required = true, description = "Full name of locality")
  @JsonProperty("localityName")
  @NotNull
  public String getLocalityName() {
    return localityName;
  }
  public void setLocalityName(String localityName) {
    this.localityName = localityName;
  }

  /**
   * Postcode for the locality
   **/
  
  @Schema(required = true, description = "Postcode for the locality")
  @JsonProperty("postcode")
  @NotNull
  public String getPostcode() {
    return postcode;
  }
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  /**
   * State in which the address belongs. Valid enumeration defined by Australia Post PAF code file
   **/
  
  @Schema(required = true, description = "State in which the address belongs. Valid enumeration defined by Australia Post PAF code file")
  @JsonProperty("state")
  @NotNull
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PAFAddress paFAddress = (PAFAddress) o;
    return Objects.equals(dpid, paFAddress.dpid) &&
        Objects.equals(thoroughfareNumber1, paFAddress.thoroughfareNumber1) &&
        Objects.equals(thoroughfareNumber1Suffix, paFAddress.thoroughfareNumber1Suffix) &&
        Objects.equals(thoroughfareNumber2, paFAddress.thoroughfareNumber2) &&
        Objects.equals(thoroughfareNumber2Suffix, paFAddress.thoroughfareNumber2Suffix) &&
        Objects.equals(flatUnitNumber, paFAddress.flatUnitNumber) &&
        Objects.equals(floorLevelNumber, paFAddress.floorLevelNumber) &&
        Objects.equals(lotNumber, paFAddress.lotNumber) &&
        Objects.equals(buildingName1, paFAddress.buildingName1) &&
        Objects.equals(buildingName2, paFAddress.buildingName2) &&
        Objects.equals(streetName, paFAddress.streetName) &&
        Objects.equals(streetType, paFAddress.streetType) &&
        Objects.equals(streetSuffix, paFAddress.streetSuffix) &&
        Objects.equals(postalDeliveryType, paFAddress.postalDeliveryType) &&
        Objects.equals(postalDeliveryNumber, paFAddress.postalDeliveryNumber) &&
        Objects.equals(postalDeliveryNumberPrefix, paFAddress.postalDeliveryNumberPrefix) &&
        Objects.equals(postalDeliveryNumberSuffix, paFAddress.postalDeliveryNumberSuffix) &&
        Objects.equals(localityName, paFAddress.localityName) &&
        Objects.equals(postcode, paFAddress.postcode) &&
        Objects.equals(state, paFAddress.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dpid, thoroughfareNumber1, thoroughfareNumber1Suffix, thoroughfareNumber2, thoroughfareNumber2Suffix, flatUnitNumber, floorLevelNumber, lotNumber, buildingName1, buildingName2, streetName, streetType, streetSuffix, postalDeliveryType, postalDeliveryNumber, postalDeliveryNumberPrefix, postalDeliveryNumberSuffix, localityName, postcode, state);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
