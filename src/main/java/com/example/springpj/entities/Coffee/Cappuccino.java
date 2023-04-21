package com.example.springpj.entities.Coffee;

import java.util.ArrayList;

public class Cappuccino implements Coffee{

    private String name;
    private int price;
    private ArrayList<String> ingredients = new ArrayList<>();

    @Override
    public void makeCoffee() {

    }


    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        return "name: '" + name +  ", price: " + price + ", ingredients=" + ingredients;
    }
}
