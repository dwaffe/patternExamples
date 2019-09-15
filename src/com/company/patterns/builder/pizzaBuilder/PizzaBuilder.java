package com.company.patterns.builder.pizzaBuilder;

import com.company.patterns.builder.Pizza;

public abstract class PizzaBuilder {
    protected Pizza pizza = new Pizza();

    public abstract void makeDough();
    public abstract void putSos();
    public abstract void putIngredients();

    public Pizza getPizza() {
        return pizza;
    }
}
