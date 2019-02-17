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
    define(['ApiClient', 'model/InternationalPayeeBankDetailsBankAddress'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./InternationalPayeeBankDetailsBankAddress'));
  } else {
    // Browser globals (root is window)
    if (!root.ConsumerDataStandards) {
      root.ConsumerDataStandards = {};
    }
    root.ConsumerDataStandards.InternationalPayeeBankDetails = factory(root.ConsumerDataStandards.ApiClient, root.ConsumerDataStandards.InternationalPayeeBankDetailsBankAddress);
  }
}(this, function(ApiClient, InternationalPayeeBankDetailsBankAddress) {
  'use strict';



  /**
   * The InternationalPayeeBankDetails model module.
   * @module model/InternationalPayeeBankDetails
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>InternationalPayeeBankDetails</code>.
   * @alias module:model/InternationalPayeeBankDetails
   * @class
   * @param country {String} Country of the recipient institution. A valid ISO 3166 Alpha-3 country code
   * @param accountNumber {String} Account Targeted for payment
   */
  var exports = function(country, accountNumber) {
    var _this = this;

    _this['country'] = country;
    _this['accountNumber'] = accountNumber;
  };

  /**
   * Constructs a <code>InternationalPayeeBankDetails</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/InternationalPayeeBankDetails} obj Optional instance to populate.
   * @return {module:model/InternationalPayeeBankDetails} The populated <code>InternationalPayeeBankDetails</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('country')) {
        obj['country'] = ApiClient.convertToType(data['country'], 'String');
      }
      if (data.hasOwnProperty('accountNumber')) {
        obj['accountNumber'] = ApiClient.convertToType(data['accountNumber'], 'String');
      }
      if (data.hasOwnProperty('bankAddress')) {
        obj['bankAddress'] = InternationalPayeeBankDetailsBankAddress.constructFromObject(data['bankAddress']);
      }
      if (data.hasOwnProperty('beneficiaryBankBIC')) {
        obj['beneficiaryBankBIC'] = ApiClient.convertToType(data['beneficiaryBankBIC'], 'String');
      }
      if (data.hasOwnProperty('fedWireNumber')) {
        obj['fedWireNumber'] = ApiClient.convertToType(data['fedWireNumber'], 'String');
      }
      if (data.hasOwnProperty('sortCode')) {
        obj['sortCode'] = ApiClient.convertToType(data['sortCode'], 'String');
      }
      if (data.hasOwnProperty('chipNumber')) {
        obj['chipNumber'] = ApiClient.convertToType(data['chipNumber'], 'String');
      }
      if (data.hasOwnProperty('routingNumber')) {
        obj['routingNumber'] = ApiClient.convertToType(data['routingNumber'], 'String');
      }
      if (data.hasOwnProperty('legalEntityIdentifier')) {
        obj['legalEntityIdentifier'] = ApiClient.convertToType(data['legalEntityIdentifier'], 'String');
      }
    }
    return obj;
  }

  /**
   * Country of the recipient institution. A valid ISO 3166 Alpha-3 country code
   * @member {String} country
   */
  exports.prototype['country'] = undefined;
  /**
   * Account Targeted for payment
   * @member {String} accountNumber
   */
  exports.prototype['accountNumber'] = undefined;
  /**
   * @member {module:model/InternationalPayeeBankDetailsBankAddress} bankAddress
   */
  exports.prototype['bankAddress'] = undefined;
  /**
   * Swift bank code.  Aligns with standard [ISO 9362](https://www.iso.org/standard/60390.html)
   * @member {String} beneficiaryBankBIC
   */
  exports.prototype['beneficiaryBankBIC'] = undefined;
  /**
   * Number for Fedwire payment (Federal Reserve Wire Network)
   * @member {String} fedWireNumber
   */
  exports.prototype['fedWireNumber'] = undefined;
  /**
   * Sort code used for account identification in some jurisdictions
   * @member {String} sortCode
   */
  exports.prototype['sortCode'] = undefined;
  /**
   * Number for the Clearing House Interbank Payments System
   * @member {String} chipNumber
   */
  exports.prototype['chipNumber'] = undefined;
  /**
   * International bank routing number
   * @member {String} routingNumber
   */
  exports.prototype['routingNumber'] = undefined;
  /**
   * The legal entity identifier (LEI) for the beneficiary.  Aligns with [ISO 17442](https://www.iso.org/standard/59771.html)
   * @member {String} legalEntityIdentifier
   */
  exports.prototype['legalEntityIdentifier'] = undefined;



  return exports;
}));


