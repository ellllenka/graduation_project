package com.graduation_project.service;

import com.graduation_project.domain.Restaurant;
import com.graduation_project.domain.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by elena on 02.04.16.
 */
@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    private Integer addRestaurant(Restaurant restaurant){    //input a restaurant
        restaurantRepository.save(restaurant);
        return restaurant.getId();
    }

    private void updateRestaurant(Restaurant restaurant){
        restaurantRepository.save(restaurant);
    }

    private void deleteRestaurant(Integer id){
        restaurantRepository.delete(id);
    }

    private Page<Restaurant> findAll(Pageable pageable){
        Page<Restaurant> restaurantPage = restaurantRepository.findAll(pageable);
        return restaurantPage;
    }
}


/*
2 types of users: admin and regular users
Admin can input a restaurant and it's lunch menu of the day (2-5 items usually, just a dish name and price)
Menu changes each day (admins do the updates)
Users can vote on which restaurant they want to have lunch at
Only one vote counted per user
If user votes again the same day:
If it is before 11:00 we asume that he changed his mind.
If it is after 11:00 then it is too late, vote can't be changed
Each restaurant provides new menu each day.
 */
