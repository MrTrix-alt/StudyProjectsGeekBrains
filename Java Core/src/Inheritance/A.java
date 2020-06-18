package Inheritance;
// Simple example of Inheritance

// Create SuperClass
class A {
    int i, j; // если объявить их как private, то
              // доступа к ним не будет в подклассе

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

// create a SubClass by extending class A
class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}

class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        // the SuperClass can be used independently (самостоятельно)
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое объекта superOb: ");
        superOb.showij();
        System.out.println();

        /* Подкласс имеет доступ ко всем ОТКРЫТЫМ членам
           своего суперкласса */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое объекта subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Сумма i, j и k в объекте subOb:");
        subOb.sum();
    }
}