package ClassesAndMethodes;

// Еще один пример рекурсии
// В данном примере рекурсивный метод printArray
// выводит первые i элементов из массива values
public class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    }

    // вывести рекурсивно элементы массива
    void printArray(int i) {
        if (i == 0)
            return;
        else
            printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}

class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;

        for(i = 0; i < 10; i++)
            ob.values[i] = i;
        ob.printArray(10);
    }
}