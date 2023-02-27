package ru.netology.lesson16.quiz.products;

public class Book extends Product {
    private String author;

    public Book(String title, String author, int price) {
        super(title, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}