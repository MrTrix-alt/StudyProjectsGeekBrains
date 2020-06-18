package Interface;

class AnotherClient implements CallBack {
     // реализовать интерфейс CallBack
    public void callback(int p) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квавдрате равно " + (p * p));
    }
}
