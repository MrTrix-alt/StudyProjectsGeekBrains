package com;

public class LoopFor {
    public static void main(String[] args) {

    /* традиционная форма цикла for:
    for(инициализация; условие; итерация) {
        // loop's body
    }
     */
    // Пример 1.
        for(int n = 10; n > 0; n--)
            System.out.println("Такт " + n);
        // если n требуется использовать в других частях программы,
        // то ее нельзя объявлять в самом цикле.
        System.out.println();
    // Пример 2. Проверка на простые числа

        int num;
        boolean isPrime;
        num = 14;

        if (num < 2)
            isPrime = false;
        else
            isPrime = true;

        for (int i = 2; i <= num / i; i++) {
            if((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Простое число");
        else System.out.println("Не простое число");

        System.out.println();

        // Пример 3. В ряде случаев требуется
        // указать несколько операторов в инициализирующей
        // и итерационной частях оператора цикла for.
        int a, b = 4;
        for(a = 1; a < b; a++) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            b--;
        }

        System.out.println();
        // можно использовать больше одного счетчика в цикле
        for(int g = 1, r = 4; g < r; g++, r--) {
            System.out.println("g = " + g);
            System.out.println("r = " + r);
        }

        System.out.println();
        //Пример 4. В качестве условия может быть любое логическое выражение
  /*      boolean done = false;
        for(int i = 1; !done; i++) {
            // ...
            if(interrupted()) done = true;
        }
        в данном случае цикл будет продолжаться до тех пор,
        пока в переменной done не установится лог. выражение true
   */
        // Пример 5. цилк без инициализации и итерации
        int i;
        boolean done = false;
        i = 0;
        for( ; !done; ) {
            System.out.println("i равно " + i);
            if (i == 10)
                done = true;
                i++;

        }

    }
}

