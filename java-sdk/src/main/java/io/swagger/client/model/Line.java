/*
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

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ExtensionSummary;

/**
 * Line
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T10:24:24.257Z")
public class Line {
  @SerializedName("line")
  private Integer line = null;

  @SerializedName("extension")
  private ExtensionSummary extension = null;

  public Line line(Integer line) {
    this.line = line;
    return this;
  }

   /**
   * Line number
   * @return line
  **/
  @ApiModelProperty(example = "null", value = "Line number")
  public Integer getLine() {
    return line;
  }

  public void setLine(Integer line) {
    this.line = line;
  }

  public Line extension(ExtensionSummary extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Extensions object that this line number is mapped to.
   * @return extension
  **/
  @ApiModelProperty(example = "null", value = "Extensions object that this line number is mapped to.")
  public ExtensionSummary getExtension() {
    return extension;
  }

  public void setExtension(ExtensionSummary extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Line line = (Line) o;
    return Objects.equals(this.line, line.line) &&
        Objects.equals(this.extension, line.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line, extension);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Line {\n");
    
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

