package ru.netology.lesson9.Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
        Person person = new Person("Vasya", 13);
//        person.name = "Petya";
//        person.age = 8;
        System.out.println(person.getName() + " " + person.getAge() + " типа молод? " + person.isTooYoung());
        person.setName("Petya");
        person.setAge(40);
        person.setAge(-8);
//        System.out.println(person.name + " " + person.age + " типа молод? " + person.isTooYoung());
        System.out.println(person.getName() + " " + person.getAge() + " типа молод? " + person.isTooYoung());
    }
}
