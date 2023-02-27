package ru.netology.lesson16.quiz;
import ru.netology.lesson16.quiz.products.*;

class Main {
    public static void main(String[] args) {
        Shop<Device> shop = new Shop<>();

        // не скомпилится, тк магазин мы создали только для продажи устройств.
        // если бы создавали как Shop<Product>, то скомпилилось бы
        // shop.add(new Book("Lord of the Rings", "2Pac", 100));

        shop.add(new Mobile("UPhone", "Orange", 30_000, 100));
        shop.add(new SmartWatch("UWatch", "Orange", 6_500, true));
        shop.add(new Mobile("UPhone mini", "Orange", 15_000, 93));

        // Без каста сразу получаем значение типа Device
        Device device = shop.getCheapest();
        System.out.println("Самое дешёвое: " + device.getTitle());
    }
}