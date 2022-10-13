package com.devmountain.training.polymorphism;

public class AnimalMain {
    public static void main(String[] args) {
        AnimalSounds animalSounds = new AnimalSounds();
        System.out.println("Now the animalSounds behaves as a general animalSounds!");
        animalSounds.sound();
        displaySeperateLine();

        animalSounds = new Cow();
        System.out.println("Now the animalSounds behaves as a Cow!");
        animalSounds.sound();
        displaySeperateLine();

        animalSounds = new Cat();
        System.out.println("Now the animalSounds behaves as a Cat!");
        animalSounds.sound();
        displaySeperateLine();

        AnimalSounds Dog = new Dog();
        System.out.println("Now the animalSounds behaves as a Dog!");
        animalSounds.sound();
        displaySeperateLine();

        Cow cow = new Cow();
        System.out.println("Now the Cow behaves as a Cow!");
        cow.sound();
        displaySeperateLine();

        Cat cat = new Cat();
        System.out.println("Now the Cat behaves as a Cat!");
        cat.sound();
        displaySeperateLine();

        Dog dog = new Dog();
        System.out.println("Now the Dog behaves as a Dog!");
        dog.sound();
        displaySeperateLine();

        Deer deer = new Deer("abc", 120);
        Goat goat = new Goat();
        Mammals mammals = goat;
        mammals.sleep();
        mammals.speak();
//        deer.sleep();
//        deer.speak();
    }

    private static void displaySeperateLine() {
        System.out.println("=================================================================\n");
    }


}
