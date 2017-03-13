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

import io.swagger.client.model.FilterIdNameArray;
import io.swagger.client.model.RouteFull;
import io.swagger.client.model.SortIdName;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ListRoutes {
  
  @SerializedName("filters")
  private FilterIdNameArray filters = null;
  @SerializedName("sort")
  private SortIdName sort = null;
  @SerializedName("total")
  private Integer total = null;
  @SerializedName("offset")
  private Integer offset = null;
  @SerializedName("limit")
  private Integer limit = null;
  @SerializedName("items")
  private List<RouteFull> items = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public FilterIdNameArray getFilters() {
    return filters;
  }
  public void setFilters(FilterIdNameArray filters) {
    this.filters = filters;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SortIdName getSort() {
    return sort;
  }
  public void setSort(SortIdName sort) {
    this.sort = sort;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<RouteFull> getItems() {
    return items;
  }
  public void setItems(List<RouteFull> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRoutes listRoutes = (ListRoutes) o;
    return (this.filters == null ? listRoutes.filters == null : this.filters.equals(listRoutes.filters)) &&
        (this.sort == null ? listRoutes.sort == null : this.sort.equals(listRoutes.sort)) &&
        (this.total == null ? listRoutes.total == null : this.total.equals(listRoutes.total)) &&
        (this.offset == null ? listRoutes.offset == null : this.offset.equals(listRoutes.offset)) &&
        (this.limit == null ? listRoutes.limit == null : this.limit.equals(listRoutes.limit)) &&
        (this.items == null ? listRoutes.items == null : this.items.equals(listRoutes.items));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.filters == null ? 0: this.filters.hashCode());
    result = 31 * result + (this.sort == null ? 0: this.sort.hashCode());
    result = 31 * result + (this.total == null ? 0: this.total.hashCode());
    result = 31 * result + (this.offset == null ? 0: this.offset.hashCode());
    result = 31 * result + (this.limit == null ? 0: this.limit.hashCode());
    result = 31 * result + (this.items == null ? 0: this.items.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRoutes {\n");
    
    sb.append("  filters: ").append(filters).append("\n");
    sb.append("  sort: ").append(sort).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("  offset: ").append(offset).append("\n");
    sb.append("  limit: ").append(limit).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
