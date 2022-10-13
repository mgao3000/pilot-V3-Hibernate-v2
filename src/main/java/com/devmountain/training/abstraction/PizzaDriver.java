package com.devmountain.training.abstraction;

public class PizzaDriver {
    public static void main(String[] args) {
        SubPizza subPizza = new SubPizza(20);
        subPizza.greeting("James");
    }
}
