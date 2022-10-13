package com.devmountain.training.oop;

public class ItStudentDriver {

    public void checkItStudentForms() {
        ITStudent itStudent = new ITStudent();

        DummyInterface dummyInterface = itStudent;

        Object obj = itStudent;

        Student student = itStudent;

        Person person = itStudent;

        HumanBeing humanBeing = itStudent;

        University university = itStudent;  
    }

}
