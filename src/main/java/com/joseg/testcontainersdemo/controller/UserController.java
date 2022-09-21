package com.joseg.testcontainersdemo.controller;

import com.joseg.testcontainersdemo.repository.UserRepository;
import com.joseg.testcontainersdemo.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userRepository.findById(id).orElse(new User());
    }

}