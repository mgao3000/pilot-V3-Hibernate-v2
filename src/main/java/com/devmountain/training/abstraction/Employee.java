package com.devmountain.training.abstraction;

public class Employee extends Person {
    private int employeeId;

    public Employee(String name, String gender, double salary, int employeeId) {
        super(name, gender, salary);
        this.employeeId = employeeId;
    }

    public void dummyMethodInEmployee() {
        System.out.println("Inside dummyMethodInEmployee");
    }

    @Override
    public boolean isInOffice() {
        boolean isEmployeeInOfficeFlag = false;
        if (this.employeeId > 0) {
            System.out.println("Employee Logged In");
            isEmployeeInOfficeFlag = true;
        } else {
            System.out.println("Employee Logged Out");
        }
        return isEmployeeInOfficeFlag;
    }

    @Override
    public void exam() {
        if(getName() != null && getGender() != null && getSalary() > 10000.0) {
            System.out.println("The employee is valid!");
        } else {
            System.out.println("Not quite sure if the employee is qualified!");
        }
    }
}
