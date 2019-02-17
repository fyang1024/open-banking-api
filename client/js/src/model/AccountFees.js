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
    define(['ApiClient', 'model/AccountDiscounts'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AccountDiscounts'));
  } else {
    // Browser globals (root is window)
    if (!root.ConsumerDataStandards) {
      root.ConsumerDataStandards = {};
    }
    root.ConsumerDataStandards.AccountFees = factory(root.ConsumerDataStandards.ApiClient, root.ConsumerDataStandards.AccountDiscounts);
  }
}(this, function(ApiClient, AccountDiscounts) {
  'use strict';



  /**
   * The AccountFees model module.
   * @module model/AccountFees
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>AccountFees</code>.
   * @alias module:model/AccountFees
   * @class
   * @param name {String} Name of the fee
   * @param feeType {module:model/AccountFees.FeeTypeEnum} The type of fee
   */
  var exports = function(name, feeType) {
    var _this = this;

    _this['name'] = name;
    _this['feeType'] = feeType;
  };

  /**
   * Constructs a <code>AccountFees</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AccountFees} obj Optional instance to populate.
   * @return {module:model/AccountFees} The populated <code>AccountFees</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('feeType')) {
        obj['feeType'] = ApiClient.convertToType(data['feeType'], 'String');
      }
      if (data.hasOwnProperty('amount')) {
        obj['amount'] = ApiClient.convertToType(data['amount'], 'String');
      }
      if (data.hasOwnProperty('balanceRate')) {
        obj['balanceRate'] = ApiClient.convertToType(data['balanceRate'], 'String');
      }
      if (data.hasOwnProperty('transactionRate')) {
        obj['transactionRate'] = ApiClient.convertToType(data['transactionRate'], 'String');
      }
      if (data.hasOwnProperty('currency')) {
        obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
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
      if (data.hasOwnProperty('discounts')) {
        obj['discounts'] = ApiClient.convertToType(data['discounts'], [AccountDiscounts]);
      }
    }
    return obj;
  }

  /**
   * Name of the fee
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * The type of fee
   * @member {module:model/AccountFees.FeeTypeEnum} feeType
   */
  exports.prototype['feeType'] = undefined;
  /**
   * The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
   * @member {String} amount
   */
  exports.prototype['amount'] = undefined;
  /**
   * A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
   * @member {String} balanceRate
   */
  exports.prototype['balanceRate'] = undefined;
  /**
   * A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
   * @member {String} transactionRate
   */
  exports.prototype['transactionRate'] = undefined;
  /**
   * The currency the fee will be charged in. Assumes AUD if absent
   * @member {String} currency
   */
  exports.prototype['currency'] = undefined;
  /**
   * Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType
   * @member {String} additionalValue
   */
  exports.prototype['additionalValue'] = undefined;
  /**
   * Display text providing more information on the fee
   * @member {String} additionalInfo
   */
  exports.prototype['additionalInfo'] = undefined;
  /**
   * Link to a web page with more information on this fee
   * @member {String} additionalInfoUri
   */
  exports.prototype['additionalInfoUri'] = undefined;
  /**
   * @member {Array.<module:model/AccountDiscounts>} discounts
   */
  exports.prototype['discounts'] = undefined;


  /**
   * Allowed values for the <code>feeType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.FeeTypeEnum = {
    /**
     * value: "PERIODIC"
     * @const
     */
    "PERIODIC": "PERIODIC",
    /**
     * value: "TRANSACTION"
     * @const
     */
    "TRANSACTION": "TRANSACTION",
    /**
     * value: "EXIT"
     * @const
     */
    "EXIT": "EXIT",
    /**
     * value: "OVERDRAW"
     * @const
     */
    "OVERDRAW": "OVERDRAW",
    /**
     * value: "MIN_BALANCE"
     * @const
     */
    "MIN_BALANCE": "MIN_BALANCE",
    /**
     * value: "REDRAW"
     * @const
     */
    "REDRAW": "REDRAW",
    /**
     * value: "CHEQUE_CASH"
     * @const
     */
    "CHEQUE_CASH": "CHEQUE_CASH",
    /**
     * value: "CHEQUE_STOP"
     * @const
     */
    "CHEQUE_STOP": "CHEQUE_STOP",
    /**
     * value: "CHEQUE_BOOK"
     * @const
     */
    "CHEQUE_BOOK": "CHEQUE_BOOK",
    /**
     * value: "CARD_REPLACE"
     * @const
     */
    "CARD_REPLACE": "CARD_REPLACE",
    /**
     * value: "PAPER_STATEMENT"
     * @const
     */
    "PAPER_STATEMENT": "PAPER_STATEMENT",
    /**
     * value: "OTHER_EVENT"
     * @const
     */
    "OTHER_EVENT": "OTHER_EVENT"  };


  return exports;
}));


