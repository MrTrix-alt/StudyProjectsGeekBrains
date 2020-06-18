package ClassesAndMethodes;

public class OverLoadMethodTwo {
    // Применить автоматическое преобразование типов к перегрузке
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // Перегружаемый метод, проверяющий наличие
    // двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие
    // параметра типа double
    void test(double a) {
        System.out.println("Внутреннее преобразование при вызове test(double) a: " + a);
    }
}
    class OverLoadTwo {
        public static void main(String[] args) {
            OverLoadMethodTwo ob = new OverLoadMethodTwo();
            int i = 88;

            ob.test();
            ob.test(10,20);

            ob.test(i); // Здесь вызываетя вариант метода test(double)
            ob.test(123.2); // здесь также вызывается вариант метода test(double)
            //  Если бы был метод void(int a),
            //  то ob.test(i) вызвал бы его.
        }
    }


