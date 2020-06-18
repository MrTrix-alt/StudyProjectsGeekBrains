package ClassesAndMethodes;

public class TestThree {
    int a, b;
    // метод относится к передаче объекта
    TestThree(int i, int j) {
        a = i;
        b = j;
    }
    void meth(TestThree o) { // передача объекта в качестве аргумента
        o.a *= 2;
        o.b /= 2;
    }
}
class PassObjRe {
    public static void main(String[] args) {
        TestThree ob = new TestThree(15, 20);

        // рассмотрение передачи объекта в качестве аргумента
        System.out.println("ob.a и ob.b до вызова: " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("a и b после вызова: " + ob.a + " " + ob.b);
    }
}



