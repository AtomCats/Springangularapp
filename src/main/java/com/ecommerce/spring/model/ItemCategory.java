package com.ecommerce.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String description;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "items_categories",
            joinColumns = @JoinColumn(name = "itemcategory_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "items_id", referencedColumnName = "id"))
    private List<Item> items;
}
