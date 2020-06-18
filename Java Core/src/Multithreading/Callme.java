package Multithreading;

// Эта программа не синхронизирована
// В ней отстутствует механизм, предотвращающий
// одновременный вызов в потоках исполнения одного и того
// метода для того же самого объекта, или так называемое
// состояние гонок, поскольку три потока соперничают за окончание метода.
// Чтобы исправить программу, следуется упорядочить доступ к методу call().
// Это означает, что доступ к этому методу из поток исполнения следует
// разрешить только по очереди. Для этого достаточно предварить
// объявление метода call() ключевым словом synchronized

class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
class Caller implements Runnable {
        String msg;
        Callme target;
        Thread t;

        public Caller(Callme targ, String s) {
            target = targ;
            msg = s;
            t = new Thread(this);
            t.start(); // запустить поток
        }

        // Точка входа в поток исполнения
        public void run() {
            synchronized (target) { // Синхронизированный блок
                target.call(msg);
            }
        }
}

class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Добро пожаловать");
        Caller ob2 = new Caller(target, "в синхронизированный");
        Caller ob3 = new Caller(target, "мир!");

        // Ожидать завершения потока исполнения
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

    }
}
