package com.arun.controller;

import com.arun.entity.RestaurantEntity;
import com.arun.service.RestaurantService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by arun on 24/03/19.
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("restaurants")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RestaurantController {

    final RestaurantService restaurantService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getRestaurants(@RequestParam(value = "cuisines", defaultValue = "") String[] cuisines,
                                                     @RequestParam(value = "sortBy", defaultValue = "name") String sortByColumn,
                                                     @RequestParam(value = "order", defaultValue = "ASC") String sortingOrder,
                                                     @RequestParam(value = "restaurantName", defaultValue = "") String restaurantName,
                                                     @RequestParam(value = "pageNumber", defaultValue = "0") Integer pageNumber,
                                                     @RequestParam(value = "pageSize", defaultValue = "100") Integer pageSize) {


        Page<RestaurantEntity> restaurantEntityPage = restaurantService.getRestaurants(restaurantName, sortingOrder, sortByColumn, cuisines, pageSize, pageNumber);
        return new ResponseEntity<Page<RestaurantEntity>>(restaurantEntityPage, HttpStatus.OK);
    }
}
