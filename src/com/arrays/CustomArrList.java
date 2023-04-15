package com.arrays;

public class CustomArrList<T> {
    private int size;
    private int[] nums;

    public CustomArrList(int length) {
        this.size = 0;
        this.nums = new int[length];
    }

    public void add(int el){
        if(size == nums.length){
            int[] newArr = new int[this.size * 2];
            for (int i = 0; i < nums.length; i++) {
                newArr[i] = nums[i];
            }
            this.nums = newArr;
        }
        nums[size++] = el;
    }
}
