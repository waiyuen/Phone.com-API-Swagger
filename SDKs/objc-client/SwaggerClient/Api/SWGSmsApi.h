#import <Foundation/Foundation.h>
#import "SWGCreateSmsParams.h"
#import "SWGListSms.h"
#import "SWGSmsFull.h"
#import "SWGApi.h"

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



@interface SWGSmsApi: NSObject <SWGApi>

extern NSString* kSWGSmsApiErrorDomain;
extern NSInteger kSWGSmsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Send a SMS to one or a group of recipients
/// For more on the input fields, see Intro to SMS.
///
/// @param accountId Account ID
/// @param data SMS data
/// 
///  code:201 message:"Created",
///  code:401 message:"Unauthorized access",
///  code:403 message:"Forbidden",
///  code:422 message:"Invalid Data",
///  code:429 message:"Rate Limit Reached"
///
/// @return SWGSmsFull*
-(NSURLSessionTask*) createAccountSmsWithAccountId: (NSNumber*) accountId
    data: (SWGCreateSmsParams*) data
    completionHandler: (void (^)(SWGSmsFull* output, NSError* error)) handler;


/// Show details of an individual SMS
/// This service shows the details of an individual sms. See Intro to SMS for more info on the properties.
///
/// @param accountId Account ID
/// @param smsId SMS ID
/// 
///  code:200 message:"",
///  code:401 message:"Unauthorized access",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return SWGSmsFull*
-(NSURLSessionTask*) getAccountSmsWithAccountId: (NSNumber*) accountId
    smsId: (NSString*) smsId
    completionHandler: (void (^)(SWGSmsFull* output, NSError* error)) handler;


/// Get a list of SMS messages for an account
/// See Intro to SMS for more info on the properties.
///
/// @param accountId Account ID
/// @param filtersId ID filter (optional)
/// @param filtersDirection Direction filter (optional)
/// @param filtersFrom Caller ID filter (optional)
/// @param sortId ID sorting (optional)
/// @param sortCreatedAt Sort by created time of message (optional)
/// @param limit Max results (optional)
/// @param offset Results to skip (optional)
/// @param fields Field set (optional)
/// 
///  code:200 message:"OK",
///  code:401 message:"Unauthorized access",
///  code:403 message:"Forbidden"
///
/// @return SWGListSms*
-(NSURLSessionTask*) listAccountSmsWithAccountId: (NSNumber*) accountId
    filtersId: (NSArray<NSString*>*) filtersId
    filtersDirection: (NSString*) filtersDirection
    filtersFrom: (NSString*) filtersFrom
    sortId: (NSString*) sortId
    sortCreatedAt: (NSString*) sortCreatedAt
    limit: (NSNumber*) limit
    offset: (NSNumber*) offset
    fields: (NSString*) fields
    completionHandler: (void (^)(SWGListSms* output, NSError* error)) handler;



@end
