package ru.netology.lesson9.kviz;

// пара Main1 - Util
class Util {
    static int counter = 0;
//    int counter = 0;

    public Util() {
        counter++;
    }

    public void getCount() {
        System.out.println("Total number of Util instances so far: " + counter);
    }
}