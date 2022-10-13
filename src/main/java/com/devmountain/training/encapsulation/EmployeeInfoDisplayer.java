package com.devmountain.training.encapsulation;

public class EmployeeInfoDisplayer {

    public static void main (String[] args)   {
        System.out.println(("Company=" + Employee.MY_COMPANY_NAME));

        Employee employee = new Employee();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        //never do it!!!
//        int employeeAge = employee.employeeAge;

//        String employeeName= employee.name;

        employee.setName("Robert");
    //.    employee.setAge(33);
        employee.setEmployeeId(1253);

        System.out.println("Employee's name: " + employee.getName());
        System.out.println("Employee's age: " + employee.getAge());
        System.out.println("Employee's ID: " + employee.getEmployeeId());
    }
}
