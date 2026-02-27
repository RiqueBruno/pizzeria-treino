package com.pizzeria.pizzeria_api.services;

import com.pizzeria.pizzeria_api.entities.Ingredient;
import com.pizzeria.pizzeria_api.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository repository;

    public List<Ingredient> findAll() {
        return repository.findAll();
    }

    public Ingredient save(Ingredient ingredient) {
        return repository.save(ingredient);
    }

    public void consumeStock(Long id, Integer amount) {
        Ingredient ing = repository.findById(id).orElseThrow(() -> new RuntimeException("Ingredient not found"));
        if(ing.getStockQuantity() < amount) {
            throw new RuntimeException("Insufficient stock for: " + ing.getName());
        }
        ing.setStockQuantity(ing.getStockQuantity() - amount);
        repository.save(ing);
    }
}
