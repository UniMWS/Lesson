package ru.netology.lesson16.GenericAndInheritance;

public class Memory<T> implements Savable<T> {// передаём интерфейсу полученный классом параметр <T>
    protected T value;

    public void save(T value) {
        this.value = value;
    }

    public T getlast() {
        return value;
    }
}
