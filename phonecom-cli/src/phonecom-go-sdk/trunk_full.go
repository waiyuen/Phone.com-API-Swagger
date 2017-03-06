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

// The Full Trunk Object is identical to the Trunk Summary Object, along with the following:
type TrunkFull struct {

	// Integer Trunk ID. Read-only.
	Id int32 `json:"id"`

	// Name. Required.
	Name string `json:"name"`

	// Fully-qualified SIP URI. Required.
	Uri string `json:"uri"`

	// Max concurrent calls. Default is 10.
	MaxConcurrentCalls int32 `json:"max_concurrent_calls"`

	// Max minutes per month. Default is 750.
	MaxMinutesPerMonth int32 `json:"max_minutes_per_month"`

	// Greeting. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE.
	Greeting MediaSummary `json:"greeting"`

	// Error Message. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE.
	ErrorMessage MediaSummary `json:"error_message"`

	// Custom audio codec configuration, if any is needed. If provided, must be a simple array containing the prioritized list of desired codecs. Supported codecs are: g711u 64k, g711u 56k, g711a 64k, g711a 56k, g7231, g728, g729, g729A, g729B, g729AB, gms full, rfc2833, t38, ilbc, h263, g722, g722_1, g729D, g729E, amr, amr_wb, efr, evrc, h264, mpeg4, red, cng, SIP Info to 2833
	Codecs []string `json:"codecs"`
}
