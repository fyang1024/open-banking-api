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
    root.ConsumerDataStandards.InternationalPayeeBeneficiaryDetails = factory(root.ConsumerDataStandards.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The InternationalPayeeBeneficiaryDetails model module.
   * @module model/InternationalPayeeBeneficiaryDetails
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>InternationalPayeeBeneficiaryDetails</code>.
   * @alias module:model/InternationalPayeeBeneficiaryDetails
   * @class
   * @param country {String} Country where the beneficiary resides. A valid ISO 3166 Alpha-3 country code
   */
  var exports = function(country) {
    var _this = this;

    _this['country'] = country;
  };

  /**
   * Constructs a <code>InternationalPayeeBeneficiaryDetails</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/InternationalPayeeBeneficiaryDetails} obj Optional instance to populate.
   * @return {module:model/InternationalPayeeBeneficiaryDetails} The populated <code>InternationalPayeeBeneficiaryDetails</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('country')) {
        obj['country'] = ApiClient.convertToType(data['country'], 'String');
      }
      if (data.hasOwnProperty('message')) {
        obj['message'] = ApiClient.convertToType(data['message'], 'String');
      }
    }
    return obj;
  }

  /**
   * Name of the beneficiary
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * Country where the beneficiary resides. A valid ISO 3166 Alpha-3 country code
   * @member {String} country
   */
  exports.prototype['country'] = undefined;
  /**
   * Response message for the payment
   * @member {String} message
   */
  exports.prototype['message'] = undefined;



  return exports;
}));

