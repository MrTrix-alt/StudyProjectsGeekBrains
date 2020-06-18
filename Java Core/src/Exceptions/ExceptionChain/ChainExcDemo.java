package Exceptions.ExceptionChain;

// Демонстрация цепочек исключений

class ChainExcDemo {
    static void demoProc() {
        // создать исключение
        NullPointerException e = new NullPointerException("верхний уровень");

        // добавить причину исключения
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            // Вывести исключение верхнего уровня
            System.out.println("Перехвачено исключение: " + e);

            // Вывести исключение, послужившей причиной
            // для исключения верхнего уровня
            System.out.println("Первопричина " + e.getCause());
        }
    }
}
