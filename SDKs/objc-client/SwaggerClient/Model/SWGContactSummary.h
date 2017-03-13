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




@protocol SWGContactSummary
@end

@interface SWGContactSummary : SWGObject

/* Integer ID. Read-only. [optional]
 */
@property(nonatomic) NSNumber* _id;
/* Salutation, such as Mr, Mrs, or Dr [optional]
 */
@property(nonatomic) NSString* prefix;
/* First name or given name [optional]
 */
@property(nonatomic) NSString* firstName;
/* Middle or second name [optional]
 */
@property(nonatomic) NSString* middleName;
/* Last name or surname [optional]
 */
@property(nonatomic) NSString* lastName;
/* Suffix, such as 'Jr.', 'Sr.', 'II', or 'III' [optional]
 */
@property(nonatomic) NSString* suffix;
/* Nickname, or a shortened informal version of the contact's name [optional]
 */
@property(nonatomic) NSString* nickname;
/* Name of the contact's company [optional]
 */
@property(nonatomic) NSString* company;

@end
