package com.ecommerce.spring.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long Id;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "users_permission",
    joinColumns = @JoinColumn(name = "userpermission_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "users_id", referencedColumnName = "id"))
    private List<User> users;
}
