package Interface.StaticMethod;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "объект типа String по умолчанию";
    }

    // Объявление статического метода в интерфейсе
    // Статические методы из интерфейсов не наследуются
    // ни реализующими их классами, ни подчиненными интерфейсами.
    static int getDefaultNumber(int c) {
        return c * c;
    }
}

class Experience implements MyIF {
    public int getNumber() {
        return 99;
    }
    public String getString(String name) {
        return name;
    }
}

class DemoExp {
    public static void main(String[] args) {
        Experience exp = new Experience();

        System.out.println(exp.getNumber());

        String c = "Hello";
        System.out.println(exp.getString("Timur") + ", " + c);

        int defNumb = MyIF.getDefaultNumber(10); // вызов статического метода из интерфейса,
                                                    // его можно не реализовать в классе Experience
        System.out.println(defNumb);
        System.out.println(MyIF.getDefaultNumber(10));



    }
}
