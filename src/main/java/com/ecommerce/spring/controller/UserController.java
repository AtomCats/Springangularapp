package com.ecommerce.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.spring.model.Admin;
import com.ecommerce.spring.model.User;
import com.ecommerce.spring.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    //@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/all")
    public List<User> getAllAdmins() {
        return userService.getAll();
    }

    @PostMapping(value = "/add")
    public User add(@RequestBody User user) {
        return userService.save(user);
    }
}
