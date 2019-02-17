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
    root.ConsumerDataStandards.PhoneNumber = factory(root.ConsumerDataStandards.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The PhoneNumber model module.
   * @module model/PhoneNumber
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>PhoneNumber</code>.
   * @alias module:model/PhoneNumber
   * @class
   * @param purpose {module:model/PhoneNumber.PurposeEnum} The purpose of the number as specified by the customer
   * @param _number {String} The actual phone number, with leading zeros as appropriate
   * @param fullNumber {String} Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966
   */
  var exports = function(purpose, _number, fullNumber) {
    var _this = this;

    _this['purpose'] = purpose;
    _this['number'] = _number;
    _this['fullNumber'] = fullNumber;
  };

  /**
   * Constructs a <code>PhoneNumber</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PhoneNumber} obj Optional instance to populate.
   * @return {module:model/PhoneNumber} The populated <code>PhoneNumber</code> instance.
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
      if (data.hasOwnProperty('countryCode')) {
        obj['countryCode'] = ApiClient.convertToType(data['countryCode'], 'String');
      }
      if (data.hasOwnProperty('areaCode')) {
        obj['areaCode'] = ApiClient.convertToType(data['areaCode'], 'String');
      }
      if (data.hasOwnProperty('number')) {
        obj['number'] = ApiClient.convertToType(data['number'], 'String');
      }
      if (data.hasOwnProperty('extension')) {
        obj['extension'] = ApiClient.convertToType(data['extension'], 'String');
      }
      if (data.hasOwnProperty('fullNumber')) {
        obj['fullNumber'] = ApiClient.convertToType(data['fullNumber'], 'String');
      }
    }
    return obj;
  }

  /**
   * Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be 'false' if not present
   * @member {Boolean} isPreferred
   */
  exports.prototype['isPreferred'] = undefined;
  /**
   * The purpose of the number as specified by the customer
   * @member {module:model/PhoneNumber.PurposeEnum} purpose
   */
  exports.prototype['purpose'] = undefined;
  /**
   * If absent, assumed to be Australia (+61). The + should be included
   * @member {String} countryCode
   */
  exports.prototype['countryCode'] = undefined;
  /**
   * Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted.
   * @member {String} areaCode
   */
  exports.prototype['areaCode'] = undefined;
  /**
   * The actual phone number, with leading zeros as appropriate
   * @member {String} number
   */
  exports.prototype['number'] = undefined;
  /**
   * An extension number (if applicable)
   * @member {String} extension
   */
  exports.prototype['extension'] = undefined;
  /**
   * Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966
   * @member {String} fullNumber
   */
  exports.prototype['fullNumber'] = undefined;


  /**
   * Allowed values for the <code>purpose</code> property.
   * @enum {String}
   * @readonly
   */
  exports.PurposeEnum = {
    /**
     * value: "MOBILE"
     * @const
     */
    "MOBILE": "MOBILE",
    /**
     * value: "HOME"
     * @const
     */
    "HOME": "HOME",
    /**
     * value: "WORK"
     * @const
     */
    "WORK": "WORK",
    /**
     * value: "OTHER"
     * @const
     */
    "OTHER": "OTHER",
    /**
     * value: "INTERNATIONAL"
     * @const
     */
    "INTERNATIONAL": "INTERNATIONAL",
    /**
     * value: "UNSPECIFIED"
     * @const
     */
    "UNSPECIFIED": "UNSPECIFIED"  };


  return exports;
}));


