package ru.homework.lessonTwo.HWFirst;

public class Wall {

    float height;

    Wall(float height) {
        this.height = height;
    }

    boolean showResult(float jumpLimit) {
        return jumpLimit > this.height;
    }
}
