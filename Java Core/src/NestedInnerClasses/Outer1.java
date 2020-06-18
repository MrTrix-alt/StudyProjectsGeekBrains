package NestedInnerClasses;

class Outer1 {
    private int outer_x = 100;

    void test() {
        for(int i = 0; i < 10; i++) {
            class Inner1 { // класс определен в теле метода test
                void display() {
                    System.out.println("вывод: outer_x = " + outer_x);
                }
            }
                Inner1 inner = new Inner1(); // объект класса Inner1
                inner.display();             // может быть создан только в "теле" внешнего класса
                                             // в который он вложен.

            }
    }
}

class InnerClassDemo1 {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        outer.test();
    }

}
