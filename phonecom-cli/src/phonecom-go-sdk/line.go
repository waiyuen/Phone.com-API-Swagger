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

type Line struct {

	// Line number
	Line int32 `json:"line,omitempty"`

	// Extensions object that this line number is mapped to.
	Extension ExtensionSummary `json:"extension,omitempty"`
}
