package Vargs;

public class VarArgs3 {
    // Методы, принимающий аргументы переменной длины,
    // можно перегружать.
    // Аргументы переменной длины и перегрузка

    static void vaTest(int... v) {
        System.out.print("vaTest(int...): " + "Количество аргументов: " + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean...): " + "Количество аргументов: " + v.length + " Содержимое: ");

        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest(String, int...): " + "Количество аргументов: " + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }


    public static void main(String[] args) {

        vaTest(1, 2 ,3);
        vaTest(false, true, true);
        vaTest("Проверка", 10, 20);

    }
}