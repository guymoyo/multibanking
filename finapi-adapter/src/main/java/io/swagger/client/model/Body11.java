/*
 * finAPI RESTful Services
 * finAPI RESTful Services
 *
 * OpenAPI spec version: v1.20.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters of notification rule
 */
@ApiModel(description = "Parameters of notification rule")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T14:26:47.047Z")
public class Body11 {
  /**
   * Trigger event type
   */
  public enum TriggerEventEnum {
    @SerializedName("NEW_ACCOUNT_BALANCE")
    NEW_ACCOUNT_BALANCE("NEW_ACCOUNT_BALANCE"),
    
    @SerializedName("NEW_TRANSACTIONS")
    NEW_TRANSACTIONS("NEW_TRANSACTIONS"),
    
    @SerializedName("BANK_LOGIN_ERROR")
    BANK_LOGIN_ERROR("BANK_LOGIN_ERROR"),
    
    @SerializedName("FOREIGN_MONEY_TRANSFER")
    FOREIGN_MONEY_TRANSFER("FOREIGN_MONEY_TRANSFER"),
    
    @SerializedName("LOW_ACCOUNT_BALANCE")
    LOW_ACCOUNT_BALANCE("LOW_ACCOUNT_BALANCE"),
    
    @SerializedName("HIGH_TRANSACTION_AMOUNT")
    HIGH_TRANSACTION_AMOUNT("HIGH_TRANSACTION_AMOUNT"),
    
    @SerializedName("CATEGORY_CASH_FLOW")
    CATEGORY_CASH_FLOW("CATEGORY_CASH_FLOW");

    private String value;

    TriggerEventEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("triggerEvent")
  private TriggerEventEnum triggerEvent = null;

  @SerializedName("params")
  private Map<String, String> params = new HashMap<String, String>();

  @SerializedName("callbackHandle")
  private String callbackHandle = null;

  @SerializedName("includeDetails")
  private Boolean includeDetails = false;

  public Body11 triggerEvent(TriggerEventEnum triggerEvent) {
    this.triggerEvent = triggerEvent;
    return this;
  }

   /**
   * Trigger event type
   * @return triggerEvent
  **/
  @ApiModelProperty(example = "null", required = true, value = "Trigger event type")
  public TriggerEventEnum getTriggerEvent() {
    return triggerEvent;
  }

  public void setTriggerEvent(TriggerEventEnum triggerEvent) {
    this.triggerEvent = triggerEvent;
  }

  public Body11 params(Map<String, String> params) {
    this.params = params;
    return this;
  }

  public Body11 putParamsItem(String key, String paramsItem) {
    this.params.put(key, paramsItem);
    return this;
  }

   /**
   * Additional parameters that are specific to the chosen trigger event type. Please refer to the documentation for details.
   * @return params
  **/
  @ApiModelProperty(example = "null", value = "Additional parameters that are specific to the chosen trigger event type. Please refer to the documentation for details.")
  public Map<String, String> getParams() {
    return params;
  }

  public void setParams(Map<String, String> params) {
    this.params = params;
  }

  public Body11 callbackHandle(String callbackHandle) {
    this.callbackHandle = callbackHandle;
    return this;
  }

   /**
   * An arbitrary string that finAPI will include into the notifications that it sends based on this rule and that you can use to identify the notification in your application. For instance, you could include the identifier of the user that you create this rule for. Maximum allowed length of the string is 512 characters.<br><br>Note that for this parameter, you can pass the symbols '/', '=', '%' and '\"' in addition to the symbols that are generally allowed in finAPI (see https://finapi.zendesk.com/hc/en-us/articles/222013148). This was done to enable you to set Base64 encoded strings and JSON structures for the callback handle.
   * @return callbackHandle
  **/
  @ApiModelProperty(example = "null", value = "An arbitrary string that finAPI will include into the notifications that it sends based on this rule and that you can use to identify the notification in your application. For instance, you could include the identifier of the user that you create this rule for. Maximum allowed length of the string is 512 characters.<br><br>Note that for this parameter, you can pass the symbols '/', '=', '%' and '\"' in addition to the symbols that are generally allowed in finAPI (see https://finapi.zendesk.com/hc/en-us/articles/222013148). This was done to enable you to set Base64 encoded strings and JSON structures for the callback handle.")
  public String getCallbackHandle() {
    return callbackHandle;
  }

  public void setCallbackHandle(String callbackHandle) {
    this.callbackHandle = callbackHandle;
  }

  public Body11 includeDetails(Boolean includeDetails) {
    this.includeDetails = includeDetails;
    return this;
  }

   /**
   * Whether the notification messages that will be send based on this rule should contain encrypted detailed data or not
   * @return includeDetails
  **/
  @ApiModelProperty(example = "null", value = "Whether the notification messages that will be send based on this rule should contain encrypted detailed data or not")
  public Boolean getIncludeDetails() {
    return includeDetails;
  }

  public void setIncludeDetails(Boolean includeDetails) {
    this.includeDetails = includeDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body11 body11 = (Body11) o;
    return Objects.equals(this.triggerEvent, body11.triggerEvent) &&
        Objects.equals(this.params, body11.params) &&
        Objects.equals(this.callbackHandle, body11.callbackHandle) &&
        Objects.equals(this.includeDetails, body11.includeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(triggerEvent, params, callbackHandle, includeDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body11 {\n");
    
    sb.append("    triggerEvent: ").append(toIndentedString(triggerEvent)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    callbackHandle: ").append(toIndentedString(callbackHandle)).append("\n");
    sb.append("    includeDetails: ").append(toIndentedString(includeDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

