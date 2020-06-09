package ru.homework.lessonOne.GeekBrainsLessons.Animal;

public class AnimalDemo {
    public static void main(String[] args) {
        System.out.println("Task 1, 2, 3:");
        Cat cat = new Cat("Hugo");
        cat.catInfo();
        Dog dog = new Dog("Ryzik");
        dog.dogInfo();
        System.out.println();

        System.out.println("Task 4:");
        Animal[] animals = new Animal[5];
        animals[0] = new Cat("Barsik");
        animals[1] = new Dog("Bulba");
        animals[2] = new Cat("Ginger");
        animals[3] = new Dog("Boyka");
        animals[4] = new Dog("Dymok");

        for(Animal animal: animals) {
            animal.jump(2);
            animal.swim(3);
            animal.run(15);
        }
        System.out.println();
        System.out.println("Task 5. With SuperDog");
        Animal[] animalsTwo = new Animal[2];
        animalsTwo[0] = new SuperDog("Boyka", 600, 1, 15);
        animalsTwo[1] = new SuperDog("Dymka", 400, 0.4, 3);
        for (Animal anim : animalsTwo) {
            anim.run(223);
            anim.jump(0.8);
            anim.swim(7);
        }
    }
}
