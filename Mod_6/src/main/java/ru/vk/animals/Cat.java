package ru.vk.animals;

public class Cat extends Animal {
    static int countCat = 0;

    public Cat(String breed, String name, int distanceMaxRun) {
        this.breed = breed;
        this.name = name;
        this.distanceMaxRun = distanceMaxRun;
        countCat++;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кошка не плавает!");
    }

    public static void getCountCat() {
        System.out.println("Количество котов: " + countCat);
    }
}