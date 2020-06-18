package Polymorphism;

abstract class AbstractA {
    abstract void callme();

    // абстрактные классы все же могут содержат
    // конкретные методы
    void callmetoo() {
        System.out.println("Это конкретный метод");
    }
}
class B extends AbstractA {
    void callme() {
        System.out.println("Реализация метода callme() из класса B");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();
        b.callme();
        b.callmetoo();
    }
}