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
    instance = new ConsumerDataStandards.PAFAddress();
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

  describe('PAFAddress', function() {
    it('should create an instance of PAFAddress', function() {
      // uncomment below and update the code to test PAFAddress
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be.a(ConsumerDataStandards.PAFAddress);
    });

    it('should have the property dpid (base name: "dpid")', function() {
      // uncomment below and update the code to test the property dpid
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property thoroughfareNumber1 (base name: "thoroughfareNumber1")', function() {
      // uncomment below and update the code to test the property thoroughfareNumber1
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property thoroughfareNumber1Suffix (base name: "thoroughfareNumber1Suffix")', function() {
      // uncomment below and update the code to test the property thoroughfareNumber1Suffix
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property thoroughfareNumber2 (base name: "thoroughfareNumber2")', function() {
      // uncomment below and update the code to test the property thoroughfareNumber2
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property thoroughfareNumber2Suffix (base name: "thoroughfareNumber2Suffix")', function() {
      // uncomment below and update the code to test the property thoroughfareNumber2Suffix
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property flatUnitNumber (base name: "flatUnitNumber")', function() {
      // uncomment below and update the code to test the property flatUnitNumber
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property floorLevelNumber (base name: "floorLevelNumber")', function() {
      // uncomment below and update the code to test the property floorLevelNumber
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property lotNumber (base name: "lotNumber")', function() {
      // uncomment below and update the code to test the property lotNumber
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property buildingName1 (base name: "buildingName1")', function() {
      // uncomment below and update the code to test the property buildingName1
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property buildingName2 (base name: "buildingName2")', function() {
      // uncomment below and update the code to test the property buildingName2
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property streetName (base name: "streetName")', function() {
      // uncomment below and update the code to test the property streetName
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property streetType (base name: "streetType")', function() {
      // uncomment below and update the code to test the property streetType
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property streetSuffix (base name: "streetSuffix")', function() {
      // uncomment below and update the code to test the property streetSuffix
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property postalDeliveryType (base name: "postalDeliveryType")', function() {
      // uncomment below and update the code to test the property postalDeliveryType
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property postalDeliveryNumber (base name: "postalDeliveryNumber")', function() {
      // uncomment below and update the code to test the property postalDeliveryNumber
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property postalDeliveryNumberPrefix (base name: "postalDeliveryNumberPrefix")', function() {
      // uncomment below and update the code to test the property postalDeliveryNumberPrefix
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property postalDeliveryNumberSuffix (base name: "postalDeliveryNumberSuffix")', function() {
      // uncomment below and update the code to test the property postalDeliveryNumberSuffix
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property localityName (base name: "localityName")', function() {
      // uncomment below and update the code to test the property localityName
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property postcode (base name: "postcode")', function() {
      // uncomment below and update the code to test the property postcode
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

    it('should have the property state (base name: "state")', function() {
      // uncomment below and update the code to test the property state
      //var instance = new ConsumerDataStandards.PAFAddress();
      //expect(instance).to.be();
    });

  });

}));
