package com.graduation_project.controller;

import com.graduation_project.domain.Menu;
import com.graduation_project.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by elena on 02.04.16.
 */
@Controller
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    @ResponseBody
    public Menu getDish (Integer id){
        return menuService.getMenu(id);
    }

    @RequestMapping(value = "/menu", method = RequestMethod.POST)
    @ResponseBody
    public Integer addMenu(@RequestBody Menu menu){
        return menuService.addMenu(menu);
    }

    @RequestMapping(value = "/menu", method = RequestMethod.PUT)
    @ResponseBody
    public void updateMenu(@RequestBody Menu menu){
        menuService.updateMenu(menu);
    }

    @RequestMapping(value = "/menu/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteMenu(@PathVariable Integer id){
        menuService.deleteMenu(id);
    }

    @RequestMapping(value = "/menus", method = RequestMethod.GET)
    @ResponseBody
    public Page<Menu> getAll(Pageable pageable){
        return menuService.findAll(pageable);
    }
}
