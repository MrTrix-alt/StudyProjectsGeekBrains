package ClassesAndMethodes;

// Возврать объектов
class TestNew1 {
    int a;

    TestNew1(int i) {
        a = i;
    }

    TestNew1 incrByTen(){
        TestNew1 temp = new TestNew1(a + 10);
        return temp;
    }
}

class RetOb {
    public static void main(String[] args) {
        TestNew1 ob1 = new TestNew1(2);
        TestNew1 ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увеличения значения: " + ob2.a);

    }
}
