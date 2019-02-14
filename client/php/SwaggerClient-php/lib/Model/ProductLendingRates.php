<?php
/**
 * ProductLendingRates
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

use \ArrayAccess;
use \Swagger\Client\ObjectSerializer;

/**
 * ProductLendingRates Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class ProductLendingRates implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'ProductLendingRates';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'lending_rate_type' => 'string',
'rate' => 'string',
'additional_value' => 'string',
'additional_info' => 'string',
'additional_info_uri' => 'string'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'lending_rate_type' => null,
'rate' => 'RateString',
'additional_value' => null,
'additional_info' => null,
'additional_info_uri' => 'URIString'    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'lending_rate_type' => 'lendingRateType',
'rate' => 'rate',
'additional_value' => 'additionalValue',
'additional_info' => 'additionalInfo',
'additional_info_uri' => 'additionalInfoUri'    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'lending_rate_type' => 'setLendingRateType',
'rate' => 'setRate',
'additional_value' => 'setAdditionalValue',
'additional_info' => 'setAdditionalInfo',
'additional_info_uri' => 'setAdditionalInfoUri'    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'lending_rate_type' => 'getLendingRateType',
'rate' => 'getRate',
'additional_value' => 'getAdditionalValue',
'additional_info' => 'getAdditionalInfo',
'additional_info_uri' => 'getAdditionalInfoUri'    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
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

    const LENDING_RATE_TYPE_FIXED = 'FIXED';
const LENDING_RATE_TYPE_INTRODUCTORY = 'INTRODUCTORY';
const LENDING_RATE_TYPE_DISCOUNT = 'DISCOUNT';
const LENDING_RATE_TYPE_PENALTY = 'PENALTY';
const LENDING_RATE_TYPE_BUNDLE_DISCOUNT = 'BUNDLE_DISCOUNT';
const LENDING_RATE_TYPE_FLOATING = 'FLOATING';
const LENDING_RATE_TYPE_MARKET_LINKED = 'MARKET_LINKED';
const LENDING_RATE_TYPE_CASH_ADVANCE = 'CASH_ADVANCE';
const LENDING_RATE_TYPE_VARIABLE = 'VARIABLE';
const LENDING_RATE_TYPE_COMPARISON = 'COMPARISON';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getLendingRateTypeAllowableValues()
    {
        return [
            self::LENDING_RATE_TYPE_FIXED,
self::LENDING_RATE_TYPE_INTRODUCTORY,
self::LENDING_RATE_TYPE_DISCOUNT,
self::LENDING_RATE_TYPE_PENALTY,
self::LENDING_RATE_TYPE_BUNDLE_DISCOUNT,
self::LENDING_RATE_TYPE_FLOATING,
self::LENDING_RATE_TYPE_MARKET_LINKED,
self::LENDING_RATE_TYPE_CASH_ADVANCE,
self::LENDING_RATE_TYPE_VARIABLE,
self::LENDING_RATE_TYPE_COMPARISON,        ];
    }

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['lending_rate_type'] = isset($data['lending_rate_type']) ? $data['lending_rate_type'] : null;
        $this->container['rate'] = isset($data['rate']) ? $data['rate'] : null;
        $this->container['additional_value'] = isset($data['additional_value']) ? $data['additional_value'] : null;
        $this->container['additional_info'] = isset($data['additional_info']) ? $data['additional_info'] : null;
        $this->container['additional_info_uri'] = isset($data['additional_info_uri']) ? $data['additional_info_uri'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['lending_rate_type'] === null) {
            $invalidProperties[] = "'lending_rate_type' can't be null";
        }
        $allowedValues = $this->getLendingRateTypeAllowableValues();
        if (!in_array($this->container['lending_rate_type'], $allowedValues)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'lending_rate_type', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['rate'] === null) {
            $invalidProperties[] = "'rate' can't be null";
        }
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

        if ($this->container['lending_rate_type'] === null) {
            return false;
        }
        $allowedValues = $this->getLendingRateTypeAllowableValues();
        if (!in_array($this->container['lending_rate_type'], $allowedValues)) {
            return false;
        }
        if ($this->container['rate'] === null) {
            return false;
        }
        return true;
    }


    /**
     * Gets lending_rate_type
     *
     * @return string
     */
    public function getLendingRateType()
    {
        return $this->container['lending_rate_type'];
    }

    /**
     * Sets lending_rate_type
     *
     * @param string $lending_rate_type The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning
     *
     * @return $this
     */
    public function setLendingRateType($lending_rate_type)
    {
        $allowedValues = $this->getLendingRateTypeAllowableValues();
        if (!in_array($lending_rate_type, $allowedValues)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'lending_rate_type', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['lending_rate_type'] = $lending_rate_type;

        return $this;
    }

    /**
     * Gets rate
     *
     * @return string
     */
    public function getRate()
    {
        return $this->container['rate'];
    }

    /**
     * Sets rate
     *
     * @param string $rate The rate to be applied
     *
     * @return $this
     */
    public function setRate($rate)
    {
        $this->container['rate'] = $rate;

        return $this;
    }

    /**
     * Gets additional_value
     *
     * @return string
     */
    public function getAdditionalValue()
    {
        return $this->container['additional_value'];
    }

    /**
     * Sets additional_value
     *
     * @param string $additional_value Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType
     *
     * @return $this
     */
    public function setAdditionalValue($additional_value)
    {
        $this->container['additional_value'] = $additional_value;

        return $this;
    }

    /**
     * Gets additional_info
     *
     * @return string
     */
    public function getAdditionalInfo()
    {
        return $this->container['additional_info'];
    }

    /**
     * Sets additional_info
     *
     * @param string $additional_info Display text providing more information on the fee.
     *
     * @return $this
     */
    public function setAdditionalInfo($additional_info)
    {
        $this->container['additional_info'] = $additional_info;

        return $this;
    }

    /**
     * Gets additional_info_uri
     *
     * @return string
     */
    public function getAdditionalInfoUri()
    {
        return $this->container['additional_info_uri'];
    }

    /**
     * Sets additional_info_uri
     *
     * @param string $additional_info_uri Link to a web page with more information  on this fee
     *
     * @return $this
     */
    public function setAdditionalInfoUri($additional_info_uri)
    {
        $this->container['additional_info_uri'] = $additional_info_uri;

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
