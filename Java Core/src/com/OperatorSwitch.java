package com;

public class OperatorSwitch {
    // Пример 1
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = i;
            switch (arr[i]) {
                case 0:
                    System.out.println("arr[" + i + "] = " + i);
                    break;
                case 1:
                    System.out.println("arr[" + i + "] = " + i);
                    break;
                case 2:
                    System.out.println("arr[" + i + "] = " + i);
                    break;
                case 3:
                    System.out.println("arr[" + i + "] = " + i);
                    break;
                default:
                    System.out.println("arr[" + i + "]" + " больше трех");
            }
        }
        System.out.println();

// Пример 2
// Использование оператор ветвей case
// без разделяющих их операторов break
        for(int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println(i + " меньше 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(i + " меньше 10");
                    break;
                default:
                    System.out.println(i + " равно или больше 10");
            }
        }

        System.out.println();
// Вложенные операторы switch
        int count = 2;
        int target = 0;
        switch (count) {
            case 1:
                switch (target) {
                    case 0:
                        System.out.println("target равно 0");
                        break;
                    case 1:
                        System.out.println("target равно 1");
                        break;
                }
                break;
            case 2:
                switch (target) {
                    case 0:
                        System.out.println("target равно 0");
                        break;
                }
        }
    }
}




