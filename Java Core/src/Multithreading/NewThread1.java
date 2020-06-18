package Multithreading;

// Создать второй поток исполнения, расширив класс Thread

class NewThread1 extends Thread {

    NewThread1() {
        // создать новый поток исполнения
        // метод super() вызывает конструктор Thread(),
        // общая форма  которого:
            // public Thread(String имя_потока)
        super("Демонстрационный поток");
        System.out.println(getName() + ": " + this);
        start(); // запустить поток на исполнение
    }

    // Точка входа во второй поток исполнения
    @Override
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " +  i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний класс завершен.");
    }
}

class ExtendThread {
    public static void main(String[] args) {
        new NewThread1(); // создать новый поток исполнения

        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}