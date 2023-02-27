package ru.netology.lesson12.ExceptionsStacktrace.Prez;

import java.util.Scanner;

public class MainThorws2 {// можем сами инициировать создание и выброс исключения
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int value1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int value2 = scanner.nextInt();
        if (value1 == 0 || value2 == 0) {
            throw new Exception("Значения не должны быть меньше нуля");
        }
        System.out.println(value1 / value2);
    }
}
