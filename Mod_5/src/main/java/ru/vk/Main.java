package ru.vk;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Ivan Ivanov", "Engineer", "ivivan@mailbox.com", "892312312", 500000, 27),
                new Employee("Petr Vasiliev", "Programmer", "pvas@mailbox.com", "8923123366", 60000, 41),
                new Employee("Denis Sobolev", "Engineer", "divan@mailbox.com", "89231445612", 650000, 42),
                new Employee("Anton Volkov", "Engineer", "avolk@mailbox.com", "89234367121", 710000, 45),
                new Employee("Mark Levin", "Programmer", "mlevin@mailbox.com", "89233342422", 500000, 27),
        };
        for (Employee arr : employees) {
            if (arr.age > 40) arr.infoEmployee();
        }
    }
}