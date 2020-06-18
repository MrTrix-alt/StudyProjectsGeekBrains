package Inheritance;

// Переменная суперкласса может ссылаться
// на объект подкласс
class BoxNew {
    // В это программе наследование применяется
    // для расширения класса Box
    double width;
    double height;
    double depth;

    // Constructor for clone of object
    BoxNew(BoxNew ob) { // передать  объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    BoxNew(double w, double h, double d) {
        width = w;
        depth = d;
        height = h;
    }

    BoxNew() {
        width = -1;
        depth = -1;
        height = -1;
    }

    BoxNew(double len) { // Constructor for Cube
        width = depth = height = len;
    }

    double volume() {
        return width * depth * height;
    }
}
// Расширить класс Box, включив в него поле веса
class BoxWeight1 extends BoxNew {
    double weight;

    // Constructor BoxWeight
    BoxWeight1(double w, double h, double d, double m) {
        width = w;
        depth = d;
        height = h;
        weight = m;
    }
}

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight1 weightbox = new BoxWeight1(3,5,7,8.37);
        BoxNew plainbox = new BoxNew();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();

        // Присвоить ссыле на объект BoxWeight ссылки
        // на объект BoxNew
        plainbox = weightbox;
        vol = plainbox.volume(); // Верно, т.к. метод volume()
                                 // определен в классе BoxNew
        System.out.println("Объем plainbox равен " + vol);

        /* Следующий оператор ошибочен, поскольку член plainbox
           не определяет член weight.
        */
        // System.out.println("Вес plainbox равен " + plainbox.weight);


    }
}
