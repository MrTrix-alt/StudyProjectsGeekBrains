package Exceptions.TryCatch;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();

        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
            } catch (ArithmeticException e) {
                System.out.println("Деление на нуль");
                // в этом случае, во втором методе println
                // в классе Throwable переопределяется
                // метод toString, определенный в классе Object
                System.out.println("Исключение: " + e);
                a = 0; // присвоить нуль и продолжить работу
            }
            System.out.println("a: " + a);
        }
    }
}
