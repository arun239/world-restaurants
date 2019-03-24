package com.arun.pojo;

import com.arun.entity.RestaurantAddressEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by arun on 24/03/19.
 */
@Getter
@Setter
public class Restaurant {

    private String name;

    private String cuisines;

    private float cost;

    private String currencyName;

    private String currencySymbol;


    private String ratingColor;


    private String ratingText;


    private Boolean hasTableBooking;


    private Boolean hasOnlineDelivery;


    private float aggregateRating;


    private double votes;

    private RestaurantAddress restaurantAddress;

}
