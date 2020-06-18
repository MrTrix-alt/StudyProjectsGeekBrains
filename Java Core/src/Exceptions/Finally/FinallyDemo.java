package Exceptions.Finally;

/* Пример, в котором демонстрируются три метода,
   возвращющих управление разными способами.
   Но ни в одном из них не пропускается выполнение
   оператор блока finally.
 */

class FinallyDemo {
    // сгененерировать исключение в методе
    static void procA() {
        try {
            System.out.println("В теле метода procA().");
            throw new RuntimeException("демонстрация");
        } finally {
            System.out.println("Блок оператор finally в методе procA().");
        }
    }

    // возвратить управление из блока оператор try
    static void procB() {
        try {
            System.out.println("В теле метода procB().");
            return; // здесь происходит выход из блока оператора try
                    // через оператор return.
        } finally {
            System.out.println("Блок оператор finally в методе procB()");
        }
    }

    // выполнить блок try как обычно
    static void procC() {
        try {
            System.out.println("В теле метода procC().");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("Перхвачено исключение " + e);
        } finally {
            System.out.println("Блока оператор finally в методе procC().");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (RuntimeException e) {
            System.out.println("Исключение перехвачено " + e);

        }
        procB();
        procC();
    }
}

