package com.inheritance;

public class Shape {
    private int sides;
    private String name;

    public void printName(){
        System.out.println("I am a general shape");
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(int sides, String name) {
        this.sides = sides;
        this.name = name;
    }
}
