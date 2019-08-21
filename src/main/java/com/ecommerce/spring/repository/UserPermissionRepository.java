package com.ecommerce.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.spring.model.UserPermission;

@Repository
public interface UserPermissionRepository extends CrudRepository<UserPermission, Long> {

    UserPermission findUserPermissionByName(String name);
}
