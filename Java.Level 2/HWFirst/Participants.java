package ru.homework.lessonTwo.HWFirst;

public class Participants {
    Robot robot;
    Human human;
    Cat cat;

    Participants(Robot robot) {
        this.robot = robot;
    }
    Participants(Human human) {
        this.human = human;
    }
    Participants(Cat cat) { this.cat = cat;
    }

}
