package Generics;

// Применение ограниченных типов
// Класс Stat наследует класс Number(суперкласс
// для классов оболочек числовых типов данных)
// Следовательно, аргумент типа Т должен быть
// классом Number или наследуемым классом от него.


class Stat<T extends Number>
{
    T[] nums; // масси класса Number или его подкласа

    // передать конструктор ссылку на массив элементов
    // класса Number или подкласса
    Stat(T[] obj)
    {
        nums = obj;
    }

    // вовзртить значение типа double в любом случае
    double average()
    {
        double sum = 0.0;

        for (int i = 0; i <nums.length ; i++)
            sum += nums[i].doubleValue();
            return sum / nums.length;
    }

    // Определить равенство двух средних значений
    // Применение метасимола <?>
    boolean sameAvg(Stat<?> ob)
    {
        if(average() == ob.average())
        {
            return true;
        }

        return false;
    }
}

class BoundsDemo
{
    public static void main(String[] args)
    {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stat<Integer> iOb = new Stat<Integer>(inums);
        double v = iOb.average();
        System.out.println("Среднее значение iOb равно " + v);

        Double dNums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stat<Double> dOb = new Stat<Double>(dNums);
        double w = dOb.average();
        System.out.println("Среднее значение dOb равно " + w);
        // Если создать объект типа String - код не скомпилируется
        // т.к. String не является производным от класса Number

        Float fNums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stat<Float> fOb = new Stat<Float>(fNums);
        double x = fOb.average();
        System.out.println("Среднее значение dOb равно " + x);

        // выяснить, какие массивы имеют одинаковые средние значения
        System.out.print("Средние знаения iOb & dOb ");
        if(iOb.sameAvg(dOb))
        {
            System.out.println("равны");
        }
        else
        {
            System.out.println("отличаются");
        }

        System.out.print("Средние знаения iOb & fOb ");
        if(iOb.sameAvg(fOb))
        {
            System.out.println("равны");
        }
        else
        {
            System.out.println("отличаются");
        }
    }
}
