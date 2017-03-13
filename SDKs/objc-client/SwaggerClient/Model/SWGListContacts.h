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


#import "SWGContactFull.h"
#import "SWGFilterIdGroupIdUpdatedAtArray.h"
#import "SWGSortIdUpdatedAt.h"


@protocol SWGListContacts
@end

@interface SWGListContacts : SWGObject


@property(nonatomic) SWGFilterIdGroupIdUpdatedAtArray* filters;

@property(nonatomic) SWGSortIdUpdatedAt* sort;

@property(nonatomic) NSNumber* total;

@property(nonatomic) NSNumber* offset;

@property(nonatomic) NSNumber* limit;

@property(nonatomic) NSArray<SWGContactFull>* items;

@end
