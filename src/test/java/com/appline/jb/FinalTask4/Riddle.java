package com.appline.jb.FinalTask4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Riddle {

    public static void main(String[] args) throws IOException {

        final String QUESTION = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        final String ANSWER = "Заархивированный вирус";

        int chance = 3;
        String youAnswer;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Загадка : " + QUESTION);
        do {
            if (chance == 3) {
                System.out.println("Отгадайте загадку. У Вас есть 3 попытки. Для получения подсказки укажите 'Подсказка'");
            }else {
                System.out.println("Отгадайте загадку. У Вас есть "+ chance +" попытки.");
            }

            do {
                youAnswer = br.readLine();

                if (!youAnswer.equalsIgnoreCase("Подсказка")) break;
                if (chance == 3){
                    System.out.println("Подсказка : Жук в конверте");
                    chance = 1;
                }else{
                    System.out.println("Подсказка уже недоступна. Укажите Ваш ответ");
                }
                System.out.println("Отгадайте загадку. У Вас есть "+ chance +" попытка.");

            } while (true);

            chance--;

            if (ANSWER.equalsIgnoreCase(youAnswer.trim())){
                System.out.println("Правильно!");
                break;
            }else if(chance == 2 || chance == 1){
                System.out.println("Подумай еще!");

            }else if(chance == 0){
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }while (true);

    }
}
