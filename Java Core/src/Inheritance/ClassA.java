package Inheritance;

// Динамическая диспетчеризация методов
class ClassA {
    void callme() {
        System.out.println("В методе callme() из классе ClassА");
    }
}
    class ClassB extends ClassA {
        // переопределить метод
        void callme() {
            System.out.println("В методе callme() из класса ClassB");
        }
    }
        class ClassC extends ClassA {
            void callme() {
                System.out.println("В методе callme() из класса ClassC");

            }
        }

class  Dispatch {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();

        ClassA f = new ClassA();

        ClassA r; // получить ссылку на объект типа ClassA
        r = a;           // переменная r ссылка на объект типа ClassA
        r.callme();      // вызвать варинт метода callme()
                         // определенный в классе ClassA
        r = b;           // переменная r ссылка на объект типа ClassB
        r.callme();      // вызвать варинт метода callme()
                         // определенный в классе ClassB
        r = c;           // переменная r ссылка на объект типа ClassC
        r.callme();      // вызвать варинт метода callme()
                         // определенный в классе ClassC

    }
}
