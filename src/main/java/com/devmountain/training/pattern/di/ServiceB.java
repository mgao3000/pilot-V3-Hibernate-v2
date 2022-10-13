package com.devmountain.training.pattern.di;

public class ServiceB {

    private int age;
    private String dummy;

    public ServiceB(int age, String dummy, int sum, String nickName , int anotherInt, float floatValue) {
//    public ServiceB(int age, String str, float wage) {
//    public ServiceB(int age) {
//    public ServiceB(int age, String str) {
        this.age = age;
//        this.dummy = str;
    }

    public String getGreeting(String name) {
      return "Hi " + name;
    }

    public int getFinalResult(int size) {
        int finalResult = 0;
        if(size > 0)
            finalResult = size * 10 + 50;
        return finalResult;
    }
}
