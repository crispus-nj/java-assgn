package com.company;

public class TestStudent {
    public static void main(String[] args)
    {
Student S1 = new Student("khamis kingi", "male",24);
GradStudent G1 = new GradStudent("Oyiersupervisor","sct121-07072018");
        System.out.println("name"+S1.getName(),"gender"+S1.getGender(),"age"+S1.getAge());
        System.out.println("supervisorname"+G1.getSupName(),"reistration number"+G1.getRegNo());


    }
}
