package com.pizzeria.pizzeria_api.controllers;

import com.pizzeria.pizzeria_api.entities.Ingredient;
import com.pizzeria.pizzeria_api.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ingredients")
public class IngredientController {
    @Autowired
    private IngredientService service;

    @GetMapping
    public List<Ingredient> listAll() {
        return service.findAll();
    };

    @PostMapping
    public Ingredient create(@RequestBody Ingredient ingredient) {
        return service.save(ingredient);
    };
};
