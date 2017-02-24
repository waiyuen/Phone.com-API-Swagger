/* 
 * Phone.com API
 *
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package swagger

// The Queue Summary Object is used to briefly represent a calling queue. It can be seen in several places throughout this API. Here are the properties:
type QueueSummary struct {

	// Integer ID. Read-only.
	Id int32 `json:"id,omitempty"`

	// Name. Required.
	Name string `json:"name,omitempty"`
}
