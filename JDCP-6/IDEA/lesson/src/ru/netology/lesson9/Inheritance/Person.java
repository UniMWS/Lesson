package ru.netology.lesson9.Inheritance;

//public final class Person { // final - запрет наследования!
public class Person {
    //    protected String name;
    private String name; // по уму надо protected
    //    int age = 1;
//    protected int age = 1;
    private int age = 1; // по уму надо protected
    //    public Person(String name, int age){
//        setName(name);
//        setAge(age);
//    }
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

    public void happyBirthDay() {
        age++;
        System.out.println("С др, " + name + " - " + age + " лет!");
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
