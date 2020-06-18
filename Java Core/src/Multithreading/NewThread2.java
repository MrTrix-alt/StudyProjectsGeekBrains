package Multithreading;

// Создать несколько потоков исполнения


class NewThread2 extends Thread {
    String name; // имя поток исполнения
    Thread t;

    NewThread2(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start(); // запустить поток на исполнение
    }

    // Точка входа в поток исполнения
    public void run() {
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }
}

class MultiThreadDemo {
    public static void main(String[] args) {
        // запустить поток на исполнение
        new NewThread2("Первый поток");
        new NewThread2("Второй поток");
        new NewThread2("Третий поток");

        try {
            // Ожидать завершения других поток исполнения
            for (int i = 5; i > 0; i--) {
                Thread.sleep(2500);
                System.out.println("Главный поток: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен.");
    }
}
