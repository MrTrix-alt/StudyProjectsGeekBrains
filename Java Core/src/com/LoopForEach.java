package com;

public class LoopForEach {
    public static void main(String[] args) {
        /* Loop for as 'for each'. His form:
        for(тип итерационная_переменная : коллекция)
            блок_операторов

            Цикл будет выполняться до тех пора, пока
            не будут извлечены все элементы из коллекции
         */

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i];
        System.out.println("Сумма равна: " + sum);
        // Можно реализовать иначе с помощью for each
        int sum1 = 0;
        for (int x : nums) {
            System.out.println("x = " + x);
            sum1 += x;
        }
        System.out.println("Сумма равна: " + sum1);

        // Пример 2. Применение break в цикле for each
        int sum2 = 0;
        for (int j : nums) {
            sum2 += j;
            if (j == 5)
                break;
        }
        System.out.println("Сумма первых пяти членов равна: " + sum2);

        // Пример 3.
        for (int q : nums) {
            System.out.print(q + " ");
            q = q * 10; // Этот оператор не оказывает никакого
            // влияния на массив nums
        }
        System.out.println();

        for (int q : nums)
            System.out.print(q + " ");
        System.out.println();


        System.out.println();

        // Пример 4. Применение цикла for each для многомерного массива
        /* В общем случае при использовании цикла for each для перебора
            массива размерностью N получаемые в итоге объекты будут
            массивами размерностью N-1
         */
        int sumNumbers = 0;
        int[][] arr = new int[3][5];

        // Присваиваем значение элементам массива arr
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (i + 1) * (j + 1);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] x : arr) {
            for (int y : x) {
                System.out.println("Значение равно " + y);
                sumNumbers += y;
            }
        }
        System.out.println("Сумма равна: " + sumNumbers);
        //
        System.out.println();
        //

        /* Пример 5.
            for each используется для алгоритмов поиска
         */
        int[] arr1 = {1, 323, 13, 667, 123, 90};
        int val = 667;
        boolean found = false;
        for (int x : arr1) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Значение найдено!");

        //
        System.out.println();
        //

        /* Пример 6. Вложенные циклы for
         */
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
        System.out.println();

        int sum3 = 0;
        int[][][] var1 = new int[3][4][5];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int n = 0; n < 5; n++) {
                    var1[i][j][n] = k;
                    k++;
                    System.out.print(var1[i][j][n] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println();

        for (int[][] x : var1) {
            for (int[] y : x) {
                for (int z : y) {
                    System.out.print("{" + z + "}" + " ");
                    sum3 += z;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(sum3);
    }
}

