package Exceptions.Throw;

// Продемонстрировать применеие оператор throw

class ThrowDemo {
    static void demoProc() {
        try {
            throw new NullPointerException("демонстрация");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoProc().");
            throw e; // повторно сгенерировать исключение
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
        }
    }
}
