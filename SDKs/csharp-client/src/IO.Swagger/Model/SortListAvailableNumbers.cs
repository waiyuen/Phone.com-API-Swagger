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
    /// SortListAvailableNumbers
    /// </summary>
    [DataContract]
    public partial class SortListAvailableNumbers :  IEquatable<SortListAvailableNumbers>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SortListAvailableNumbers" /> class.
        /// </summary>
        /// <param name="_Internal">_Internal.</param>
        /// <param name="Price">Price.</param>
        /// <param name="PhoneNumber">PhoneNumber.</param>
        public SortListAvailableNumbers(string _Internal = default(string), string Price = default(string), string PhoneNumber = default(string))
        {
            this._Internal = _Internal;
            this.Price = Price;
            this.PhoneNumber = PhoneNumber;
        }
        
        /// <summary>
        /// Gets or Sets _Internal
        /// </summary>
        [DataMember(Name="internal", EmitDefaultValue=false)]
        public string _Internal { get; set; }
        /// <summary>
        /// Gets or Sets Price
        /// </summary>
        [DataMember(Name="price", EmitDefaultValue=false)]
        public string Price { get; set; }
        /// <summary>
        /// Gets or Sets PhoneNumber
        /// </summary>
        [DataMember(Name="phone_number", EmitDefaultValue=false)]
        public string PhoneNumber { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SortListAvailableNumbers {\n");
            sb.Append("  _Internal: ").Append(_Internal).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  PhoneNumber: ").Append(PhoneNumber).Append("\n");
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
            return this.Equals(obj as SortListAvailableNumbers);
        }

        /// <summary>
        /// Returns true if SortListAvailableNumbers instances are equal
        /// </summary>
        /// <param name="other">Instance of SortListAvailableNumbers to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SortListAvailableNumbers other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this._Internal == other._Internal ||
                    this._Internal != null &&
                    this._Internal.Equals(other._Internal)
                ) && 
                (
                    this.Price == other.Price ||
                    this.Price != null &&
                    this.Price.Equals(other.Price)
                ) && 
                (
                    this.PhoneNumber == other.PhoneNumber ||
                    this.PhoneNumber != null &&
                    this.PhoneNumber.Equals(other.PhoneNumber)
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
                if (this._Internal != null)
                    hash = hash * 59 + this._Internal.GetHashCode();
                if (this.Price != null)
                    hash = hash * 59 + this.Price.GetHashCode();
                if (this.PhoneNumber != null)
                    hash = hash * 59 + this.PhoneNumber.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
