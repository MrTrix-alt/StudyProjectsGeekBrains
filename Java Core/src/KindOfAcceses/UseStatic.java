package KindOfAcceses;

// Продемонстрировать статические переменные, методы и блоки кода
class UseStatic {
    static int a = 3; // сперва устанавливается значение 3,
    // после инициализируется статический блок static, в котором
    // b инициализируется значением a * 4, т.е 12.
    // После этого вызывается метод main(), который вызывает метод meth()
    private static int b;

    static void meth(int x) {
        System.out.println("x = " + x); // x - локальная переменная
        System.out.println("a = " + a); // а и b - статические переменные
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Статический блок инициализирован");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(42);



    }
}
