package ru.netology.lesson11.AbstractClasses;

public class MainBak2 {
    public static void main(String[] args) {
        String name = "Vasya";
        Car car = new Car();
        car.transfer(name, "SPb", "Msk");

        Ship ship = new Ship();
        ship.transfer(name, "SPb", "Msk");
        spbToMoscow(name, car);
//        Transport transport = new Transport(10);// и тут начались проблемы
//        spbToMoscow(name, transport);// во-первых, "не доехал"
//        System.out.println(transport.getFuel());// во-вторых, что за вечный двигатель?!
        System.out.println(car.getFuel());
        System.out.println(ship.getFuel());
        Plane plane = new Plane();// в-третьих, мы тупо "не знали" про метод трансфер
        spbToMoscow(name, plane);
        System.out.println(plane.getFuel());
    }

    public static void spbToMoscow(String name, Transport transport) {
        transport.transfer(name, "SPb", "Moscow");
    }
}
