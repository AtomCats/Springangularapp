package com.ecommerce.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.sql.Blob;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Float price;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] image;
    @ManyToMany(mappedBy = "items")
    private List<ItemCategory> itemCategory;
}
