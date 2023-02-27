package ru.netology.lesson12.ExceptionsStacktrace.Prez;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {// Ошибка ввода
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число");
            int input = scanner.nextInt();
            System.out.println(input);
        } catch (InputMismatchException exception) {
            System.out.println("Ошибка ввода, вы ввели не число");
        }
    }
}