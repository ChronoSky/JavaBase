package com.appline.jb.FinalTask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value;

        do {
            System.out.println("Укажите кол-во строк (целое положительное число)");
            value = br.readLine();
        } while (!value.matches("\\d+") );

        String[] str = new String[Integer.parseInt(value)];
        for (int i=0; i < str.length ; i++){
            System.out.println("Введите строку "+ (i+1));
            str[i] = br.readLine();
        }

        int indMax = 0;
        int maxChars = 0;

        for (int i = 0; i < str.length; i++) {

            StringBuilder newTxt = new StringBuilder();
            for (int j = 0; j < str[i].length(); j++) {
                if (!newTxt.toString().contains(str[i].substring(j,j+1))){
                    newTxt.append(str[i].charAt(j));
                }
            }

            if (maxChars < newTxt.length()){
                maxChars = newTxt.length();
                indMax = i;
            }

        }

        System.out.println(str[indMax]);


    }
}
