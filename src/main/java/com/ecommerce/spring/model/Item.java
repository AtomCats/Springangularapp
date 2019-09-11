package com.ecommerce.spring.model;

import lombok.Data;

import java.util.List;

@Data
public class Item {
    private Long id;
    private String name;
    private Float price;
    private List<ItemCategory> itemCategory;
}
