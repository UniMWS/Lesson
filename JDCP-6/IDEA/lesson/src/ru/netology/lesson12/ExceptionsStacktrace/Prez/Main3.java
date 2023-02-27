package ru.netology.lesson12.ExceptionsStacktrace.Prez;

import java.util.Scanner;

public class Main3 {//Scanner, который может работать не только с консолью, но и с файлами и другими ресурсами, требующими принудительного закрытия.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {// try после открытия сканера
            System.out.println("Введите первое число:");
            int value1 = scanner.nextInt();
            System.out.println("Введите второе число:");
            int value2 = scanner.nextInt();
            System.out.println(value1 / value2);
        } catch (ArithmeticException exception) {
            System.out.println("Деление на ноль");
        } finally {// обязательно закрываем сканер в доп блоке
            scanner.close();
        }
    }
}
