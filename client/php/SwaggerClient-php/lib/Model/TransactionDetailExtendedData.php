<?php
/**
 * TransactionDetailExtendedData
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
 * TransactionDetailExtendedData Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class TransactionDetailExtendedData implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'TransactionDetail_extendedData';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'payer' => 'string',
'payee' => 'string',
'extension_u_type' => 'string',
'extended_description' => 'string',
'service_id' => 'string'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'payer' => null,
'payee' => null,
'extension_u_type' => null,
'extended_description' => null,
'service_id' => null    ];

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
        'payer' => 'payer',
'payee' => 'payee',
'extension_u_type' => 'extensionUType',
'extended_description' => 'extendedDescription',
'service_id' => 'serviceId'    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'payer' => 'setPayer',
'payee' => 'setPayee',
'extension_u_type' => 'setExtensionUType',
'extended_description' => 'setExtendedDescription',
'service_id' => 'setServiceId'    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'payer' => 'getPayer',
'payee' => 'getPayee',
'extension_u_type' => 'getExtensionUType',
'extended_description' => 'getExtendedDescription',
'service_id' => 'getServiceId'    ];

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

    const EXTENSION_U_TYPE_EXTENDED_DESCRIPTION = 'extendedDescription';
const SERVICE_ID__01 = 'X2P1.01';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getExtensionUTypeAllowableValues()
    {
        return [
            self::EXTENSION_U_TYPE_EXTENDED_DESCRIPTION,        ];
    }
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getServiceIdAllowableValues()
    {
        return [
            self::SERVICE_ID__01,        ];
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
        $this->container['payer'] = isset($data['payer']) ? $data['payer'] : null;
        $this->container['payee'] = isset($data['payee']) ? $data['payee'] : null;
        $this->container['extension_u_type'] = isset($data['extension_u_type']) ? $data['extension_u_type'] : null;
        $this->container['extended_description'] = isset($data['extended_description']) ? $data['extended_description'] : null;
        $this->container['service_id'] = isset($data['service_id']) ? $data['service_id'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        $allowedValues = $this->getExtensionUTypeAllowableValues();
        if (!in_array($this->container['extension_u_type'], $allowedValues)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'extension_u_type', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getServiceIdAllowableValues();
        if (!in_array($this->container['service_id'], $allowedValues)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'service_id', must be one of '%s'",
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

        $allowedValues = $this->getExtensionUTypeAllowableValues();
        if (!in_array($this->container['extension_u_type'], $allowedValues)) {
            return false;
        }
        $allowedValues = $this->getServiceIdAllowableValues();
        if (!in_array($this->container['service_id'], $allowedValues)) {
            return false;
        }
        return true;
    }


    /**
     * Gets payer
     *
     * @return string
     */
    public function getPayer()
    {
        return $this->container['payer'];
    }

    /**
     * Sets payer
     *
     * @param string $payer Name or description of the originating payer.  Mandatory for inbound payment
     *
     * @return $this
     */
    public function setPayer($payer)
    {
        $this->container['payer'] = $payer;

        return $this;
    }

    /**
     * Gets payee
     *
     * @return string
     */
    public function getPayee()
    {
        return $this->container['payee'];
    }

    /**
     * Sets payee
     *
     * @param string $payee Name or description of the target payee. Mandatory for an outbound payment
     *
     * @return $this
     */
    public function setPayee($payee)
    {
        $this->container['payee'] = $payee;

        return $this;
    }

    /**
     * Gets extension_u_type
     *
     * @return string
     */
    public function getExtensionUType()
    {
        return $this->container['extension_u_type'];
    }

    /**
     * Sets extension_u_type
     *
     * @param string $extension_u_type Optional extended data provided specific to transaction originated via NPP
     *
     * @return $this
     */
    public function setExtensionUType($extension_u_type)
    {
        $allowedValues = $this->getExtensionUTypeAllowableValues();
        if (!is_null($extension_u_type) && !in_array($extension_u_type, $allowedValues)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'extension_u_type', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['extension_u_type'] = $extension_u_type;

        return $this;
    }

    /**
     * Gets extended_description
     *
     * @return string
     */
    public function getExtendedDescription()
    {
        return $this->container['extended_description'];
    }

    /**
     * Sets extended_description
     *
     * @param string $extended_description An extended string description. Only present if specified by the extensionUType field
     *
     * @return $this
     */
    public function setExtendedDescription($extended_description)
    {
        $this->container['extended_description'] = $extended_description;

        return $this;
    }

    /**
     * Gets service_id
     *
     * @return string
     */
    public function getServiceId()
    {
        return $this->container['service_id'];
    }

    /**
     * Sets service_id
     *
     * @param string $service_id Identifier of the applicable NPP payment service
     *
     * @return $this
     */
    public function setServiceId($service_id)
    {
        $allowedValues = $this->getServiceIdAllowableValues();
        if (!is_null($service_id) && !in_array($service_id, $allowedValues)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'service_id', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['service_id'] = $service_id;

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