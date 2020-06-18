package Enum;

// Перечисление сортов яблок
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

/**
 * Операции, которые можно выполнять над перечислениями:
 * в логических операторах, в операторе switch,
 * в методе println
 */

class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.RedDel;

        // Вывести значения перечисляемого типа
        System.out.println("Значение ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        // сравнить два значения перечисляемого типа
        if(ap == Apple.GoldenDel) {
            System.out.println("Переменная ap содержит "  + ap);
        }

        System.out.println();

        // применить перечисление для управления оператор switch
        switch (ap) {
            case Jonathan:
                System.out.println("Сорт Jonathan красный");
            case GoldenDel:
                System.out.println("Сорт GoldenDel красный");
            case RedDel:
                System.out.println("Сорт RedDel красный");

        }
        // Применение методов:
        // values() - возвращает массив
        // valueOf() - возвращает имя перечисляемого типа String строка
        //
        for(Apple x : Apple.values())
            System.out.println(x);

        ap = Apple.valueOf("Jonathan");
        System.out.println(ap);



        }
    }


