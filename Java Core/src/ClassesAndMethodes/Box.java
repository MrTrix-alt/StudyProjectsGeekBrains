package ClassesAndMethodes;

class Box {
    // переменный экземпляра
    double width;
    double height;
    double depth;

    // конструктор класса Box
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    // расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String[]args) {
        Box mybox1 = new Box(10, 20, 15); // создаем объект класса Box
        Box mybox2 = new Box(3,6,9); // еще один объект
        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем параллелепипеда равен: " + vol);
        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем параллелепипеда равен: " + vol);
        // Можно вызывать метод volume иначе:
        System.out.println("Объем 1ого равен " + mybox1.volume());
        System.out.println("Объем 2ого  равен " + mybox2.volume());


       /** Box b1 = new Box();
        Box b2 = b1; // любые изменения, внесенные в объект b2,
                     // окажут влияние на объект, на который ссылается
                     // переменная b1, поскольку этот один и тот же объект

        */
    }
}
