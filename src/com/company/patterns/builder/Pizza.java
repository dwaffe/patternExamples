package com.company.patterns.builder;

import java.util.ArrayList;

public class Pizza {
    private ArrayList<String> ingredients = new ArrayList<>();
    private String dough;
    private String sos;

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSos() {
        return sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }
}
