package ru.vk;

/**
 * Java Core. Basic level. Lesson 1
 *
 * @author Adam Gahverdiev
 */

public class JavaApp {
    public static void main(String[] args) {
        //Task 2
        createVariable();

        //Task 3
        System.out.println(calculate(10.2f, 10.2f, 2.1f, 100.1f));

        //Task 4
        System.out.println(task10abd20(10, 10));

        //Task 5
        isPositiveOrNegative(-1);

        //Task 6
        System.out.println(isNegative(1));

        //Task 7
        greetings("Adam");

        //Task 8
        leapYear(2022);
    }

    /**
     * Задание 2. Создать переменные всех пройденных типов данных и инициализировать их значения
     */
    public static void createVariable() {
        //Примитивные
        byte valByte = -100;
        short valShort = 12440;
        int valInt = 100000;
        long valLong = 34223;
        float valFloat = 12.23f;
        double valDouble = -123.123;
        char valChar = 'a';
        boolean valBoolean = true;

        //Ссылочные(объектные)
        String valString = "Hello";
    }

    /**
     * Задание 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
     * где a, b, c, d – аргументы этого метода, имеющие тип float
     */
    public static float calculate(float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }

    /**
     * Задание 4. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false
     */
    public static boolean task10abd20(int x1, int x2) {
        int sum = x1 + x2;
        return (10 <= sum) && (sum <= 20);
    }

    /**
     * Задание 5. Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом
     */
    public static void isPositiveOrNegative(int x) {
        if (0 <= x) System.out.println("Число положительное: " + x);
        else System.out.println("Число отрицвтельное: " + x);
    }

    /**
     * Задание 6. Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное
     */
    public static boolean isNegative(int x) {
        return 0 > x;
    }

    /**
     * Задание 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
     * Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
     */
    public static void greetings(String name) {
        System.out.println("Hello, " + name);
    }

    /**
     * Задание 8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
     */
    public static void leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Год високосный (366 дней)");
        else
            System.out.println("Год не високосный (365 дней)");
    }
}