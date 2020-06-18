package ClassesAndMethodes;

public class OverLoadMethod {
    void test(){
        System.out.println("Параметр отсутствуют");
    }

    // Перегружаемый метод, проверяющий наличие
    // одного целочисленного параметра
    void test(int a) {
        System.out.println("a: " + a);
    }
    // Перегружаемый метод, проверяющий наличе
    // двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }
    // Перегружаемый метод, проверяющий наличие
    // параметра типа double
    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}

class OverLoad {
    public static void main(String[] args) {
        OverLoadMethod ob = new OverLoadMethod();
        double result;

        // вызвать все варианты метода test()
        ob.test();
        ob.test(5);
        ob.test(3, 4);
        result = ob.test(34.4);
        System.out.println("Результат вызова ob.test(34.4): " + result);
    }
}
