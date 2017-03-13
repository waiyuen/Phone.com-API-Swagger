<?php
/**
 * CreateCallParams
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swaagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Phone.com API
 *
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * CreateCallParams Class Doc Comment
 *
 * @category    Class
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class CreateCallParams implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'CreateCallParams';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'caller_phone_number' => 'string',
        'caller_extension' => 'int',
        'caller_caller_id' => 'string',
        'caller_private' => 'bool',
        'callee_phone_number' => 'string',
        'callee_extension' => 'int',
        'callee_caller_id' => 'string',
        'callee_private' => 'bool'
    ];

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = [
        'caller_phone_number' => 'caller_phone_number',
        'caller_extension' => 'caller_extension',
        'caller_caller_id' => 'caller_caller_id',
        'caller_private' => 'caller_private',
        'callee_phone_number' => 'callee_phone_number',
        'callee_extension' => 'callee_extension',
        'callee_caller_id' => 'callee_caller_id',
        'callee_private' => 'callee_private'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'caller_phone_number' => 'setCallerPhoneNumber',
        'caller_extension' => 'setCallerExtension',
        'caller_caller_id' => 'setCallerCallerId',
        'caller_private' => 'setCallerPrivate',
        'callee_phone_number' => 'setCalleePhoneNumber',
        'callee_extension' => 'setCalleeExtension',
        'callee_caller_id' => 'setCalleeCallerId',
        'callee_private' => 'setCalleePrivate'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'caller_phone_number' => 'getCallerPhoneNumber',
        'caller_extension' => 'getCallerExtension',
        'caller_caller_id' => 'getCallerCallerId',
        'caller_private' => 'getCallerPrivate',
        'callee_phone_number' => 'getCalleePhoneNumber',
        'callee_extension' => 'getCalleeExtension',
        'callee_caller_id' => 'getCalleeCallerId',
        'callee_private' => 'getCalleePrivate'
    ];

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    public static function setters()
    {
        return self::$setters;
    }

    public static function getters()
    {
        return self::$getters;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['caller_phone_number'] = isset($data['caller_phone_number']) ? $data['caller_phone_number'] : null;
        $this->container['caller_extension'] = isset($data['caller_extension']) ? $data['caller_extension'] : null;
        $this->container['caller_caller_id'] = isset($data['caller_caller_id']) ? $data['caller_caller_id'] : null;
        $this->container['caller_private'] = isset($data['caller_private']) ? $data['caller_private'] : null;
        $this->container['callee_phone_number'] = isset($data['callee_phone_number']) ? $data['callee_phone_number'] : null;
        $this->container['callee_extension'] = isset($data['callee_extension']) ? $data['callee_extension'] : null;
        $this->container['callee_caller_id'] = isset($data['callee_caller_id']) ? $data['callee_caller_id'] : null;
        $this->container['callee_private'] = isset($data['callee_private']) ? $data['callee_private'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];

        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {

        return true;
    }


    /**
     * Gets caller_phone_number
     * @return string
     */
    public function getCallerPhoneNumber()
    {
        return $this->container['caller_phone_number'];
    }

    /**
     * Sets caller_phone_number
     * @param string $caller_phone_number Caller phone number in E.164 format
     * @return $this
     */
    public function setCallerPhoneNumber($caller_phone_number)
    {
        $this->container['caller_phone_number'] = $caller_phone_number;

        return $this;
    }

    /**
     * Gets caller_extension
     * @return int
     */
    public function getCallerExtension()
    {
        return $this->container['caller_extension'];
    }

    /**
     * Sets caller_extension
     * @param int $caller_extension Caller Extension ID
     * @return $this
     */
    public function setCallerExtension($caller_extension)
    {
        $this->container['caller_extension'] = $caller_extension;

        return $this;
    }

    /**
     * Gets caller_caller_id
     * @return string
     */
    public function getCallerCallerId()
    {
        return $this->container['caller_caller_id'];
    }

    /**
     * Sets caller_caller_id
     * @param string $caller_caller_id Caller caller ID in E.164 format
     * @return $this
     */
    public function setCallerCallerId($caller_caller_id)
    {
        $this->container['caller_caller_id'] = $caller_caller_id;

        return $this;
    }

    /**
     * Gets caller_private
     * @return bool
     */
    public function getCallerPrivate()
    {
        return $this->container['caller_private'];
    }

    /**
     * Sets caller_private
     * @param bool $caller_private Flag to set caller ID to private
     * @return $this
     */
    public function setCallerPrivate($caller_private)
    {
        $this->container['caller_private'] = $caller_private;

        return $this;
    }

    /**
     * Gets callee_phone_number
     * @return string
     */
    public function getCalleePhoneNumber()
    {
        return $this->container['callee_phone_number'];
    }

    /**
     * Sets callee_phone_number
     * @param string $callee_phone_number Callee phone number in E.164 format
     * @return $this
     */
    public function setCalleePhoneNumber($callee_phone_number)
    {
        $this->container['callee_phone_number'] = $callee_phone_number;

        return $this;
    }

    /**
     * Gets callee_extension
     * @return int
     */
    public function getCalleeExtension()
    {
        return $this->container['callee_extension'];
    }

    /**
     * Sets callee_extension
     * @param int $callee_extension Callee Extension ID
     * @return $this
     */
    public function setCalleeExtension($callee_extension)
    {
        $this->container['callee_extension'] = $callee_extension;

        return $this;
    }

    /**
     * Gets callee_caller_id
     * @return string
     */
    public function getCalleeCallerId()
    {
        return $this->container['callee_caller_id'];
    }

    /**
     * Sets callee_caller_id
     * @param string $callee_caller_id Callee caller ID in E.164 format
     * @return $this
     */
    public function setCalleeCallerId($callee_caller_id)
    {
        $this->container['callee_caller_id'] = $callee_caller_id;

        return $this;
    }

    /**
     * Gets callee_private
     * @return bool
     */
    public function getCalleePrivate()
    {
        return $this->container['callee_private'];
    }

    /**
     * Sets callee_private
     * @param bool $callee_private Flag to set callee ID to private
     * @return $this
     */
    public function setCalleePrivate($callee_private)
    {
        $this->container['callee_private'] = $callee_private;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
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
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}


