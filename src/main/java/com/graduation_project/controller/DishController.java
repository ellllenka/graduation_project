package com.graduation_project.controller;

import com.graduation_project.domain.Dish;
import com.graduation_project.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by elena on 30.03.16.
 */
@Controller
public class DishController {
    @Autowired
    private DishService dishService;

    @RequestMapping(value = "/dish", method = RequestMethod.GET)
    @ResponseBody
    public Dish getDish (Integer id){
        return dishService.getDish(id);
    }

    @RequestMapping(value = "/dish", method = RequestMethod.POST)
    @ResponseBody
    public Integer addDish(@RequestBody Dish dish){
        return dishService.addDish(dish);
    }

    @RequestMapping(value = "/dish", method = RequestMethod.PUT)
    @ResponseBody
    public void updateDish(@RequestBody Dish dish){
        dishService.updateDish(dish);
    }

    @RequestMapping(value = "/dish/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteDish(@PathVariable Integer id){
        dishService.deleteDish(id);
    }

    @RequestMapping(value = "/dishes", method = RequestMethod.GET)
    @ResponseBody
    public Page<Dish> getAll(Pageable pageable){
        return dishService.findAll(pageable);
    }
}













