package ru.homework.lessonTwo.HWSecond;

public class DemoException {
    public static void main(String[] args) {
        LearningException exception = new LearningException();

        String[][] array = new String[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "x" + (j * 2);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        try {
            int sum = exception.arrException(array);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
