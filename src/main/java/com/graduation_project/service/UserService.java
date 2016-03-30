package com.graduation_project.service;

import com.graduation_project.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by elena on 30.03.16.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
}
