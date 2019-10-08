package com.ecommerce.spring.controller;


import com.ecommerce.spring.model.ItemCategory;
import com.ecommerce.spring.service.ItemCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/item-categories")
@RequiredArgsConstructor
public class ItemCategoryController {
    @Autowired
    ItemCategoryService itemCategoryService;

    @GetMapping(value = "/all")
    public List<ItemCategory> getAll() {
        return itemCategoryService.getAll();
    }
}
