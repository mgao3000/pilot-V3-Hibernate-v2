package com.devmountain.training.encapsulation;

public class Employee {
    public static final String MY_COMPANY_NAME = "Google.com";
    private String name;
    private int employeeId;
    private int age;

    //never do it!!!
//    public int employeeAge;

    String gameName;

    public int getAge() {
        return age * 10;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getName() { return name;  }

    public int getEmployeeId() {  return employeeId;  }

    private void setAge(int newAge) { this.age = newAge;  }

    public void setName(String newName) {
        if(!newName.contains("Brandon"))
            this.name = newName;
    }

    public void setEmployeeId(int empId) {   this.employeeId = empId; }

}

