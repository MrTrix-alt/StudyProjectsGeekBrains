package ClassesAndMethodes;

public class BoxNew {
    // Нередко новый объект приходится создавать
    // таким образом, чтобы он первоначально
    // ничем не отличался от уже существующего объекта

    // В этой версии класса BoxNew (см. класс Box)
    // один объект допускается инициализировать
    // другим объектом

    double width;
    double height;
    double depth;

    // Обрати внимание на этот конструктор.
    // В качестве парметра в нем используется объект типа BoxNew
    BoxNew (BoxNew ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    BoxNew (double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
    }

        // Конструктор, используемый, когда ни один из параметров не указан
    BoxNew () {
            width = -1; // использовать значение -1 для обозначения
            height = -1; // неинициализированного
            depth = -1; // параллелепипеда
        }

        // конструктор, используемый при создании куба
    BoxNew (double len) {
            width = depth = height = len;
        }

        // Рассчитать и возвратить объем
    double volume(){
            return width * depth * height;
    }
}

class OverLoadCons2 {
    public static void main(String[] args) {
        // создать параллелепипеды, используя
        // разные конструкторы
        BoxNew mybox1 = new BoxNew(10,20,15);
        BoxNew mybox2 = new BoxNew();
        BoxNew mycube = new BoxNew(7);

        BoxNew myclone = new BoxNew(mybox1); // создать копию объект mybox1

        double vol;

        // получить объем 1ого параллелепида
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        // получить объем 2ого параллелепида
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        // получить объем 1ого параллелепида
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);

        // получить объем клона
        vol = myclone.volume();
        System.out.println("Объем myclone равен " + vol);
    }
}

