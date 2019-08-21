package com.ecommerce.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.spring.model.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {

    Admin findAdminByFirstName(String firstName);
    Admin findAdminByLastName(String lastName);
    Admin findAdminByUsername(String username);
}
