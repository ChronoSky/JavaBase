package com.appline.jb.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Avg {
    public static void main(String[] args) throws IOException {

        // 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String size;
        do {
            System.out.println("Укажите размер массива");
            size = br.readLine();
        }while (!size.matches("\\d+"));

        double[] nums = new double[Integer.parseInt(size)];

        System.out.println("Заполните массив значениями (double)");
        double sum = 0;
        for (int i = 0; i < Integer.parseInt(size); i++){
            nums[i] = Double.parseDouble(br.readLine());
            sum += nums[i];
        }

        // 2
        double avg = sum/Integer.parseInt(size);

        // 3
        System.out.println("Вывод результата:");
        for (Double d : nums){
            System.out.println(d*avg);
        }

    }

}
