package ru.vk;

public class Plate {
    private int foodAmount;

    public void putFood(int amount) {
        this.foodAmount += amount;
        System.out.printf("Plate food amount increased, now %d\n", this.foodAmount);
    }

    public boolean decreaseFood(int amount) {
        if (amount < 0 || amount > this.foodAmount) return false;
        this.foodAmount -= amount;
        System.out.printf("Bowl food amount decreased, now %d\n", this.foodAmount);
        return true;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "foodAmount=" + foodAmount +
                '}';
    }
}