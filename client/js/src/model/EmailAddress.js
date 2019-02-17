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
    root.ConsumerDataStandards.EmailAddress = factory(root.ConsumerDataStandards.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The EmailAddress model module.
   * @module model/EmailAddress
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>EmailAddress</code>.
   * @alias module:model/EmailAddress
   * @class
   * @param isPreferred {Boolean} Required for one and only one email record in the collection. Denotes the default email address
   * @param purpose {module:model/EmailAddress.PurposeEnum} The purpose for the email, as specified by the customer (Enumeration)
   * @param address {String} A correctly formatted email address, as defined by the addr_spec format in RFC_5322
   */
  var exports = function(isPreferred, purpose, address) {
    var _this = this;

    _this['isPreferred'] = isPreferred;
    _this['purpose'] = purpose;
    _this['address'] = address;
  };

  /**
   * Constructs a <code>EmailAddress</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/EmailAddress} obj Optional instance to populate.
   * @return {module:model/EmailAddress} The populated <code>EmailAddress</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('isPreferred')) {
        obj['isPreferred'] = ApiClient.convertToType(data['isPreferred'], 'Boolean');
      }
      if (data.hasOwnProperty('purpose')) {
        obj['purpose'] = ApiClient.convertToType(data['purpose'], 'String');
      }
      if (data.hasOwnProperty('address')) {
        obj['address'] = ApiClient.convertToType(data['address'], 'String');
      }
    }
    return obj;
  }

  /**
   * Required for one and only one email record in the collection. Denotes the default email address
   * @member {Boolean} isPreferred
   */
  exports.prototype['isPreferred'] = undefined;
  /**
   * The purpose for the email, as specified by the customer (Enumeration)
   * @member {module:model/EmailAddress.PurposeEnum} purpose
   */
  exports.prototype['purpose'] = undefined;
  /**
   * A correctly formatted email address, as defined by the addr_spec format in RFC_5322
   * @member {String} address
   */
  exports.prototype['address'] = undefined;


  /**
   * Allowed values for the <code>purpose</code> property.
   * @enum {String}
   * @readonly
   */
  exports.PurposeEnum = {
    /**
     * value: "WORK"
     * @const
     */
    "WORK": "WORK",
    /**
     * value: "HOME"
     * @const
     */
    "HOME": "HOME",
    /**
     * value: "OTHER"
     * @const
     */
    "OTHER": "OTHER",
    /**
     * value: "UNSPECIFIED"
     * @const
     */
    "UNSPECIFIED": "UNSPECIFIED"  };


  return exports;
}));


