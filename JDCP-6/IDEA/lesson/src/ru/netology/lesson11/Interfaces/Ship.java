package ru.netology.lesson11.Interfaces;

public class Ship extends Transport {
    public Ship() {
        super(500);
    }

    @Override
    public void transfer(String name, String from, String to) {
        System.out.println(name + " поплыл из " + from + " в " + to);
        spendFuel(80);
    }
}
