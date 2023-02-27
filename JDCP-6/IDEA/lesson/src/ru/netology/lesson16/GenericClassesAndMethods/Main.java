package ru.netology.lesson16.GenericClassesAndMethods;

public class Main {
    public static void main(String[] args) {
        Memory<String> memory = new Memory(); // необязательно указывать здесь `new Memory<String>`
        memory.save("Petya");
        memory.save("Olya");
        memory.save("Tanya");
        String value = memory.getlast();
        System.out.println(value);

        String v1 = "Petya";
        String v2 = "Olya";
        String result = choose(true, v1, v2);// даже не указываем явным образом (String)
        String result1 = Main.<String>choose(true, v1, v2);// можно так через Класс.<>, но зачем?
        System.out.println(result);
    }

    public static <T> T choose(boolean flag, T first, T second) {
        if (flag) {
            return first;
        } else {
            return second;
        }
    }
}
