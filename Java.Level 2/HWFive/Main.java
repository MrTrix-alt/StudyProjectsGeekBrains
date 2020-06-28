package ru.homework.lessonFive;

public class Main
{
    public static void main(String[] args)
    {
        new Thread(new ThreadsForWorkWithArr.MyThread()).start();
    }
}
