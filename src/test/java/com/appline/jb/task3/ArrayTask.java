package com.appline.jb.task3;

public class ArrayTask {

    public static void main(String[] args) {

        // 1
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 10;
        nums[2] = 6;
        nums[3] = 2;
        nums[4] = 8;

        // 2
        int num = nums[0];
        nums[0] = nums[nums.length-1];
        nums[4] = num;

        // 3
        System.out.println( nums[0] +  nums[nums.length/2]);

    }
}
