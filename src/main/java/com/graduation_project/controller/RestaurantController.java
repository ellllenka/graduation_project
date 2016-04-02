package com.graduation_project.controller;

import com.graduation_project.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by elena on 02.04.16.
 */
@Controller
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;
}
