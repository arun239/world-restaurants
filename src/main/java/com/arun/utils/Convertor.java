package com.arun.utils;

import com.arun.entity.RestaurantAddressEntity;
import com.arun.entity.RestaurantEntity;
import com.arun.pojo.Restaurant;
import com.arun.pojo.RestaurantAddress;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by arun on 24/03/19.
 */
@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Slf4j
public class Convertor {

    final DozerBeanMapper dozerBeanMapper;

    public Restaurant deepCloneRestaurantEntityToPojo(RestaurantEntity restaurantEntity) {
        Set<RestaurantAddressEntity> restaurantAddressEntitySet = restaurantEntity.getRestaurantAddresses();
        RestaurantAddress restaurantAddress = null;
        if (restaurantAddressEntitySet!= null) {
            if (restaurantAddressEntitySet.size() > 1) {
                // raise exception.
                log.error("Multiple Addresses available for Restaurant, Expected one.");
            } else {
                RestaurantAddressEntity restaurantAddressEntity = (RestaurantAddressEntity)restaurantAddressEntitySet.toArray()[0];
                restaurantAddress = this.dozerBeanMapper.map(restaurantAddressEntity, RestaurantAddress.class);
            }
        }

        Restaurant restaurant = this.dozerBeanMapper.map(restaurantEntity, Restaurant.class);
        restaurant.setRestaurantAddress(restaurantAddress);
        return restaurant;

    }
}
