
package org.ashq.fox.cabs.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "product_id",
    "currency_code",
    "display_name",
    "estimate",
    "low_estimate",
    "high_estimate",
    "surge_multiplier"
})
public class PriceEstimate {

    /**
     * Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles
     * 
     */
    @JsonProperty("product_id")
    @JsonPropertyDescription("Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles")
    private String productId;
    /**
     * [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code.
     * 
     */
    @JsonProperty("currency_code")
    @JsonPropertyDescription("[ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code.")
    private String currencyCode;
    /**
     * Display name of product.
     * 
     */
    @JsonProperty("display_name")
    @JsonPropertyDescription("Display name of product.")
    private String displayName;
    /**
     * Formatted string of estimate in local currency of the start location. Estimate could be a range, a single number (flat rate) or "Metered" for TAXI.
     * 
     */
    @JsonProperty("estimate")
    @JsonPropertyDescription("Formatted string of estimate in local currency of the start location. Estimate could be a range, a single number (flat rate) or \"Metered\" for TAXI.")
    private String estimate;
    /**
     * Lower bound of the estimated price.
     * 
     */
    @JsonProperty("low_estimate")
    @JsonPropertyDescription("Lower bound of the estimated price.")
    private Double lowEstimate;
    /**
     * Upper bound of the estimated price.
     * 
     */
    @JsonProperty("high_estimate")
    @JsonPropertyDescription("Upper bound of the estimated price.")
    private Double highEstimate;
    /**
     * Expected surge multiplier. Surge is active if surge_multiplier is greater than 1. Price estimate already factors in the surge multiplier.
     * 
     */
    @JsonProperty("surge_multiplier")
    @JsonPropertyDescription("Expected surge multiplier. Surge is active if surge_multiplier is greater than 1. Price estimate already factors in the surge multiplier.")
    private Double surgeMultiplier;

    /**
     * Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles
     * 
     */
    @JsonProperty("product_id")
    public String getProductId() {
        return productId;
    }

    /**
     * Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles
     * 
     */
    @JsonProperty("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code.
     * 
     */
    @JsonProperty("currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code.
     * 
     */
    @JsonProperty("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Display name of product.
     * 
     */
    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display name of product.
     * 
     */
    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Formatted string of estimate in local currency of the start location. Estimate could be a range, a single number (flat rate) or "Metered" for TAXI.
     * 
     */
    @JsonProperty("estimate")
    public String getEstimate() {
        return estimate;
    }

    /**
     * Formatted string of estimate in local currency of the start location. Estimate could be a range, a single number (flat rate) or "Metered" for TAXI.
     * 
     */
    @JsonProperty("estimate")
    public void setEstimate(String estimate) {
        this.estimate = estimate;
    }

    /**
     * Lower bound of the estimated price.
     * 
     */
    @JsonProperty("low_estimate")
    public Double getLowEstimate() {
        return lowEstimate;
    }

    /**
     * Lower bound of the estimated price.
     * 
     */
    @JsonProperty("low_estimate")
    public void setLowEstimate(Double lowEstimate) {
        this.lowEstimate = lowEstimate;
    }

    /**
     * Upper bound of the estimated price.
     * 
     */
    @JsonProperty("high_estimate")
    public Double getHighEstimate() {
        return highEstimate;
    }

    /**
     * Upper bound of the estimated price.
     * 
     */
    @JsonProperty("high_estimate")
    public void setHighEstimate(Double highEstimate) {
        this.highEstimate = highEstimate;
    }

    /**
     * Expected surge multiplier. Surge is active if surge_multiplier is greater than 1. Price estimate already factors in the surge multiplier.
     * 
     */
    @JsonProperty("surge_multiplier")
    public Double getSurgeMultiplier() {
        return surgeMultiplier;
    }

    /**
     * Expected surge multiplier. Surge is active if surge_multiplier is greater than 1. Price estimate already factors in the surge multiplier.
     * 
     */
    @JsonProperty("surge_multiplier")
    public void setSurgeMultiplier(Double surgeMultiplier) {
        this.surgeMultiplier = surgeMultiplier;
    }

}
