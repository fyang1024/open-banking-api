<?php
/**
 * Account
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
 * Account Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class Account implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'Account';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'account_id' => 'string',
'display_name' => 'string',
'nickname' => 'string',
'masked_number' => 'string',
'open_status' => 'string',
'is_owned' => 'bool',
'product_category' => '\Swagger\Client\Model\EnumProductCategory',
'product_name' => 'string'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'account_id' => 'ASCIIString',
'display_name' => null,
'nickname' => null,
'masked_number' => 'MaskedAccountString',
'open_status' => null,
'is_owned' => null,
'product_category' => null,
'product_name' => null    ];

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
'display_name' => 'displayName',
'nickname' => 'nickname',
'masked_number' => 'maskedNumber',
'open_status' => 'openStatus',
'is_owned' => 'isOwned',
'product_category' => 'productCategory',
'product_name' => 'productName'    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'account_id' => 'setAccountId',
'display_name' => 'setDisplayName',
'nickname' => 'setNickname',
'masked_number' => 'setMaskedNumber',
'open_status' => 'setOpenStatus',
'is_owned' => 'setIsOwned',
'product_category' => 'setProductCategory',
'product_name' => 'setProductName'    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'account_id' => 'getAccountId',
'display_name' => 'getDisplayName',
'nickname' => 'getNickname',
'masked_number' => 'getMaskedNumber',
'open_status' => 'getOpenStatus',
'is_owned' => 'getIsOwned',
'product_category' => 'getProductCategory',
'product_name' => 'getProductName'    ];

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

    const OPEN_STATUS_OPEN = 'OPEN';
const OPEN_STATUS_CLOSED = 'CLOSED';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getOpenStatusAllowableValues()
    {
        return [
            self::OPEN_STATUS_OPEN,
self::OPEN_STATUS_CLOSED,        ];
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
        $this->container['display_name'] = isset($data['display_name']) ? $data['display_name'] : null;
        $this->container['nickname'] = isset($data['nickname']) ? $data['nickname'] : null;
        $this->container['masked_number'] = isset($data['masked_number']) ? $data['masked_number'] : null;
        $this->container['open_status'] = isset($data['open_status']) ? $data['open_status'] : 'OPEN';
        $this->container['is_owned'] = isset($data['is_owned']) ? $data['is_owned'] : true;
        $this->container['product_category'] = isset($data['product_category']) ? $data['product_category'] : null;
        $this->container['product_name'] = isset($data['product_name']) ? $data['product_name'] : null;
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
        if ($this->container['display_name'] === null) {
            $invalidProperties[] = "'display_name' can't be null";
        }
        if ($this->container['masked_number'] === null) {
            $invalidProperties[] = "'masked_number' can't be null";
        }
        $allowedValues = $this->getOpenStatusAllowableValues();
        if (!in_array($this->container['open_status'], $allowedValues)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'open_status', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['product_category'] === null) {
            $invalidProperties[] = "'product_category' can't be null";
        }
        if ($this->container['product_name'] === null) {
            $invalidProperties[] = "'product_name' can't be null";
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
        if ($this->container['display_name'] === null) {
            return false;
        }
        if ($this->container['masked_number'] === null) {
            return false;
        }
        $allowedValues = $this->getOpenStatusAllowableValues();
        if (!in_array($this->container['open_status'], $allowedValues)) {
            return false;
        }
        if ($this->container['product_category'] === null) {
            return false;
        }
        if ($this->container['product_name'] === null) {
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
     * Gets display_name
     *
     * @return string
     */
    public function getDisplayName()
    {
        return $this->container['display_name'];
    }

    /**
     * Sets display_name
     *
     * @param string $display_name The display name of the account. If a customer provided nickname is available that value should be returned
     *
     * @return $this
     */
    public function setDisplayName($display_name)
    {
        $this->container['display_name'] = $display_name;

        return $this;
    }

    /**
     * Gets nickname
     *
     * @return string
     */
    public function getNickname()
    {
        return $this->container['nickname'];
    }

    /**
     * Sets nickname
     *
     * @param string $nickname A customer supplied nick name for the account
     *
     * @return $this
     */
    public function setNickname($nickname)
    {
        $this->container['nickname'] = $nickname;

        return $this;
    }

    /**
     * Gets masked_number
     *
     * @return string
     */
    public function getMaskedNumber()
    {
        return $this->container['masked_number'];
    }

    /**
     * Sets masked_number
     *
     * @param string $masked_number A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked
     *
     * @return $this
     */
    public function setMaskedNumber($masked_number)
    {
        $this->container['masked_number'] = $masked_number;

        return $this;
    }

    /**
     * Gets open_status
     *
     * @return string
     */
    public function getOpenStatus()
    {
        return $this->container['open_status'];
    }

    /**
     * Sets open_status
     *
     * @param string $open_status Open or closed status for the account.  If not present then OPEN is assumed
     *
     * @return $this
     */
    public function setOpenStatus($open_status)
    {
        $allowedValues = $this->getOpenStatusAllowableValues();
        if (!is_null($open_status) && !in_array($open_status, $allowedValues)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'open_status', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['open_status'] = $open_status;

        return $this;
    }

    /**
     * Gets is_owned
     *
     * @return bool
     */
    public function getIsOwned()
    {
        return $this->container['is_owned'];
    }

    /**
     * Sets is_owned
     *
     * @param bool $is_owned Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then 'true' is assumed
     *
     * @return $this
     */
    public function setIsOwned($is_owned)
    {
        $this->container['is_owned'] = $is_owned;

        return $this;
    }

    /**
     * Gets product_category
     *
     * @return \Swagger\Client\Model\EnumProductCategory
     */
    public function getProductCategory()
    {
        return $this->container['product_category'];
    }

    /**
     * Sets product_category
     *
     * @param \Swagger\Client\Model\EnumProductCategory $product_category product_category
     *
     * @return $this
     */
    public function setProductCategory($product_category)
    {
        $this->container['product_category'] = $product_category;

        return $this;
    }

    /**
     * Gets product_name
     *
     * @return string
     */
    public function getProductName()
    {
        return $this->container['product_name'];
    }

    /**
     * Sets product_name
     *
     * @param string $product_name A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display
     *
     * @return $this
     */
    public function setProductName($product_name)
    {
        $this->container['product_name'] = $product_name;

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