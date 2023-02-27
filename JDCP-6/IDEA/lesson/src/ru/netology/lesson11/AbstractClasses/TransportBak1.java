package ru.netology.lesson11.AbstractClasses;

public class TransportBak1 {
    private int fuel;

    protected TransportBak1(int fuel) {
        this.fuel = fuel;
    }// частичное решение

    public void spendFuel(int fuel) {
        this.fuel -= fuel;
    }

    public void transfer(String name, String from, String to) {
        System.out.println("чо, память отказала? где трансфер и топливо?!");
    }

    public int getFuel() {
        return fuel;
    }
}
