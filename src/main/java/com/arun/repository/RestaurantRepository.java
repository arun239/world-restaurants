package com.arun.repository;

import com.arun.entity.RestaurantEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by arun on 24/03/19.
 */
@Repository
public interface RestaurantRepository extends PagingAndSortingRepository<RestaurantEntity, Long> {
    Page<RestaurantEntity> findAllByNameContainingAndCuisinesContaining(String name, String cuisines, Pageable pageable);
}
