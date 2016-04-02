package com.graduation_project.service;

import com.graduation_project.domain.Menu;
import com.graduation_project.domain.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by elena on 02.04.16.
 */
@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    private Integer addMenu(Menu menu){    //input lunch menu of the day
        menuRepository.save(menu);
        return menu.getId();
    }

    private void updateMenu(Menu menu){
        menuRepository.save(menu);
    }

    private void deleteMenu(Integer id){
        menuRepository.delete(id);
    }

    private Page<Menu> findAll(Pageable pageable){
        Page<Menu> menuPage = menuRepository.findAll(pageable);
        return menuPage;
    }

}
