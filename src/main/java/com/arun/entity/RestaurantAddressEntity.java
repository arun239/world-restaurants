package com.arun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by arun on 24/03/19.
 */
@Entity(name = "restaurant_address")
public class RestaurantAddressEntity extends BaseEntity {
    @Column(name = "country_code")
    private double countryCode;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @Column(name = "locality")
    private String locality;

    @Column(name = "locality_verbose")
    private String localityVerbose;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "restaurant_id")
    private double restaurantId;

    public double getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(double countryCode) {
        this.countryCode = countryCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getLocalityVerbose() {
        return localityVerbose;
    }

    public void setLocalityVerbose(String localityVerbose) {
        this.localityVerbose = localityVerbose;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }
}
