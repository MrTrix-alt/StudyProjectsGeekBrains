package com.Test;

class ArrayTriple {
    public static void main(String[] args) {

        int[][][] arr = new int[3][4][5];
        int k = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int n = 0; n < 5; n++) {
                    arr[i][j][n] = k;
                    k++;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int n = 0; n < 5; n++) {
                    System.out.print(arr[i][j][n] + " ");
                }
                System.out.println();
            }
        }
    }
}