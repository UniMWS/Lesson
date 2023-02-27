package ru.netology.lesson11.Interfaces;

public class Car extends Transport {
    public Car() {
        super(100);
    }

    @Override
    public void transfer(String name, String from, String to) {
        System.out.println(name + " поехал на машине из " + from + " в " + to);
        spendFuel(10);
    }
}
