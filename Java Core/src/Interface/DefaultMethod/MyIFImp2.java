package Interface.DefaultMethod;

public class MyIFImp2 implements MyIF {
    // В этом классе предоставляются реализация обоих методов
    // getNumber() and getString().
    public int getNumber() {
        return 100;
    }
    public String getString() {
        return "Это другая символьная строка.";
    }
}
class DefaultMethodDemo2 {
    public static void main(String[] args) {
        MyIFImp2 obj = new MyIFImp2();

        // Метод getNumber можно вызвать, т.к. он ЯВНО
        // реализован в классе MyIFImp:
        System.out.println(obj.getNumber());

        // Метод getString() также можно вызвать, т.к. в интерфейсе
        // имеется его реализация по умолчанию:
        System.out.println(obj.getString());
    }
}
