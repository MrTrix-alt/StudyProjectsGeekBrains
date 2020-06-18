package com;
// демонстрирование применения тернарной операии ?
public class TernaryOperation {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; // получить абсолютное значение переменной i
        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);

        i = -10;
        k = i < 0 ? -i : i; // получить абсолютное значение переменной i
        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);

    }
}
