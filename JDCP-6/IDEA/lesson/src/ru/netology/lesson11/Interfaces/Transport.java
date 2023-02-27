package ru.netology.lesson11.Interfaces;

public abstract class Transport implements Transferer, Billable {
    private int fuel;

    public Transport(int fuel) {
        this.fuel = fuel;
    }

    public void spendFuel(int fuel) {
        this.fuel -= fuel;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Уплачено в размере " + amount);
    }
    public  abstract void transfer(String name, String from, String to);//теперь тут не нужен
    public int getFuel() {
        return fuel;
    }
}
