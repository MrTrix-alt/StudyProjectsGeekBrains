package ru.homework.lessonTwo.HWSecond;



public class LearningException {
    private final int size = 4;

    public int arrException(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (size == arr.length && size == arr[0].length) {
            System.out.println("Размер массива задан правильно");
        } else {
            throw new MyArraySizeException("Неправильно задан размер массива");
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                    System.out.println(sum);
                } catch (Exception e) {
                    throw new MyArrayDataException("Нельзя конвертировать String в int, не используя оболочки типов.");
                }
            }
        }
        return sum;
    }
}



