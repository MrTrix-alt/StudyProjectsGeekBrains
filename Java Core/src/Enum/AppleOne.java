package Enum;

import java.util.prefs.AbstractPreferences;

enum AppleOne {
    Jonathan(10), GoldenDel, RedDel(12), Winesap(15), Cortland(8);


// создаем поле в классе enum
    private int price; // цена яблока каждого сорт
    private String text;

// создаем конструктор
// числа в данном перечислении являются аргумента для передачи
// в параметры конструктора

    AppleOne(int p) {
        price = p;
    }

    // Перегружаемый конструктор для именованной константы без параметра
    AppleOne() {
        price = 0;
    }

    int showPrice() {
        return price;
    }


}

class EnumDemo2 {
    public static void main(String[] args) {
        AppleOne ap;

        // Вывести цену на яблоко сорта Winesap

        System.out.println("Яблоко сорта Winesap стоит " +
                AppleOne.Winesap.showPrice() + " центов.");


        // вывести цена на все сорта яблок
        System.out.println("Цены на все сорта яблока:");
        for (AppleOne x : AppleOne.values()) {
            System.out.println(x + " стоит " + x.showPrice() + " центов.");

        }
    }
}
