package com.arun.service;

import com.arun.entity.RestaurantEntity;
import com.arun.repository.RestaurantRepository;
import com.arun.utils.Convertor;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * Created by arun on 24/03/19.
 */
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RestaurantService {

    final RestaurantRepository restaurantRepository;
    final Convertor convertor;

    public Page<RestaurantEntity> getRestaurants(String nameQuery, String order, String sortBy, String[] cuisines,
                                           Integer pageSize, Integer pageNumber) {
        Sort sort = new Sort(Sort.Direction.valueOf(order), sortBy);
        Pageable pageable = new PageRequest(pageNumber, pageSize, sort);
        String cuisinesCSV = String.join(",", cuisines);
        Page<RestaurantEntity> restaurantEntityPage = this.restaurantRepository.findAllByNameContainingAndCuisinesContaining(nameQuery, cuisinesCSV, pageable);

//        List<RestaurantEntity> restaurantEntityList = restaurantEntityPage.getContent();
//
//        List<Restaurant> restaurantList = new ArrayList<>();
//        for (RestaurantEntity restaurantEntity : restaurantEntityList) {
//            restaurantList.add(this.convertor.deepCloneRestaurantEntityToPojo(restaurantEntity));
//        }

        return restaurantEntityPage;

    }
}
