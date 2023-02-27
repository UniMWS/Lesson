package ru.netology.lesson10.Polymorphism;

public class Person {
    protected String name;
    protected int age = 1;

    public Person(String name, int age) {
        setName(name);
        setAge(age);// так ты хер ошибешься;)
    }

    public int rating;

    public void printRating() {
        System.out.println(rating);
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

    protected void happyBirthDay() {// см. наследника
        age++;
        System.out.println("С др, " + name + " - " + age + " лет! (v/p)");
    }

    public boolean isTooYoung() {
        if (age < 21) return true;
        else return false;
    }

    @Override
    public String toString() {
        return getName() + " (" + getAge() + " лет)";
    }
}
