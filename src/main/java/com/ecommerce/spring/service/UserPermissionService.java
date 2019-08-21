package com.ecommerce.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.spring.model.UserPermission;
import com.ecommerce.spring.repository.UserPermissionRepository;

@Service
public class UserPermissionService {

    @Autowired
    UserPermissionRepository userPermissionRepository;

    public UserPermission getByName(String name) {
        return userPermissionRepository.findUserPermissionByName(name);
    }

}
