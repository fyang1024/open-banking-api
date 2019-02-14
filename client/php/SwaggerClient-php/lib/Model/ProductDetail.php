<?php
/**
 * ProductDetail
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
* Consumer Data Standards
 *
* API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
* OpenAPI spec version: 1-oas3
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 3.0.4
 */
/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;
use \Swagger\Client\ObjectSerializer;

/**
 * ProductDetail Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class ProductDetail extends Product 
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'ProductDetail';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'bundles' => '\Swagger\Client\Model\ProductBundles[]',
'features' => '\Swagger\Client\Model\ProductFeatures[]',
'constraints' => '\Swagger\Client\Model\ProductConstraints[]',
'eligibility' => '\Swagger\Client\Model\ProductEligibility[]',
'fees' => '\Swagger\Client\Model\ProductFees[]',
'deposit_rates' => '\Swagger\Client\Model\ProductDepositRates[]',
'lending_rates' => '\Swagger\Client\Model\ProductLendingRates[]'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'bundles' => null,
'features' => null,
'constraints' => null,
'eligibility' => null,
'fees' => null,
'deposit_rates' => null,
'lending_rates' => null    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes + parent::swaggerTypes();
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats + parent::swaggerFormats();
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'bundles' => 'bundles',
'features' => 'features',
'constraints' => 'constraints',
'eligibility' => 'eligibility',
'fees' => 'fees',
'deposit_rates' => 'depositRates',
'lending_rates' => 'lendingRates'    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'bundles' => 'setBundles',
'features' => 'setFeatures',
'constraints' => 'setConstraints',
'eligibility' => 'setEligibility',
'fees' => 'setFees',
'deposit_rates' => 'setDepositRates',
'lending_rates' => 'setLendingRates'    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'bundles' => 'getBundles',
'features' => 'getFeatures',
'constraints' => 'getConstraints',
'eligibility' => 'getEligibility',
'fees' => 'getFees',
'deposit_rates' => 'getDepositRates',
'lending_rates' => 'getLendingRates'    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return parent::attributeMap() + self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return parent::setters() + self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return parent::getters() + self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    


    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        parent::__construct($data);

        $this->container['bundles'] = isset($data['bundles']) ? $data['bundles'] : null;
        $this->container['features'] = isset($data['features']) ? $data['features'] : null;
        $this->container['constraints'] = isset($data['constraints']) ? $data['constraints'] : null;
        $this->container['eligibility'] = isset($data['eligibility']) ? $data['eligibility'] : null;
        $this->container['fees'] = isset($data['fees']) ? $data['fees'] : null;
        $this->container['deposit_rates'] = isset($data['deposit_rates']) ? $data['deposit_rates'] : null;
        $this->container['lending_rates'] = isset($data['lending_rates']) ? $data['lending_rates'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = parent::listInvalidProperties();

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        if (!parent::valid()) {
            return false;
        }

        return true;
    }


    /**
     * Gets bundles
     *
     * @return \Swagger\Client\Model\ProductBundles[]
     */
    public function getBundles()
    {
        return $this->container['bundles'];
    }

    /**
     * Sets bundles
     *
     * @param \Swagger\Client\Model\ProductBundles[] $bundles bundles
     *
     * @return $this
     */
    public function setBundles($bundles)
    {
        $this->container['bundles'] = $bundles;

        return $this;
    }

    /**
     * Gets features
     *
     * @return \Swagger\Client\Model\ProductFeatures[]
     */
    public function getFeatures()
    {
        return $this->container['features'];
    }

    /**
     * Sets features
     *
     * @param \Swagger\Client\Model\ProductFeatures[] $features features
     *
     * @return $this
     */
    public function setFeatures($features)
    {
        $this->container['features'] = $features;

        return $this;
    }

    /**
     * Gets constraints
     *
     * @return \Swagger\Client\Model\ProductConstraints[]
     */
    public function getConstraints()
    {
        return $this->container['constraints'];
    }

    /**
     * Sets constraints
     *
     * @param \Swagger\Client\Model\ProductConstraints[] $constraints constraints
     *
     * @return $this
     */
    public function setConstraints($constraints)
    {
        $this->container['constraints'] = $constraints;

        return $this;
    }

    /**
     * Gets eligibility
     *
     * @return \Swagger\Client\Model\ProductEligibility[]
     */
    public function getEligibility()
    {
        return $this->container['eligibility'];
    }

    /**
     * Sets eligibility
     *
     * @param \Swagger\Client\Model\ProductEligibility[] $eligibility eligibility
     *
     * @return $this
     */
    public function setEligibility($eligibility)
    {
        $this->container['eligibility'] = $eligibility;

        return $this;
    }

    /**
     * Gets fees
     *
     * @return \Swagger\Client\Model\ProductFees[]
     */
    public function getFees()
    {
        return $this->container['fees'];
    }

    /**
     * Sets fees
     *
     * @param \Swagger\Client\Model\ProductFees[] $fees fees
     *
     * @return $this
     */
    public function setFees($fees)
    {
        $this->container['fees'] = $fees;

        return $this;
    }

    /**
     * Gets deposit_rates
     *
     * @return \Swagger\Client\Model\ProductDepositRates[]
     */
    public function getDepositRates()
    {
        return $this->container['deposit_rates'];
    }

    /**
     * Sets deposit_rates
     *
     * @param \Swagger\Client\Model\ProductDepositRates[] $deposit_rates deposit_rates
     *
     * @return $this
     */
    public function setDepositRates($deposit_rates)
    {
        $this->container['deposit_rates'] = $deposit_rates;

        return $this;
    }

    /**
     * Gets lending_rates
     *
     * @return \Swagger\Client\Model\ProductLendingRates[]
     */
    public function getLendingRates()
    {
        return $this->container['lending_rates'];
    }

    /**
     * Sets lending_rates
     *
     * @param \Swagger\Client\Model\ProductLendingRates[] $lending_rates lending_rates
     *
     * @return $this
     */
    public function setLendingRates($lending_rates)
    {
        $this->container['lending_rates'] = $lending_rates;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}
