package Inheritance;

import java.util.logging.SocketHandler;

public class Box {
    // В это программе наследование применяется
    // для расширения класса Box
    private double width;
    private double height;
    private double depth;

    // Constructor for clone of object
    Box(Box ob) { // передать  объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        depth = d;
        height = h;
    }

    Box() {
        width = -1;
        depth = -1;
        height = -1;
    }

    Box(double len) { // Constructor for Cube
        width = depth = height = len;
    }

    double volume() {
        return width * depth * height;
    }
}
    // Расширить класс Box, включив в него поле веса
class BoxWeight extends Box {
        double weight;

        BoxWeight(BoxWeight ob) { // конструктор для создания клона объекта
            super(ob);
            weight = ob.weight;
        }

        // Constructor BoxWeight
        BoxWeight(double w, double h, double d, double m) {
            /*width = w;
            depth = d;
            height = h;
            их можно заменить на более короткую форму
            используя ключевое слово super
            */
            super(w, h, d); // оно должно быть всегда первым оператором
            // выполняемым в конструкторе подкласса
            weight = m;
        }

        // Конструктор, применяемый по умолчанию
        BoxWeight() {
            super();
            weight = -1;
        }

        BoxWeight(double len, double m) {
            super(len);
            weight = m;
        }
    }


class Shipment extends BoxWeight {
    double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }

}



class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 30, 30, 12.2);
        BoxWeight mybox2 = new BoxWeight(12, 11, 4, 0.032);
        BoxWeight mybox3 = new BoxWeight(); // по умолчанию
        BoxWeight mycube = new BoxWeight(3,4);
        BoxWeight myclone = new BoxWeight(mybox1);
        Shipment shipment1 = new Shipment(10, 30, 30, 12.2, 3.41);
        Shipment shipment2 = new Shipment(12, 11, 4, 0.032, 1.28);
        Shipment shipmentClone = new Shipment(shipment1);
        double vol;

        vol = shipment1.volume();
        System.out.println("Объем shipment1 равен " + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объем shipment2 равен " + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки: $" + shipment2.cost);
        System.out.println();

        vol = shipmentClone.volume();
        System.out.println("Объем shipmentClone равен " + vol);
        System.out.println("Вес shipmentClone равен " + shipmentClone.weight);
        System.out.println("Стоимость доставки: $" + shipmentClone.cost);
        System.out.println();


        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox3.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mycube.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + myclone.weight);
    }
}

