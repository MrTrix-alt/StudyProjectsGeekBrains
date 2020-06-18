package Multithreading;

// Создать второй поток исполнения
// с помощью реализации интерфейса Runnable

class NewThread implements Runnable {
    Thread t; // ссылочная переменная на класс Thread

    NewThread() {
        // создать новый, второй поток исполнения
        // Новый объект класса Thread создается в этом операторе
        // из конструктор NewThread()
        t = new Thread(this, "Демонстрационный поток"); // Thread - конструктор из класс Thread(этот класс системный)
        System.out.println("Дочерний поток создан: " + t);
        t.start(); // запустить поток исполнения
    }
    // Точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 1; i <= 5 ; i++) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершен.");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new NewThread(); // создать новый поток

        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Главный поток исполнения: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}

