package com.pizzeria.pizzeria_menu;

import java.util.List;

public class Menu {
    public List<Pizza> pizze;
    public  List<String> toppings;
    public List<Drink> drinks;

    @Override
    public String toString() {
        return "Menu{" +
                "pizze=" + pizze +
                ", toppings=" + toppings +
                ", drinks=" + drinks +
                '}';
    }

    public Menu(List<Pizza> pizze, List<String> toppings, List<Drink> drinks) {
        this.pizze = pizze;
        this.toppings = toppings;
        this.drinks = drinks;


    }

    public void printMenu() {
        System.out.println("--com.pizzeria.pizzeria_menu.Pizza--");
        pizze.forEach(System.out::println);
        System.out.println("--Drinks--");
        drinks.forEach(System.out::println);
        System.out.println("--Toppings--");
        toppings.forEach(System.out::println);
    }

}
