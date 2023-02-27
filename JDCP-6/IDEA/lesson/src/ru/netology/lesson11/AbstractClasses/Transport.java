package ru.netology.lesson11.AbstractClasses;

public abstract class Transport {// решили 1 проблему - роли только наследование и полиморфизм
    private int fuel;

    public Transport(int fuel) {// вернули public
        this.fuel = fuel;
    }

    public void spendFuel(int fuel) {
        this.fuel -= fuel;
    }

    public abstract void transfer(String name, String from, String to);//решили 2 вопрос недописанного метода

    public int getFuel() {
        return fuel;
    }
}
