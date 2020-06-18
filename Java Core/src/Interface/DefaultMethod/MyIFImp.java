package Interface.DefaultMethod;

// Реализовать интерфейс MyIF
public class MyIFImp implements MyIF{
    // В этом классе должен быть реализован только
    // метод getNumber(), определенный в интерфейсе MyIF.
    // А вызов метода getString() разрешается по умолчанию.
    public int getNumber() {
        return 100;
    }
}
// Использовать МЕТОД ПО УМОЛЧАНИЮ
class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        // Метод getNumber можно вызвать, т.к. он ЯВНО
        // реализован в классе MyIFImp:
        System.out.println(obj.getNumber());

        // Метод getString() также можно вызвать, т.к. в интерфейсе
        // имеется его реализация по умолчанию:
        System.out.println(obj.getString());
    }
}