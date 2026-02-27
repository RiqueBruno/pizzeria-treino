package com.pizzeria.pizzeria_api.controllers;

import com.pizzeria.pizzeria_api.entities.Pizza;
import com.pizzeria.pizzeria_api.services.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {

    @Autowired
    private PizzaService service;

    @GetMapping
    public List<Pizza> listAll() {
        return service.findAll();
    }

    @PostMapping
    public Pizza create(@RequestBody Pizza pizza) {
        return service.save(pizza);
    }
}
