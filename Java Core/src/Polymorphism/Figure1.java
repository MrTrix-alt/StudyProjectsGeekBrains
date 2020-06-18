package Polymorphism;

abstract class Figure1 {
    double dim1;
    double dim2;
    Figure1(int a, int b) {
        dim1 = a;
        dim2 = b;
    }
    // теперь метод area() объявляется абстрактным
    abstract double area();
}

class Triangle1 extends Figure1 {
    Triangle1(int a, int b) {
        super(a, b);
    }

    // переопределить метод area() для треугольника
    double area() {
        System.out.println("В области треугольника");
        return dim1 * dim2 / 2;
    }
}
class FigureDemo {
    public static void main(String[] args) {
       // Figure1 f = new Figure1(10,10);  теперь недопустимо, т.к. Figure1 абстрактный
        Triangle1 t = new Triangle1(9,5);
        Figure1 figref; // верно, но объект не создается

        figref = t;
        System.out.println("Площадь равна " + figref.area());


    }
}
