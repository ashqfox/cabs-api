
package org.ashq.fox.cabs.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "uuid"
})
public class Activity {

    /**
     * Unique identifier for the activity
     * 
     */
    @JsonProperty("uuid")
    @JsonPropertyDescription("Unique identifier for the activity")
    private String uuid;

    /**
     * Unique identifier for the activity
     * 
     */
    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    /**
     * Unique identifier for the activity
     * 
     */
    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
