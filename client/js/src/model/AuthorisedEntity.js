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
    root.ConsumerDataStandards.AuthorisedEntity = factory(root.ConsumerDataStandards.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The AuthorisedEntity model module.
   * @module model/AuthorisedEntity
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>AuthorisedEntity</code>.
   * @alias module:model/AuthorisedEntity
   * @class
   * @param name {String} Name of the authorised entity
   * @param financialInstitution {String} Name of the financial institution through which the direct debit will be executed
   */
  var exports = function(name, financialInstitution) {
    var _this = this;

    _this['name'] = name;
    _this['financialInstitution'] = financialInstitution;
  };

  /**
   * Constructs a <code>AuthorisedEntity</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AuthorisedEntity} obj Optional instance to populate.
   * @return {module:model/AuthorisedEntity} The populated <code>AuthorisedEntity</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('financialInstitution')) {
        obj['financialInstitution'] = ApiClient.convertToType(data['financialInstitution'], 'String');
      }
      if (data.hasOwnProperty('abn')) {
        obj['abn'] = ApiClient.convertToType(data['abn'], 'String');
      }
      if (data.hasOwnProperty('acn')) {
        obj['acn'] = ApiClient.convertToType(data['acn'], 'String');
      }
      if (data.hasOwnProperty('arbn')) {
        obj['arbn'] = ApiClient.convertToType(data['arbn'], 'String');
      }
    }
    return obj;
  }

  /**
   * Name of the authorised entity
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * Name of the financial institution through which the direct debit will be executed
   * @member {String} financialInstitution
   */
  exports.prototype['financialInstitution'] = undefined;
  /**
   * Australian Business Number for the authorised entity
   * @member {String} abn
   */
  exports.prototype['abn'] = undefined;
  /**
   * Australian Business Number for the authorised entity
   * @member {String} acn
   */
  exports.prototype['acn'] = undefined;
  /**
   * Australian Registered Body Number for the authorised entity
   * @member {String} arbn
   */
  exports.prototype['arbn'] = undefined;



  return exports;
}));


