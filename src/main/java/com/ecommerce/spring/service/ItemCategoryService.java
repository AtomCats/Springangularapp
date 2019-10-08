package com.ecommerce.spring.service;

import com.ecommerce.spring.model.ItemCategory;
import com.ecommerce.spring.repository.ItemCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ItemCategoryService {
    @Autowired
    ItemCategoryRepository itemCategoryRepository;

    public List<ItemCategory> getAll() {
        return  StreamSupport.stream(itemCategoryRepository.findAll().spliterator(), false).collect(Collectors.toList());

    }
}
