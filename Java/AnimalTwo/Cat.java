package ru.homework.lessonOne.GeekBrainsLessons.AnimalTwo;

public class Cat {
    protected String name;
    protected int appetite;
    protected int maxAppetite;
    int hungry = 0;


    public Cat(String name, int appetite, int maxAppetite) {
        this.name = name;
        this.appetite = appetite;
        this.maxAppetite = maxAppetite;
    }

    public void eatFrom(Plate plate) {

        while (hungry != maxAppetite || hungry >= maxAppetite) {
            plate.decreaseFood(appetite);
            hungry = hungry + appetite;
            if (hungry == maxAppetite) {
                System.out.println(name + " сыт");
                return;
            } else if (hungry >= maxAppetite){
                System.out.println(name + " переел");
                return;
            }
        }


    }
}



