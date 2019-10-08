package com.ecommerce.spring.repository;

import com.ecommerce.spring.model.Item;
import com.ecommerce.spring.model.ItemCategory;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
    Item findItemByName(String name);
    Item findItemByItemCategory(ItemCategory itemCategory);
    Item findItemByNameContaining(String nameContains);
    Item findItemById(Long id);
}
