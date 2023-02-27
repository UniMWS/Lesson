package ru.netology.lesson11.AbstractClasses;

public abstract class TransportBak2 {// решили проблему запрета объекта этого класса - только наследование
    private int fuel;

    public TransportBak2(int fuel) {// вернули public
        this.fuel = fuel;
    }

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
