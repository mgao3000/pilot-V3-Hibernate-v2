package com.devmountain.training.polymorphism;

public class Rabbit implements AnimalCharacter {
    @Override
    public String eatHabit() {
        return "No meat please!";
    }

    @Override
    public String generalInformation() {
        return "I am rabbit. My weight is usually under 10 pounds. ";
    }

    public void checkedExeption() {
        Integer.valueOf("123");   //.parseInt("123");
    }

    //   ...
}
