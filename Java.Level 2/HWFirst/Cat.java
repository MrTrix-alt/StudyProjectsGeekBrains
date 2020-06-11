package ru.homework.lessonTwo.HWFirst;

public class Cat implements  Abilities {
    String name;
    private float jumpLimit;
    private int runLimit;



    Cat(String name, float jumpLimit, int runLimit) {
        this.name = name;
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }


    // for Tasks One and Two
    @Override
    public void run(Treadmill treadmill) {
        System.out.println(this.name + " can run on " + this.runLimit + " meters");
        if(treadmill.showResult(runLimit))
        {
            System.out.println(this.name + " can run over treadmill");
        }
        else
        {
            System.out.println(this.name + " can't run over treadmill, because distance is " + treadmill.distance + " meters");

        }
    }
    // for Tasks One and Two
    @Override
    public void jump(Wall wall) {
        System.out.println(this.name + " can jump on " + this.jumpLimit + " meters");
        if(wall.showResult(jumpLimit))
        {
            System.out.println(this.name + " can jump over the wall");
        }
        else
        {
            System.out.println(this.name + " can't jump over the wall, because wall height is" + wall.height + " meters");
        }

    }
    // for Tasks Three and Four
    public void run(Obstacles obstacles) {
        System.out.println(this.name + " can run on " + this.runLimit + " meters");
        if(obstacles.treadmill.showResult(runLimit))
        {
            System.out.println(this.name + " can run over treadmill");
        }
        else
        {
            System.out.println(this.name + " can't run over treadmill, because distance is " + obstacles.treadmill.distance + " meters");
        }
    }

    // for Tasks Three and Four
    public void jump(Obstacles obstacles) {
        System.out.println(this.name + " can jump on " + this.jumpLimit + " meters");
        if(obstacles.wall.showResult(jumpLimit))
        {
            System.out.println(this.name + " can jump over the wall");
        }
        else
        {
            System.out.println(this.name + " can't jump over the wall, because wall height is" + obstacles.wall.height + " meters");
        }

    }
}
