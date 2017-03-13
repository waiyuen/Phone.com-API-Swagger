<?php
/**
 * MediaApi
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
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

namespace Swagger\Client\Api;

use \Swagger\Client\ApiClient;
use \Swagger\Client\ApiException;
use \Swagger\Client\Configuration;
use \Swagger\Client\ObjectSerializer;

/**
 * MediaApi Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class MediaApi
{
    /**
     * API Client
     *
     * @var \Swagger\Client\ApiClient instance of the ApiClient
     */
    protected $apiClient;

    /**
     * Constructor
     *
     * @param \Swagger\Client\ApiClient|null $apiClient The api client to use
     */
    public function __construct(\Swagger\Client\ApiClient $apiClient = null)
    {
        if ($apiClient === null) {
            $apiClient = new ApiClient();
        }

        $this->apiClient = $apiClient;
    }

    /**
     * Get API client
     *
     * @return \Swagger\Client\ApiClient get the API client
     */
    public function getApiClient()
    {
        return $this->apiClient;
    }

    /**
     * Set the API client
     *
     * @param \Swagger\Client\ApiClient $apiClient set the API client
     *
     * @return MediaApi
     */
    public function setApiClient(\Swagger\Client\ApiClient $apiClient)
    {
        $this->apiClient = $apiClient;
        return $this;
    }

    /**
     * Operation getAccountMedia
     *
     * Show details of an individual media recording (Greeting or Hold Music)
     *
     * @param int $account_id Account ID (required)
     * @param int $recording_id Recording ID (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return \Swagger\Client\Model\MediaFull
     */
    public function getAccountMedia($account_id, $recording_id)
    {
        list($response) = $this->getAccountMediaWithHttpInfo($account_id, $recording_id);
        return $response;
    }

    /**
     * Operation getAccountMediaWithHttpInfo
     *
     * Show details of an individual media recording (Greeting or Hold Music)
     *
     * @param int $account_id Account ID (required)
     * @param int $recording_id Recording ID (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of \Swagger\Client\Model\MediaFull, HTTP status code, HTTP response headers (array of strings)
     */
    public function getAccountMediaWithHttpInfo($account_id, $recording_id)
    {
        // verify the required parameter 'account_id' is set
        if ($account_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $account_id when calling getAccountMedia');
        }
        // verify the required parameter 'recording_id' is set
        if ($recording_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $recording_id when calling getAccountMedia');
        }
        // parse inputs
        $resourcePath = "/accounts/{account_id}/media/{recording_id}";
        $httpBody = '';
        $queryParams = [];
        $headerParams = [];
        $formParams = [];
        $_header_accept = $this->apiClient->selectHeaderAccept(['application/json']);
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(['application/json']);

        // path params
        if ($account_id !== null) {
            $resourcePath = str_replace(
                "{" . "account_id" . "}",
                $this->apiClient->getSerializer()->toPathValue($account_id),
                $resourcePath
            );
        }
        // path params
        if ($recording_id !== null) {
            $resourcePath = str_replace(
                "{" . "recording_id" . "}",
                $this->apiClient->getSerializer()->toPathValue($recording_id),
                $resourcePath
            );
        }
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
        // this endpoint requires API key authentication
        $apiKey = $this->apiClient->getApiKeyWithPrefix('Authorization');
        if (strlen($apiKey) !== 0) {
            $headerParams['Authorization'] = $apiKey;
        }
        // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'GET',
                $queryParams,
                $httpBody,
                $headerParams,
                '\Swagger\Client\Model\MediaFull',
                '/accounts/{account_id}/media/{recording_id}'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\MediaFull', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\MediaFull', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }

    /**
     * Operation listAccountMedia
     *
     * Get a list of media recordings for an account
     *
     * @param int $account_id Account ID (required)
     * @param string[] $filters_id ID filter (optional)
     * @param string[] $filters_name Name filter (optional)
     * @param string $sort_id ID sorting (optional)
     * @param string $sort_name Name sorting (optional)
     * @param int $limit Max results (optional)
     * @param int $offset Results to skip (optional)
     * @param string $fields Field set (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return \Swagger\Client\Model\ListMedia
     */
    public function listAccountMedia($account_id, $filters_id = null, $filters_name = null, $sort_id = null, $sort_name = null, $limit = null, $offset = null, $fields = null)
    {
        list($response) = $this->listAccountMediaWithHttpInfo($account_id, $filters_id, $filters_name, $sort_id, $sort_name, $limit, $offset, $fields);
        return $response;
    }

    /**
     * Operation listAccountMediaWithHttpInfo
     *
     * Get a list of media recordings for an account
     *
     * @param int $account_id Account ID (required)
     * @param string[] $filters_id ID filter (optional)
     * @param string[] $filters_name Name filter (optional)
     * @param string $sort_id ID sorting (optional)
     * @param string $sort_name Name sorting (optional)
     * @param int $limit Max results (optional)
     * @param int $offset Results to skip (optional)
     * @param string $fields Field set (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of \Swagger\Client\Model\ListMedia, HTTP status code, HTTP response headers (array of strings)
     */
    public function listAccountMediaWithHttpInfo($account_id, $filters_id = null, $filters_name = null, $sort_id = null, $sort_name = null, $limit = null, $offset = null, $fields = null)
    {
        // verify the required parameter 'account_id' is set
        if ($account_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $account_id when calling listAccountMedia');
        }
        if (!is_null($sort_id) && !preg_match("/asc|desc/", $sort_id)) {
            throw new \InvalidArgumentException("invalid value for \"sort_id\" when calling MediaApi.listAccountMedia, must conform to the pattern /asc|desc/.");
        }

        if (!is_null($sort_name) && !preg_match("/asc|desc/", $sort_name)) {
            throw new \InvalidArgumentException("invalid value for \"sort_name\" when calling MediaApi.listAccountMedia, must conform to the pattern /asc|desc/.");
        }

        // parse inputs
        $resourcePath = "/accounts/{account_id}/media";
        $httpBody = '';
        $queryParams = [];
        $headerParams = [];
        $formParams = [];
        $_header_accept = $this->apiClient->selectHeaderAccept(['application/json']);
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(['application/json']);

        // query params
        if (is_array($filters_id)) {
            $filters_id = $this->apiClient->getSerializer()->serializeCollection($filters_id, 'multi', true);
        }
        if ($filters_id !== null) {
            $queryParams['filters[id]'] = $this->apiClient->getSerializer()->toQueryValue($filters_id);
        }
        // query params
        if (is_array($filters_name)) {
            $filters_name = $this->apiClient->getSerializer()->serializeCollection($filters_name, 'multi', true);
        }
        if ($filters_name !== null) {
            $queryParams['filters[name]'] = $this->apiClient->getSerializer()->toQueryValue($filters_name);
        }
        // query params
        if ($sort_id !== null) {
            $queryParams['sort[id]'] = $this->apiClient->getSerializer()->toQueryValue($sort_id);
        }
        // query params
        if ($sort_name !== null) {
            $queryParams['sort[name]'] = $this->apiClient->getSerializer()->toQueryValue($sort_name);
        }
        // query params
        if ($limit !== null) {
            $queryParams['limit'] = $this->apiClient->getSerializer()->toQueryValue($limit);
        }
        // query params
        if ($offset !== null) {
            $queryParams['offset'] = $this->apiClient->getSerializer()->toQueryValue($offset);
        }
        // query params
        if ($fields !== null) {
            $queryParams['fields'] = $this->apiClient->getSerializer()->toQueryValue($fields);
        }
        // path params
        if ($account_id !== null) {
            $resourcePath = str_replace(
                "{" . "account_id" . "}",
                $this->apiClient->getSerializer()->toPathValue($account_id),
                $resourcePath
            );
        }
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
        // this endpoint requires API key authentication
        $apiKey = $this->apiClient->getApiKeyWithPrefix('Authorization');
        if (strlen($apiKey) !== 0) {
            $headerParams['Authorization'] = $apiKey;
        }
        // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'GET',
                $queryParams,
                $httpBody,
                $headerParams,
                '\Swagger\Client\Model\ListMedia',
                '/accounts/{account_id}/media'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\ListMedia', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\ListMedia', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }
}
