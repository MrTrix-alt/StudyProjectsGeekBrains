package Vargs;
// Аргументы переменной длины, перегрузка и неоднозначность
//
// Эта программа содержит ошибку, и поэтому не может быть скомпелирована!
class VarArgs4 {

    static void vaTest(int... v) {
        System.out.print("vaTest(int ...): " + "Количество аргументов: " + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    // Методы vaTest(int... v) и vaTest(int n, int ... v) создают неоднозначность

    /**
     * static void vaTest(int n, int ... v) {
     * System.out.print("vaTest(int ...): " + "Количество аргументов: "  + v.length + " Содержимое: ");
     * <p>
     * for(int x : v)
     * System.out.print(x + " ");
     * System.out.println();
     * }
     * Из-за ошибок неоднозначности, подобных этим, иногда приходится отказываться
     * от перегрузи и просто использовать один и тот же метод под двумя разными именами.
     */

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean ...): " + "Количество аргументов: " + v.length + " Содержимое: ");

        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        vaTest(1, 2, 3); // Верно!
        vaTest(true, false, true); // Верно!
        // vaTest(); // ОШИБКА!: НЕОДНОЗНАЧНОСТЬ.
        // Компилятор не может понять какой тип данных вывести,
        // т.к. оба метода (с разными типами данных) подходят для данного вызова


    }
}

