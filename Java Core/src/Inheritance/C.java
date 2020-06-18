package Inheritance;

// Использовать ключевое слово super с целью
// предотвратить сокрытие имен
class C {
    int i;
}

    // Creat SubClass by extending class C
class D extends C {
    int i; // этот член класса D скрывает член i из класса С

        D(int a, int b) {
            super.i = a; // member i from class C
            i = b; // member i from class D
        }

        void show() {
            System.out.println("Член i в суперклассе: " + super.i);
            System.out.println("Член i в подклассе: " + i);
        }
    }
class UseSuper {
    public static void main(String[] args) {
        D subOb = new D(1, 3);

        subOb.show();
    }
}
