package com.company.patterns.builder.pizzaBuilder;

import com.company.patterns.builder.Pizza;

public class HawaiianPizzaBuilder extends PizzaBuilder {
    @Override
    public void makeDough() {
        pizza.setDough("Na grubym");
    }

    @Override
    public void putSos() {
        pizza.setSos("pomidorowy");
    }

    @Override
    public void putIngredients() {
        pizza.addIngredient("ser");
        pizza.addIngredient("ananas");
        pizza.addIngredient("szynka");
    }
}
