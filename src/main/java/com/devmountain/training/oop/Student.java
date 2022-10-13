package com.devmountain.training.oop;

public class Student  extends Person {
    private String schoolName;
    private int grade;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getAge() {
        return super.getAge() * 10;
    }

}
