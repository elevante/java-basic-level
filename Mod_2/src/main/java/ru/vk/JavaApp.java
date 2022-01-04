package ru.vk;

public class JavaApp {
    public static void main(String[] args) {
        //Task 1
        zeroToOne();

        //Task 2
        arrFilling();

        //Task 3
        lessSixTimeTwo();

        //Task 4
        fillDiagonal();

        //Task 5
        minMaxArray();
    }

    /**
     * Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0
     */
    public static void zeroToOne() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Задание 2. Задать пустой целочисленный массив размером 8.
     * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    public static void arrFilling() {
        int[] arr = new int[8];
        for (int i = 0, k = 0; i < arr.length; i++, k += 3) {
            arr[i] += k;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void lessSixTimeTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int y = 0, k = arr.length - 1; y < arr.length; y++, k--) {
            for (int x = 0; x < arr.length; x++) {
                if (y == x) arr[y][x] = 1;
                if (x == k) arr[y][k] = 1;
                System.out.print(arr[y][x] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Задание 5. *Задать одномерный массив c целыми числами
     * и найти в нем минимальный и максимальный элементы (без помощи интернета).
     */
    public static void minMaxArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
            else max = arr[i];
        }
        System.out.println("Mинимальное число в массиве: " + min);
        System.out.println("Максимальное число в массиве: " + max);
    }
}