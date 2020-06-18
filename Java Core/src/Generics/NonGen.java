package Generics;
// класс NonGen - функциональный эквивалент
// класса Gen без обобщений
public class NonGen
{
    Object ob; // объект ob теперь имеет тип Object


    // передать конструктору ссылку на объект типа Object
    NonGen(Object ob)
    {
        this.ob = ob;
    }

    // возвратить типа Object
    Object getOb()
    {
     return ob;
    }

    // показать тип объекта ob
    void showType()
    {
        System.out.println("Объект ob относится к типу " + ob.getClass().getName());
    }
}

class NonGenDemo
{
    public static void main(String[] args)
    {
        NonGen iOb;


        // Создать объект типа NonGen и сохранить в нем
        // объект типа Integer. Выполняется автоупаковка
        iOb = new NonGen(88);
        // показать типа данных, хранящихся в переменной iOb
        iOb.showType();

        // получить значения переменной iOb,
        // на этот рах требуется приведение типов
        int v = (Integer) iOb.getOb();
        System.out.println("Value: " + v);
        System.out.println();

        // создать другой объект типа NonGen и
        // сохранить в нем объект типа String
        NonGen strOb = new NonGen("Тест без обобщений");
        // показать тип данных, хранящихся в переменной strOb
        strOb.showType();

        // получить значение переменнй strOb,
        // В этом случае тоже потребуется приведение типов
        String str = (String) strOb.getOb();
        System.out.println("Text str: " + str);

        // Этот код компилируется, но он приниципиально неверный!!!
        iOb = strOb;
        v = (Integer) iOb.getOb(); // Ошибка во время выполнения
    }
}
