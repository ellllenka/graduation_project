package com.graduation_project.domain.repository;

import com.graduation_project.domain.Dish;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by elena on 30.03.16.
 */
@Repository
public interface DishRepository extends PagingAndSortingRepository<Dish, Integer> {
}
