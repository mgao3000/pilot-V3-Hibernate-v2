package com.devmountain.training.oop;

public class InheritanceSample {

    public static void main(String [] args) {
        Person person = new Person();
        person.setAge(90);

        Student student = new Student();
        student.setSchoolName("MIT");
        student.setAge(18);

        ITStudent itStudent = new ITStudent();
        itStudent.setAge(20);

        student.setSchoolName("MIT");

        System.out.println("Person's age=" + person.getAge());

//        itStudent = person;

         person = itStudent;  //  itStudent.
         student = itStudent;
         DummyInterface dummyInterface = itStudent;

           //     person.
        System.out.println("After assigning person=itStudent, Person's age=" + person.getAge());

        person = student;
        System.out.println("After assigning person=student, Person's age=" + person.getAge());


    }
}
