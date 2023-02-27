package ru.netology.lesson7.arr3_string;

public class Singer {
    public static int maxRating = 0;
    public String name;
    public int age;
    public int rating;

    public Singer(String name, int age, int rating) {
        this.name = name;
        this.age = age;
        this.rating = rating;
        maxRating = Math.max(maxRating, rating);
    }

    public Singer(String name, int age) {
        this(name, age, 3);
    }
}
