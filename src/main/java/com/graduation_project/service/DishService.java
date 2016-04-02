package com.graduation_project.service;

import com.graduation_project.domain.Dish;
import com.graduation_project.domain.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by elena on 30.03.16.
 */
@Service
public class DishService {
    @Autowired
    private DishRepository dishRepository;

    private Integer addDish(Dish dish){
        dishRepository.save(dish);
        return dish.getId();
    }

    private void updateDish(Dish dish){
        dishRepository.save(dish);
    }

    private void deleteDish(Integer id){
        dishRepository.delete(id);
    }

    private Page<Dish> findAll(Pageable pageable){
        Page<Dish> dishPage = dishRepository.findAll(pageable);
        return dishPage;
    }




}
