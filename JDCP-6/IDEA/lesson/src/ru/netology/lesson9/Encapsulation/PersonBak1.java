package ru.netology.lesson9.Encapsulation;

public class PersonBak1 {
    String name;
    int age;

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
