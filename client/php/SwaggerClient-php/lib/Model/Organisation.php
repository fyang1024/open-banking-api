<?php
/**
 * Organisation
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
 * Organisation Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class Organisation implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'Organisation';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'last_update_time' => 'string',
'agent_first_name' => 'string',
'agent_last_name' => 'string',
'agent_role' => 'string',
'business_name' => 'string',
'legal_name' => 'string',
'short_name' => 'string',
'abn' => 'string',
'acn' => 'string',
'is_acnc_registered' => 'bool',
'industry_code' => 'string',
'organisation_type' => 'string',
'registered_country' => 'string',
'establishment_date' => 'string'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'last_update_time' => 'DateTimeString',
'agent_first_name' => null,
'agent_last_name' => null,
'agent_role' => null,
'business_name' => null,
'legal_name' => null,
'short_name' => null,
'abn' => null,
'acn' => null,
'is_acnc_registered' => null,
'industry_code' => null,
'organisation_type' => null,
'registered_country' => null,
'establishment_date' => 'DateString'    ];

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
        'last_update_time' => 'lastUpdateTime',
'agent_first_name' => 'agentFirstName',
'agent_last_name' => 'agentLastName',
'agent_role' => 'agentRole',
'business_name' => 'businessName',
'legal_name' => 'legalName',
'short_name' => 'shortName',
'abn' => 'abn',
'acn' => 'acn',
'is_acnc_registered' => 'isACNCRegistered',
'industry_code' => 'industryCode',
'organisation_type' => 'organisationType',
'registered_country' => 'registeredCountry',
'establishment_date' => 'establishmentDate'    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'last_update_time' => 'setLastUpdateTime',
'agent_first_name' => 'setAgentFirstName',
'agent_last_name' => 'setAgentLastName',
'agent_role' => 'setAgentRole',
'business_name' => 'setBusinessName',
'legal_name' => 'setLegalName',
'short_name' => 'setShortName',
'abn' => 'setAbn',
'acn' => 'setAcn',
'is_acnc_registered' => 'setIsAcncRegistered',
'industry_code' => 'setIndustryCode',
'organisation_type' => 'setOrganisationType',
'registered_country' => 'setRegisteredCountry',
'establishment_date' => 'setEstablishmentDate'    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'last_update_time' => 'getLastUpdateTime',
'agent_first_name' => 'getAgentFirstName',
'agent_last_name' => 'getAgentLastName',
'agent_role' => 'getAgentRole',
'business_name' => 'getBusinessName',
'legal_name' => 'getLegalName',
'short_name' => 'getShortName',
'abn' => 'getAbn',
'acn' => 'getAcn',
'is_acnc_registered' => 'getIsAcncRegistered',
'industry_code' => 'getIndustryCode',
'organisation_type' => 'getOrganisationType',
'registered_country' => 'getRegisteredCountry',
'establishment_date' => 'getEstablishmentDate'    ];

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

    const ORGANISATION_TYPE_SOLE_TRADER = 'SOLE_TRADER';
const ORGANISATION_TYPE_COMPANY = 'COMPANY';
const ORGANISATION_TYPE_PARTNERSHIP = 'PARTNERSHIP';
const ORGANISATION_TYPE_TRUST = 'TRUST';
const ORGANISATION_TYPE_GOVERNMENT_ENTITY = 'GOVERNMENT_ENTITY';
const ORGANISATION_TYPE_OTHER = 'OTHER';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getOrganisationTypeAllowableValues()
    {
        return [
            self::ORGANISATION_TYPE_SOLE_TRADER,
self::ORGANISATION_TYPE_COMPANY,
self::ORGANISATION_TYPE_PARTNERSHIP,
self::ORGANISATION_TYPE_TRUST,
self::ORGANISATION_TYPE_GOVERNMENT_ENTITY,
self::ORGANISATION_TYPE_OTHER,        ];
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
        $this->container['last_update_time'] = isset($data['last_update_time']) ? $data['last_update_time'] : null;
        $this->container['agent_first_name'] = isset($data['agent_first_name']) ? $data['agent_first_name'] : null;
        $this->container['agent_last_name'] = isset($data['agent_last_name']) ? $data['agent_last_name'] : null;
        $this->container['agent_role'] = isset($data['agent_role']) ? $data['agent_role'] : null;
        $this->container['business_name'] = isset($data['business_name']) ? $data['business_name'] : null;
        $this->container['legal_name'] = isset($data['legal_name']) ? $data['legal_name'] : null;
        $this->container['short_name'] = isset($data['short_name']) ? $data['short_name'] : null;
        $this->container['abn'] = isset($data['abn']) ? $data['abn'] : null;
        $this->container['acn'] = isset($data['acn']) ? $data['acn'] : null;
        $this->container['is_acnc_registered'] = isset($data['is_acnc_registered']) ? $data['is_acnc_registered'] : null;
        $this->container['industry_code'] = isset($data['industry_code']) ? $data['industry_code'] : null;
        $this->container['organisation_type'] = isset($data['organisation_type']) ? $data['organisation_type'] : null;
        $this->container['registered_country'] = isset($data['registered_country']) ? $data['registered_country'] : null;
        $this->container['establishment_date'] = isset($data['establishment_date']) ? $data['establishment_date'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['last_update_time'] === null) {
            $invalidProperties[] = "'last_update_time' can't be null";
        }
        if ($this->container['agent_last_name'] === null) {
            $invalidProperties[] = "'agent_last_name' can't be null";
        }
        if ($this->container['agent_role'] === null) {
            $invalidProperties[] = "'agent_role' can't be null";
        }
        if ($this->container['business_name'] === null) {
            $invalidProperties[] = "'business_name' can't be null";
        }
        if ($this->container['organisation_type'] === null) {
            $invalidProperties[] = "'organisation_type' can't be null";
        }
        $allowedValues = $this->getOrganisationTypeAllowableValues();
        if (!in_array($this->container['organisation_type'], $allowedValues)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'organisation_type', must be one of '%s'",
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

        if ($this->container['last_update_time'] === null) {
            return false;
        }
        if ($this->container['agent_last_name'] === null) {
            return false;
        }
        if ($this->container['agent_role'] === null) {
            return false;
        }
        if ($this->container['business_name'] === null) {
            return false;
        }
        if ($this->container['organisation_type'] === null) {
            return false;
        }
        $allowedValues = $this->getOrganisationTypeAllowableValues();
        if (!in_array($this->container['organisation_type'], $allowedValues)) {
            return false;
        }
        return true;
    }


    /**
     * Gets last_update_time
     *
     * @return string
     */
    public function getLastUpdateTime()
    {
        return $this->container['last_update_time'];
    }

    /**
     * Sets last_update_time
     *
     * @param string $last_update_time The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data
     *
     * @return $this
     */
    public function setLastUpdateTime($last_update_time)
    {
        $this->container['last_update_time'] = $last_update_time;

        return $this;
    }

    /**
     * Gets agent_first_name
     *
     * @return string
     */
    public function getAgentFirstName()
    {
        return $this->container['agent_first_name'];
    }

    /**
     * Sets agent_first_name
     *
     * @param string $agent_first_name The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field
     *
     * @return $this
     */
    public function setAgentFirstName($agent_first_name)
    {
        $this->container['agent_first_name'] = $agent_first_name;

        return $this;
    }

    /**
     * Gets agent_last_name
     *
     * @return string
     */
    public function getAgentLastName()
    {
        return $this->container['agent_last_name'];
    }

    /**
     * Sets agent_last_name
     *
     * @param string $agent_last_name The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field
     *
     * @return $this
     */
    public function setAgentLastName($agent_last_name)
    {
        $this->container['agent_last_name'] = $agent_last_name;

        return $this;
    }

    /**
     * Gets agent_role
     *
     * @return string
     */
    public function getAgentRole()
    {
        return $this->container['agent_role'];
    }

    /**
     * Sets agent_role
     *
     * @param string $agent_role The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display.  Default to “Unspecified” if the role is not known
     *
     * @return $this
     */
    public function setAgentRole($agent_role)
    {
        $this->container['agent_role'] = $agent_role;

        return $this;
    }

    /**
     * Gets business_name
     *
     * @return string
     */
    public function getBusinessName()
    {
        return $this->container['business_name'];
    }

    /**
     * Sets business_name
     *
     * @param string $business_name Name of the organisation
     *
     * @return $this
     */
    public function setBusinessName($business_name)
    {
        $this->container['business_name'] = $business_name;

        return $this;
    }

    /**
     * Gets legal_name
     *
     * @return string
     */
    public function getLegalName()
    {
        return $this->container['legal_name'];
    }

    /**
     * Sets legal_name
     *
     * @param string $legal_name Legal name, if different to the business name
     *
     * @return $this
     */
    public function setLegalName($legal_name)
    {
        $this->container['legal_name'] = $legal_name;

        return $this;
    }

    /**
     * Gets short_name
     *
     * @return string
     */
    public function getShortName()
    {
        return $this->container['short_name'];
    }

    /**
     * Sets short_name
     *
     * @param string $short_name Short name used for communication, if  different to the business name
     *
     * @return $this
     */
    public function setShortName($short_name)
    {
        $this->container['short_name'] = $short_name;

        return $this;
    }

    /**
     * Gets abn
     *
     * @return string
     */
    public function getAbn()
    {
        return $this->container['abn'];
    }

    /**
     * Sets abn
     *
     * @param string $abn Australian Business Number for the organisation
     *
     * @return $this
     */
    public function setAbn($abn)
    {
        $this->container['abn'] = $abn;

        return $this;
    }

    /**
     * Gets acn
     *
     * @return string
     */
    public function getAcn()
    {
        return $this->container['acn'];
    }

    /**
     * Sets acn
     *
     * @param string $acn Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type
     *
     * @return $this
     */
    public function setAcn($acn)
    {
        $this->container['acn'] = $acn;

        return $this;
    }

    /**
     * Gets is_acnc_registered
     *
     * @return bool
     */
    public function getIsAcncRegistered()
    {
        return $this->container['is_acnc_registered'];
    }

    /**
     * Sets is_acnc_registered
     *
     * @param bool $is_acnc_registered True if registered with the ACNC.  False if not. Absent or null if not confirmed.
     *
     * @return $this
     */
    public function setIsAcncRegistered($is_acnc_registered)
    {
        $this->container['is_acnc_registered'] = $is_acnc_registered;

        return $this;
    }

    /**
     * Gets industry_code
     *
     * @return string
     */
    public function getIndustryCode()
    {
        return $this->container['industry_code'];
    }

    /**
     * Sets industry_code
     *
     * @param string $industry_code [ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the organisation.
     *
     * @return $this
     */
    public function setIndustryCode($industry_code)
    {
        $this->container['industry_code'] = $industry_code;

        return $this;
    }

    /**
     * Gets organisation_type
     *
     * @return string
     */
    public function getOrganisationType()
    {
        return $this->container['organisation_type'];
    }

    /**
     * Sets organisation_type
     *
     * @param string $organisation_type Legal organisation type
     *
     * @return $this
     */
    public function setOrganisationType($organisation_type)
    {
        $allowedValues = $this->getOrganisationTypeAllowableValues();
        if (!in_array($organisation_type, $allowedValues)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'organisation_type', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['organisation_type'] = $organisation_type;

        return $this;
    }

    /**
     * Gets registered_country
     *
     * @return string
     */
    public function getRegisteredCountry()
    {
        return $this->container['registered_country'];
    }

    /**
     * Sets registered_country
     *
     * @param string $registered_country Enumeration with values from ISO 3166 Alpha-3 country codes.  Assumed to be AUS if absent
     *
     * @return $this
     */
    public function setRegisteredCountry($registered_country)
    {
        $this->container['registered_country'] = $registered_country;

        return $this;
    }

    /**
     * Gets establishment_date
     *
     * @return string
     */
    public function getEstablishmentDate()
    {
        return $this->container['establishment_date'];
    }

    /**
     * Sets establishment_date
     *
     * @param string $establishment_date The date the organisation described was established
     *
     * @return $this
     */
    public function setEstablishmentDate($establishment_date)
    {
        $this->container['establishment_date'] = $establishment_date;

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
