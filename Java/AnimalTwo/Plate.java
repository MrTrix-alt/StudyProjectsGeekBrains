package ru.homework.lessonOne.GeekBrainsLessons.AnimalTwo;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void plateInfo() {
        System.out.println("Еды осталось: " + food);

    }

    public void decreaseFood(int appetite) {
        if (checkFood(appetite)) {
            food = food - appetite;
        } else {
            food = food - appetite;
        }

    }


    public boolean checkFood(int appetite) {
        if (food < appetite) {
            food = food + 25;
            return true;
        } else if (food == 0) {
            food =+ increaseFood(25);
            return true;
        } else {
            return false;
        }
    }

    public int increaseFood(int food) {
            this.food += food;
            return this.food;
        }
    }



