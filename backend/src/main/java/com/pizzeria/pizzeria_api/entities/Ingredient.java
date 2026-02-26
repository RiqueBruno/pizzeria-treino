package com.pizzeria.pizzeria_api.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int stockQuantity;
}
