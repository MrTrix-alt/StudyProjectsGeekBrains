package com.Test;
// Cпросить на курсах
class TripleUnregArr {
    public static void main(String[] args) {
        int[][][] arr = new int[3][4][];

        int i, j, k = 0;
        int b = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                arr[i][j] = new int[k];
                k++;
            }
        }

            for (i = 0; i < 3; i++) {
                for (j = 0; j < 4; j++) {
                    for (int n = 0; n < arr[i][j].length; n++) { // как понять длину массива для многомерного массива
                        arr[i][j][n] = b;
                        b++;
                        System.out.print(arr[i][j][n] + " ");
                    }
                    System.out.println();
                }
            }

    }
}

