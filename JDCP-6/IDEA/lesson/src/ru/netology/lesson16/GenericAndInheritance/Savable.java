package ru.netology.lesson16.GenericAndInheritance;

public interface Savable<T> {
    void save(T obj);
}
