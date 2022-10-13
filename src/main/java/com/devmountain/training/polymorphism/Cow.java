package com.devmountain.training.polymorphism;

public class Cow extends AnimalSounds {
    @Override
    public void sound() {
        System.out.println("The cow says: moh moh");
    }

    public void dommyCow() {
        System.out.println("Dummy Cow");
    }
}
