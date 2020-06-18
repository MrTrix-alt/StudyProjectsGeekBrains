package Polymorphism;

// Применение полиморфизма во время выполнения

class Figure {
    private double dim1; // попробовал использовать инкапсуляцию
    private double dim2; // попробовал использовать инкапсуляцию

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    double area() {
        System.out.println("Площадь фигуры не определена");
        return 0;
    }
}

class Triangle extends Figure {
    private double dim; // попробовал использовать инкапсуляцию
    private double dim3; // попробовал использовать инкапсуляцию
    Triangle(double a, double b, double c, double d) {
        super(a, b);
        dim = c;
        dim3 = d;
    }
    // переопределить метод area() для треугольника
    double area() {
        System.out.println("В области треугольника");
        return dim * dim3 / 2;
    }
}

class Rectangle extends Figure {
    private double dimm;  // попробовал использовать инкапсуляцию
    private double dimm3; // попробовал использовать инкапсуляцию
    Rectangle(double a, double b, double c, double d) {
        super(a, b);
        dimm = c;
        dimm3 = d;
    }
    // переопределить метод area() для четырехугольника
    double area() {
        System.out.println("В области треугольника");
        return dimm * dimm3;
    }
}

class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10,10);
        Triangle trian = new Triangle(100, 100, 3, 5);
        Rectangle rec = new Rectangle(107,107,3,5);

        Figure r;

        r = trian;
        System.out.println("Площадь равна " + r.area());

        r = rec;
        System.out.println("Площадь равна " + r.area());

        r = f;
        System.out.println("Площадь равна " + r.area());

    }
}

