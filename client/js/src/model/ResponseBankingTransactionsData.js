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
    define(['ApiClient', 'model/Transaction'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Transaction'));
  } else {
    // Browser globals (root is window)
    if (!root.ConsumerDataStandards) {
      root.ConsumerDataStandards = {};
    }
    root.ConsumerDataStandards.ResponseBankingTransactionsData = factory(root.ConsumerDataStandards.ApiClient, root.ConsumerDataStandards.Transaction);
  }
}(this, function(ApiClient, Transaction) {
  'use strict';



  /**
   * The ResponseBankingTransactionsData model module.
   * @module model/ResponseBankingTransactionsData
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>ResponseBankingTransactionsData</code>.
   * @alias module:model/ResponseBankingTransactionsData
   * @class
   * @param transactions {Array.<module:model/Transaction>} 
   */
  var exports = function(transactions) {
    var _this = this;

    _this['transactions'] = transactions;
  };

  /**
   * Constructs a <code>ResponseBankingTransactionsData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ResponseBankingTransactionsData} obj Optional instance to populate.
   * @return {module:model/ResponseBankingTransactionsData} The populated <code>ResponseBankingTransactionsData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('accountId')) {
        obj['accountId'] = ApiClient.convertToType(data['accountId'], 'String');
      }
      if (data.hasOwnProperty('displayName')) {
        obj['displayName'] = ApiClient.convertToType(data['displayName'], 'String');
      }
      if (data.hasOwnProperty('nickname')) {
        obj['nickname'] = ApiClient.convertToType(data['nickname'], 'String');
      }
      if (data.hasOwnProperty('transactions')) {
        obj['transactions'] = ApiClient.convertToType(data['transactions'], [Transaction]);
      }
    }
    return obj;
  }

  /**
   * ID of the account for which transactions are provided
   * @member {String} accountId
   */
  exports.prototype['accountId'] = undefined;
  /**
   * The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type.
   * @member {String} displayName
   */
  exports.prototype['displayName'] = undefined;
  /**
   * A customer supplied nick name for the account
   * @member {String} nickname
   */
  exports.prototype['nickname'] = undefined;
  /**
   * @member {Array.<module:model/Transaction>} transactions
   */
  exports.prototype['transactions'] = undefined;



  return exports;
}));

