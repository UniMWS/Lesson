package ru.netology.lesson16.GenericClassesAndMethods;

public class MemoryBak2 {
    protected Object value;

    public void save(Object value) {
        this.value = value;
    }

    public Object getlast() {
        return value;
//        return new Integer(100);
    }
}
