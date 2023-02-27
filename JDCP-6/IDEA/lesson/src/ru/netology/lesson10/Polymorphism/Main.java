package ru.netology.lesson10.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Person person = new Singer("Kolya", 18, 4);

        person.happyBirthDay();
        System.out.println(chekPerson(person));
    }

    public static boolean chekPerson(Person person) {
        return person.age >= 0;
    }
}
