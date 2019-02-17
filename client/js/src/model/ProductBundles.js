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
    root.ConsumerDataStandards.ProductBundles = factory(root.ConsumerDataStandards.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The ProductBundles model module.
   * @module model/ProductBundles
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>ProductBundles</code>.
   * @alias module:model/ProductBundles
   * @class
   * @param name {String} Name of the bundle
   * @param description {String} Description of the bundle
   * @param productIds {Array.<String>} Array of product IDs for products included in the bundle
   */
  var exports = function(name, description, productIds) {
    var _this = this;

    _this['name'] = name;
    _this['description'] = description;
    _this['productIds'] = productIds;
  };

  /**
   * Constructs a <code>ProductBundles</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ProductBundles} obj Optional instance to populate.
   * @return {module:model/ProductBundles} The populated <code>ProductBundles</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('additionalInfoUri')) {
        obj['additionalInfoUri'] = ApiClient.convertToType(data['additionalInfoUri'], 'String');
      }
      if (data.hasOwnProperty('productIds')) {
        obj['productIds'] = ApiClient.convertToType(data['productIds'], ['String']);
      }
    }
    return obj;
  }

  /**
   * Name of the bundle
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * Description of the bundle
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * Link to a web page with more information on the bundle criteria and benefits
   * @member {String} additionalInfoUri
   */
  exports.prototype['additionalInfoUri'] = undefined;
  /**
   * Array of product IDs for products included in the bundle
   * @member {Array.<String>} productIds
   */
  exports.prototype['productIds'] = undefined;



  return exports;
}));


