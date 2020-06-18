package com;
// создание массива размерностью 3х4х5
// заполнение элементов произведением их индексов
// демонстрация применения трехмерного массива
public class ArrayFour {
    public static void main(String[] args) {
        int[][][] arr = new int[3][4][5];
        int i, j, k;
        int b = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    arr[i][j][k] = b;
                    b++;
                }
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
