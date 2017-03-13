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




@protocol SWGAddressListContacts
@end

@interface SWGAddressListContacts : SWGObject

/* Address type, one of: home or business. Default is home. [optional]
 */
@property(nonatomic) NSString* type;
/* House number and street name, including apartment, suite, etc. [optional]
 */
@property(nonatomic) NSString* street;
/* City [optional]
 */
@property(nonatomic) NSString* city;
/* State or province [optional]
 */
@property(nonatomic) NSString* state;
/* Zip code or postal code [optional]
 */
@property(nonatomic) NSString* zip;
/* Country name [optional]
 */
@property(nonatomic) NSString* country;

@end
