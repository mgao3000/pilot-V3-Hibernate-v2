package com.devmountain.training.abstraction;

public abstract class Person {
    private String name;
    private String gender;
    private double salary;

//    public Person(String name) {
//        this.name = name;
//    }

    public Person(String name, String gender, double salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    protected double computePay() {
        System.out.println("Inside Employee computePay");
        return this.salary / 52;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public void exam() {
        System.out.println("Do not have any Exam logic yet!");
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name=" + this.name + "::Gender=" + this.gender + "::Salary=" + salary;
    }

    abstract public boolean isInOffice();

}

