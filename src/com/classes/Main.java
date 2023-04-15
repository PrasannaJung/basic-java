package com.classes;

// ACCESS MODIFIERS IN JAVA
/*

    DEFAULT => AVAILABLE IN THE CURRENT PACKAGE
    PRIVATE => available within that class only
    PUBLIC  => anywhere
    PROTECTED => only within the package or in the subclasses (child classes)

 */


public class Main {
    public static void main(String[] args) {
        Human prasanna = new Human(20,"Prasanna","Ktm");
        Human kaif = new Human(20,"Kaif","Lucknow");
        System.out.println(Human.population);


    }

}