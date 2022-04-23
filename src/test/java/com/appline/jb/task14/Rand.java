package com.appline.jb.task14;

import java.util.Random;

public class Rand {
    public static void main(String[] args) {

        int[] nums = new int[15];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnd(-20,20);
        }

        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>max) max = nums[i];
            if (nums[i]<min) min = nums[i];
        }

        System.out.println("Максимальный элемент: "+ max);
        System.out.println("Минимальный элемент: "+ min);

        System.out.println((Math.max(Math.abs(max), Math.abs(min))));
    }

    public static int rnd(int min, int max){

        if (min > max || (max - min + 1 > Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("Invalid range");
        }

        return new Random().nextInt(max - min + 1) + min;
    }
}
