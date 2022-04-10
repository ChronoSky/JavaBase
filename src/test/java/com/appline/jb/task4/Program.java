package com.appline.jb.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

    public static void main(String[] args) throws IOException {
        // 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());
        br.close();

        // 2
        double avg = (double)(x+y+z)/3;
        System.out.println("Среднее арифметическое : "+ avg);

        // 3
        double avg2 = Math.floor(avg/2);

        // 4
        if (avg2>3){
            System.out.println("Программа выполнена корректно");
        }


    }
}
