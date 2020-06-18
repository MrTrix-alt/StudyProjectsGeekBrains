package com.Test;


class  TestLoop {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int i = 0;
        do {
            arr[i] = i * 10;
            System.out.print(arr[i] + " ");
            switch (arr[i]) {
                case 0:
                case 10:
                case 20:
                case 30:
                case 40:
                    int[] arr1 = new int[5];
                    arr1[i] = arr[i] / 10;
                    System.out.println(arr1[i]);
                    break;
            }
        } while (++i < 5);

    }
}
