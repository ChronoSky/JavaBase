package com.appline.jb.task13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckText {
    public static void main(String[] args) throws IOException {

        // 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите строку из слов разделенную пробелами");
        String text = br.readLine();

        String[] test =  text.split(" ");
        int latCount = 0;

        for(String s: test){
            if (s.matches("[A-Za-z]+")) {
                System.out.println(s);
                latCount++;
            }
        }

        System.out.println(String.format("Слов с латинскими буквами : %s", latCount));

    }
}
