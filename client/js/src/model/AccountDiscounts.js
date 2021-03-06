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
    root.ConsumerDataStandards.AccountDiscounts = factory(root.ConsumerDataStandards.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The AccountDiscounts model module.
   * @module model/AccountDiscounts
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>AccountDiscounts</code>.
   * @alias module:model/AccountDiscounts
   * @class
   * @param description {String} Description of the discount
   * @param discountType {module:model/AccountDiscounts.DiscountTypeEnum} The type of discount. See the next section for an overview of valid values and their meaning
   * @param amount {String} Value of the discount. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself
   */
  var exports = function(description, discountType, amount) {
    var _this = this;

    _this['description'] = description;
    _this['discountType'] = discountType;
    _this['amount'] = amount;
  };

  /**
   * Constructs a <code>AccountDiscounts</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AccountDiscounts} obj Optional instance to populate.
   * @return {module:model/AccountDiscounts} The populated <code>AccountDiscounts</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('discountType')) {
        obj['discountType'] = ApiClient.convertToType(data['discountType'], 'String');
      }
      if (data.hasOwnProperty('amount')) {
        obj['amount'] = ApiClient.convertToType(data['amount'], 'String');
      }
      if (data.hasOwnProperty('additionalValue')) {
        obj['additionalValue'] = ApiClient.convertToType(data['additionalValue'], 'String');
      }
    }
    return obj;
  }

  /**
   * Description of the discount
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * The type of discount. See the next section for an overview of valid values and their meaning
   * @member {module:model/AccountDiscounts.DiscountTypeEnum} discountType
   */
  exports.prototype['discountType'] = undefined;
  /**
   * Value of the discount. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself
   * @member {String} amount
   */
  exports.prototype['amount'] = undefined;
  /**
   * Generic field containing additional information relevant to the discountType specified. Whether mandatory or not is dependent on the value of discountType
   * @member {String} additionalValue
   */
  exports.prototype['additionalValue'] = undefined;


  /**
   * Allowed values for the <code>discountType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.DiscountTypeEnum = {
    /**
     * value: "BALANCE"
     * @const
     */
    "BALANCE": "BALANCE",
    /**
     * value: "DEPOSITS"
     * @const
     */
    "DEPOSITS": "DEPOSITS",
    /**
     * value: "PAYMENTS"
     * @const
     */
    "PAYMENTS": "PAYMENTS",
    /**
     * value: "BUNDLE"
     * @const
     */
    "BUNDLE": "BUNDLE"  };


  return exports;
}));


