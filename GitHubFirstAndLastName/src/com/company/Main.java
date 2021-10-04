package com.company;

public class Main {

    public static void main(String[] args) {


        //Hi its a very simple application which gives you the person full name
        //and checking if the person is teen or not.
        //still no constructor in the class

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(11);
        System.out.println("get full name " + person.getFullName());
        System.out.println("is teen " + person.stillTeen());
        person.setFirstName("Mike");
        person.setAge(16);
        System.out.println("get full name " + person.getFullName());
        System.out.println("is teen " + person.stillTeen());
        person.setLastName("Mega");
        System.out.println("get full name " + person.getFullName());




    }
}
