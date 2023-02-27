package ru.netology.lesson9.Encapsulation;

public class Person {
    private String name;
    private int age = 1;
    public Person (String name, int age){
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 200) return;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean isTooYoung() {
        if (age < 18) return true;
        else return false;
    }
}
