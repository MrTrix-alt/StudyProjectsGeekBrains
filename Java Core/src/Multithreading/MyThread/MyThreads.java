package Multithreading.MyThread;


public class MyThreads {
    int n = 0;
    boolean valueSet = false;

    synchronized int get() {
        while(!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение перехвачено");
            }

        System.out.println("Получено " + n);
            valueSet = false;
            notify();
            return n;
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение перехвачено");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Отправлено: " + n);
        notify();
    }
}

class Producer implements Runnable {

    MyThreads q;

    Producer(MyThreads q) {
        this.q = q;
        new Thread(this, "Поставщик");
    }

    public void run() {
        int n;
        for(n = 0; n < 10; n++){
            q.put(n);
        }
    }
}

class Consumer implements Runnable {
    MyThreads q;

    Consumer(MyThreads q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}

class PC {
    public static void main(String[] args) {
        MyThreads q = new MyThreads();
        new Producer(q);
        new Consumer(q);
    }
}