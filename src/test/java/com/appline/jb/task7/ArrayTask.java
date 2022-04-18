package com.appline.jb.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTask {
    public static void main(String[] args) throws IOException {

        final int NUM_X = 3;
        final int NUM_Y = 7;
        final int NUM_Z = 9;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size;
        do {
            System.out.println("Укажите размер масива (>0)");
            size = Integer.parseInt(br.readLine());
        }while (size<0);

        if (size>0){
            System.out.println("Заполните массив");
            int[] nums = new int[size];
            for (int i=0; i < nums.length; i++){
                nums[i] = Integer.parseInt(br.readLine());
            }

            for (int i : nums){
                if (i== NUM_X || i== NUM_Y || i== NUM_Z){
                    System.out.println("Данное значение имеется в константах");
                }
            }
        }

    }
}
