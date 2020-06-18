package Exceptions.CustomExceptionClasses;

// В этой программе создается специальный тип исключений
// т.е. собственной исключение, наследуемое из класс Exception,
// которое в свою очередь наследуется из класс Throwable

class MyException extends Exception {
     private int detail;

     MyException(int a) { // Constructor
         detail = a;
     }

     @Override
     public String toString() {
         return "MyException[" + detail + "]";
     }
}

class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Вызван метод compute(" + a + ")");
        if (a > 10)
            throw new MyException(a);
        System.out.println("Нормальное заверешение.");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}

