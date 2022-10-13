package com.devmountain.training.abstraction;

public class Pizza {

    public static final String PIZZA_BRAND_NAME = "Round Table";
    private int size;
    private int toppings;

    public Pizza(int size, int toppings) {
        this.size = size;
        this.toppings = toppings;
    }

    public int getSize() {
        return size;
    }

//    public void setSize(int size) {
//        this.size = size;
//    }

    public int getToppings() {
        return toppings;
    }

    public void setToppings(int toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }
}
