//
// CalllogsAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



open class CalllogsAPI: APIBase {
    /**
     Get a list of call details associated with your account
     
     - parameter accountId: (path) Account ID 
     - parameter filtersId: (query) ID filter (optional)
     - parameter filtersStartTime: (query) Call start time filter (optional)
     - parameter filtersCreatedAt: (query) Call log creation time filter (optional)
     - parameter filtersDirection: (query) Call direction filter: in or out (optional)
     - parameter filtersCalledNumber: (query) Called number (optional)
     - parameter filtersType: (query) Call type, such as &#39;call&#39;, &#39;fax&#39;, &#39;audiogram&#39; (optional)
     - parameter filtersExtension: (query) Extension filter (optional)
     - parameter sortId: (query) ID sorting (optional)
     - parameter sortStartTime: (query) Sorting by call start time: asc or desc (optional)
     - parameter sortCreatedAt: (query) Sorting by call log creation time: asc or desc (optional)
     - parameter limit: (query) Max results (optional)
     - parameter offset: (query) Results to skip (optional)
     - parameter fields: (query) Field set (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func listAccountCallLogs(accountId: Int32, filtersId: [String]? = nil, filtersStartTime: [String]? = nil, filtersCreatedAt: String? = nil, filtersDirection: String? = nil, filtersCalledNumber: String? = nil, filtersType: String? = nil, filtersExtension: [String]? = nil, sortId: String? = nil, sortStartTime: String? = nil, sortCreatedAt: String? = nil, limit: Int32? = nil, offset: Int32? = nil, fields: String? = nil, completion: @escaping ((_ data: ListCallLogs?,_ error: Error?) -> Void)) {
        listAccountCallLogsWithRequestBuilder(accountId: accountId, filtersId: filtersId, filtersStartTime: filtersStartTime, filtersCreatedAt: filtersCreatedAt, filtersDirection: filtersDirection, filtersCalledNumber: filtersCalledNumber, filtersType: filtersType, filtersExtension: filtersExtension, sortId: sortId, sortStartTime: sortStartTime, sortCreatedAt: sortCreatedAt, limit: limit, offset: offset, fields: fields).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Get a list of call details associated with your account
     - GET /accounts/{accountId}/call-logs
     - See Call Logs for more detail.
     - API Key:
       - type: apiKey Authorization 
       - name: apiKey
     - examples: [{contentType=application/json, example={
  "total" : 123,
  "offset" : 123,
  "limit" : 123,
  "filters" : {
    "start_time" : "aeiou",
    "created_at" : "aeiou",
    "id" : "aeiou",
    "called_number" : "aeiou",
    "type" : "aeiou",
    "direction" : "aeiou"
  },
  "sort" : {
    "start_time" : "aeiou",
    "created_at" : "aeiou",
    "id" : "aeiou"
  },
  "items" : [ {
    "call_number" : "aeiou",
    "call_recording" : "aeiou",
    "extension" : {
      "extension" : 123,
      "name" : "aeiou",
      "id" : 123
    },
    "caller_cnam" : "aeiou",
    "created_at" : "aeiou",
    "type" : "aeiou",
    "uuid" : "aeiou",
    "call_duration" : 123,
    "final_action" : "aeiou",
    "start_time" : "aeiou",
    "is_monitored" : "aeiou",
    "caller_id" : "aeiou",
    "details" : [ {
      "start_time" : 123,
      "voip_phone_id" : 123,
      "type" : "aeiou",
      "id_value" : 123,
      "voip_id" : 123
    } ],
    "id" : "aeiou",
    "called_number" : "aeiou",
    "direction" : "aeiou"
  } ]
}}]
     
     - parameter accountId: (path) Account ID 
     - parameter filtersId: (query) ID filter (optional)
     - parameter filtersStartTime: (query) Call start time filter (optional)
     - parameter filtersCreatedAt: (query) Call log creation time filter (optional)
     - parameter filtersDirection: (query) Call direction filter: in or out (optional)
     - parameter filtersCalledNumber: (query) Called number (optional)
     - parameter filtersType: (query) Call type, such as &#39;call&#39;, &#39;fax&#39;, &#39;audiogram&#39; (optional)
     - parameter filtersExtension: (query) Extension filter (optional)
     - parameter sortId: (query) ID sorting (optional)
     - parameter sortStartTime: (query) Sorting by call start time: asc or desc (optional)
     - parameter sortCreatedAt: (query) Sorting by call log creation time: asc or desc (optional)
     - parameter limit: (query) Max results (optional)
     - parameter offset: (query) Results to skip (optional)
     - parameter fields: (query) Field set (optional)

     - returns: RequestBuilder<ListCallLogs> 
     */
    open class func listAccountCallLogsWithRequestBuilder(accountId: Int32, filtersId: [String]? = nil, filtersStartTime: [String]? = nil, filtersCreatedAt: String? = nil, filtersDirection: String? = nil, filtersCalledNumber: String? = nil, filtersType: String? = nil, filtersExtension: [String]? = nil, sortId: String? = nil, sortStartTime: String? = nil, sortCreatedAt: String? = nil, limit: Int32? = nil, offset: Int32? = nil, fields: String? = nil) -> RequestBuilder<ListCallLogs> {
        var path = "/accounts/{accountId}/call-logs"
        path = path.replacingOccurrences(of: "{accountId}", with: "\(accountId)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
            "filters[id]": filtersId, 
            "filters[start_time]": filtersStartTime, 
            "filters[created_at]": filtersCreatedAt, 
            "filters[direction]": filtersDirection, 
            "filters[called_number]": filtersCalledNumber, 
            "filters[type]": filtersType, 
            "filters[extension]": filtersExtension, 
            "sort[id]": sortId, 
            "sort[start_time]": sortStartTime, 
            "sort[created_at]": sortCreatedAt, 
            "limit": limit?.encodeToJSON(), 
            "offset": offset?.encodeToJSON(), 
            "fields": fields
        ])
        

        let requestBuilder: RequestBuilder<ListCallLogs>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
