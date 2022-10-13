package com.devmountain.training.polymorphism;

public class DeerDriver {

    public static void main(String[] args) {

        Deer deer = new Deer("dummyName", 200);
        Mammals mammals = deer;

        Animal animal = deer;

        Vegetarian vegetarian = deer;

        Object object = deer;
    }

}
