package ru.netology.lesson16.GenericAndInheritance;

public class Main {
    public static void main(String[] args) {
        Integer i = 100;
        Number n = i;

        Memory<Number> memory = new Memory<>(); // правильно делать так <>
        memory.save(100);
        memory.save(300);
        memory.save(500);
        Number value = memory.getlast();
        System.out.println(value);

        int v1 = 100;
        int v2 = 500;
        int result = choose(true, v1, v2);
        System.out.println(result);
    }

    public static <T extends Number> T choose(boolean flag, T first, T second) {
        if (flag) {
            return first;
        } else {
            return second;
        }
    }
}
