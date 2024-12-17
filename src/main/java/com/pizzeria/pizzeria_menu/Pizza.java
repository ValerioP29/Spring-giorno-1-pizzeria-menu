package com.pizzeria.pizzeria_menu;

import lombok.Data;

import java.util.List;

public class Pizza {
    private String name;
    private int price;
    private int calories;
    List<String> toppings;

    public Pizza(String name, int price, int calories, List<String> toppings) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                ", toppings=" + toppings +
                '}';
    }
}

