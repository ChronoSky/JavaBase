package com.appline.jb.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1
        String unit = "";
        do {
            System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
            unit = br.readLine();
        } while (!(unit.equals("1") || unit.equals("2")));

        // 2
        String type = "";
        do {
            if (unit.equals("1")){
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            }else{
                System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - унции, 4 - караты");
            }
            type = br.readLine();
        } while (!type.matches("[1-4]"));

        // 3
        String count = "";
        do {
            System.out.println("Введите число");
            count = br.readLine();
        } while (!count.matches("\\d+"));


        if (unit.equals("1")){
            double metr = 0;
            double mil = 0;
            double yard = 0;
            double fut = 0;

            switch (type){
                case "1" :
                    metr = Integer.parseInt(count);
                    mil = 0.00062 * metr;
                    yard = 1.09 * metr;
                    fut = 3.28 * metr;
                    break;
                case "2" :
                    mil = Integer.parseInt(count);
                    metr = 1609.34 * mil;
                    yard = 1760 * mil;
                    fut = 5280 * mil;
                    break;
                case "3" :
                    yard = Integer.parseInt(count);
                    metr = 0.91 * yard;
                    mil = 0.00057 * yard;
                    fut = 3 * yard;
                    break;
                case "4" :
                    fut = Integer.parseInt(count);
                    metr = 0.3 * fut;
                    mil = 0.00019 * fut;
                    yard = 0.33 * fut;

            }

            System.out.println("Результат:");
            System.out.println("Метры: "+ metr);
            System.out.println("Мили: " + mil);
            System.out.println("Ярды: " + yard);
            System.out.println("Футы: " + fut);

        }else{
            double gr = 0;
            double kg = 0;
            double unc = 0;
            double karat = 0;

            switch (type){
                case "1" :
                    gr = Integer.parseInt(count);
                    kg = 0.001 * gr;
                    unc = 0.035 * gr;
                    karat = 5 * gr;
                    break;
                case "2" :
                    kg = Integer.parseInt(count);
                    gr = 1000 * kg;
                    unc = 35.27 * kg;
                    karat = 5000 * kg;
                    break;
                case "3" :
                    unc = Integer.parseInt(count);
                    gr = 28.35 * unc;
                    kg = 0.028 * unc;
                    karat = 141.75 * unc;
                    break;
                case "4" :
                    karat = Integer.parseInt(count);
                    gr = 0.2 * karat;
                    kg = 0.0002 * karat;
                    unc = 0.0071 * karat;

            }

            System.out.println("Результат:");
            System.out.println("Граммы: "+ gr);
            System.out.println("Килграммы: " + kg);
            System.out.println("Унции: " + unc);
            System.out.println("Карты: " + karat);

        }

    }
}
