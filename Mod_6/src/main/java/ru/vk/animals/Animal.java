package ru.vk.animals;

public class Animal {
    String breed;
    String name;
    int distanceMaxRun;
    int distanceMaxSwim;

    public Animal() {
    }

    public Animal(String breed, String name, int distanceMaxRun, int distanceMaxSwim) {
        this.breed = breed;
        this.name = name;
        this.distanceMaxRun = distanceMaxRun;
        this.distanceMaxSwim = distanceMaxSwim;
    }

    public void run(int distance) {
        if (this.distanceMaxRun <= distance) System.out.println(this.breed + " " + this.name +
                " не (пробежал/пробежала) все расстояние: " + distance + "м. " + "Максимальная расстояние для " + this.breed + ": " + this.distanceMaxRun + "m.");
        else System.out.println(this.breed + " " + this.name +
                " пробежал/пробежала все расстояние: " + distance + "м. " + "Максимальная расстояние для " + this.breed + ": " + this.distanceMaxRun + "m.");
    }

    public void swim(int distance) {
        if (this.distanceMaxSwim <= distance) System.out.println(this.breed + " " + this.name +
                " не (проплыл/проплыла) все расстояние: " + distance + "м. " + "Максимальная расстояние для " + this.breed + ": " + this.distanceMaxSwim + "m.");
        else System.out.println(this.breed + " " + this.name +
                " проплыл/проплыла все расстояние: " + distance + "м. " + "Максимальная расстояние для " + this.breed + ": " + this.distanceMaxSwim + "m.");
    }

}