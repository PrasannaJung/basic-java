package com.classes;

// STATIC THING BELONGS TO THE CLASS ITSELF
// NO NEED TO INSTANTIATE THE OBJECT TO ACCESS IT

import javax.swing.text.html.parser.TagElement;

public class Human {
     private int age;
     private String name;
     private String city;

    static int population;

    public Human() {
        this.age = -1;
        this.city = "";
        this.name = "";
    }

    public Human(int age, String name, String city) {
        this.age = age;
        this.name = name;
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}


