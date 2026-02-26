package com.pizzeria.pizzeria_api.repositories;

import com.pizzeria.pizzeria_api.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
