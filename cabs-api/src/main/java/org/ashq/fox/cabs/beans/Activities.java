
package org.ashq.fox.cabs.beans;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "offset",
    "limit",
    "count",
    "history"
})
public class Activities {

    /**
     * Position in pagination.
     * 
     */
    @JsonProperty("offset")
    @JsonPropertyDescription("Position in pagination.")
    private Integer offset;
    /**
     * Number of items to retrieve (100 max).
     * 
     */
    @JsonProperty("limit")
    @JsonPropertyDescription("Number of items to retrieve (100 max).")
    private Integer limit;
    /**
     * Total number of items available.
     * 
     */
    @JsonProperty("count")
    @JsonPropertyDescription("Total number of items available.")
    private Integer count;
    @JsonProperty("history")
    private List<Activity> history = new ArrayList<Activity>();

    /**
     * Position in pagination.
     * 
     */
    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    /**
     * Position in pagination.
     * 
     */
    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * Number of items to retrieve (100 max).
     * 
     */
    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    /**
     * Number of items to retrieve (100 max).
     * 
     */
    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Total number of items available.
     * 
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * Total number of items available.
     * 
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("history")
    public List<Activity> getHistory() {
        return history;
    }

    @JsonProperty("history")
    public void setHistory(List<Activity> history) {
        this.history = history;
    }

}
