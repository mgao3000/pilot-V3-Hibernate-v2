package com.devmountain.training.pattern;

public class Client {

    public static void main(String[] args) {

        HelloWorldSingleton helloNate = HelloWorldSingleton.getInstance();

        helloNate.sayHello("Nate");


        HelloWorldSingleton helloMo = HelloWorldSingleton.getInstance();

        helloMo.sayHello("Mo");

    }
}
