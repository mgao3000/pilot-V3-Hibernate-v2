package com.devmountain.training.polymorphism;

public class DummyClass {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Object object = tiger;
        AnimalCharacter animalCharacter = tiger;

        Vegetarian vegetarian = tiger;
    }

}
