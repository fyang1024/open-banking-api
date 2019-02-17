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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.ConsumerDataStandards);
  }
}(this, function(expect, ConsumerDataStandards) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new ConsumerDataStandards.AccountLendingRates();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('AccountLendingRates', function() {
    it('should create an instance of AccountLendingRates', function() {
      // uncomment below and update the code to test AccountLendingRates
      //var instance = new ConsumerDataStandards.AccountLendingRates();
      //expect(instance).to.be.a(ConsumerDataStandards.AccountLendingRates);
    });

    it('should have the property lendingRateType (base name: "lendingRateType")', function() {
      // uncomment below and update the code to test the property lendingRateType
      //var instance = new ConsumerDataStandards.AccountLendingRates();
      //expect(instance).to.be();
    });

    it('should have the property rate (base name: "rate")', function() {
      // uncomment below and update the code to test the property rate
      //var instance = new ConsumerDataStandards.AccountLendingRates();
      //expect(instance).to.be();
    });

    it('should have the property additionalValue (base name: "additionalValue")', function() {
      // uncomment below and update the code to test the property additionalValue
      //var instance = new ConsumerDataStandards.AccountLendingRates();
      //expect(instance).to.be();
    });

    it('should have the property additionalInfo (base name: "additionalInfo")', function() {
      // uncomment below and update the code to test the property additionalInfo
      //var instance = new ConsumerDataStandards.AccountLendingRates();
      //expect(instance).to.be();
    });

    it('should have the property additionalInfoUri (base name: "additionalInfoUri")', function() {
      // uncomment below and update the code to test the property additionalInfoUri
      //var instance = new ConsumerDataStandards.AccountLendingRates();
      //expect(instance).to.be();
    });

  });

}));
