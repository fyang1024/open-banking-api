/**
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 *
 * OpenAPI Generator version: 4.0.0-beta2
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.ConsumerDataStandards) {
      root.ConsumerDataStandards = {};
    }
    root.ConsumerDataStandards.ProductEligibility = factory(root.ConsumerDataStandards.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The ProductEligibility model module.
   * @module model/ProductEligibility
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>ProductEligibility</code>.
   * @alias module:model/ProductEligibility
   * @class
   * @param eligibilityType {module:model/ProductEligibility.EligibilityTypeEnum} The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning
   */
  var exports = function(eligibilityType) {
    var _this = this;

    _this['eligibilityType'] = eligibilityType;
  };

  /**
   * Constructs a <code>ProductEligibility</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ProductEligibility} obj Optional instance to populate.
   * @return {module:model/ProductEligibility} The populated <code>ProductEligibility</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('eligibilityType')) {
        obj['eligibilityType'] = ApiClient.convertToType(data['eligibilityType'], 'String');
      }
      if (data.hasOwnProperty('additionalValue')) {
        obj['additionalValue'] = ApiClient.convertToType(data['additionalValue'], 'String');
      }
      if (data.hasOwnProperty('additionalInfo')) {
        obj['additionalInfo'] = ApiClient.convertToType(data['additionalInfo'], 'String');
      }
      if (data.hasOwnProperty('additionalInfoUri')) {
        obj['additionalInfoUri'] = ApiClient.convertToType(data['additionalInfoUri'], 'String');
      }
    }
    return obj;
  }

  /**
   * The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning
   * @member {module:model/ProductEligibility.EligibilityTypeEnum} eligibilityType
   */
  exports.prototype['eligibilityType'] = undefined;
  /**
   * Generic field containing additional information relevant to the eligibilityType specified.  Whether mandatory or not is dependent on the value of eligibilityType
   * @member {String} additionalValue
   */
  exports.prototype['additionalValue'] = undefined;
  /**
   * Display text providing more information on the eligibility criteria. Mandatory if the eligibilityType field is set to OTHER
   * @member {String} additionalInfo
   */
  exports.prototype['additionalInfo'] = undefined;
  /**
   * Link to a web page with more information on this eligibility criteria
   * @member {String} additionalInfoUri
   */
  exports.prototype['additionalInfoUri'] = undefined;


  /**
   * Allowed values for the <code>eligibilityType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.EligibilityTypeEnum = {
    /**
     * value: "BUSINESS"
     * @const
     */
    "BUSINESS": "BUSINESS",
    /**
     * value: "PENSION_RECIPIENT"
     * @const
     */
    "PENSION_RECIPIENT": "PENSION_RECIPIENT",
    /**
     * value: "MIN_AGE"
     * @const
     */
    "MIN_AGE": "MIN_AGE",
    /**
     * value: "MAX_AGE"
     * @const
     */
    "MAX_AGE": "MAX_AGE",
    /**
     * value: "MIN_INCOME"
     * @const
     */
    "MIN_INCOME": "MIN_INCOME",
    /**
     * value: "MIN_TURNOVER"
     * @const
     */
    "MIN_TURNOVER": "MIN_TURNOVER",
    /**
     * value: "STAFF"
     * @const
     */
    "STAFF": "STAFF",
    /**
     * value: "STUDENT"
     * @const
     */
    "STUDENT": "STUDENT",
    /**
     * value: "EMPLOYMENT_STATUS"
     * @const
     */
    "EMPLOYMENT_STATUS": "EMPLOYMENT_STATUS",
    /**
     * value: "RESIDENCY_STATUS"
     * @const
     */
    "RESIDENCY_STATUS": "RESIDENCY_STATUS",
    /**
     * value: "OTHER"
     * @const
     */
    "OTHER": "OTHER"  };


  return exports;
}));

