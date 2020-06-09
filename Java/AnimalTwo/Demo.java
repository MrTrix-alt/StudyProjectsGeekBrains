package ru.homework.lessonOne.GeekBrainsLessons.AnimalTwo;

public class Demo {
    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Bars", 5, 10);
        cats[1] = new Cat("Bars1", 20, 30);
        cats[2] = new Cat("Bars2", 10, 10);
        Plate plate = new Plate(25);

        plate.plateInfo();
            for (Cat cat : cats) {
                cat.eatFrom(plate);
            }
            plate.plateInfo();



    }
}
