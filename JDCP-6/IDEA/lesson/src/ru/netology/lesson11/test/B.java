package ru.netology.lesson11.test;

public class B extends A{

    public void pay(int amount) {
        System.out.println(amount);
    }

    @Override
    public void printAmount(int amount) {
        System.out.println(amount);
    }
}
