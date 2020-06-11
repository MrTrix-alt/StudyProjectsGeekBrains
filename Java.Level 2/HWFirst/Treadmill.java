package ru.homework.lessonTwo.HWFirst;

public class Treadmill {

    int distance;

    Treadmill(int distance) {
        this.distance = distance;
    }

    boolean showResult(int runLimit) {
        return runLimit > this.distance;
    }
}
