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
    instance = new ConsumerDataStandards.AccountDetail();
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

  describe('AccountDetail', function() {
    it('should create an instance of AccountDetail', function() {
      // uncomment below and update the code to test AccountDetail
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be.a(ConsumerDataStandards.AccountDetail);
    });

    it('should have the property accountId (base name: "accountId")', function() {
      // uncomment below and update the code to test the property accountId
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property displayName (base name: "displayName")', function() {
      // uncomment below and update the code to test the property displayName
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property nickname (base name: "nickname")', function() {
      // uncomment below and update the code to test the property nickname
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property maskedNumber (base name: "maskedNumber")', function() {
      // uncomment below and update the code to test the property maskedNumber
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property openStatus (base name: "openStatus")', function() {
      // uncomment below and update the code to test the property openStatus
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property isOwned (base name: "isOwned")', function() {
      // uncomment below and update the code to test the property isOwned
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property productCategory (base name: "productCategory")', function() {
      // uncomment below and update the code to test the property productCategory
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property productName (base name: "productName")', function() {
      // uncomment below and update the code to test the property productName
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property bsb (base name: "bsb")', function() {
      // uncomment below and update the code to test the property bsb
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property accountNumber (base name: "accountNumber")', function() {
      // uncomment below and update the code to test the property accountNumber
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property bundleName (base name: "bundleName")', function() {
      // uncomment below and update the code to test the property bundleName
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property specificAccountUType (base name: "specificAccountUType")', function() {
      // uncomment below and update the code to test the property specificAccountUType
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property termDeposit (base name: "termDeposit")', function() {
      // uncomment below and update the code to test the property termDeposit
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property creditCard (base name: "creditCard")', function() {
      // uncomment below and update the code to test the property creditCard
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property loan (base name: "loan")', function() {
      // uncomment below and update the code to test the property loan
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property features (base name: "features")', function() {
      // uncomment below and update the code to test the property features
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property fees (base name: "fees")', function() {
      // uncomment below and update the code to test the property fees
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property depositRates (base name: "depositRates")', function() {
      // uncomment below and update the code to test the property depositRates
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property lendingRates (base name: "lendingRates")', function() {
      // uncomment below and update the code to test the property lendingRates
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

    it('should have the property address (base name: "address")', function() {
      // uncomment below and update the code to test the property address
      //var instance = new ConsumerDataStandards.AccountDetail();
      //expect(instance).to.be();
    });

  });

}));