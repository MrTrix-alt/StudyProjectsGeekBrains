package ClassesAndMethodes;

public class TestTwo {
    // Аргументы примитивных типов передаются по значению
    void meth(int i, int j) { // относится к первому случаю(передача примитивных значений)
        i *= 2;
        j /= 2;
    }


}
    class CallByValue {
        public static void main(String[] args) {
            TestTwo ob = new TestTwo();

            int a = 15, b = 20;

            System.out.println("a и b до вызова: " + a + " " + b);

            ob.meth(a,b);
            System.out.println("a и b после вызова: " + a + " " + b);
            System.out.println();
        }
    }

