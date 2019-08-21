package com.ecommerce.spring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.stereotype.Service;

import com.ecommerce.spring.model.Admin;
import com.ecommerce.spring.repository.AdminRepository;

@Service
public class AdminService  {

    @Autowired
    AdminRepository adminRepository;

    public List<Admin> getAll() {

        return  StreamSupport.stream(adminRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Admin getByFirstName (String firtName) {
        return adminRepository.findAdminByFirstName(firtName);
    }

    public Admin getByLastName(String lastName) {
        return adminRepository.findAdminByLastName(lastName);
    }

    public Admin AdminGetByUserName(String userName) {
        return adminRepository.findAdminByUsername(userName);
    }
}
