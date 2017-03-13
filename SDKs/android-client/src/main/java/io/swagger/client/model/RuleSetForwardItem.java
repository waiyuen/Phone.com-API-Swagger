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

package io.swagger.client.model;

import io.swagger.client.model.ExtensionSummary;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Array of Forward Item Objects. See below for details. Required.
 **/
@ApiModel(description = "Array of Forward Item Objects. See below for details. Required.")
public class RuleSetForwardItem {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("extension")
  private ExtensionSummary extension = null;
  @SerializedName("number")
  private String number = null;
  @SerializedName("screening")
  private Boolean screening = null;
  @SerializedName("caller_id")
  private String callerId = null;
  @SerializedName("voice_tag")
  private String voiceTag = null;
  @SerializedName("distinctive_ring")
  private String distinctiveRing = null;

  /**
   * Required. Must equal phone_number or extension.
   **/
  @ApiModelProperty(value = "Required. Must equal phone_number or extension.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Required if type = \"extension\". Extension that callers should be directed to. Output is an Extension Summary Object. Input must be an Extension Lookup Object.
   **/
  @ApiModelProperty(value = "Required if type = \"extension\". Extension that callers should be directed to. Output is an Extension Summary Object. Input must be an Extension Lookup Object.")
  public ExtensionSummary getExtension() {
    return extension;
  }
  public void setExtension(ExtensionSummary extension) {
    this.extension = extension;
  }

  /**
   * Required if type = \"phone_number\". Phone number that callers should be directed to. Must be a string in E.164 format.
   **/
  @ApiModelProperty(value = "Required if type = \"phone_number\". Phone number that callers should be directed to. Must be a string in E.164 format.")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * Boolean. Optional. Default is FALSE. Use this to activate call screening. If TRUE, the timeout on the parent action should be at least 30 seconds.
   **/
  @ApiModelProperty(value = "Boolean. Optional. Default is FALSE. Use this to activate call screening. If TRUE, the timeout on the parent action should be at least 30 seconds.")
  public Boolean getScreening() {
    return screening;
  }
  public void setScreening(Boolean screening) {
    this.screening = screening;
  }

  /**
   * Optional. Must equal calling_number or called_number. Defines which phone number should be used for Caller ID. Default is calling_number.
   **/
  @ApiModelProperty(value = "Optional. Must equal calling_number or called_number. Defines which phone number should be used for Caller ID. Default is calling_number.")
  public String getCallerId() {
    return callerId;
  }
  public void setCallerId(String callerId) {
    this.callerId = callerId;
  }

  /**
   * Optional string. If screening = TRUE, this value will be passed into our Text-To-Speech engine and used to inform the caller of who they have reached.
   **/
  @ApiModelProperty(value = "Optional string. If screening = TRUE, this value will be passed into our Text-To-Speech engine and used to inform the caller of who they have reached.")
  public String getVoiceTag() {
    return voiceTag;
  }
  public void setVoiceTag(String voiceTag) {
    this.voiceTag = voiceTag;
  }

  /**
   * Optional. Must equal one of: DEFAULT, STYLE_2, STYLE_3, STYLE_4, STYLE_5, STYLE_6, STYLE_7, STYLE_8, or STYLE_9. Identifies the style of ring tone you will hear when an incoming call is waiting.
   **/
  @ApiModelProperty(value = "Optional. Must equal one of: DEFAULT, STYLE_2, STYLE_3, STYLE_4, STYLE_5, STYLE_6, STYLE_7, STYLE_8, or STYLE_9. Identifies the style of ring tone you will hear when an incoming call is waiting.")
  public String getDistinctiveRing() {
    return distinctiveRing;
  }
  public void setDistinctiveRing(String distinctiveRing) {
    this.distinctiveRing = distinctiveRing;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleSetForwardItem ruleSetForwardItem = (RuleSetForwardItem) o;
    return (this.type == null ? ruleSetForwardItem.type == null : this.type.equals(ruleSetForwardItem.type)) &&
        (this.extension == null ? ruleSetForwardItem.extension == null : this.extension.equals(ruleSetForwardItem.extension)) &&
        (this.number == null ? ruleSetForwardItem.number == null : this.number.equals(ruleSetForwardItem.number)) &&
        (this.screening == null ? ruleSetForwardItem.screening == null : this.screening.equals(ruleSetForwardItem.screening)) &&
        (this.callerId == null ? ruleSetForwardItem.callerId == null : this.callerId.equals(ruleSetForwardItem.callerId)) &&
        (this.voiceTag == null ? ruleSetForwardItem.voiceTag == null : this.voiceTag.equals(ruleSetForwardItem.voiceTag)) &&
        (this.distinctiveRing == null ? ruleSetForwardItem.distinctiveRing == null : this.distinctiveRing.equals(ruleSetForwardItem.distinctiveRing));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.extension == null ? 0: this.extension.hashCode());
    result = 31 * result + (this.number == null ? 0: this.number.hashCode());
    result = 31 * result + (this.screening == null ? 0: this.screening.hashCode());
    result = 31 * result + (this.callerId == null ? 0: this.callerId.hashCode());
    result = 31 * result + (this.voiceTag == null ? 0: this.voiceTag.hashCode());
    result = 31 * result + (this.distinctiveRing == null ? 0: this.distinctiveRing.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleSetForwardItem {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  extension: ").append(extension).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("  screening: ").append(screening).append("\n");
    sb.append("  callerId: ").append(callerId).append("\n");
    sb.append("  voiceTag: ").append(voiceTag).append("\n");
    sb.append("  distinctiveRing: ").append(distinctiveRing).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}