<?php
/**
 * AccountFees
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
 * AccountFees Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class AccountFees implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'AccountFees';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'name' => 'string',
'fee_type' => 'string',
'amount' => 'string',
'balance_rate' => 'string',
'transaction_rate' => 'string',
'currency' => 'string',
'additional_value' => 'string',
'additional_info' => 'string',
'additional_info_uri' => 'string',
'discounts' => '\Swagger\Client\Model\AccountDiscounts[]'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'name' => null,
'fee_type' => null,
'amount' => 'AmountString',
'balance_rate' => 'RateString',
'transaction_rate' => 'RateString',
'currency' => 'CurrencyString',
'additional_value' => null,
'additional_info' => null,
'additional_info_uri' => 'URIString',
'discounts' => null    ];

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
        'name' => 'name',
'fee_type' => 'feeType',
'amount' => 'amount',
'balance_rate' => 'balanceRate',
'transaction_rate' => 'transactionRate',
'currency' => 'currency',
'additional_value' => 'additionalValue',
'additional_info' => 'additionalInfo',
'additional_info_uri' => 'additionalInfoUri',
'discounts' => 'discounts'    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'name' => 'setName',
'fee_type' => 'setFeeType',
'amount' => 'setAmount',
'balance_rate' => 'setBalanceRate',
'transaction_rate' => 'setTransactionRate',
'currency' => 'setCurrency',
'additional_value' => 'setAdditionalValue',
'additional_info' => 'setAdditionalInfo',
'additional_info_uri' => 'setAdditionalInfoUri',
'discounts' => 'setDiscounts'    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'name' => 'getName',
'fee_type' => 'getFeeType',
'amount' => 'getAmount',
'balance_rate' => 'getBalanceRate',
'transaction_rate' => 'getTransactionRate',
'currency' => 'getCurrency',
'additional_value' => 'getAdditionalValue',
'additional_info' => 'getAdditionalInfo',
'additional_info_uri' => 'getAdditionalInfoUri',
'discounts' => 'getDiscounts'    ];

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

    const FEE_TYPE_PERIODIC = 'PERIODIC';
const FEE_TYPE_TRANSACTION = 'TRANSACTION';
const FEE_TYPE__EXIT = 'EXIT';
const FEE_TYPE_OVERDRAW = 'OVERDRAW';
const FEE_TYPE_MIN_BALANCE = 'MIN_BALANCE';
const FEE_TYPE_REDRAW = 'REDRAW';
const FEE_TYPE_CHEQUE_CASH = 'CHEQUE_CASH';
const FEE_TYPE_CHEQUE_STOP = 'CHEQUE_STOP';
const FEE_TYPE_CHEQUE_BOOK = 'CHEQUE_BOOK';
const FEE_TYPE_CARD_REPLACE = 'CARD_REPLACE';
const FEE_TYPE_PAPER_STATEMENT = 'PAPER_STATEMENT';
const FEE_TYPE_OTHER_EVENT = 'OTHER_EVENT';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getFeeTypeAllowableValues()
    {
        return [
            self::FEE_TYPE_PERIODIC,
self::FEE_TYPE_TRANSACTION,
self::FEE_TYPE__EXIT,
self::FEE_TYPE_OVERDRAW,
self::FEE_TYPE_MIN_BALANCE,
self::FEE_TYPE_REDRAW,
self::FEE_TYPE_CHEQUE_CASH,
self::FEE_TYPE_CHEQUE_STOP,
self::FEE_TYPE_CHEQUE_BOOK,
self::FEE_TYPE_CARD_REPLACE,
self::FEE_TYPE_PAPER_STATEMENT,
self::FEE_TYPE_OTHER_EVENT,        ];
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
        $this->container['name'] = isset($data['name']) ? $data['name'] : null;
        $this->container['fee_type'] = isset($data['fee_type']) ? $data['fee_type'] : null;
        $this->container['amount'] = isset($data['amount']) ? $data['amount'] : null;
        $this->container['balance_rate'] = isset($data['balance_rate']) ? $data['balance_rate'] : null;
        $this->container['transaction_rate'] = isset($data['transaction_rate']) ? $data['transaction_rate'] : null;
        $this->container['currency'] = isset($data['currency']) ? $data['currency'] : null;
        $this->container['additional_value'] = isset($data['additional_value']) ? $data['additional_value'] : null;
        $this->container['additional_info'] = isset($data['additional_info']) ? $data['additional_info'] : null;
        $this->container['additional_info_uri'] = isset($data['additional_info_uri']) ? $data['additional_info_uri'] : null;
        $this->container['discounts'] = isset($data['discounts']) ? $data['discounts'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['name'] === null) {
            $invalidProperties[] = "'name' can't be null";
        }
        if ($this->container['fee_type'] === null) {
            $invalidProperties[] = "'fee_type' can't be null";
        }
        $allowedValues = $this->getFeeTypeAllowableValues();
        if (!in_array($this->container['fee_type'], $allowedValues)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'fee_type', must be one of '%s'",
                implode("', '", $allowedValues)
            );
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

        if ($this->container['name'] === null) {
            return false;
        }
        if ($this->container['fee_type'] === null) {
            return false;
        }
        $allowedValues = $this->getFeeTypeAllowableValues();
        if (!in_array($this->container['fee_type'], $allowedValues)) {
            return false;
        }
        return true;
    }


    /**
     * Gets name
     *
     * @return string
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string $name Name of the fee
     *
     * @return $this
     */
    public function setName($name)
    {
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets fee_type
     *
     * @return string
     */
    public function getFeeType()
    {
        return $this->container['fee_type'];
    }

    /**
     * Sets fee_type
     *
     * @param string $fee_type The type of fee
     *
     * @return $this
     */
    public function setFeeType($fee_type)
    {
        $allowedValues = $this->getFeeTypeAllowableValues();
        if (!in_array($fee_type, $allowedValues)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'fee_type', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['fee_type'] = $fee_type;

        return $this;
    }

    /**
     * Gets amount
     *
     * @return string
     */
    public function getAmount()
    {
        return $this->container['amount'];
    }

    /**
     * Sets amount
     *
     * @param string $amount The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
     *
     * @return $this
     */
    public function setAmount($amount)
    {
        $this->container['amount'] = $amount;

        return $this;
    }

    /**
     * Gets balance_rate
     *
     * @return string
     */
    public function getBalanceRate()
    {
        return $this->container['balance_rate'];
    }

    /**
     * Sets balance_rate
     *
     * @param string $balance_rate A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
     *
     * @return $this
     */
    public function setBalanceRate($balance_rate)
    {
        $this->container['balance_rate'] = $balance_rate;

        return $this;
    }

    /**
     * Gets transaction_rate
     *
     * @return string
     */
    public function getTransactionRate()
    {
        return $this->container['transaction_rate'];
    }

    /**
     * Sets transaction_rate
     *
     * @param string $transaction_rate A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
     *
     * @return $this
     */
    public function setTransactionRate($transaction_rate)
    {
        $this->container['transaction_rate'] = $transaction_rate;

        return $this;
    }

    /**
     * Gets currency
     *
     * @return string
     */
    public function getCurrency()
    {
        return $this->container['currency'];
    }

    /**
     * Sets currency
     *
     * @param string $currency The currency the fee will be charged in. Assumes AUD if absent
     *
     * @return $this
     */
    public function setCurrency($currency)
    {
        $this->container['currency'] = $currency;

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
     * @param string $additional_value Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType
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
     * @param string $additional_info Display text providing more information on the fee
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
     * @param string $additional_info_uri Link to a web page with more information on this fee
     *
     * @return $this
     */
    public function setAdditionalInfoUri($additional_info_uri)
    {
        $this->container['additional_info_uri'] = $additional_info_uri;

        return $this;
    }

    /**
     * Gets discounts
     *
     * @return \Swagger\Client\Model\AccountDiscounts[]
     */
    public function getDiscounts()
    {
        return $this->container['discounts'];
    }

    /**
     * Sets discounts
     *
     * @param \Swagger\Client\Model\AccountDiscounts[] $discounts discounts
     *
     * @return $this
     */
    public function setDiscounts($discounts)
    {
        $this->container['discounts'] = $discounts;

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
