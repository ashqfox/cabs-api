
package org.ashq.fox.cabs.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "product_id",
    "description",
    "display_name",
    "capacity",
    "image"
})
public class Product {

    /**
     * Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * 
     */
    @JsonProperty("product_id")
    @JsonPropertyDescription("Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.")
    private String productId;
    /**
     * Description of product.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description of product.")
    private String description;
    /**
     * Display name of product.
     * 
     */
    @JsonProperty("display_name")
    @JsonPropertyDescription("Display name of product.")
    private String displayName;
    /**
     * Capacity of product. For example, 4 people.
     * 
     */
    @JsonProperty("capacity")
    @JsonPropertyDescription("Capacity of product. For example, 4 people.")
    private String capacity;
    /**
     * Image URL representing the product.
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("Image URL representing the product.")
    private String image;

    /**
     * Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * 
     */
    @JsonProperty("product_id")
    public String getProductId() {
        return productId;
    }

    /**
     * Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * 
     */
    @JsonProperty("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Description of product.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description of product.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
     * Capacity of product. For example, 4 people.
     * 
     */
    @JsonProperty("capacity")
    public String getCapacity() {
        return capacity;
    }

    /**
     * Capacity of product. For example, 4 people.
     * 
     */
    @JsonProperty("capacity")
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /**
     * Image URL representing the product.
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * Image URL representing the product.
     * 
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

}
