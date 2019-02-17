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
    define(['ApiClient', 'model/Payee'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Payee'));
  } else {
    // Browser globals (root is window)
    if (!root.ConsumerDataStandards) {
      root.ConsumerDataStandards = {};
    }
    root.ConsumerDataStandards.ResponseBankingPayeesData = factory(root.ConsumerDataStandards.ApiClient, root.ConsumerDataStandards.Payee);
  }
}(this, function(ApiClient, Payee) {
  'use strict';



  /**
   * The ResponseBankingPayeesData model module.
   * @module model/ResponseBankingPayeesData
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>ResponseBankingPayeesData</code>.
   * @alias module:model/ResponseBankingPayeesData
   * @class
   * @param payees {Array.<module:model/Payee>} The list of payees returned
   */
  var exports = function(payees) {
    var _this = this;

    _this['payees'] = payees;
  };

  /**
   * Constructs a <code>ResponseBankingPayeesData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ResponseBankingPayeesData} obj Optional instance to populate.
   * @return {module:model/ResponseBankingPayeesData} The populated <code>ResponseBankingPayeesData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('payees')) {
        obj['payees'] = ApiClient.convertToType(data['payees'], [Payee]);
      }
    }
    return obj;
  }

  /**
   * The list of payees returned
   * @member {Array.<module:model/Payee>} payees
   */
  exports.prototype['payees'] = undefined;



  return exports;
}));


