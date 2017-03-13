/* 
 * Phone.com API
 *
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;

namespace IO.Swagger.Model
{
    /// <summary>
    /// The Full Extension Object has the same properties as the Extension Summary Object, along with the following:
    /// </summary>
    [DataContract]
    public partial class ExtensionFull :  IEquatable<ExtensionFull>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ExtensionFull" /> class.
        /// </summary>
        /// <param name="Id">ID of the extension. This is the internal Phone.com ID, not the extension number callers may dial..</param>
        /// <param name="Name">User-supplied name for the extension. On POST, leaving this empty will result in an auto-generated value. On PUT, this field is required..</param>
        /// <param name="Extension">Extension number that callers may dial. On POST, leaving this empty will result in an auto-generated value. On PUT, this field is required..</param>
        /// <param name="FullName">Full name of the individual or department to which this extension is assigned.</param>
        /// <param name="UsageType">Can be \&quot;limited\&quot; or \&quot;unlimited\&quot;. In most cases, changing this will affect your monthly bill. Please see our Control Panel or contact Customer Service for pricing..</param>
        /// <param name="DeviceMembership">DeviceMembership.</param>
        /// <param name="Timezone">Time zone. Can be in any commonly recognized format, such as \&quot;America/Los_Angeles\&quot;..</param>
        /// <param name="NameGreeting">Greeting that communicates the extension&#39;s name. Output is a Greeting Summary Object. Input must be a Greeting Lookup Object..</param>
        /// <param name="IncludeInDirectory">Whether this extension should be included in the dial-by-name directory for this account. Boolean..</param>
        /// <param name="CallerId">Phone number to use as Caller ID for outgoing calls. Must be a phone number belonging to this account, or one of any additional authorized phone numbers. You can use our List Caller Ids service to see a current list. To unassign, you may set this to \&quot;private\&quot;, NULL, or an empty string..</param>
        /// <param name="LocalAreaCode">For outbound calls, this is the North American area code that this extension is calling from..</param>
        /// <param name="EnableCallWaiting">Whether Call Waiting is enabled. Boolean. Default is TRUE..</param>
        /// <param name="EnableOutboundCalls">Whether outgoing calls are enabled. Boolean. Default is TRUE..</param>
        /// <param name="Voicemail">Voicemail.</param>
        /// <param name="CallNotifications">Call Notifications Object. See below for details..</param>
        /// <param name="Route">Route which will handle incoming voice and fax calls. Only valid on PUT requests, not POST. Output is a Route Summary Object if the route is named, otherwise the Full Route Object will be shown. Input must be a Route Lookup Object pointing to a named route. Route must belong to this extension already..</param>
        public ExtensionFull(int? Id = default(int?), string Name = default(string), int? Extension = default(int?), string FullName = default(string), string UsageType = default(string), DeviceMembership DeviceMembership = default(DeviceMembership), string Timezone = default(string), MediaSummary NameGreeting = default(MediaSummary), bool? IncludeInDirectory = default(bool?), string CallerId = default(string), string LocalAreaCode = default(string), bool? EnableCallWaiting = default(bool?), bool? EnableOutboundCalls = default(bool?), Voicemail Voicemail = default(Voicemail), Notification CallNotifications = default(Notification), RouteSummary Route = default(RouteSummary))
        {
            this.Id = Id;
            this.Name = Name;
            this.Extension = Extension;
            this.FullName = FullName;
            this.UsageType = UsageType;
            this.DeviceMembership = DeviceMembership;
            this.Timezone = Timezone;
            this.NameGreeting = NameGreeting;
            this.IncludeInDirectory = IncludeInDirectory;
            this.CallerId = CallerId;
            this.LocalAreaCode = LocalAreaCode;
            this.EnableCallWaiting = EnableCallWaiting;
            this.EnableOutboundCalls = EnableOutboundCalls;
            this.Voicemail = Voicemail;
            this.CallNotifications = CallNotifications;
            this.Route = Route;
        }
        
        /// <summary>
        /// ID of the extension. This is the internal Phone.com ID, not the extension number callers may dial.
        /// </summary>
        /// <value>ID of the extension. This is the internal Phone.com ID, not the extension number callers may dial.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public int? Id { get; set; }
        /// <summary>
        /// User-supplied name for the extension. On POST, leaving this empty will result in an auto-generated value. On PUT, this field is required.
        /// </summary>
        /// <value>User-supplied name for the extension. On POST, leaving this empty will result in an auto-generated value. On PUT, this field is required.</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }
        /// <summary>
        /// Extension number that callers may dial. On POST, leaving this empty will result in an auto-generated value. On PUT, this field is required.
        /// </summary>
        /// <value>Extension number that callers may dial. On POST, leaving this empty will result in an auto-generated value. On PUT, this field is required.</value>
        [DataMember(Name="extension", EmitDefaultValue=false)]
        public int? Extension { get; set; }
        /// <summary>
        /// Full name of the individual or department to which this extension is assigned
        /// </summary>
        /// <value>Full name of the individual or department to which this extension is assigned</value>
        [DataMember(Name="full_name", EmitDefaultValue=false)]
        public string FullName { get; set; }
        /// <summary>
        /// Can be \&quot;limited\&quot; or \&quot;unlimited\&quot;. In most cases, changing this will affect your monthly bill. Please see our Control Panel or contact Customer Service for pricing.
        /// </summary>
        /// <value>Can be \&quot;limited\&quot; or \&quot;unlimited\&quot;. In most cases, changing this will affect your monthly bill. Please see our Control Panel or contact Customer Service for pricing.</value>
        [DataMember(Name="usage_type", EmitDefaultValue=false)]
        public string UsageType { get; set; }
        /// <summary>
        /// Gets or Sets DeviceMembership
        /// </summary>
        [DataMember(Name="device_membership", EmitDefaultValue=false)]
        public DeviceMembership DeviceMembership { get; set; }
        /// <summary>
        /// Time zone. Can be in any commonly recognized format, such as \&quot;America/Los_Angeles\&quot;.
        /// </summary>
        /// <value>Time zone. Can be in any commonly recognized format, such as \&quot;America/Los_Angeles\&quot;.</value>
        [DataMember(Name="timezone", EmitDefaultValue=false)]
        public string Timezone { get; set; }
        /// <summary>
        /// Greeting that communicates the extension&#39;s name. Output is a Greeting Summary Object. Input must be a Greeting Lookup Object.
        /// </summary>
        /// <value>Greeting that communicates the extension&#39;s name. Output is a Greeting Summary Object. Input must be a Greeting Lookup Object.</value>
        [DataMember(Name="name_greeting", EmitDefaultValue=false)]
        public MediaSummary NameGreeting { get; set; }
        /// <summary>
        /// Whether this extension should be included in the dial-by-name directory for this account. Boolean.
        /// </summary>
        /// <value>Whether this extension should be included in the dial-by-name directory for this account. Boolean.</value>
        [DataMember(Name="include_in_directory", EmitDefaultValue=false)]
        public bool? IncludeInDirectory { get; set; }
        /// <summary>
        /// Phone number to use as Caller ID for outgoing calls. Must be a phone number belonging to this account, or one of any additional authorized phone numbers. You can use our List Caller Ids service to see a current list. To unassign, you may set this to \&quot;private\&quot;, NULL, or an empty string.
        /// </summary>
        /// <value>Phone number to use as Caller ID for outgoing calls. Must be a phone number belonging to this account, or one of any additional authorized phone numbers. You can use our List Caller Ids service to see a current list. To unassign, you may set this to \&quot;private\&quot;, NULL, or an empty string.</value>
        [DataMember(Name="caller_id", EmitDefaultValue=false)]
        public string CallerId { get; set; }
        /// <summary>
        /// For outbound calls, this is the North American area code that this extension is calling from.
        /// </summary>
        /// <value>For outbound calls, this is the North American area code that this extension is calling from.</value>
        [DataMember(Name="local_area_code", EmitDefaultValue=false)]
        public string LocalAreaCode { get; set; }
        /// <summary>
        /// Whether Call Waiting is enabled. Boolean. Default is TRUE.
        /// </summary>
        /// <value>Whether Call Waiting is enabled. Boolean. Default is TRUE.</value>
        [DataMember(Name="enable_call_waiting", EmitDefaultValue=false)]
        public bool? EnableCallWaiting { get; set; }
        /// <summary>
        /// Whether outgoing calls are enabled. Boolean. Default is TRUE.
        /// </summary>
        /// <value>Whether outgoing calls are enabled. Boolean. Default is TRUE.</value>
        [DataMember(Name="enable_outbound_calls", EmitDefaultValue=false)]
        public bool? EnableOutboundCalls { get; set; }
        /// <summary>
        /// Gets or Sets Voicemail
        /// </summary>
        [DataMember(Name="voicemail", EmitDefaultValue=false)]
        public Voicemail Voicemail { get; set; }
        /// <summary>
        /// Call Notifications Object. See below for details.
        /// </summary>
        /// <value>Call Notifications Object. See below for details.</value>
        [DataMember(Name="call_notifications", EmitDefaultValue=false)]
        public Notification CallNotifications { get; set; }
        /// <summary>
        /// Route which will handle incoming voice and fax calls. Only valid on PUT requests, not POST. Output is a Route Summary Object if the route is named, otherwise the Full Route Object will be shown. Input must be a Route Lookup Object pointing to a named route. Route must belong to this extension already.
        /// </summary>
        /// <value>Route which will handle incoming voice and fax calls. Only valid on PUT requests, not POST. Output is a Route Summary Object if the route is named, otherwise the Full Route Object will be shown. Input must be a Route Lookup Object pointing to a named route. Route must belong to this extension already.</value>
        [DataMember(Name="route", EmitDefaultValue=false)]
        public RouteSummary Route { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ExtensionFull {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Extension: ").Append(Extension).Append("\n");
            sb.Append("  FullName: ").Append(FullName).Append("\n");
            sb.Append("  UsageType: ").Append(UsageType).Append("\n");
            sb.Append("  DeviceMembership: ").Append(DeviceMembership).Append("\n");
            sb.Append("  Timezone: ").Append(Timezone).Append("\n");
            sb.Append("  NameGreeting: ").Append(NameGreeting).Append("\n");
            sb.Append("  IncludeInDirectory: ").Append(IncludeInDirectory).Append("\n");
            sb.Append("  CallerId: ").Append(CallerId).Append("\n");
            sb.Append("  LocalAreaCode: ").Append(LocalAreaCode).Append("\n");
            sb.Append("  EnableCallWaiting: ").Append(EnableCallWaiting).Append("\n");
            sb.Append("  EnableOutboundCalls: ").Append(EnableOutboundCalls).Append("\n");
            sb.Append("  Voicemail: ").Append(Voicemail).Append("\n");
            sb.Append("  CallNotifications: ").Append(CallNotifications).Append("\n");
            sb.Append("  Route: ").Append(Route).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as ExtensionFull);
        }

        /// <summary>
        /// Returns true if ExtensionFull instances are equal
        /// </summary>
        /// <param name="other">Instance of ExtensionFull to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ExtensionFull other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Id == other.Id ||
                    this.Id != null &&
                    this.Id.Equals(other.Id)
                ) && 
                (
                    this.Name == other.Name ||
                    this.Name != null &&
                    this.Name.Equals(other.Name)
                ) && 
                (
                    this.Extension == other.Extension ||
                    this.Extension != null &&
                    this.Extension.Equals(other.Extension)
                ) && 
                (
                    this.FullName == other.FullName ||
                    this.FullName != null &&
                    this.FullName.Equals(other.FullName)
                ) && 
                (
                    this.UsageType == other.UsageType ||
                    this.UsageType != null &&
                    this.UsageType.Equals(other.UsageType)
                ) && 
                (
                    this.DeviceMembership == other.DeviceMembership ||
                    this.DeviceMembership != null &&
                    this.DeviceMembership.Equals(other.DeviceMembership)
                ) && 
                (
                    this.Timezone == other.Timezone ||
                    this.Timezone != null &&
                    this.Timezone.Equals(other.Timezone)
                ) && 
                (
                    this.NameGreeting == other.NameGreeting ||
                    this.NameGreeting != null &&
                    this.NameGreeting.Equals(other.NameGreeting)
                ) && 
                (
                    this.IncludeInDirectory == other.IncludeInDirectory ||
                    this.IncludeInDirectory != null &&
                    this.IncludeInDirectory.Equals(other.IncludeInDirectory)
                ) && 
                (
                    this.CallerId == other.CallerId ||
                    this.CallerId != null &&
                    this.CallerId.Equals(other.CallerId)
                ) && 
                (
                    this.LocalAreaCode == other.LocalAreaCode ||
                    this.LocalAreaCode != null &&
                    this.LocalAreaCode.Equals(other.LocalAreaCode)
                ) && 
                (
                    this.EnableCallWaiting == other.EnableCallWaiting ||
                    this.EnableCallWaiting != null &&
                    this.EnableCallWaiting.Equals(other.EnableCallWaiting)
                ) && 
                (
                    this.EnableOutboundCalls == other.EnableOutboundCalls ||
                    this.EnableOutboundCalls != null &&
                    this.EnableOutboundCalls.Equals(other.EnableOutboundCalls)
                ) && 
                (
                    this.Voicemail == other.Voicemail ||
                    this.Voicemail != null &&
                    this.Voicemail.Equals(other.Voicemail)
                ) && 
                (
                    this.CallNotifications == other.CallNotifications ||
                    this.CallNotifications != null &&
                    this.CallNotifications.Equals(other.CallNotifications)
                ) && 
                (
                    this.Route == other.Route ||
                    this.Route != null &&
                    this.Route.Equals(other.Route)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.Id != null)
                    hash = hash * 59 + this.Id.GetHashCode();
                if (this.Name != null)
                    hash = hash * 59 + this.Name.GetHashCode();
                if (this.Extension != null)
                    hash = hash * 59 + this.Extension.GetHashCode();
                if (this.FullName != null)
                    hash = hash * 59 + this.FullName.GetHashCode();
                if (this.UsageType != null)
                    hash = hash * 59 + this.UsageType.GetHashCode();
                if (this.DeviceMembership != null)
                    hash = hash * 59 + this.DeviceMembership.GetHashCode();
                if (this.Timezone != null)
                    hash = hash * 59 + this.Timezone.GetHashCode();
                if (this.NameGreeting != null)
                    hash = hash * 59 + this.NameGreeting.GetHashCode();
                if (this.IncludeInDirectory != null)
                    hash = hash * 59 + this.IncludeInDirectory.GetHashCode();
                if (this.CallerId != null)
                    hash = hash * 59 + this.CallerId.GetHashCode();
                if (this.LocalAreaCode != null)
                    hash = hash * 59 + this.LocalAreaCode.GetHashCode();
                if (this.EnableCallWaiting != null)
                    hash = hash * 59 + this.EnableCallWaiting.GetHashCode();
                if (this.EnableOutboundCalls != null)
                    hash = hash * 59 + this.EnableOutboundCalls.GetHashCode();
                if (this.Voicemail != null)
                    hash = hash * 59 + this.Voicemail.GetHashCode();
                if (this.CallNotifications != null)
                    hash = hash * 59 + this.CallNotifications.GetHashCode();
                if (this.Route != null)
                    hash = hash * 59 + this.Route.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
