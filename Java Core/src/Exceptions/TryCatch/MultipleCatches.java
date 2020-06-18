package Exceptions.TryCatch;

// Продемонстрировать применение
// несколько операторов catch

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 2; i++) {
                args[i] = "table";
                System.out.println(args[i]); // не выводиться в консоль
            }

            int a = args.length; // если a = 0, т.е. argh.length = 0
                                 // будет выполняться только оператор catch 1
                                 // в ином случае, будет выполняться оператор
                                 // catch 2. Смотри строчку 18.

            System.out.println("a = " + a); // не выводится в консоль
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        } catch (ArithmeticException e) { // catch 1
            System.out.println("Деление на нуль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) { // catch 2
            System.out.println("Ошибка индексации за пределами массива: " + e);
        }
        System.out.println("После блока операторов try/catch.");
    }
}
