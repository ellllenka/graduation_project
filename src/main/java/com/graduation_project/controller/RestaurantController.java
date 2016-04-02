package com.graduation_project.controller;

import com.graduation_project.domain.Restaurant;
import com.graduation_project.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by elena on 02.04.16.
 */
@Controller
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @RequestMapping(value = "/restaurant", method = RequestMethod.GET)
    @ResponseBody
    public Restaurant getRestaurant (Integer id){
        return restaurantService.getRestaurant(id);
    }

    @RequestMapping(value = "/restaurant", method = RequestMethod.POST)
    @ResponseBody
    public Integer addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.addRestaurant(restaurant);
    }

    @RequestMapping(value = "/restaurant", method = RequestMethod.PUT)
    @ResponseBody
    public void updateRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.updateRestaurant(restaurant);
    }

    @RequestMapping(value = "/restaurant/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteRestaurant(@PathVariable Integer id){
        restaurantService.deleteRestaurant(id);
    }

    @RequestMapping(value = "/restaurants", method = RequestMethod.GET)
    @ResponseBody
    public Page<Restaurant> getAll(Pageable pageable){
        return restaurantService.findAll(pageable);
    }
}
