#import <Foundation/Foundation.h>
#import "SWGObject.h"

/**
* Phone.com API
* This is a Phone.com api Swagger definition
*
* OpenAPI spec version: 1.0.0
* Contact: apisupport@phone.com
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/


#import "SWGDeviceMembership.h"
#import "SWGMediaSummary.h"
#import "SWGNotification.h"
#import "SWGRouteSummary.h"
#import "SWGVoicemail.h"


@protocol SWGExtensionFull
@end

@interface SWGExtensionFull : SWGObject

/* ID of the extension. This is the internal Phone.com ID, not the extension number callers may dial. [optional]
 */
@property(nonatomic) NSNumber* _id;
/* User-supplied name for the extension. On POST, leaving this empty will result in an auto-generated value. On PUT, this field is required. [optional]
 */
@property(nonatomic) NSString* name;
/* Extension number that callers may dial. On POST, leaving this empty will result in an auto-generated value. On PUT, this field is required. [optional]
 */
@property(nonatomic) NSNumber* extension;
/* Full name of the individual or department to which this extension is assigned [optional]
 */
@property(nonatomic) NSString* fullName;
/* Can be \"limited\" or \"unlimited\". In most cases, changing this will affect your monthly bill. Please see our Control Panel or contact Customer Service for pricing. [optional]
 */
@property(nonatomic) NSString* usageType;

@property(nonatomic) SWGDeviceMembership* deviceMembership;
/* Time zone. Can be in any commonly recognized format, such as \"America/Los_Angeles\". [optional]
 */
@property(nonatomic) NSString* timezone;
/* Greeting that communicates the extension's name. Output is a Greeting Summary Object. Input must be a Greeting Lookup Object. [optional]
 */
@property(nonatomic) SWGMediaSummary* nameGreeting;
/* Whether this extension should be included in the dial-by-name directory for this account. Boolean. [optional]
 */
@property(nonatomic) NSNumber* includeInDirectory;
/* Phone number to use as Caller ID for outgoing calls. Must be a phone number belonging to this account, or one of any additional authorized phone numbers. You can use our List Caller Ids service to see a current list. To unassign, you may set this to \"private\", NULL, or an empty string. [optional]
 */
@property(nonatomic) NSString* callerId;
/* For outbound calls, this is the North American area code that this extension is calling from. [optional]
 */
@property(nonatomic) NSString* localAreaCode;
/* Whether Call Waiting is enabled. Boolean. Default is TRUE. [optional]
 */
@property(nonatomic) NSNumber* enableCallWaiting;
/* Whether outgoing calls are enabled. Boolean. Default is TRUE. [optional]
 */
@property(nonatomic) NSNumber* enableOutboundCalls;

@property(nonatomic) SWGVoicemail* voicemail;
/* Call Notifications Object. See below for details. [optional]
 */
@property(nonatomic) SWGNotification* callNotifications;
/* Route which will handle incoming voice and fax calls. Only valid on PUT requests, not POST. Output is a Route Summary Object if the route is named, otherwise the Full Route Object will be shown. Input must be a Route Lookup Object pointing to a named route. Route must belong to this extension already. [optional]
 */
@property(nonatomic) SWGRouteSummary* route;

@end
