package ru.netology.lesson12.ExceptionsStacktrace.Prez;

import java.util.Scanner;

public class Main2 {// Деление на ноль
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число:");
            int value1 = scanner.nextInt();
            System.out.println("Введите второе число:");
            int value2 = scanner.nextInt();
            System.out.println(value1 / value2);
        } catch (ArithmeticException exception) {
            System.out.println("Деление на ноль");
        }
    }
}
