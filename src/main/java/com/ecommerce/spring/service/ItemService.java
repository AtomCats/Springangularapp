package com.ecommerce.spring.service;

import com.ecommerce.spring.model.Item;
import com.ecommerce.spring.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAll(){
        return  StreamSupport.stream(itemRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Item getByName(String name) {
        return itemRepository.findItemByName(name);
    }

    public Item getById(Long id) {
        return itemRepository.findItemById(id);
    }
}
