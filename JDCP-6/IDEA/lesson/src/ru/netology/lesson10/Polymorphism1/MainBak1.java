package ru.netology.lesson10.Polymorphism1;

public class MainBak1 {
    public static final int AGE = 18;

    public static void main(String[] args) {
        Singer singer = new Singer("Kolya", 18, 4);
        singer.happyBirthDay();
        if (chekPerson(singer)) System.out.println(singer.getAge() + " >= " + AGE);
        else System.out.println(singer.getAge() + " < " + AGE);
    }

    public static boolean chekPerson(Person person) {
        return person.age >= AGE;
    }
}
