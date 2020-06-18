package Vargs;

// Продемонстрировать применение аргументов переменной длины
class VarArgs {
    // теперь метод vaTest() объявляется с аргументами переменной длины
    static void vaTest(int... v) {
        // int doIt(int a, int b, double c, int ... vals) - вполне допустимо
        // аргумент переменной длины должен находиться последним в методе,
        // если есть "обычные" параметры.
        // Также нельзя использовать более одного раза в методе
        // аргумент переменной длины
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

public static void main(String[] args) {
    // Обрати вимание на возможные способы вызова
    // метода vaTest() с аргументами переменной длины

    vaTest(10); // 1 аргумент
    vaTest(1,2,3); // Two arguments
    vaTest(); // Without arguments
    }
}