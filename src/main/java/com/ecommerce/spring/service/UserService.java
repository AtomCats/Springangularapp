package com.ecommerce.spring.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.spring.model.User;
import com.ecommerce.spring.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAll() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public User getByFirstName(String firstName) {
        return userRepository.findUserByFirstName(firstName);
    }

    public User getByLastName(String lastName) {
        return userRepository.findUserByLastName(lastName);
    }

    public User getByUsername(String userName) {
        return userRepository.findUserByUsername(userName);
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
