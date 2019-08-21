package com.ecommerce.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.spring.model.Admin;
import com.ecommerce.spring.service.AdminService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/admins")
@RequiredArgsConstructor
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping(value = "/all")
    public List<Admin> getAllAdmins() {
        return adminService.getAll();
    }
}
