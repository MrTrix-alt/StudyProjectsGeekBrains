package com;

public class OperatorIf {
    public static void main(String[] args) {

        int j = 12;
        int a = 22, c = 32;
        int b = 123;
        int d = 1123;
        int i = 10;
        int k = 100;
        if (i == 10) {
            if (j > 20) {
                a = b;
            } else {
                i = k;
                System.out.println(i);
            }
            if (k > 101) {
                c = d; // этот условный оператор
                System.out.println(c);
            } else {
                a = c;
                System.out.println(a);
            }

        } else {
            a = d; // а этот оператор else связан с - if (i == 10)
            System.out.println(a);

            }
        }
    }

