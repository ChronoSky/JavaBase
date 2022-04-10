package com.appline.jb.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {

    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число:");
        int num1 = Integer.parseInt(br.readLine());

        System.out.println("Введите второе число:");
        int num2 = Integer.parseInt(br.readLine());

        System.out.println("Введите арифметический оператор:");
        String oper = br.readLine();

        switch (oper){
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                if (num2==0) {
                    System.out.println("Делить на ноль нельзя");
                }else{
                    System.out.println((double)(num1/num2));
                }
                break;
            default:
                System.out.println("Указан не верный оператор. Допустимые варианты: +, - , / , *");

        }

    }
}
