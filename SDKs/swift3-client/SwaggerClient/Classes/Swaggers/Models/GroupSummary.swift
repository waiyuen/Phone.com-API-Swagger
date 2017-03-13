//
// GroupSummary.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** The Group Summary Object is used to briefly represent a contact group. It can occur in several places throughout this API. Here are the properties: */
open class GroupSummary: JSONEncodable {
    /** Integer ID. Read-only. */
    public var id: Int32?
    /** Name */
    public var name: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["id"] = self.id?.encodeToJSON()
        nillableDictionary["name"] = self.name
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
