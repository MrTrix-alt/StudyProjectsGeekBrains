package ru.homework.lessonThree;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    HashMap<String, ArrayList<Integer>> book;


    PhoneBook() {
        this.book = new HashMap<>();
    }

    public void add(String name, int number) {
        ArrayList<Integer> numbers = book.getOrDefault(name, new ArrayList<>());
        numbers.add(number);
        book.put(name, numbers);
    }

    public ArrayList<Integer> getNumber(String name) {
        return book.getOrDefault(name, new ArrayList<>());
    }




}
