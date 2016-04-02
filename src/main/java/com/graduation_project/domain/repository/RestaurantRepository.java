package com.graduation_project.domain.repository;

import com.graduation_project.domain.Restaurant;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by elena on 02.04.16.
 */
@Repository
public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, Integer> {
}
