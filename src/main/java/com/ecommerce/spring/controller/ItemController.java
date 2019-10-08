package com.ecommerce.spring.controller;

import com.ecommerce.spring.model.Item;
import com.ecommerce.spring.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/items")
@RequiredArgsConstructor
public class ItemController {
    @Autowired
    ItemService itemService;


    @GetMapping(value = "/all")
    public List<Item> getAll() {
        return itemService.getAll();
    }
}
