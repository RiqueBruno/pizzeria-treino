package com.pizzeria.pizzeria_api.repositories;

import com.pizzeria.pizzeria_api.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
