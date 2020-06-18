package Generics;

class TwoGen<T, V>
{
    T ob1;
    V ob2;

    // передать конструкторы ссылки на объекты типа T и V
    TwoGen(T ob1, V ob2)
    {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    // показать типы T и V
    void showTypes()
    {
        System.out.println("Type's T: " + ob1.getClass().getName());
        System.out.println("Type's V: " + ob2.getClass().getName());

    }

    T getOb1()
    {
        return ob1;
    }

    V getOb2()
    {
        return ob2;
    }
}

class SimpGen
{
    public static void main(String[] args)
    {
        TwoGen<Integer, String> tgObj =
                new TwoGen<Integer, String>(88, "Generics");

        // показать типы
        tgObj.showTypes();
        // take and show values
        int v = tgObj.getOb1();
        System.out.println("Value' v: " + v);

        String str = tgObj.getOb2();
        System.out.println("Value's str: " + str);

    }
}

