package com.devmountain.training.pattern.di;

public class ServiceClient {

    public static void main(String[] args) {
//        ServiceB serviceB = new ServiceB(100, "dummy", 100);
   //     ServiceB serviceB = new ServiceB(100);
//        ServiceA serviceA = new ServiceA(serviceB);
        ServiceA serviceA = new ServiceA();
        String name = "Mike";
        int size = 30;
        int standardSize = 65;

        serviceA.displayGreetingMessage(name);

        System.out.println("Is the final Result positive: " + serviceA.isFinalResultPositive(standardSize, size));
    }
}
