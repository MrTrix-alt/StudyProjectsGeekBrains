package Wrappers;

/**
 * Автоупаковка/автораспаковка происходит при передаче
 * параметров и возврате значений из методов
 */
class AutoBox {
    // принять параметр типа Integer и возврать
    // значение типа int

    static int retInt(Integer v) {
        return v; // автораспаковка значения типа int
    }

    public static void main(String[] args) {
        Integer iOb = retInt(10);
        System.out.println(iOb);

        Character cOb1;
        Integer inOb2;
        Integer inOb3;


        cOb1 = 'x';
        System.out.println("Исходное значение cOb1: " + cOb1);
        ++cOb1;
        System.out.println("После ++cOb1: " + cOb1);
        inOb2 = 101;
        inOb3 = inOb2 + (inOb2 / 3);
        System.out.println("Значение iOb3: " + inOb3);

        int i = inOb2 + (inOb2 / 3);
        System.out.println("int i = " + i);

        Boolean obj = true;
        Boolean obj1 = Boolean.valueOf("true");
        System.out.println(obj1);
        if (obj1) {
            int h = inOb2 + inOb3;
            System.out.println(h);
        }
        if (obj)
            System.out.println("obj равно " + obj);

        while (inOb2 < 105) {
            System.out.print(++inOb2 + " ");
        }
        System.out.println();

        Integer val = 1000;
        int q = val.byteValue();
        System.out.println(q);

        }
    }

