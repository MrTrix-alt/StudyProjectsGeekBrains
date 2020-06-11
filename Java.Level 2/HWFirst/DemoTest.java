package ru.homework.lessonTwo.HWFirst;

public class DemoTest {
    public static void main(String[] args) {

        System.out.println("Tasks One and Two:");
        Robot robot = new Robot("(Roboto) Phil", 9.0f, 1000);
        Wall wallForRobot = new Wall(10.0f);
        Treadmill treadmillForRobot = new Treadmill(500);
        robot.run(treadmillForRobot);
        robot.jump(wallForRobot);

        System.out.println();

        Human human = new Human("(Human) Petya", 1.0f, 150);
        Wall wallForHuman = new Wall(2.0f);
        Treadmill treadmillForHuman = new Treadmill(60);
        human.run(treadmillForHuman);
        human.jump(wallForHuman);

        System.out.println();

        Cat cat = new Cat("(Cat) Barsik", 4.0f, 50);
        Wall wallForCat = new Wall(2.0f);
        Treadmill treadmillForCat = new Treadmill(60);
        cat.jump(wallForCat);
        cat.run(treadmillForCat);

        System.out.println("Tasks Three and Four:");

        Wall wall = new Wall(5.0f);
        Treadmill treadmill = new Treadmill(750);
        Obstacles[] obstacles = new Obstacles[2];
        obstacles[0] = new Obstacles(wall);
        obstacles[1] = new Obstacles(treadmill);


        Participants[] participants = new Participants[3];
        participants[0] = new Participants(robot);
        participants[1] = new Participants(human);
        participants[2] = new Participants(human);

// не могу понять, почему вылетает исключение.. скорее всего из-за памяти и значений null
    try {
        for (Participants participants1 : participants) {
            participants1.robot.jump(obstacles[0]);
            participants1.robot.run(obstacles[1]);
            participants1.human.jump(obstacles[0]);
            participants1.human.run(obstacles[1]);
            participants1.human.jump(obstacles[0]);
            participants1.human.run(obstacles[1]);
        }
    } catch (NullPointerException e) {
        System.out.println("Exception: " + e);
    }




        }


}

