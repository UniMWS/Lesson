package ru.netology.lesson16.GenericClassesAndMethods;

public class MainBak2 {
    public static void main(String[] args) {
        MemoryBak2 memory = new MemoryBak2();
        memory.save("Petya");
        memory.save("Olya");
        memory.save("Tanya");
        String value = (String) memory.getlast(); // Заставляем java считать типом данных (String)
    }
}
