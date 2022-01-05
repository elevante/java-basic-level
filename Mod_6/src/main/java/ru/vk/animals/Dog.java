package ru.vk.animals;

public class Dog extends Animal {
    static int countDog = 0;

    public Dog(String breed, String name, int distanceMaxRun, int distanceMaxSwim) {
        super(breed, name, distanceMaxRun, distanceMaxSwim);
        countDog++;
    }

    public static void getCountDog() {
        System.out.println("Количество собак: " + countDog);
    }
}