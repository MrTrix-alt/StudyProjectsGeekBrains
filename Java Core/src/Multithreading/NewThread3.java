package Multithreading;

// Применить метод join(), чтобы
// ожидать завершения потоков исполнения

class NewThread3 implements Runnable {
    String name; // имя потока
    Thread t;

    NewThread3(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start(); // запустить поток исполнения
    }
    // Точка входа в поток исполнения
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен." );
    }
}
class DemoJoin {
    public static void main(String[] args) {
        NewThread3 ob1 = new NewThread3("One");
        NewThread3 ob2 = new NewThread3("Two");
        NewThread3 ob3 = new NewThread3("Three");

        // В этом случае метод isAlive() показывает, что
        // потоки исполнения еще исполняются, выдаст true.
        System.out.println("Thread One started: " + ob1.t.isAlive());
        System.out.println("Thread Two started: " + ob2.t.isAlive());
        System.out.println("Thread Three started: " + ob3.t.isAlive());

        // Ожидать завершения потоков исполнения
    try {
        // Вызовы методов join() возвращают управление,
        // то есть потоки(One, Two, Three) преркращают исполнение
        System.out.println("Ожидание завершения потоков.");
        ob1.t.join();
        ob2.t.join();
        ob2.t.join();
    } catch (InterruptedException e) {
        System.out.println("The main thread is interrupted.");
    }
        // В этом случае метод isAlive() показывает, что
        // потоки исполнения завершены, выдаст false.
        System.out.println("Thread One started: " + ob1.t.isAlive());
        System.out.println("Thread Two started: " + ob2.t.isAlive());
        System.out.println("Thread Three started: " + ob3.t.isAlive());

        System.out.println("The main thread is completed.");
    }

}
