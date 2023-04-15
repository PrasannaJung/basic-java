package com.strings;


import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String firstName = "Prasanna";
        String lastName = new String("Prasanna");
        lastName.intern();

        String finalName = "Prasanna";

        if(lastName == finalName){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

        String capital = firstName.toUpperCase();
        System.out.println(firstName);


        StringBuilder sb = new StringBuilder("Prasanna");
        sb.append("Jung");
        sb.reverse();
        System.out.println(sb);


    }
}
