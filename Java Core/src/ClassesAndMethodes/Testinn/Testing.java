package ClassesAndMethodes.Testinn;


class Testing implements Calc {
    double val1;
    double val2;


    Testing(double _val1, double _val2) {
        val1 = _val1;
        val2 = _val2;
    }

    public double sum() {
        return val1 + val2;
    }
    public double diff() {
        return val1 - val2;
    }
    public double prod() {
        return val1 * val2;
    }
    public double division() {
        return val1 / val2;
    }
}

class CalcDemo {
    public static void main(String[] args) {
        double a, b;

        System.out.print("Введите числа: ");

        Testing obj = new Testing(32.43, 123.43);

        System.out.println("Сумма: " + obj.sum());
        System.out.println("Разность: " + obj.diff());
        System.out.println("Произведение: " + obj.prod());
        System.out.println("Частное: " + obj.division());

        System.out.println("Квадрат числа: " + obj.square(32.4));
        System.out.println("Возведение числа в степень N: " + Math.round(obj.squareNumb(4.3, 4.2)));



        }


    }

