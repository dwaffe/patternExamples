package com.company.patterns;

import com.company.patterns.builder.Chef;
import com.company.patterns.builder.pizzaBuilder.HawaiianPizzaBuilder;
import com.company.patterns.builder.pizzaBuilder.MargaritaPizzaBuilder;
import com.company.patterns.builder.Pizza;
import com.company.patterns.builder.pizzaBuilder.MeetPizzaBuilder;

public class MainBuilder {

    public static void main(String[] args) {
        Chef chef = new Chef();
        chef.bakePizza(new MargaritaPizzaBuilder());
        Pizza margarita = chef.getPizza();

        chef.bakePizza(new HawaiianPizzaBuilder());
        Pizza hawaiian = chef.getPizza();

        chef.bakePizza(new MeetPizzaBuilder());
        Pizza meet = chef.getPizza();

        System.out.println(margarita.getIngredients());
        System.out.println(hawaiian.getIngredients());
        System.out.println(meet.getIngredients());
    }
}
