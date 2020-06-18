package Multithreading;

// Приостановка и возобновление исполнения
// потока современным способом

class NewThread4 implements Runnable {
    String name; // имя поток исполнения
    Thread t;
    boolean suspendFlag;

    NewThread4(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        suspendFlag = false;
        t.start(); // запустить поток исполнения
    }

    // Точка входа в поток исполнения
    public void run() {
        try {
            for (int i = 15; i >0 ; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}

class SuspendResume {
    public static void main(String[] args) {
        NewThread4 ob1 = new NewThread4("One");
        NewThread4 ob2 = new NewThread4("Two");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Приостановка потока One");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Возобновление потока One");Thread.sleep(1000);
            ob2.mysuspend();
            System.out.println("Приостановка потока Two");Thread.sleep(1000);
            ob2.mysuspend();
            System.out.println("Возобновление потока Two");
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
        // Ожидать завершения поток исполнения
        try {
            System.out.println("Ожидание завершения потоков.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }

        System.out.println("Main thread is completed");
    }
}