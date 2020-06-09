package ru.homework.lessonOne.GeekBrainsLessons.Animal;

class Cat extends Animal {
    boolean swim = false;

    Cat(String name) {
        super("Cat: " + name);
        this.run = 200;
        this.jump = 2;
    }


    public void catInfo() {
        System.out.println(name + "run = " + run + " м; " + "jump = " + jump + " м.");
    }
}


