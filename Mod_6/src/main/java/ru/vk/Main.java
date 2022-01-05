package ru.vk;

import ru.vk.animals.Animal;
import ru.vk.animals.Cat;
import ru.vk.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] arrAnimals = {
                new Cat("Cat", "Ted", 200),
                new Cat("Cat", "Leon", 200),
                new Dog("Dog", "Rick", 500, 10),
                new Dog("Dog", "Mika", 500, 10),
                new Dog("Dog", "John", 500, 10),
        };
        for (Animal a : arrAnimals) {
//            a.run(500);
            a.swim(100);
        }

        Cat.getCountCat();
        Dog.getCountDog();
    }
}