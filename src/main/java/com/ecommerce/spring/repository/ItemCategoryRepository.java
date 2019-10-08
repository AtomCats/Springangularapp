package com.ecommerce.spring.repository;

import com.ecommerce.spring.model.Item;
import com.ecommerce.spring.model.ItemCategory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemCategoryRepository extends CrudRepository<ItemCategory, Long> {
    ItemCategory findItemCategoryByName(String name);
    ItemCategory findItemCategoryByItems(List<Item> items);
    ItemCategory findItemCategoryById(Long id);
}
