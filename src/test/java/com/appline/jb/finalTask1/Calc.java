package com.appline.jb.finalTask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double kurs = 0.0;
        do {
            System.out.println("Укажите курс");
            String value = br.readLine();
            if (value.matches("\\d+(.\\d{2})?")){
                kurs = Double.parseDouble(value);
                break;
            }
        }while(true);

        double count = 0;
        do {
            System.out.println("Количество рублей");
            String value = br.readLine();
            if (value.matches("\\d+(.\\d{2})?")){
                count = Double.parseDouble(value);
                break;
            }
        }while(true);


        System.out.println(String.format("%.2f", Math.rint(count*100/kurs)/100));

    }
}
