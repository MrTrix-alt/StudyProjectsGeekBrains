package ru.homework.lessonOne;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkThree {

    static void attemptCounter() {
        System.out.println("You have three attempts. Enter any number from 0 to 9. Let's start!");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("Attempt number One.");
                int userNumb = scan.nextInt();
                guessNumber(userNumb);
            } else if (i == 1) {
                System.out.println("Attempt number Two.");
                int userNumb = scan.nextInt();
                guessNumber(userNumb);
            } else if (i == 2) {
                System.out.println("Attempt number Three.");
                int userNumb = scan.nextInt();
                guessNumber(userNumb);
            }
        }
    }

    static void guessNumber(int inputNumb) {
        Random rand = new Random();
        int randNumb = rand.nextInt(9);
        if(randNumb == inputNumb) {
            System.out.println("You guessed the number!");
        } else if (randNumb > inputNumb || inputNumb > 9) {
            System.out.println("The inputted value is less than" +
                    " the guessed number");
        } else if (randNumb < inputNumb) {
            System.out.println("The inputted value is greater than" +
                    " the guessed number");
        }

    }

    static void gameOfWords() {
        System.out.println("The computer made up the name of the vegetable or fruit." +
                " Try to guess.");
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
            guessWord(words);

        }


    static void guessWord(String[] words) {
        Scanner scan = new Scanner(System.in);
        String symb = "#########";
        Random rand = new Random();
        int numb = rand.nextInt(words.length);
        System.out.println("Enter your word:");
        String name = scan.next();
        while (true) {

            if (words[numb].equals(name)) {
                System.out.println("You guessed a word!!!");
                break;
            } else if (words[numb].charAt(0) == name.charAt(0) && words[numb].charAt(1) == name.charAt(1)) {
                System.out.println("You were close - " + words[numb].charAt(0) + words[numb].charAt(1) + symb + "\n" +
                        "Try again:");
                name = scan.next();
            } else if (words[numb].charAt(0) != name.charAt(0) && words[numb].charAt(1) != name.charAt(1)) {
                System.out.println("You are not close [keep a hint] - " + words[numb].charAt(0) + words[numb].charAt(1) + symb + "\n" +
                        "Try again:");
                name = scan.next();
            }


        }

    }

    public static void main(String[] args) {

        System.out.println("Task 1.");
        attemptCounter();

        System.out.println("Task 2.");
        gameOfWords();

    }
}
