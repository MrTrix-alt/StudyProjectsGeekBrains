package Generics;

/**
 * Простой обобщенный класс.
 * Здесь T обозначает параметр типа,
 * котоорый будет заменен реальным типом
 * при создании объекта типа Gen
 * @param <T>
 */
public class Gen<T>
{
    T ob; // объявить объект типа Т
    // объект ob станет объектом того типа, который будет передан
    // в качестве параметра типа Т

    // передать конструктору ссылку на объект типа Т
    Gen(T ob)
    {
        this.ob = ob;
    }

    // возвратить объект ob
    T getOb() // T - возвращаемый тип данных
    {
        return ob;
    }

    // показать тип Т
    void showType()
    {
        System.out.println("Типом Т является " + ob.getClass().getName());
    }
}

class GenDemo
{
    public static void main(String[] args)
    {
        // Создать ссылку типа Gen для целых чисел
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(8);

        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Значение v: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("Тест обобщений");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Текст str: " + str);


    }
}

