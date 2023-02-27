package ru.netology.lesson16.quiz.products;

public class Device extends Product {
    private String vendor;

    public Device(String title, String vendor, int price) {
        super(title, price);
        this.vendor = vendor;
    }

    public String getVendor() {
        return vendor;
    }
}