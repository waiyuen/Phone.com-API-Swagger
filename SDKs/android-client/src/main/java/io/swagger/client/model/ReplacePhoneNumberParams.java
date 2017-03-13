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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ReplacePhoneNumberParams {
  
  @SerializedName("route")
  private Object route = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("block_incoming")
  private Boolean blockIncoming = null;
  @SerializedName("block_anonymous")
  private Boolean blockAnonymous = null;
  @SerializedName("caller_id[name]")
  private String callerIdName = null;
  @SerializedName("caller_id[type]")
  private String callerIdType = null;
  @SerializedName("sms_forwarding[type]")
  private String smsForwardingType = null;
  @SerializedName("sms_forwarding[application]")
  private Object smsForwardingApplication = null;
  @SerializedName("sms_forwarding[extension]")
  private Object smsForwardingExtension = null;
  @SerializedName("pool_item")
  private Object poolItem = null;
  @SerializedName("call_notifications[emails]")
  private List<String> callNotificationsEmails = null;
  @SerializedName("call_notifications[sms]")
  private String callNotificationsSms = null;

  /**
   * Route lookup object
   **/
  @ApiModelProperty(value = "Route lookup object")
  public Object getRoute() {
    return route;
  }
  public void setRoute(Object route) {
    this.route = route;
  }

  /**
   * Phone Name
   **/
  @ApiModelProperty(value = "Phone Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Block incoming calls
   **/
  @ApiModelProperty(value = "Block incoming calls")
  public Boolean getBlockIncoming() {
    return blockIncoming;
  }
  public void setBlockIncoming(Boolean blockIncoming) {
    this.blockIncoming = blockIncoming;
  }

  /**
   * Block anonymous calls
   **/
  @ApiModelProperty(value = "Block anonymous calls")
  public Boolean getBlockAnonymous() {
    return blockAnonymous;
  }
  public void setBlockAnonymous(Boolean blockAnonymous) {
    this.blockAnonymous = blockAnonymous;
  }

  /**
   * Caller ID name
   **/
  @ApiModelProperty(value = "Caller ID name")
  public String getCallerIdName() {
    return callerIdName;
  }
  public void setCallerIdName(String callerIdName) {
    this.callerIdName = callerIdName;
  }

  /**
   * Caller ID type
   **/
  @ApiModelProperty(value = "Caller ID type")
  public String getCallerIdType() {
    return callerIdType;
  }
  public void setCallerIdType(String callerIdType) {
    this.callerIdType = callerIdType;
  }

  /**
   * 'application' or 'extension'
   **/
  @ApiModelProperty(value = "'application' or 'extension'")
  public String getSmsForwardingType() {
    return smsForwardingType;
  }
  public void setSmsForwardingType(String smsForwardingType) {
    this.smsForwardingType = smsForwardingType;
  }

  /**
   * Application lookup object
   **/
  @ApiModelProperty(value = "Application lookup object")
  public Object getSmsForwardingApplication() {
    return smsForwardingApplication;
  }
  public void setSmsForwardingApplication(Object smsForwardingApplication) {
    this.smsForwardingApplication = smsForwardingApplication;
  }

  /**
   * Extension lookup object
   **/
  @ApiModelProperty(value = "Extension lookup object")
  public Object getSmsForwardingExtension() {
    return smsForwardingExtension;
  }
  public void setSmsForwardingExtension(Object smsForwardingExtension) {
    this.smsForwardingExtension = smsForwardingExtension;
  }

  /**
   * Pool lookup object
   **/
  @ApiModelProperty(value = "Pool lookup object")
  public Object getPoolItem() {
    return poolItem;
  }
  public void setPoolItem(Object poolItem) {
    this.poolItem = poolItem;
  }

  /**
   * Call notifications for emails. Can be a single email or an array of emails
   **/
  @ApiModelProperty(value = "Call notifications for emails. Can be a single email or an array of emails")
  public List<String> getCallNotificationsEmails() {
    return callNotificationsEmails;
  }
  public void setCallNotificationsEmails(List<String> callNotificationsEmails) {
    this.callNotificationsEmails = callNotificationsEmails;
  }

  /**
   * Call notification for SMS
   **/
  @ApiModelProperty(value = "Call notification for SMS")
  public String getCallNotificationsSms() {
    return callNotificationsSms;
  }
  public void setCallNotificationsSms(String callNotificationsSms) {
    this.callNotificationsSms = callNotificationsSms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplacePhoneNumberParams replacePhoneNumberParams = (ReplacePhoneNumberParams) o;
    return (this.route == null ? replacePhoneNumberParams.route == null : this.route.equals(replacePhoneNumberParams.route)) &&
        (this.name == null ? replacePhoneNumberParams.name == null : this.name.equals(replacePhoneNumberParams.name)) &&
        (this.blockIncoming == null ? replacePhoneNumberParams.blockIncoming == null : this.blockIncoming.equals(replacePhoneNumberParams.blockIncoming)) &&
        (this.blockAnonymous == null ? replacePhoneNumberParams.blockAnonymous == null : this.blockAnonymous.equals(replacePhoneNumberParams.blockAnonymous)) &&
        (this.callerIdName == null ? replacePhoneNumberParams.callerIdName == null : this.callerIdName.equals(replacePhoneNumberParams.callerIdName)) &&
        (this.callerIdType == null ? replacePhoneNumberParams.callerIdType == null : this.callerIdType.equals(replacePhoneNumberParams.callerIdType)) &&
        (this.smsForwardingType == null ? replacePhoneNumberParams.smsForwardingType == null : this.smsForwardingType.equals(replacePhoneNumberParams.smsForwardingType)) &&
        (this.smsForwardingApplication == null ? replacePhoneNumberParams.smsForwardingApplication == null : this.smsForwardingApplication.equals(replacePhoneNumberParams.smsForwardingApplication)) &&
        (this.smsForwardingExtension == null ? replacePhoneNumberParams.smsForwardingExtension == null : this.smsForwardingExtension.equals(replacePhoneNumberParams.smsForwardingExtension)) &&
        (this.poolItem == null ? replacePhoneNumberParams.poolItem == null : this.poolItem.equals(replacePhoneNumberParams.poolItem)) &&
        (this.callNotificationsEmails == null ? replacePhoneNumberParams.callNotificationsEmails == null : this.callNotificationsEmails.equals(replacePhoneNumberParams.callNotificationsEmails)) &&
        (this.callNotificationsSms == null ? replacePhoneNumberParams.callNotificationsSms == null : this.callNotificationsSms.equals(replacePhoneNumberParams.callNotificationsSms));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.route == null ? 0: this.route.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.blockIncoming == null ? 0: this.blockIncoming.hashCode());
    result = 31 * result + (this.blockAnonymous == null ? 0: this.blockAnonymous.hashCode());
    result = 31 * result + (this.callerIdName == null ? 0: this.callerIdName.hashCode());
    result = 31 * result + (this.callerIdType == null ? 0: this.callerIdType.hashCode());
    result = 31 * result + (this.smsForwardingType == null ? 0: this.smsForwardingType.hashCode());
    result = 31 * result + (this.smsForwardingApplication == null ? 0: this.smsForwardingApplication.hashCode());
    result = 31 * result + (this.smsForwardingExtension == null ? 0: this.smsForwardingExtension.hashCode());
    result = 31 * result + (this.poolItem == null ? 0: this.poolItem.hashCode());
    result = 31 * result + (this.callNotificationsEmails == null ? 0: this.callNotificationsEmails.hashCode());
    result = 31 * result + (this.callNotificationsSms == null ? 0: this.callNotificationsSms.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplacePhoneNumberParams {\n");
    
    sb.append("  route: ").append(route).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  blockIncoming: ").append(blockIncoming).append("\n");
    sb.append("  blockAnonymous: ").append(blockAnonymous).append("\n");
    sb.append("  callerIdName: ").append(callerIdName).append("\n");
    sb.append("  callerIdType: ").append(callerIdType).append("\n");
    sb.append("  smsForwardingType: ").append(smsForwardingType).append("\n");
    sb.append("  smsForwardingApplication: ").append(smsForwardingApplication).append("\n");
    sb.append("  smsForwardingExtension: ").append(smsForwardingExtension).append("\n");
    sb.append("  poolItem: ").append(poolItem).append("\n");
    sb.append("  callNotificationsEmails: ").append(callNotificationsEmails).append("\n");
    sb.append("  callNotificationsSms: ").append(callNotificationsSms).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}