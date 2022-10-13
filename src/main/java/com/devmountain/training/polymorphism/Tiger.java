package com.devmountain.training.polymorphism;

public class Tiger implements AnimalCharacter, Vegetarian {
    @Override
    public String eatHabit() {
        return "Only meat please!";
    }

    @Override
    public String generalInformation() {
        return "I am tiger, my weight is usually over 300 pounds";
    }

    @Override
    public void eat() {

    }
}
