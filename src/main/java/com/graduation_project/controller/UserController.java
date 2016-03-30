package com.graduation_project.controller;

import com.graduation_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by elena on 30.03.16.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
}
