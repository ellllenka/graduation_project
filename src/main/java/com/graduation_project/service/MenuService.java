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

    public Menu getMenu (Integer id){
        return menuRepository.findOne(id);
    }

    public Integer addMenu(Menu menu){    //input lunch menu of the day
        menuRepository.save(menu);
        return menu.getId();
    }

    public void updateMenu(Menu menu){
        menuRepository.save(menu);
    }

    public void deleteMenu(Integer id){
        menuRepository.delete(id);
    }

    public Page<Menu> findAll(Pageable pageable){
        Page<Menu> menuPage = menuRepository.findAll(pageable);
        return menuPage;
    }

}
