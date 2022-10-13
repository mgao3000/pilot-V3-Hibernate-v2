package com.devmountain.training.abstraction;

public class PizzaOne {
    private int size;

    private Object object;
    private int toppings;

//    public PizzaOne(int size) {
//        this.size = size;
//    }

    public PizzaOne() {  }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getToppings() {
        return toppings;
    }

    public void setToppings(int toppings) {
        this.toppings = toppings;
    }


    public boolean decideSurcharge(int order, int numberOfPizza) {
        boolean shouldCharge = shouldIPutSurcharge(order, numberOfPizza);
//        if(order > 10) {
//            shouldCharge = true;
//        } else if(numberOfPizza > 5) {
//            shouldCharge = true;
//        }
        //dkflgfdlkglfd;
        //dfgfdgdfg
        return shouldCharge;
    }

    private boolean shouldIPutSurcharge(int order, int numberOfPizza) {
        boolean shouldCharge = false;
        if(order > 10) {
            shouldCharge = true;
        } else if(numberOfPizza > 5) {
            shouldCharge = true;
        }
        return shouldCharge;
    }



}
