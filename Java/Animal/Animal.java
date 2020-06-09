package ru.homework.lessonOne.GeekBrainsLessons.Animal;

public abstract class  Animal {
        protected String name;
        protected int run;
        protected double jump;
        protected int swim;

        Animal(String name){
            this.name = name;
        }

        public void run(int distanceRun) {
                if (distanceRun > 0 && distanceRun <= run) {
                        System.out.println(this.name + " пробежал " + distanceRun + "м");
                } else {
                        System.out.println(this.name + " не может пробежать столько!");
                }
        }

        public void jump(double height) {
                if (height > 0 && height <= jump) {
                        System.out.println(this.name + " прыгнул на " + height + "м");
                } else {
                        System.out.println(this.name + " не может прыгнуть столько!");
                }
        }

        public void swim(int distancesSwim) {
                if (distancesSwim > 0 && distancesSwim <= swim) {
                        System.out.println(this.name + " проплыл " + distancesSwim + "м");
                } else {
                        System.out.println(this.name + " не может столько проплыть!");
                }
        }


}
