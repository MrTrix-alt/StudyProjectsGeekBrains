package ru.homework.lessonFive;

public class ThreadsForWorkWithArr
{
    static class MyThread implements Runnable
    {
        static final int size = 1000000;

        public synchronized void createArr()
        {
            float[] arr = new float[size];
            long a = System.currentTimeMillis();
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            long b = System.currentTimeMillis();
            System.out.println("First stream life: " + (b - a));
        }

        public synchronized void divisionGluingArr()
        {
            float[] arr = new float[size];
            float[] a1 = new float[arr.length / 2];
            float[] a2 = new float[arr.length / 2];
            long a = System.currentTimeMillis();
            System.arraycopy(arr, 0, a1, 0, a1.length);
            for (int i = 0; i < a1.length; i++)
            {
                a1[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.arraycopy(arr, 0, a2, 0, a2.length);
            for (int i = 0; i < a2.length; i++)
            {
                a2[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }

            System.arraycopy(a1, 0, arr, 0, a1.length);
            System.arraycopy(a2, 0, arr, a1.length, a2.length);
            long b = System.currentTimeMillis();
            System.out.println("Second stream life: " + (b - a));
        }

        @Override
        public void run()
        {
            createArr();
            divisionGluingArr();
        }
    }
}
