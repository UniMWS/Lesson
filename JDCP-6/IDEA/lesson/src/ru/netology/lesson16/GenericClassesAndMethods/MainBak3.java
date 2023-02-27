package ru.netology.lesson16.GenericClassesAndMethods;

public class MainBak3 {
    public static void main(String[] args) {
        Memory<String> memory = new Memory(); // необязательно указывать здесь `new Memory<String>`
        memory.save("Petya");
        memory.save("Olya");
        memory.save("Tanya");
        String value = memory.getlast();
        System.out.println(value);

        String v1 = "Petya";
        String v2 = "Olya";
        String result = choose(true, v1, v2);
        System.out.println(result);
    }

    public static String choose(boolean flag, String first, String second) {
        if (flag) {
            return first;
        } else {
            return second;
        }
    }
}
