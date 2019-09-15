package com.company.patterns.builder;

import com.company.patterns.builder.pizzaBuilder.PizzaBuilder;

public class Chef {
    private Pizza bakedPizza;

    public void bakePizza(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.makeDough();
        pizzaBuilder.putSos();
        pizzaBuilder.putIngredients();
        bakedPizza = pizzaBuilder.getPizza();
    }

    public Pizza getPizza() {
        return bakedPizza;
    }
}
