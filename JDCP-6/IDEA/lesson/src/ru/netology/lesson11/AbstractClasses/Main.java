package ru.netology.lesson11.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        String name = "Vasya";
        Car car = new Car();
        car.transfer(name, "SPb", "Msk");

        Ship ship = new Ship();
        ship.transfer(name, "SPb", "Msk");
        spbToMoscow(name, car);System.out.println(car.getFuel());
        System.out.println(ship.getFuel());
        Plane plane = new Plane();// теперь точно знаем про метод трансфер
        spbToMoscow(name, plane);
        System.out.println(plane.getFuel());
    }

    public static void spbToMoscow(String name, Transport transport) {
        transport.transfer(name, "SPb", "Moscow");
    }
}
