package com.appline.jb.task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringData {
    public static void main(String[] args) throws IOException {

        // 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num_1;
        Integer num_2;

        do{
            System.out.println("Укажите первое число");
            num_1 = br.readLine();
            if (num_1.matches("\\d+")) break;
            System.out.println("Было указано не числовое значение");
        }while(true);

        // 2
        do{
            System.out.println("Укажите второе число");
            String value = br.readLine();
            if (value.matches("\\d+")) {num_2 = Integer.parseInt(value); break;}
            System.out.println("Было указано не числовое значение");
        }while(true);

        // 3
        if (num_2>Integer.parseInt(num_1)){
            System.out.println(num_2);
            System.out.println(Double.parseDouble(num_1));
        }else{
            System.out.println(num_1);
            System.out.println(num_2.doubleValue());
        }

    }
}
