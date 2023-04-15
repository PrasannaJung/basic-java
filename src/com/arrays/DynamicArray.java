package com.arrays;

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>(3);
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.set(0,100);
        li.remove(1);
        System.out.println(li);
    }
}
