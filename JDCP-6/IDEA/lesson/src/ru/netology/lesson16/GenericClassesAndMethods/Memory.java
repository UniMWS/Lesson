package ru.netology.lesson16.GenericClassesAndMethods;

public class Memory<T> { // тип T - параметр самого класса; можно использовать несколько <T, U>
    protected T value;

    public void save(T value) {
        this.value = value;
    }

    public T getlast() {
        return value;
    }
}
