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
    /// The Full Menu Object contains the same properties as the Menu Summary Object, along with the following:
    /// </summary>
    [DataContract]
    public partial class MenuFull :  IEquatable<MenuFull>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MenuFull" /> class.
        /// </summary>
        /// <param name="Id">Integer Menu ID. Read-only..</param>
        /// <param name="Name">Name. Required. Unique..</param>
        /// <param name="AllowExtensionDial">Boolean. Determines whether a caller can enter an extension number to bypass the menu..</param>
        /// <param name="KeypressWaitTime">Boolean. Determines whether a caller can enter an extension number to bypass the menu..</param>
        /// <param name="Greeting">Greeting that is played when a caller enters a menu. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE..</param>
        /// <param name="KeypressError">Message that is played when the caller makes a keypress error. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE..</param>
        /// <param name="TimeoutHandler">Route that will be entered when the caller fails to choose a menu option within the allotted time. Output is a Route Summary Object if the route is named, otherwise the Full Route Object will be shown. Input must be a Route Lookup Object pointing to a named route..</param>
        /// <param name="Options">Array of menu option objects. See below for details..</param>
        public MenuFull(int? Id = default(int?), string Name = default(string), bool? AllowExtensionDial = default(bool?), int? KeypressWaitTime = default(int?), MediaSummary Greeting = default(MediaSummary), MediaSummary KeypressError = default(MediaSummary), RouteSummary TimeoutHandler = default(RouteSummary), List<Option> Options = default(List<Option>))
        {
            this.Id = Id;
            this.Name = Name;
            this.AllowExtensionDial = AllowExtensionDial;
            this.KeypressWaitTime = KeypressWaitTime;
            this.Greeting = Greeting;
            this.KeypressError = KeypressError;
            this.TimeoutHandler = TimeoutHandler;
            this.Options = Options;
        }
        
        /// <summary>
        /// Integer Menu ID. Read-only.
        /// </summary>
        /// <value>Integer Menu ID. Read-only.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public int? Id { get; set; }
        /// <summary>
        /// Name. Required. Unique.
        /// </summary>
        /// <value>Name. Required. Unique.</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }
        /// <summary>
        /// Boolean. Determines whether a caller can enter an extension number to bypass the menu.
        /// </summary>
        /// <value>Boolean. Determines whether a caller can enter an extension number to bypass the menu.</value>
        [DataMember(Name="allow_extension_dial", EmitDefaultValue=false)]
        public bool? AllowExtensionDial { get; set; }
        /// <summary>
        /// Boolean. Determines whether a caller can enter an extension number to bypass the menu.
        /// </summary>
        /// <value>Boolean. Determines whether a caller can enter an extension number to bypass the menu.</value>
        [DataMember(Name="keypress_wait_time", EmitDefaultValue=false)]
        public int? KeypressWaitTime { get; set; }
        /// <summary>
        /// Greeting that is played when a caller enters a menu. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE.
        /// </summary>
        /// <value>Greeting that is played when a caller enters a menu. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE.</value>
        [DataMember(Name="greeting", EmitDefaultValue=false)]
        public MediaSummary Greeting { get; set; }
        /// <summary>
        /// Message that is played when the caller makes a keypress error. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE.
        /// </summary>
        /// <value>Message that is played when the caller makes a keypress error. Output is a Media Summary Object. Input must be a Media Lookup Object. Must refer to a media recording that has is_hold_music set to FALSE.</value>
        [DataMember(Name="keypress_error", EmitDefaultValue=false)]
        public MediaSummary KeypressError { get; set; }
        /// <summary>
        /// Route that will be entered when the caller fails to choose a menu option within the allotted time. Output is a Route Summary Object if the route is named, otherwise the Full Route Object will be shown. Input must be a Route Lookup Object pointing to a named route.
        /// </summary>
        /// <value>Route that will be entered when the caller fails to choose a menu option within the allotted time. Output is a Route Summary Object if the route is named, otherwise the Full Route Object will be shown. Input must be a Route Lookup Object pointing to a named route.</value>
        [DataMember(Name="timeout_handler", EmitDefaultValue=false)]
        public RouteSummary TimeoutHandler { get; set; }
        /// <summary>
        /// Array of menu option objects. See below for details.
        /// </summary>
        /// <value>Array of menu option objects. See below for details.</value>
        [DataMember(Name="options", EmitDefaultValue=false)]
        public List<Option> Options { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MenuFull {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  AllowExtensionDial: ").Append(AllowExtensionDial).Append("\n");
            sb.Append("  KeypressWaitTime: ").Append(KeypressWaitTime).Append("\n");
            sb.Append("  Greeting: ").Append(Greeting).Append("\n");
            sb.Append("  KeypressError: ").Append(KeypressError).Append("\n");
            sb.Append("  TimeoutHandler: ").Append(TimeoutHandler).Append("\n");
            sb.Append("  Options: ").Append(Options).Append("\n");
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
            return this.Equals(obj as MenuFull);
        }

        /// <summary>
        /// Returns true if MenuFull instances are equal
        /// </summary>
        /// <param name="other">Instance of MenuFull to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MenuFull other)
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
                    this.AllowExtensionDial == other.AllowExtensionDial ||
                    this.AllowExtensionDial != null &&
                    this.AllowExtensionDial.Equals(other.AllowExtensionDial)
                ) && 
                (
                    this.KeypressWaitTime == other.KeypressWaitTime ||
                    this.KeypressWaitTime != null &&
                    this.KeypressWaitTime.Equals(other.KeypressWaitTime)
                ) && 
                (
                    this.Greeting == other.Greeting ||
                    this.Greeting != null &&
                    this.Greeting.Equals(other.Greeting)
                ) && 
                (
                    this.KeypressError == other.KeypressError ||
                    this.KeypressError != null &&
                    this.KeypressError.Equals(other.KeypressError)
                ) && 
                (
                    this.TimeoutHandler == other.TimeoutHandler ||
                    this.TimeoutHandler != null &&
                    this.TimeoutHandler.Equals(other.TimeoutHandler)
                ) && 
                (
                    this.Options == other.Options ||
                    this.Options != null &&
                    this.Options.SequenceEqual(other.Options)
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
                if (this.AllowExtensionDial != null)
                    hash = hash * 59 + this.AllowExtensionDial.GetHashCode();
                if (this.KeypressWaitTime != null)
                    hash = hash * 59 + this.KeypressWaitTime.GetHashCode();
                if (this.Greeting != null)
                    hash = hash * 59 + this.Greeting.GetHashCode();
                if (this.KeypressError != null)
                    hash = hash * 59 + this.KeypressError.GetHashCode();
                if (this.TimeoutHandler != null)
                    hash = hash * 59 + this.TimeoutHandler.GetHashCode();
                if (this.Options != null)
                    hash = hash * 59 + this.Options.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
