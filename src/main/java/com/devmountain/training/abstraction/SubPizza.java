package com.devmountain.training.abstraction;

public class SubPizza extends PizzaOne {

    private int age;
    public SubPizza(int age) {
    //    super(30);
        this.age = age;
    }

    public void dummy() {

    }

    public String greeting(String name) {
        System.out.println("Hi" + " " + name);
        return "Hi" + " " + name;
    }
}
