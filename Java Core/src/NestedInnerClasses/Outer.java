package NestedInnerClasses;

// Продемонстрировать применение внутреннего класса
class Outer {
    private int outer_x = 100;

    void test() {
        Inner inner = new Inner(); // экземпляр класса можно создать только в контексте класса Outer
        inner.display();
    }

    // внутренний класс
    class Inner {
        int y = 10;
        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }

   /** void showy() {
        System.out.println(y); - ошибка, здесь переменная "y" недоступна
    } */
}

class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
