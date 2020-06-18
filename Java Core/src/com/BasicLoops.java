package com;

import java.io.IOException;

public class BasicLoops {
    public static void main(String[] args) throws IOException {
     /* Loop while. His form:
        while (condition) {
        // loop's body
        }
     */
     // Пример 1
        int n = 10;
        while (n > 0) {
            System.out.println("такт " + n);
            n--;
        }

        System.out.println();
        // Пример 2. Тело цикла не выведется ни разу.
        int a = 10, b = 20;
        while (a > b) {
            System.out.println("Эта строка не будет выводиться");
        }
        // Пример 3. Тело цикла отстутсвует.
        // Применяется "пустой оператор" без {}
        // вместо них используется ;
        int i = 100, j = 200;
        // Рассчитать среднее знаение перменных  i and j
        while (++i < --j); // у этого цикла отстутствует тело
        System.out.println("Среднее значение равно " + i);

        System.out.println();

        /* Loop do...while. His form:
        do {
            // тело цикла
        } while (condition);
            Позволяет выполнить цикл хотя бы 1 раз,
            если условие ложно
         */
        int c = 10;
        do {
            System.out.println("такт "+ c);
            c--;
        } while (c > 0);

        System.out.println();
        // другой способ реализации этого примера
        int f = 10;
        do {
            System.out.println("такт " + f);
        } while (--f > 0); // сначала выполняется декремент,
                        // уменьшая переменную на 1 и
                        // возвращая новое значение переменной f
                        // затем это значение сравнивается c 0
        // Пример 3.
        /* do-while удобен при выборе пункта меню,
           поскольку в этом случае обычно требуется,
           чтобы тело цикла меню выполнялось, по меньшей мере,
           один раз.
         */
         {
            char choice;
            do {
                System.out.println("Справка по оператору:");
                System.out.println("     1. if");
                System.out.println("     2. switch");
                System.out.println("     3. while");
                System.out.println("     4. do-while");
                System.out.println("     5. for");
                System.out.println("Выберите нужный пункт:");
                choice = (char) System.in.read();
            } while (choice < '1' || choice > '5');

            switch (choice) {
                case '1':
                    System.out.println("if:");
                    System.out.println("if(condition) оператор;");
                    System.out.println("else оператор;");
                    break;
                case '2':
                    System.out.println("switch:");
                    System.out.println("switch(expression)");
                    System.out.println("case константа:");
                    break;
                    // и т.д. до 5ого пункт
            }

        }

    }
}
