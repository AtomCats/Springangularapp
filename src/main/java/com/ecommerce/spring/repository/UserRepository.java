package com.ecommerce.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.spring.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findUserByFirstName(String firstName);
    User findUserByLastName(String lastName);
    User findUserByUsername(String userName);
}
