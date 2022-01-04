package ru.vk;

import java.util.Random;
import java.util.Scanner;

public class JavaApp {
    public static void main(String[] args) {

        //Task 1
        gameGuess();

        //Task 2
        gameWord();
    }

    public static void gameGuess() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            System.out.println("Игра  <<Угадай число>>.");
            int a = sc.nextInt();
            int numberRand = rand.nextInt(10);
            for (int i = 0; i < 3; i++) {
                System.out.print("Введите число>>> ");

                if (a == numberRand) {
                    System.out.println("Угадал число!\n Поздравляю!");
                    break;
                } else if (a < numberRand) System.out.println("Число меньше загаданного!");
                else System.out.println("Число больше загаданного!");
            }
            System.out.print("Потворить игру еще раз? 1 - да / 0 - нет>>> ");
            int answer = sc.nextInt();
            sc.close();
            if (answer == 0) break;
        }
    }

    public static void gameWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Игра <Угадай слово>>");
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int randomIndex = random.nextInt(words.length);
        String wordRandom = words[randomIndex];
        while (true) {
            System.out.print("Введите слово >>> ");
            String answerWord = sc.nextLine();
            if (answerWord.equals(words[randomIndex])) {
                System.out.println("Угадал слово. Поздравляю!!!");
                break;
            } else {
                char first = wordRandom.charAt(0);
                char second = wordRandom.charAt(1);
                System.out.println("Не угадал!!!");
                System.out.printf("Подсказка %c%c#############", first, second);
                System.out.println();
            }
        }
        sc.close();
    }
}