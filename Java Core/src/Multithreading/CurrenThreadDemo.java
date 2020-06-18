package Multithreading;

// Управление главным потоком исполнения

class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Текущий поток исполнения: " + t);

        // Изменить имя потока исполнения
        t.setName("My Thread"); // метод, устанавливающий имя потока
                                // метод getName() позволяет получить имя потока
        System.out.println("После изменения имени потока: " + t);
        System.out.println("Имя потока: " + t.getName());

        try {
            for (int n = 5; n > 0 ; n--) {
                System.out.println(n);
                Thread.sleep(1000); // метод sleep() вынуждает тот поток,
                                          // из которого он вызывается, приостановить
                                          // свое исполнение на указанное количество
                                          // миллисекунд.
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток иполнения прерван");

        }
    }
}
