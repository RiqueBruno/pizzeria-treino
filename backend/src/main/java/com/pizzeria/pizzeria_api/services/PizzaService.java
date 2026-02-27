package com.pizzeria.pizzeria_api.services;

import com.pizzeria.pizzeria_api.entities.Pizza;
import com.pizzeria.pizzeria_api.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository repository;

    public List<Pizza> findAll() {
        return repository.findAll();
    };

    public Pizza save(Pizza pizza) {
        return repository.save(pizza);
    };

    @Transactional
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Pizza not found with ID: " + id);
        }
        repository.deleteById(id);
    }
}
