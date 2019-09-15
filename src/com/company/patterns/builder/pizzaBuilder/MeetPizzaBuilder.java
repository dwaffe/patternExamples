package com.company.patterns.builder.pizzaBuilder;

public class MeetPizzaBuilder extends PizzaBuilder {
    @Override
    public void makeDough() {
        this.pizza.setDough("na grubym");
    }

    @Override
    public void putSos() {
        this.pizza.setSos("pomidorowy");
    }

    @Override
    public void putIngredients() {
        pizza.addIngredient("szynka");
        pizza.addIngredient("kabanos");
        pizza.addIngredient("boczek");
        pizza.addIngredient("ser");
        pizza.addIngredient("ser");
    }
}
