package ru.netology.lesson11.AbstractClasses;

public class Plane extends Transport{
    public Plane() {
        super(10_000);
    }

    @Override
    public void transfer(String name, String from, String to) {
        System.out.println(name + " полетел из " + from + " в " + to);
        spendFuel(1000);
    }// теперь обязаны переопределить недописанный метод родителя
}
