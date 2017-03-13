<?php
/**
 * ReplacePhoneNumberParams
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
 * ReplacePhoneNumberParams Class Doc Comment
 *
 * @category    Class
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class ReplacePhoneNumberParams implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'ReplacePhoneNumberParams';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'route' => 'object',
        'name' => 'string',
        'block_incoming' => 'bool',
        'block_anonymous' => 'bool',
        'caller_id_name' => 'string',
        'caller_id_type' => 'string',
        'sms_forwarding_type' => 'string',
        'sms_forwarding_application' => 'object',
        'sms_forwarding_extension' => 'object',
        'pool_item' => 'object',
        'call_notifications_emails' => 'string[]',
        'call_notifications_sms' => 'string'
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
        'route' => 'route',
        'name' => 'name',
        'block_incoming' => 'block_incoming',
        'block_anonymous' => 'block_anonymous',
        'caller_id_name' => 'caller_id[name]',
        'caller_id_type' => 'caller_id[type]',
        'sms_forwarding_type' => 'sms_forwarding[type]',
        'sms_forwarding_application' => 'sms_forwarding[application]',
        'sms_forwarding_extension' => 'sms_forwarding[extension]',
        'pool_item' => 'pool_item',
        'call_notifications_emails' => 'call_notifications[emails]',
        'call_notifications_sms' => 'call_notifications[sms]'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'route' => 'setRoute',
        'name' => 'setName',
        'block_incoming' => 'setBlockIncoming',
        'block_anonymous' => 'setBlockAnonymous',
        'caller_id_name' => 'setCallerIdName',
        'caller_id_type' => 'setCallerIdType',
        'sms_forwarding_type' => 'setSmsForwardingType',
        'sms_forwarding_application' => 'setSmsForwardingApplication',
        'sms_forwarding_extension' => 'setSmsForwardingExtension',
        'pool_item' => 'setPoolItem',
        'call_notifications_emails' => 'setCallNotificationsEmails',
        'call_notifications_sms' => 'setCallNotificationsSms'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'route' => 'getRoute',
        'name' => 'getName',
        'block_incoming' => 'getBlockIncoming',
        'block_anonymous' => 'getBlockAnonymous',
        'caller_id_name' => 'getCallerIdName',
        'caller_id_type' => 'getCallerIdType',
        'sms_forwarding_type' => 'getSmsForwardingType',
        'sms_forwarding_application' => 'getSmsForwardingApplication',
        'sms_forwarding_extension' => 'getSmsForwardingExtension',
        'pool_item' => 'getPoolItem',
        'call_notifications_emails' => 'getCallNotificationsEmails',
        'call_notifications_sms' => 'getCallNotificationsSms'
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
        $this->container['route'] = isset($data['route']) ? $data['route'] : null;
        $this->container['name'] = isset($data['name']) ? $data['name'] : null;
        $this->container['block_incoming'] = isset($data['block_incoming']) ? $data['block_incoming'] : null;
        $this->container['block_anonymous'] = isset($data['block_anonymous']) ? $data['block_anonymous'] : null;
        $this->container['caller_id_name'] = isset($data['caller_id_name']) ? $data['caller_id_name'] : null;
        $this->container['caller_id_type'] = isset($data['caller_id_type']) ? $data['caller_id_type'] : null;
        $this->container['sms_forwarding_type'] = isset($data['sms_forwarding_type']) ? $data['sms_forwarding_type'] : null;
        $this->container['sms_forwarding_application'] = isset($data['sms_forwarding_application']) ? $data['sms_forwarding_application'] : null;
        $this->container['sms_forwarding_extension'] = isset($data['sms_forwarding_extension']) ? $data['sms_forwarding_extension'] : null;
        $this->container['pool_item'] = isset($data['pool_item']) ? $data['pool_item'] : null;
        $this->container['call_notifications_emails'] = isset($data['call_notifications_emails']) ? $data['call_notifications_emails'] : null;
        $this->container['call_notifications_sms'] = isset($data['call_notifications_sms']) ? $data['call_notifications_sms'] : null;
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
     * Gets route
     * @return object
     */
    public function getRoute()
    {
        return $this->container['route'];
    }

    /**
     * Sets route
     * @param object $route Route lookup object
     * @return $this
     */
    public function setRoute($route)
    {
        $this->container['route'] = $route;

        return $this;
    }

    /**
     * Gets name
     * @return string
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     * @param string $name Phone Name
     * @return $this
     */
    public function setName($name)
    {
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets block_incoming
     * @return bool
     */
    public function getBlockIncoming()
    {
        return $this->container['block_incoming'];
    }

    /**
     * Sets block_incoming
     * @param bool $block_incoming Block incoming calls
     * @return $this
     */
    public function setBlockIncoming($block_incoming)
    {
        $this->container['block_incoming'] = $block_incoming;

        return $this;
    }

    /**
     * Gets block_anonymous
     * @return bool
     */
    public function getBlockAnonymous()
    {
        return $this->container['block_anonymous'];
    }

    /**
     * Sets block_anonymous
     * @param bool $block_anonymous Block anonymous calls
     * @return $this
     */
    public function setBlockAnonymous($block_anonymous)
    {
        $this->container['block_anonymous'] = $block_anonymous;

        return $this;
    }

    /**
     * Gets caller_id_name
     * @return string
     */
    public function getCallerIdName()
    {
        return $this->container['caller_id_name'];
    }

    /**
     * Sets caller_id_name
     * @param string $caller_id_name Caller ID name
     * @return $this
     */
    public function setCallerIdName($caller_id_name)
    {
        $this->container['caller_id_name'] = $caller_id_name;

        return $this;
    }

    /**
     * Gets caller_id_type
     * @return string
     */
    public function getCallerIdType()
    {
        return $this->container['caller_id_type'];
    }

    /**
     * Sets caller_id_type
     * @param string $caller_id_type Caller ID type
     * @return $this
     */
    public function setCallerIdType($caller_id_type)
    {
        $this->container['caller_id_type'] = $caller_id_type;

        return $this;
    }

    /**
     * Gets sms_forwarding_type
     * @return string
     */
    public function getSmsForwardingType()
    {
        return $this->container['sms_forwarding_type'];
    }

    /**
     * Sets sms_forwarding_type
     * @param string $sms_forwarding_type 'application' or 'extension'
     * @return $this
     */
    public function setSmsForwardingType($sms_forwarding_type)
    {
        $this->container['sms_forwarding_type'] = $sms_forwarding_type;

        return $this;
    }

    /**
     * Gets sms_forwarding_application
     * @return object
     */
    public function getSmsForwardingApplication()
    {
        return $this->container['sms_forwarding_application'];
    }

    /**
     * Sets sms_forwarding_application
     * @param object $sms_forwarding_application Application lookup object
     * @return $this
     */
    public function setSmsForwardingApplication($sms_forwarding_application)
    {
        $this->container['sms_forwarding_application'] = $sms_forwarding_application;

        return $this;
    }

    /**
     * Gets sms_forwarding_extension
     * @return object
     */
    public function getSmsForwardingExtension()
    {
        return $this->container['sms_forwarding_extension'];
    }

    /**
     * Sets sms_forwarding_extension
     * @param object $sms_forwarding_extension Extension lookup object
     * @return $this
     */
    public function setSmsForwardingExtension($sms_forwarding_extension)
    {
        $this->container['sms_forwarding_extension'] = $sms_forwarding_extension;

        return $this;
    }

    /**
     * Gets pool_item
     * @return object
     */
    public function getPoolItem()
    {
        return $this->container['pool_item'];
    }

    /**
     * Sets pool_item
     * @param object $pool_item Pool lookup object
     * @return $this
     */
    public function setPoolItem($pool_item)
    {
        $this->container['pool_item'] = $pool_item;

        return $this;
    }

    /**
     * Gets call_notifications_emails
     * @return string[]
     */
    public function getCallNotificationsEmails()
    {
        return $this->container['call_notifications_emails'];
    }

    /**
     * Sets call_notifications_emails
     * @param string[] $call_notifications_emails Call notifications for emails. Can be a single email or an array of emails
     * @return $this
     */
    public function setCallNotificationsEmails($call_notifications_emails)
    {
        $this->container['call_notifications_emails'] = $call_notifications_emails;

        return $this;
    }

    /**
     * Gets call_notifications_sms
     * @return string
     */
    public function getCallNotificationsSms()
    {
        return $this->container['call_notifications_sms'];
    }

    /**
     * Sets call_notifications_sms
     * @param string $call_notifications_sms Call notification for SMS
     * @return $this
     */
    public function setCallNotificationsSms($call_notifications_sms)
    {
        $this->container['call_notifications_sms'] = $call_notifications_sms;

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


