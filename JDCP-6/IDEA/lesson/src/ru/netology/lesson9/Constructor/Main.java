package ru.netology.lesson9.Constructor;

//import ru.netology.lesson9.Inheritance.Singer;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Zhenya", 48);
//        person.setName("Zhenya");
//        person.age = 8;
//        System.out.println(person.age);
//        person.setAge(48);
        person.setAge(-8);

        Singer singer = new Singer("Kolya", 18, 4);
        System.out.println(singer.toString());
//        singer.setName("Kolya");
//        singer.setAge(18);
        System.out.println(singer.getName() + " " + singer.getAge() + " типа молод? " + singer.isTooYoung());
        singer.sing("Happy Birth Day!");
        singer.happyBirthDay();
        singer.rating = 5;
        System.out.println(singer.getName() + " уже " + singer.getAge() + ", рейтинг " + singer.rating + ", типа молод? " + (singer.isTooYoung() ? "Конечно!" : "Уже нет(("));
        person.happyBirthDay();
        System.out.println(person.getName() + " " + person.getAge() + " типа молод? " + (person.isTooYoung() ? "Конечно!" : "Уже нет(("));
        System.out.println();
        System.out.println(person.toString());
        System.out.println(singer.toString());
        person.rating = 50;
        person.printRating();
        singer.printRating();
    }
}
