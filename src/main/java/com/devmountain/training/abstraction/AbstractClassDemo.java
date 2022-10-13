package com.devmountain.training.abstraction;

public class AbstractClassDemo {

    public void test() {
        Employee employee = new Employee("Mike", "M",
                20000L, 123);
        Person person = employee;

        employee.dummyMethodInEmployee();


   //     Person p = new Person("mike", "male", 101.11);
 //       person.

    }
}
