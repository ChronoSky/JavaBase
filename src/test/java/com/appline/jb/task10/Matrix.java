package com.appline.jb.task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {
    public static void main(String[] args) throws IOException {
        // 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Укажите размер строк матрицы");
        int m = Integer.parseInt(br.readLine());

        System.out.println("Укажите размер столбцов матрицы");
        int n = Integer.parseInt(br.readLine());

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Введите значение для ячейки с индексом ["+ i +"]["+ j +"]");
                matrix[i][j] = Integer.parseInt(br.readLine());

            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][0]*3 + " ");
        }
    }

}
