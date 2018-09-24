
package org.ashq.fox.cabs.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "first_name",
    "last_name",
    "email",
    "picture",
    "promo_code"
})
public class Profile {

    /**
     * First name of the Uber user.
     * 
     */
    @JsonProperty("first_name")
    @JsonPropertyDescription("First name of the Uber user.")
    private String firstName;
    /**
     * Last name of the Uber user.
     * 
     */
    @JsonProperty("last_name")
    @JsonPropertyDescription("Last name of the Uber user.")
    private String lastName;
    /**
     * Email address of the Uber user
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("Email address of the Uber user")
    private String email;
    /**
     * Image URL of the Uber user.
     * 
     */
    @JsonProperty("picture")
    @JsonPropertyDescription("Image URL of the Uber user.")
    private String picture;
    /**
     * Promo code of the Uber user.
     * 
     */
    @JsonProperty("promo_code")
    @JsonPropertyDescription("Promo code of the Uber user.")
    private String promoCode;

    /**
     * First name of the Uber user.
     * 
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First name of the Uber user.
     * 
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Last name of the Uber user.
     * 
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last name of the Uber user.
     * 
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Email address of the Uber user
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Email address of the Uber user
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Image URL of the Uber user.
     * 
     */
    @JsonProperty("picture")
    public String getPicture() {
        return picture;
    }

    /**
     * Image URL of the Uber user.
     * 
     */
    @JsonProperty("picture")
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * Promo code of the Uber user.
     * 
     */
    @JsonProperty("promo_code")
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Promo code of the Uber user.
     * 
     */
    @JsonProperty("promo_code")
    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

}
