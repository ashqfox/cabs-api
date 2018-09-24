
package org.ashq.fox.cabs.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "message",
    "fields"
})
public class Error {

    @JsonProperty("code")
    private Integer code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("fields")
    private String fields;

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("fields")
    public String getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(String fields) {
        this.fields = fields;
    }

}
