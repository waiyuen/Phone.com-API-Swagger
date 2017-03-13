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
public class CreateRouteParams {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("rules")
  private List<Object> rules = null;
  @SerializedName("extension")
  private Object extension = null;

  /**
   * Name
   **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Rule Sets
   **/
  @ApiModelProperty(value = "Rule Sets")
  public List<Object> getRules() {
    return rules;
  }
  public void setRules(List<Object> rules) {
    this.rules = rules;
  }

  /**
   * Extension Reference
   **/
  @ApiModelProperty(value = "Extension Reference")
  public Object getExtension() {
    return extension;
  }
  public void setExtension(Object extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRouteParams createRouteParams = (CreateRouteParams) o;
    return (this.name == null ? createRouteParams.name == null : this.name.equals(createRouteParams.name)) &&
        (this.rules == null ? createRouteParams.rules == null : this.rules.equals(createRouteParams.rules)) &&
        (this.extension == null ? createRouteParams.extension == null : this.extension.equals(createRouteParams.extension));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.rules == null ? 0: this.rules.hashCode());
    result = 31 * result + (this.extension == null ? 0: this.extension.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRouteParams {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  rules: ").append(rules).append("\n");
    sb.append("  extension: ").append(extension).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
