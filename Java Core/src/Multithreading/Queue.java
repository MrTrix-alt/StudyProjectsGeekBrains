package Multithreading;

// Реализация поставщика и потребителя
class Queue {
    int n = 0;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение типа InterruptedException перехвачено");
            }


        System.out.println("Получено: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение типа InterruptedException перехвчено");
            }
            this.n = n;
            valueSet = true;
            System.out.println("Отправлено: " + n);
            notify();

    }
}

    class Producer implements Runnable {
        Queue q;

        Producer(Queue q) {
            this.q = q;
            new Thread(this, "Поставщик").start();
        }

        public void run() {
            int i;
            for(i = 0; i < 10; i++)
                q.put(i);
        }
    }

    class Consumer implements Runnable {
        Queue q;

        Consumer(Queue q) {
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
        Queue q = new Queue();
        new Producer(q);
        new Consumer(q);

        System.out.println("Для остановки нажмите Ctrl-C");
    }
}

