package Interface;

public class TestInterface {
    public static void main(String[] args) {
        CallBack c = new Client();
        c.callback(332);
        // т.к. с объявлена с типом интерфейса,
        // она не предоставляет достп к другим членам
        // класса Client
    }
}
