package Generics;

class TwoD // Двумерны координаты
{
    int x;
    int y;

    TwoD(int a, int b)
    {
        x = a;
        y = b;
    }
}

class ThreeD extends TwoD
{
    int z;

    ThreeD(int a, int b, int c)
    {
        super(a, b);
        z = c;
    }
}

class FourD extends ThreeD // Четерыхмерные координаты
{
    int t;

    FourD(int a, int b, int c, int d)
    {
        super(a, b, c);
        t = d;
    }
}

// класс хранит массив координатных объектов
// любой массив, сохраняемый в объъекте
// типа Coords, будет соодержать объект класса TwoD
// или любого из его подклассов.
class Coords<T extends  TwoD> {
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }
}
    class BoundedWildCard
    {
        // метод, выводящий координаты Х и У для каждого элемента
        // массива coords в объекте класса Coords
        static void showXY(Coords<?> c) {
            System.out.println("Coordinates X Y:");
            for (int i = 0; i < c.coords.length; i++)
            {
                System.out.println(c.coords[i].x + " " + c.coords[i].y);
            }
            System.out.println();
        }

        static  void showXYZ(Coords<? extends ThreeD> c)
        {
            System.out.println("Координаты X Y Z:");
            for (int i = 0; i < c.coords.length ; i++)
            {
                System.out.println(c.coords[i].x
                + " " + c.coords[i].y + " " + c.coords[i].z);
            }
            System.out.println();
        }

        static  void showAllCoord(Coords<? extends FourD> c)
        {
            System.out.println("Координаты X Y Z T:");
            for (int i = 0; i < c.coords.length ; i++)
            {
                System.out.println(c.coords[i].x
                        + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
            }
            System.out.println();
        }

        public static void main(String[] args)
        {
            TwoD td[] = {
                    new TwoD(0, 0), new TwoD(7, 9),
                    new TwoD(18, 4), new TwoD(-1, -23)
            };
                Coords<TwoD> tdLocs = new Coords<TwoD>(td);

                System.out.println("Содержимое объекта tdLocs");
                showXY(tdLocs); // Верно, это тип TwoD
                // showXYZ(tdLocs); // Ошибка, это не тип ThreeD
                // showAllCoord(tdLocs); // Ошибка, это не тип FourD

                // создаем несколько объекто тип FourD
            FourD fd[] = {
                    new FourD(1, 2, 3, 4),
                    new FourD(6, 8, 14, 8),
                    new FourD(22, 9, 4, 9),
                    new FourD(3, -2, -23, 17)
            };
            Coords<FourD> fdLocs =  new Coords<FourD>(fd);

            System.out.println("Содержимое объекта fdLocs");
            // ошибок нет
            showXY(fdLocs);
            showXYZ(fdLocs);
            showAllCoord(fdLocs);

        }
    }




