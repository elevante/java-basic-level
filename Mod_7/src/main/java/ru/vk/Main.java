package ru.vk;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate();
        plate.putFood(100);
        Cat[] cats = {
                new Cat("Leo", 15),
                new Cat("Mark", 20),
                new Cat("Mika", 20),
                new Cat("Rick", 70),

        };
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}