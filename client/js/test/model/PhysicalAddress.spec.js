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
    instance = new ConsumerDataStandards.PhysicalAddress();
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

  describe('PhysicalAddress', function() {
    it('should create an instance of PhysicalAddress', function() {
      // uncomment below and update the code to test PhysicalAddress
      //var instance = new ConsumerDataStandards.PhysicalAddress();
      //expect(instance).to.be.a(ConsumerDataStandards.PhysicalAddress);
    });

    it('should have the property addressUType (base name: "addressUType")', function() {
      // uncomment below and update the code to test the property addressUType
      //var instance = new ConsumerDataStandards.PhysicalAddress();
      //expect(instance).to.be();
    });

    it('should have the property simple (base name: "simple")', function() {
      // uncomment below and update the code to test the property simple
      //var instance = new ConsumerDataStandards.PhysicalAddress();
      //expect(instance).to.be();
    });

    it('should have the property paf (base name: "paf")', function() {
      // uncomment below and update the code to test the property paf
      //var instance = new ConsumerDataStandards.PhysicalAddress();
      //expect(instance).to.be();
    });

  });

}));
