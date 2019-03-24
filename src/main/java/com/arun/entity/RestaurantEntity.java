package com.arun.entity;


import javax.persistence.*;
import java.util.Set;

/**
 * Created by arun on 24/03/19.
 */
@Entity(name = "restaurant")
public class RestaurantEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "cuisines")
    private String cuisines;

    @Column(name = "cost")
    private float cost;

    @Column(name = "currency_name")
    private String currencyName;

    @Column(name = "currency_symbol")
    private String currencySymbol;

    @Column(name = "rating_color")
    private String ratingColor;

    @Column(name = "rating_text")
    private String ratingText;

    @Column(name = "has_table_booking")
    private Boolean hasTableBooking;

    @Column(name = "has_online_delivery")
    private Boolean hasOnlineDelivery;

    @Column(name = "aggregate_rating")
    private float aggregateRating;

    @Column(name = "votes")
    private double votes;

    @JoinColumn(name = "restaurant_id")
    @OneToMany(fetch = FetchType.EAGER)
    private Set<RestaurantAddressEntity> restaurantAddresses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisines() {
        return cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getRatingColor() {
        return ratingColor;
    }

    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    public String getRatingText() {
        return ratingText;
    }

    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    public Boolean getHasTableBooking() {
        return hasTableBooking;
    }

    public void setHasTableBooking(Boolean hasTableBooking) {
        this.hasTableBooking = hasTableBooking;
    }

    public Boolean getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    public void setHasOnlineDelivery(Boolean hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    public float getAggregateRating() {
        return aggregateRating;
    }

    public void setAggregateRating(float aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public double getVotes() {
        return votes;
    }

    public void setVotes(double votes) {
        this.votes = votes;
    }

    public Set<RestaurantAddressEntity> getRestaurantAddresses() {
        return restaurantAddresses;
    }

    public void setRestaurantAddresses(Set<RestaurantAddressEntity> restaurantAddresses) {
        this.restaurantAddresses = restaurantAddresses;
    }
}

