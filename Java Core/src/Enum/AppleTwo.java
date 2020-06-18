package Enum;

enum AppleTwo {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

// Демонстрация применения методов ordinal(), compareTo() и equals()
class EnumDemo3 {
    public static void main(String[] args) {
        AppleTwo ap;
        AppleTwo ap2;
        AppleTwo ap3;

        // Получить все порядковые значения с помощью
        // метода ordinal()
        System.out.println("Все константы сортов яблок " +
                "и их порядковые значения: ");
        for(AppleTwo x : AppleTwo.values())
            System.out.println(x + " " + x.ordinal());

        ap = AppleTwo.RedDel;
        ap2 = AppleTwo.GoldenDel;
        ap3 = AppleTwo.RedDel;

        System.out.println();

        // продемонстрировать применение метода compareTo()

        if(ap.compareTo(ap2) < 0)
            System.out.println(ap + " предшествует " + ap2);
        if(ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " предшествует " + ap);
        if(ap.compareTo(ap3) == 0)
            System.out.println(ap + " равно " + ap3);

        // продемонстрировать применение переопределенного
        // метода equals()

        System.out.println();

        if(ap.equals(ap2))
            System.out.println("Это сообщение не будет выведено");
        if(ap.equals(ap3))
            System.out.println(ap + " равно " + ap3);
        if(ap == ap3)
            System.out.println("Константы можно сравнивать с помощью" +
                    " оператора ==");



    }
}
