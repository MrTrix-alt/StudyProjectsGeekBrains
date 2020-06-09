package ru.homework.lessonOne;

class HomeWorkTwo {

    static boolean checkBalance(int[] arr) {
        int leftSum, rightSum;

        for (int i = 0; i < arr.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum)
                return true;
        }
        return false;
    }

    static void swipeInSide(int[] arr, int n) {

    }


    public static void main(String[] args) {
        System.out.println("Пункт 1:");

        /*Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
                     Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
                     С помощью цикла и условия заменить 0 на 1, 1 на 0;
        */

        int[] arrOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] == 1)
                arrOne[i] = 0;
            else
                arrOne[i] = 1;
        }
        for (int x : arrOne)
            System.out.print(x + " ");

        // Оператор, чтобы разделить пункты в консоли
        System.out.println();


    /* Задание 2. Задать пустой целочисленный массив размером 8.
                  С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
        System.out.println("Пункт 2:");
        int[] arrTwo = new int[8];
        for (int i = 0, j = 0; i < arrTwo.length; j += 3, i++)
            arrTwo[i] = j;
        for (int x : arrTwo)
            System.out.print(x + " ");


        // Оператор, чтобы разделить пункты в консоли
        System.out.println();

        /* Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
            пройти по нему циклом, и числа меньшие 6 умножить на 2;
        */
        System.out.println("Пункт 3:");
        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6)
                arrThree[i] *= 2;
        }
        for (int x : arrThree)
            System.out.print(x + " ");

        // Оператор, чтобы разделить пункты в консоли
        System.out.println();

        /* Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        */
        System.out.println("Пункт 4:");
        int[][] square = new int[4][4];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0, k = square[i].length; j < square[i].length; j++, k--) {
                if (i == j || i == (k - 1)) {
                    square[i][j] = 1;
                }
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }


        /* Задание 5. Задать одномерный массив и найти в нем минимальный и
                      максимальный элементы (без помощи интернета);
        */
        System.out.println("Пункт 5:");
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int minVal = array[0];
        int maxVal = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minVal) {
                minVal = array[i];
            } else if (array[i] > maxVal) {
                maxVal = array[i];
            }
        }
        System.out.println("Min: " + minVal);
        System.out.println("Max: " + maxVal);

        /* Задание 6. Написать метод, в который передается не пустой одномерный целочисленный массив,
                      метод должен вернуть true, если в массиве есть место, в котором сумма левой и
                      правой части массива равны.
                      Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
                      checkBalance([1, 1, 1, || 2, 1]) → true,
                      граница показана символами ||, эти символы в массив не входят;
        */
        System.out.println("Пункт 6:");
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        int[] arrNew = {2, 2, 2, 1, 2, 2, 10, 1, 5};
        System.out.println("СheckBalance is: " + checkBalance(arr));
        System.out.println("СheckBalance is: " + checkBalance(arrNew));

        /* Задание 7. Написать метод, которому на вход подается одномерный массив и
                      число n (может быть положительным, или отрицательным),
                      при этом метод должен сместить все элементымассива на n позиций.
                      Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        */
        /** Не могу понять как реализовать сдвиг в программе.
         * Понимаю, что необходимо индекс i (в цикле) как-то сдвинуть на число n
         * в зависимости от его знака(+ или -).  Написал только сам массив и метод с параметрами)
         */

        int[] newArr = {1, 2, 3, 4, 5, 7, 8, 9};
        swipeInSide(newArr, 1);

        }
}







