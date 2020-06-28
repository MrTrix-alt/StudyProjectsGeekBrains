package ru.homework.lessonThree;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        String[][] persons = { {"Boris", "Alexandr", "Boris", "Timur", "Alexey", "Phillip"},
                {"Igor", "Tyler", "Felix", "Victor", "Agata", "Kristina", "Maria",},
                {"Rose", "Irina", "Karina", "Victor", "Timur", "Kristina", "Maria", "Karina", "Boris"} };
        HashMap<String, Integer> name = new HashMap<>();
        for (String[] arr : persons) {
            for (String array : arr) {
                name.put(array, name.getOrDefault(array, 0) + 1);
            }
        }
        System.out.println(name);


        PhoneBook book = new PhoneBook();
        book.add("Kirov", 891772332);
        book.add("Petrov", 891772332);
        book.add("Medvedev", 89237643);
        book.add("Eroshko", 897822122);
        book.add("Petrov", 897822123);

    }

}
