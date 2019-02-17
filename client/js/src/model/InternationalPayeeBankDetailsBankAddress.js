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
    root.ConsumerDataStandards.InternationalPayeeBankDetailsBankAddress = factory(root.ConsumerDataStandards.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The InternationalPayeeBankDetailsBankAddress model module.
   * @module model/InternationalPayeeBankDetailsBankAddress
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>InternationalPayeeBankDetailsBankAddress</code>.
   * @alias module:model/InternationalPayeeBankDetailsBankAddress
   * @class
   * @param name {String} Name of the recipient Bank
   * @param address {String} Address of the recipient Bank
   */
  var exports = function(name, address) {
    var _this = this;

    _this['name'] = name;
    _this['address'] = address;
  };

  /**
   * Constructs a <code>InternationalPayeeBankDetailsBankAddress</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/InternationalPayeeBankDetailsBankAddress} obj Optional instance to populate.
   * @return {module:model/InternationalPayeeBankDetailsBankAddress} The populated <code>InternationalPayeeBankDetailsBankAddress</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('address')) {
        obj['address'] = ApiClient.convertToType(data['address'], 'String');
      }
    }
    return obj;
  }

  /**
   * Name of the recipient Bank
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * Address of the recipient Bank
   * @member {String} address
   */
  exports.prototype['address'] = undefined;



  return exports;
}));


