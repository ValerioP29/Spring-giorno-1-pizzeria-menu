package com.pizzeria.pizzeria_menu;


public class Drink {
    private String name;
    private double price;
    private double volume;
    private double calories;

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", calories=" + calories +
                '}';
    }

    public Drink(String name, double price, double volume, double calories) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.calories = calories;


    }
}
