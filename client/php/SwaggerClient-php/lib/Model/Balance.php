<?php
/**
 * Balance
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
 * Balance Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class Balance implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'Balance';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'account_id' => 'string',
'balance_u_type' => 'string',
'deposit' => '\Swagger\Client\Model\DepositBalance',
'lending' => '\Swagger\Client\Model\LendingBalance',
'purses' => '\Swagger\Client\Model\CurrencyAmount[]'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'account_id' => 'ASCIIString',
'balance_u_type' => null,
'deposit' => null,
'lending' => null,
'purses' => null    ];

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
        'account_id' => 'accountId',
'balance_u_type' => 'balanceUType',
'deposit' => 'deposit',
'lending' => 'lending',
'purses' => 'purses'    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'account_id' => 'setAccountId',
'balance_u_type' => 'setBalanceUType',
'deposit' => 'setDeposit',
'lending' => 'setLending',
'purses' => 'setPurses'    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'account_id' => 'getAccountId',
'balance_u_type' => 'getBalanceUType',
'deposit' => 'getDeposit',
'lending' => 'getLending',
'purses' => 'getPurses'    ];

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

    const BALANCE_U_TYPE_DEPOSIT = 'deposit';
const BALANCE_U_TYPE_LENDING = 'lending';
const BALANCE_U_TYPE_PURSES = 'purses';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getBalanceUTypeAllowableValues()
    {
        return [
            self::BALANCE_U_TYPE_DEPOSIT,
self::BALANCE_U_TYPE_LENDING,
self::BALANCE_U_TYPE_PURSES,        ];
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
        $this->container['account_id'] = isset($data['account_id']) ? $data['account_id'] : null;
        $this->container['balance_u_type'] = isset($data['balance_u_type']) ? $data['balance_u_type'] : null;
        $this->container['deposit'] = isset($data['deposit']) ? $data['deposit'] : null;
        $this->container['lending'] = isset($data['lending']) ? $data['lending'] : null;
        $this->container['purses'] = isset($data['purses']) ? $data['purses'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['account_id'] === null) {
            $invalidProperties[] = "'account_id' can't be null";
        }
        if ($this->container['balance_u_type'] === null) {
            $invalidProperties[] = "'balance_u_type' can't be null";
        }
        $allowedValues = $this->getBalanceUTypeAllowableValues();
        if (!in_array($this->container['balance_u_type'], $allowedValues)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'balance_u_type', must be one of '%s'",
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

        if ($this->container['account_id'] === null) {
            return false;
        }
        if ($this->container['balance_u_type'] === null) {
            return false;
        }
        $allowedValues = $this->getBalanceUTypeAllowableValues();
        if (!in_array($this->container['balance_u_type'], $allowedValues)) {
            return false;
        }
        return true;
    }


    /**
     * Gets account_id
     *
     * @return string
     */
    public function getAccountId()
    {
        return $this->container['account_id'];
    }

    /**
     * Sets account_id
     *
     * @param string $account_id A unique ID of the account adhering to the standards for ID permanence
     *
     * @return $this
     */
    public function setAccountId($account_id)
    {
        $this->container['account_id'] = $account_id;

        return $this;
    }

    /**
     * Gets balance_u_type
     *
     * @return string
     */
    public function getBalanceUType()
    {
        return $this->container['balance_u_type'];
    }

    /**
     * Sets balance_u_type
     *
     * @param string $balance_u_type The type of balance object provided for the account
     *
     * @return $this
     */
    public function setBalanceUType($balance_u_type)
    {
        $allowedValues = $this->getBalanceUTypeAllowableValues();
        if (!in_array($balance_u_type, $allowedValues)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'balance_u_type', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['balance_u_type'] = $balance_u_type;

        return $this;
    }

    /**
     * Gets deposit
     *
     * @return \Swagger\Client\Model\DepositBalance
     */
    public function getDeposit()
    {
        return $this->container['deposit'];
    }

    /**
     * Sets deposit
     *
     * @param \Swagger\Client\Model\DepositBalance $deposit deposit
     *
     * @return $this
     */
    public function setDeposit($deposit)
    {
        $this->container['deposit'] = $deposit;

        return $this;
    }

    /**
     * Gets lending
     *
     * @return \Swagger\Client\Model\LendingBalance
     */
    public function getLending()
    {
        return $this->container['lending'];
    }

    /**
     * Sets lending
     *
     * @param \Swagger\Client\Model\LendingBalance $lending lending
     *
     * @return $this
     */
    public function setLending($lending)
    {
        $this->container['lending'] = $lending;

        return $this;
    }

    /**
     * Gets purses
     *
     * @return \Swagger\Client\Model\CurrencyAmount[]
     */
    public function getPurses()
    {
        return $this->container['purses'];
    }

    /**
     * Sets purses
     *
     * @param \Swagger\Client\Model\CurrencyAmount[] $purses purses
     *
     * @return $this
     */
    public function setPurses($purses)
    {
        $this->container['purses'] = $purses;

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
