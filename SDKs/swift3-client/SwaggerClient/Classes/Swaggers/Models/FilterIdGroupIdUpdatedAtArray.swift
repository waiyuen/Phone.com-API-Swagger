//
// FilterIdGroupIdUpdatedAtArray.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class FilterIdGroupIdUpdatedAtArray: JSONEncodable {
    public var id: String?
    public var groupId: String?
    public var updatedAt: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["id"] = self.id
        nillableDictionary["group_id"] = self.groupId
        nillableDictionary["updated_at"] = self.updatedAt
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
