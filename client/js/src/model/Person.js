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
    root.ConsumerDataStandards.Person = factory(root.ConsumerDataStandards.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The Person model module.
   * @module model/Person
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>Person</code>.
   * @alias module:model/Person
   * @class
   * @param lastUpdateTime {String} The date and time that this record was last updated by the customer.  If no update has occurred then this date should reflect the initial creation date for the data
   * @param lastName {String} For people with single names the single name should be in this field
   * @param middleNames {Array.<String>} Field is mandatory but array may be empty
   */
  var exports = function(lastUpdateTime, lastName, middleNames) {
    var _this = this;

    _this['lastUpdateTime'] = lastUpdateTime;
    _this['lastName'] = lastName;
    _this['middleNames'] = middleNames;
  };

  /**
   * Constructs a <code>Person</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Person} obj Optional instance to populate.
   * @return {module:model/Person} The populated <code>Person</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('lastUpdateTime')) {
        obj['lastUpdateTime'] = ApiClient.convertToType(data['lastUpdateTime'], 'String');
      }
      if (data.hasOwnProperty('firstName')) {
        obj['firstName'] = ApiClient.convertToType(data['firstName'], 'String');
      }
      if (data.hasOwnProperty('lastName')) {
        obj['lastName'] = ApiClient.convertToType(data['lastName'], 'String');
      }
      if (data.hasOwnProperty('middleNames')) {
        obj['middleNames'] = ApiClient.convertToType(data['middleNames'], ['String']);
      }
      if (data.hasOwnProperty('prefix')) {
        obj['prefix'] = ApiClient.convertToType(data['prefix'], 'String');
      }
      if (data.hasOwnProperty('suffix')) {
        obj['suffix'] = ApiClient.convertToType(data['suffix'], 'String');
      }
      if (data.hasOwnProperty('occupationCode')) {
        obj['occupationCode'] = ApiClient.convertToType(data['occupationCode'], 'String');
      }
    }
    return obj;
  }

  /**
   * The date and time that this record was last updated by the customer.  If no update has occurred then this date should reflect the initial creation date for the data
   * @member {String} lastUpdateTime
   */
  exports.prototype['lastUpdateTime'] = undefined;
  /**
   * For people with single names this field need not be present.  The single name should be in the lastName field
   * @member {String} firstName
   */
  exports.prototype['firstName'] = undefined;
  /**
   * For people with single names the single name should be in this field
   * @member {String} lastName
   */
  exports.prototype['lastName'] = undefined;
  /**
   * Field is mandatory but array may be empty
   * @member {Array.<String>} middleNames
   */
  exports.prototype['middleNames'] = undefined;
  /**
   * Also known as title or salutation.  The prefix to the name (e.g. Mr, Mrs, Ms, Miss, Sir, etc)
   * @member {String} prefix
   */
  exports.prototype['prefix'] = undefined;
  /**
   * Used for a trailing suffix to the name (e.g. Jr)
   * @member {String} suffix
   */
  exports.prototype['suffix'] = undefined;
  /**
   * Value is a valid [ANZCO v1.2](http://www.abs.gov.au/ANZSCO) Standard Occupation classification.
   * @member {String} occupationCode
   */
  exports.prototype['occupationCode'] = undefined;



  return exports;
}));


