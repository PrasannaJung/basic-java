package com.inheritance;

public class Rectangle extends Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Rectangle(String color){
        super(4,"Rectangle");
        this.color = color;
    }

    @Override
    public void printName(){
        System.out.println("I am a rectangle");
    }

}
