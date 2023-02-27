package ru.netology.lesson16.GenericClassesAndMethods;

public class MainBak1 {
    public static void main(String[] args) {
        MemoryBak1 memory = new MemoryBak1();
        memory.save("Petya");
        memory.save("Olya");
        memory.save("Tanya");
        System.out.println(memory.getlast());
    }
}
