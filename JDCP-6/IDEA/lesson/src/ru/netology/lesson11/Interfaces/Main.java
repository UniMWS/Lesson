package ru.netology.lesson11.Interfaces;

public class Main {
    public static void main(String[] args) {
        String name = "Vasya";
        Car car = new Car();
        car.transfer(name, "SPb", "Msk");

        Ship ship = new Ship();
        ship.transfer(name, "SPb", "Msk");
        spbToMoscow(name, car);
        System.out.println(car.getFuel());
        System.out.println(ship.getFuel());
        Plane plane = new Plane();// теперь точно знаем про метод трансфер
        spbToMoscow(name, plane);
        plane.pay(55_000);
        System.out.println(plane.getFuel());
        Velo velo = new Velo();
        spbToMoscow(name, velo);
        spbToMoscowFuelPay(name, plane, 95_000);
        spbToMoscowFuelPay(name, car, 155000);
    }

    public static void spbToMoscow(String name, Transferer transport) {
        transport.transfer(name, "SPb", "Moscow");
    }

    public static void spbToMoscowFuelPay(String name, Transport transport, int amount) {
        transport.transfer(name, "Moscow", "Kiev");
        transport.pay(amount);
    }
}
