package com.company.patterns.builder.pizzaBuilder;

import com.company.patterns.builder.Pizza;

public class MargaritaPizzaBuilder extends PizzaBuilder {
    @Override
    public void makeDough() {
        pizza.setDough("Na cienkim");
    }

    @Override
    public void putSos() {
        pizza.setSos("pomidorowy");
    }

    @Override
    public void putIngredients() {
        pizza.addIngredient("ser");
    }
}
