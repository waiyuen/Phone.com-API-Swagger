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
    /// Each item in the &#39;details&#39; record may contain the following properties:
    /// </summary>
    [DataContract]
    public partial class CallDetails :  IEquatable<CallDetails>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CallDetails" /> class.
        /// </summary>
        /// <param name="StartTime">UNIX time stamp representing the UTC time that this call item starts.</param>
        /// <param name="Type">Endpoint for this call item, such as call, voicemail, fax, menu, menu item, queue ....</param>
        /// <param name="IdValue">ID associated with this call item endpoint (type).</param>
        /// <param name="VoipId">Same as account id.</param>
        /// <param name="VoipPhoneId">Same as account extension id.</param>
        public CallDetails(int? StartTime = default(int?), string Type = default(string), int? IdValue = default(int?), int? VoipId = default(int?), int? VoipPhoneId = default(int?))
        {
            this.StartTime = StartTime;
            this.Type = Type;
            this.IdValue = IdValue;
            this.VoipId = VoipId;
            this.VoipPhoneId = VoipPhoneId;
        }
        
        /// <summary>
        /// UNIX time stamp representing the UTC time that this call item starts
        /// </summary>
        /// <value>UNIX time stamp representing the UTC time that this call item starts</value>
        [DataMember(Name="start_time", EmitDefaultValue=false)]
        public int? StartTime { get; set; }
        /// <summary>
        /// Endpoint for this call item, such as call, voicemail, fax, menu, menu item, queue ...
        /// </summary>
        /// <value>Endpoint for this call item, such as call, voicemail, fax, menu, menu item, queue ...</value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }
        /// <summary>
        /// ID associated with this call item endpoint (type)
        /// </summary>
        /// <value>ID associated with this call item endpoint (type)</value>
        [DataMember(Name="id_value", EmitDefaultValue=false)]
        public int? IdValue { get; set; }
        /// <summary>
        /// Same as account id
        /// </summary>
        /// <value>Same as account id</value>
        [DataMember(Name="voip_id", EmitDefaultValue=false)]
        public int? VoipId { get; set; }
        /// <summary>
        /// Same as account extension id
        /// </summary>
        /// <value>Same as account extension id</value>
        [DataMember(Name="voip_phone_id", EmitDefaultValue=false)]
        public int? VoipPhoneId { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CallDetails {\n");
            sb.Append("  StartTime: ").Append(StartTime).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  IdValue: ").Append(IdValue).Append("\n");
            sb.Append("  VoipId: ").Append(VoipId).Append("\n");
            sb.Append("  VoipPhoneId: ").Append(VoipPhoneId).Append("\n");
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
            return this.Equals(obj as CallDetails);
        }

        /// <summary>
        /// Returns true if CallDetails instances are equal
        /// </summary>
        /// <param name="other">Instance of CallDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CallDetails other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.StartTime == other.StartTime ||
                    this.StartTime != null &&
                    this.StartTime.Equals(other.StartTime)
                ) && 
                (
                    this.Type == other.Type ||
                    this.Type != null &&
                    this.Type.Equals(other.Type)
                ) && 
                (
                    this.IdValue == other.IdValue ||
                    this.IdValue != null &&
                    this.IdValue.Equals(other.IdValue)
                ) && 
                (
                    this.VoipId == other.VoipId ||
                    this.VoipId != null &&
                    this.VoipId.Equals(other.VoipId)
                ) && 
                (
                    this.VoipPhoneId == other.VoipPhoneId ||
                    this.VoipPhoneId != null &&
                    this.VoipPhoneId.Equals(other.VoipPhoneId)
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
                if (this.StartTime != null)
                    hash = hash * 59 + this.StartTime.GetHashCode();
                if (this.Type != null)
                    hash = hash * 59 + this.Type.GetHashCode();
                if (this.IdValue != null)
                    hash = hash * 59 + this.IdValue.GetHashCode();
                if (this.VoipId != null)
                    hash = hash * 59 + this.VoipId.GetHashCode();
                if (this.VoipPhoneId != null)
                    hash = hash * 59 + this.VoipPhoneId.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
