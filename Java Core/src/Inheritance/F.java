package Inheritance;

class F {
    int i, j;
    // Переопределение метода
    F(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class G extends F {
    int k;

    G(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) { // теперь он является перегруженным методом,а не переопределенным
        // super.show(); // здесь вызывается метод show() из класса F
        System.out.println(msg + " k: " + k);
    }
}

class OverRide {
    public static void main(String[] args) {
        G subOb = new G(1,2,3);
        subOb.show("Это"); // вызов идет в класс G
        subOb.show(); // вызов идет в класс F


    }
}
