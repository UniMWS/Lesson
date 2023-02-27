package ru.netology.lesson11.Interfaces;

public class Velo implements Transferer {
    @Override
    public void transfer(String name, String from, String to) {
        System.out.println(name + " попиздошил из " + from + " в " + to + " и водка как топливо");
    }
}
