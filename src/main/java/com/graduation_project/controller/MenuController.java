package com.graduation_project.controller;

import com.graduation_project.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by elena on 02.04.16.
 */
@Controller
public class MenuController {
    @Autowired
    private MenuService menuService;
}
