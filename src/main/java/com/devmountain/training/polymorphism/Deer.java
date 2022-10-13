package com.devmountain.training.polymorphism;

public class Deer extends Animal implements Vegetarian, Mammals {

    private String dummyName;

    public Deer(String name, int weight) {
        super(name, weight);
    }

    /**
     * This implements the interface Vegetarian
     */
    @Override
    public void eat() {
        System.out.println("As a Deer, I only eat grass, no meat please!");
    }


    /**
     * The following methods implement Mammals interface
     */
    @Override
    public void speak() {
    }

    @Override
    public void walk() {
    }

    @Override
    public void sleep() {
    }

    @Override
    public void drink() {
    }
}
