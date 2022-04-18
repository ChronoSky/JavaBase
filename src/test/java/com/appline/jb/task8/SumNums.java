package com.appline.jb.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value;
        do {
            System.out.println("Укажите целое положительное число");
            value = br.readLine();
        }while (!value.matches("\\d+"));

        int result = 0;
        for (int i = 1; i < Integer.parseInt(value); i++){
            if (i%2!=0){
                result += i;
            }
        }
        System.out.println("Сумма нечетных числел : " + result);
    }
}
