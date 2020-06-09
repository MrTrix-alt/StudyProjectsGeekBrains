package ru.homework.lessonOne.GeekBrainsLessons.Animal;

public class Dog extends Animal {
    Dog(String name) {
        super("Dog: " + name);
        this.run = 500;
        this.jump = 0.5;
        this.swim = 10;
    }


    public void dogInfo() {
        System.out.println(name + " run = "+ run +" м; " + " jump = " + jump + " м; " +  swim + " м.");
    }
}

