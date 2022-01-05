package ru.vk;

public class Employee {

    String fullName;
    String position;
    String email;
    String telephone;
    long salary;
    int age;

    public Employee(String fullName, String position, String email, String telephone, long salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void infoEmployee() {
        System.out.println("ФИО: " + this.fullName + ". Должность: " + this.position + ". email: " + this.email
                + ". Телефон: " + this.telephone + ". Зарплата: " + this.salary + ". Возраст: " + this.age);
    }
}
