package ClassesAndMethodes;
// В данном примере конструкторы определяются в классе
// OverLoadConstructor для инициализации размеро параллелепипеда
// тремя разными способами
public class OverLoadConstructor {
    double width;
    double height;
    double depth;

    // Это конструктор класса OverLoadConstructor,
    // используемый при указании всех параметров
    OverLoadConstructor(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, используемый, когда ни один из параметров не указан
    OverLoadConstructor() {
        width = -1; // использовать значение -1 для обозначения
        height = -1; // неинициализированного
        depth = -1; // параллелепипеда
    }

    // конструктор, используемый при создании куба
    OverLoadConstructor(double len) {
        width = depth = height = len;
    }

    // Рассчитать и возвратить объем
    double volume(){
        return width * depth * height;
    }

}

class OverLoadCons {
    public static void main(String[]args) {
        // создать параллелепипеды, используя разные конструкторы
        OverLoadConstructor mybox1 = new OverLoadConstructor(10, 20, 15);
        OverLoadConstructor mybox2 = new OverLoadConstructor();
        OverLoadConstructor mycube = new OverLoadConstructor(7);

        double vol;

        // получить объем 1ого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Volume mybox1 = " + vol);

        // Получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Volume mybox2 = " + vol);

        // Полуить объем куба
        vol = mycube.volume();
        System.out.println("Volume mycube = " + vol);
    }
}