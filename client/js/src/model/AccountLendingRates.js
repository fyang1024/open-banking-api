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
    root.ConsumerDataStandards.AccountLendingRates = factory(root.ConsumerDataStandards.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The AccountLendingRates model module.
   * @module model/AccountLendingRates
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>AccountLendingRates</code>.
   * @alias module:model/AccountLendingRates
   * @class
   * @param lendingRateType {module:model/AccountLendingRates.LendingRateTypeEnum} The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning
   * @param rate {String} The rate to be applied
   */
  var exports = function(lendingRateType, rate) {
    var _this = this;

    _this['lendingRateType'] = lendingRateType;
    _this['rate'] = rate;
  };

  /**
   * Constructs a <code>AccountLendingRates</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AccountLendingRates} obj Optional instance to populate.
   * @return {module:model/AccountLendingRates} The populated <code>AccountLendingRates</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('lendingRateType')) {
        obj['lendingRateType'] = ApiClient.convertToType(data['lendingRateType'], 'String');
      }
      if (data.hasOwnProperty('rate')) {
        obj['rate'] = ApiClient.convertToType(data['rate'], 'String');
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
   * The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning
   * @member {module:model/AccountLendingRates.LendingRateTypeEnum} lendingRateType
   */
  exports.prototype['lendingRateType'] = undefined;
  /**
   * The rate to be applied
   * @member {String} rate
   */
  exports.prototype['rate'] = undefined;
  /**
   * Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType
   * @member {String} additionalValue
   */
  exports.prototype['additionalValue'] = undefined;
  /**
   * Display text providing more information on the fee.
   * @member {String} additionalInfo
   */
  exports.prototype['additionalInfo'] = undefined;
  /**
   * Link to a web page with more information  on this fee
   * @member {String} additionalInfoUri
   */
  exports.prototype['additionalInfoUri'] = undefined;


  /**
   * Allowed values for the <code>lendingRateType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.LendingRateTypeEnum = {
    /**
     * value: "FIXED"
     * @const
     */
    "FIXED": "FIXED",
    /**
     * value: "INTRODUCTORY"
     * @const
     */
    "INTRODUCTORY": "INTRODUCTORY",
    /**
     * value: "DISCOUNT"
     * @const
     */
    "DISCOUNT": "DISCOUNT",
    /**
     * value: "PENALTY"
     * @const
     */
    "PENALTY": "PENALTY",
    /**
     * value: "BUNDLE_DISCOUNT"
     * @const
     */
    "BUNDLE_DISCOUNT": "BUNDLE_DISCOUNT",
    /**
     * value: "FLOATING"
     * @const
     */
    "FLOATING": "FLOATING",
    /**
     * value: "MARKET_LINKED"
     * @const
     */
    "MARKET_LINKED": "MARKET_LINKED",
    /**
     * value: "CASH_ADVANCE"
     * @const
     */
    "CASH_ADVANCE": "CASH_ADVANCE",
    /**
     * value: "VARIABLE"
     * @const
     */
    "VARIABLE": "VARIABLE",
    /**
     * value: "COMPARISON"
     * @const
     */
    "COMPARISON": "COMPARISON"  };


  return exports;
}));


