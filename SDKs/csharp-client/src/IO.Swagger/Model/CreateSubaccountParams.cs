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
    /// CreateSubaccountParams
    /// </summary>
    [DataContract]
    public partial class CreateSubaccountParams :  IEquatable<CreateSubaccountParams>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateSubaccountParams" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateSubaccountParams() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateSubaccountParams" /> class.
        /// </summary>
        /// <param name="Username">Sub account password (required).</param>
        /// <param name="Password">Sub account password (required).</param>
        /// <param name="Contact">Contact Object. See below for details..</param>
        /// <param name="BillingContact">Contact Object for billing purposes. See below for details..</param>
        public CreateSubaccountParams(string Username = default(string), string Password = default(string), ContactSubaccount Contact = default(ContactSubaccount), ContactSubaccount BillingContact = default(ContactSubaccount))
        {
            // to ensure "Username" is required (not null)
            if (Username == null)
            {
                throw new InvalidDataException("Username is a required property for CreateSubaccountParams and cannot be null");
            }
            else
            {
                this.Username = Username;
            }
            // to ensure "Password" is required (not null)
            if (Password == null)
            {
                throw new InvalidDataException("Password is a required property for CreateSubaccountParams and cannot be null");
            }
            else
            {
                this.Password = Password;
            }
            this.Contact = Contact;
            this.BillingContact = BillingContact;
        }
        
        /// <summary>
        /// Sub account password
        /// </summary>
        /// <value>Sub account password</value>
        [DataMember(Name="username", EmitDefaultValue=false)]
        public string Username { get; set; }
        /// <summary>
        /// Sub account password
        /// </summary>
        /// <value>Sub account password</value>
        [DataMember(Name="password", EmitDefaultValue=false)]
        public string Password { get; set; }
        /// <summary>
        /// Contact Object. See below for details.
        /// </summary>
        /// <value>Contact Object. See below for details.</value>
        [DataMember(Name="contact", EmitDefaultValue=false)]
        public ContactSubaccount Contact { get; set; }
        /// <summary>
        /// Contact Object for billing purposes. See below for details.
        /// </summary>
        /// <value>Contact Object for billing purposes. See below for details.</value>
        [DataMember(Name="billing_contact", EmitDefaultValue=false)]
        public ContactSubaccount BillingContact { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateSubaccountParams {\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  Contact: ").Append(Contact).Append("\n");
            sb.Append("  BillingContact: ").Append(BillingContact).Append("\n");
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
            return this.Equals(obj as CreateSubaccountParams);
        }

        /// <summary>
        /// Returns true if CreateSubaccountParams instances are equal
        /// </summary>
        /// <param name="other">Instance of CreateSubaccountParams to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateSubaccountParams other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Username == other.Username ||
                    this.Username != null &&
                    this.Username.Equals(other.Username)
                ) && 
                (
                    this.Password == other.Password ||
                    this.Password != null &&
                    this.Password.Equals(other.Password)
                ) && 
                (
                    this.Contact == other.Contact ||
                    this.Contact != null &&
                    this.Contact.Equals(other.Contact)
                ) && 
                (
                    this.BillingContact == other.BillingContact ||
                    this.BillingContact != null &&
                    this.BillingContact.Equals(other.BillingContact)
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
                if (this.Username != null)
                    hash = hash * 59 + this.Username.GetHashCode();
                if (this.Password != null)
                    hash = hash * 59 + this.Password.GetHashCode();
                if (this.Contact != null)
                    hash = hash * 59 + this.Contact.GetHashCode();
                if (this.BillingContact != null)
                    hash = hash * 59 + this.BillingContact.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
