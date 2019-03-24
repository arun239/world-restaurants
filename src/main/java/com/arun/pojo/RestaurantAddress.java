package com.arun.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

/**
 * Created by arun on 24/03/19.
 */
@Getter
@Setter
public class RestaurantAddress {
    private double countryCode;

    private String city;

    private String address;

    private String locality;

    private String localityVerbose;

    private double longitude;

    private double latitude;

    private long restaurantId;

}
